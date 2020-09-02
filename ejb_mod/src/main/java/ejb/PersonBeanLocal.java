package ejb;

import java.io.Serializable;

public interface PersonBeanLocal extends Serializable {
    String createPerson(String firstname, String lastname, String haircolor, int shoesize, String zodiacSign, int currentPartners);
}
