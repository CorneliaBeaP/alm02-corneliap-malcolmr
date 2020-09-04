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
        assertEquals(rf.randomStringFromLastName("VeryLongLastNameIndeed"), "Your worst enemy ");
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
        assertEquals(rf.firstNameRandomizer("Femfe"), "your high school crush");
        assertEquals(rf.firstNameRandomizer("Gregor"), "your therapist");
        assertEquals(rf.firstNameRandomizer("Gregory"), "your best friend");
        assertEquals(rf.firstNameRandomizer("Valdemar+mer"), "your boss");
        assertEquals(rf.firstNameRandomizer("Bilboswagginsinioli"), "your parents");
    }

    @Test
    public void haircolorRandomizer() {
        assertEquals(rf.haircolorRandomizer("pink"), "dusk");
        assertEquals(rf.haircolorRandomizer("green"), "the darkest hour");
        assertEquals(rf.haircolorRandomizer("grey"), "dawn");
        assertEquals(rf.haircolorRandomizer("blue"), "noon");
        assertEquals(rf.haircolorRandomizer("blond"), "five o'clock");
        assertEquals(rf.haircolorRandomizer("brown"), "midnight");
        assertEquals(rf.haircolorRandomizer("black"), "half past six");
    }

    @Test
    public void shoesizeRandomizer() {
        for (int i = 0; i < 1000; i++) {
            assertNotEquals(rf.shoesizeRandomizer(41), 200);
            assertNotEquals(rf.shoesizeRandomizer(31), 300);
            assertNotEquals(rf.shoesizeRandomizer(21), 400);
            assertNotEquals(rf.shoesizeRandomizer(37), 400);
            assertNotEquals(rf.shoesizeRandomizer(39), 400);
            assertNotEquals(rf.shoesizeRandomizer(41), 400);
            assertNotEquals(rf.shoesizeRandomizer(44), 400);
            assertNotEquals(rf.shoesizeRandomizer(211), 400);
            assertNotEquals(rf.shoesizeRandomizer(41), -1);
            assertNotEquals(rf.shoesizeRandomizer(31), -1);
            assertNotEquals(rf.shoesizeRandomizer(21), -1);
            assertNotEquals(rf.shoesizeRandomizer(37), -1);
            assertNotEquals(rf.shoesizeRandomizer(39), -1);
            assertNotEquals(rf.shoesizeRandomizer(41), -1);
            assertNotEquals(rf.shoesizeRandomizer(44), -1);
            assertNotEquals(rf.shoesizeRandomizer(211), -1);
        }
    }
}