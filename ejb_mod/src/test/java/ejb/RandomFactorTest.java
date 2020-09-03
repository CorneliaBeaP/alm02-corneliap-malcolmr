package ejb;

import org.junit.Test;

import static org.junit.Assert.*;

public class RandomFactorTest {

    RandomFactor rf = new RandomFactor();

    @Test
    public void randomStringFromLastName() {
        assertEquals(rf.randomStringFromLastName("Rudhag"), "Your neighbors cat ");
        assertEquals(rf.randomStringFromLastName("Persson"), "Your neighbors cat ");
        assertEquals(rf.randomStringFromLastName(""), "You ");
        assertEquals(rf.randomStringFromLastName("Hunchback"), "Your secret lover ");
        assertEquals(rf.randomStringFromLastName("Bilbo"), "Your prison cellmate ");
        assertEquals(rf.randomStringFromLastName("Bob"), "Your pole dancing teacher ");
    }

    @Test
    public void randomStringFromCurrentPartners() {
        for (int i = 0; i < 1000; i++) {

            assertNotEquals(rf.randomStringFromCurrentPartners(1).length(), 0);
            assertNotNull(rf.randomStringFromCurrentPartners(20));
        }
    }

    @Test
    public void randomStringFromZodiacSign() {

        for (int i = 0; i < 1000; i++) {
            assertNotNull(rf.randomStringFromZodiacSign("Väduren"));
            assertNotEquals(rf.randomStringFromZodiacSign("Skytten").length(), 0);
        }
    }


     @Test
     public void firstNameRandomizer() {
        assertEquals(rf.firstNameRandomizer("Anna"), "your mom");
        assertEquals(rf.firstNameRandomizer("Cornelia"), "your favourite childhood teacher");
        assertEquals(rf.firstNameRandomizer(""), "your dad");
    }

    @Test
    public void haircolorRandomizer() {
        assertEquals(rf.haircolorRandomizer("pink"), "dusk");
        assertEquals(rf.haircolorRandomizer("green"), "the darkest hour");
        assertEquals(rf.haircolorRandomizer("grey"), "dawn");
    }

    @Test
    public void shoesizeRandomizer() {
        for (int i = 0; i < 1000; i++) {
            assertNotEquals(rf.shoesizeRandomizer(41), 200);
            assertNotEquals(rf.shoesizeRandomizer(31), 300);
            assertNotEquals(rf.shoesizeRandomizer(21), 400);
        }
    }
}