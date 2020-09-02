package ejb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomFactorTest {

    RandomFactor rf = new RandomFactor();

    @Test
    void randomStringFromLastName() {
        assertEquals(rf.randomStringFromLastName("Rudhag"), "your neighbors cat ");
        assertEquals(rf.randomStringFromLastName("Persson"), "your neighbors cat ");
        assertEquals(rf.randomStringFromLastName(""), "you ");
        assertEquals(rf.randomStringFromLastName("Hunchback"), "your secret lover ");
        assertEquals(rf.randomStringFromLastName("Bilbo"), "your prison cellmate ");
        assertEquals(rf.randomStringFromLastName("Bob"), "your pole dancing teacher ");
    }

    @Test
    void randomStringFromCurrentPartners() {
        for (int i = 0; i < 1000 ; i++) {

       assertNotEquals(rf.randomStringFromCurrentPartners(1).length(),0);
       assertNotNull(rf.randomStringFromCurrentPartners(20));
        }
    }

    @Test
    void randomStringFromZodiacSign() {

        for (int i = 0; i < 1000; i++) {
        assertNotNull(rf.randomStringFromZodiacSign("Väduren"));
        assertNotEquals(rf.randomStringFromZodiacSign("Skytten").length(),0);
        }
    }


    @Test
    void firstNameRandomizer() {
        assertEquals(rf.firstNameRandomizer("Anna"), "your mom");
        assertEquals(rf.firstNameRandomizer("Cornelia"), "your favourite childhood teacher");
        assertEquals(rf.firstNameRandomizer(""), "your dad");
    }

    @Test
    void haircolorRandomizer() {
        assertEquals(rf.haircolorRandomizer("pink"), "dusk");
        assertEquals(rf.haircolorRandomizer("green"), "the darkest hour");
        assertEquals(rf.haircolorRandomizer("grey"), "dawn");
    }

    @Test
    void shoesizeRandomizer() {
        for (int i = 0; i < 1000 ; i++) {
        assertNotEquals(rf.shoesizeRandomizer(41), 200);
        assertNotEquals(rf.shoesizeRandomizer(31), 300);
        assertNotEquals(rf.shoesizeRandomizer(21), 400);
        }
    }
}