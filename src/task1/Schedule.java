package task1;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roma on 25.02.2017.
 */
@XmlRootElement(name = "trains")
public class Schedule {
    @XmlElement(name = "train")
    private List<Train> trains = new ArrayList<>();

    public void addTrain(Train train){
        trains.add(train);
    }

    public List<Train> getTrains() {
        return trains;
    }
}
