package task1;

import JAXB.Book;
import JAXB.Catalog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Roma on 25.02.2017.
 */
public class Main {
    public static Schedule schedule = new Schedule();
    public static File file = new File("trains.xml");
    public static void main(String[] args) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Schedule.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            schedule = (Schedule) unmarshaller.unmarshal(file);
            printTrains(schedule);
            Train train1 =new Train(5L,"Kyiv","Donetsk","27.02.2017","15:23");
            addTrainToXML(train1);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void printTrains(Schedule schedule){
        Date dateAfter = new GregorianCalendar(
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DATE),15,0).getTime();
        Date dateBefore = new GregorianCalendar(
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DATE),19,0).getTime();
        for (Train train: schedule.getTrains()){
            if (train.getDateInDateFormat().after(dateAfter)&train.getDateInDateFormat().before(dateBefore))
                System.out.println(train);
        }
    }
    public static void addTrainToXML(Train train){
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Schedule.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            schedule.addTrain(train);
            jaxbMarshaller.marshal(schedule, file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}
