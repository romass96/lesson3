package task2;

import java.util.Arrays;

/**
 * Created by Bios on 07.02.2015.
 */
public class Person {
    private String name;
    private String surname;
    private String[] phones;
    private String[] sites;
    private Address address;

    public Person() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public String[] getSites() {
        return sites;
    }

    public void setSites(String[] sites) {
        this.sites = sites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person:{name: "+name+
                "; surname: "+surname+
                "; phones:"+ Arrays.deepToString(phones)+
                "; sites:"+Arrays.deepToString(sites)+
                "; address:{"+address+"}}";
    }
}
