package ejb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonBeanTest {

    PersonBean pb = new PersonBean("Andy", "Angais", "black", 42, "virgo", 1);
    PersonBean pb2 = new PersonBean();

    @Test
    void getFirstName() {
        assertEquals(pb.getFirstName(), "Andy");
    }

    @Test
    void setFirstName() {
        pb.setFirstName("Anna");
        assertEquals(pb.getFirstName(), "Anna");

    }

    @Test
    void getLastName() {
        assertEquals(pb.getLastName(), "Angais");
    }

    @Test
    void setLastName() {
        pb.setLastName("Angos");
        assertEquals(pb.getLastName(), "Angos");
    }

    @Test
    void getHaircolor() {
        assertEquals(pb.getHaircolor(), "black");
    }

    @Test
    void setHaircolor() {
        pb.setHaircolor("blue");
        assertEquals(pb.getHaircolor(), "blue");
    }

    @Test
    void getShoesize() {
        assertEquals(pb.getShoesize(), 42);
    }

    @Test
    void setShoesize() {
        pb.setShoesize(38);
        assertEquals(pb.getShoesize(), 38);
    }

    @Test
    void getZodiacSign() {
        assertEquals(pb.getZodiacSign(), "virgo");
    }

    @Test
    void setZodiacSign() {
        pb.setZodiacSign("cancer");
        assertEquals(pb.getZodiacSign(), "cancer");
    }

    @Test
    void getCurrentPartners() {
        assertEquals(pb.getCurrentPartners(), 1);
    }

    @Test
    void setCurrentPartners() {
        pb.setCurrentPartners(0);
        assertEquals(pb.getCurrentPartners(), 0);
    }

    @Test
    void createPersonAndReturnFortune() {
        String fortune = pb.createPersonAndReturnFortune("Andy", "Angais", "black", 42, "virgo", 1);
        System.out.println(fortune);
        if (fortune.length()<1){
            fail();
        }
        String fortune2 = pb2.createPersonAndReturnFortune("Andy", "Angais", "black", 42, "virgo", 1);
        if (fortune2.length()<1){
            fail();
        }
    }
}