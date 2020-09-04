package ejb;

import org.junit.Test;

import static org.junit.Assert.*;

public class TranslatorTest {
    Translator translator = new Translator();

    @Test
    public void generateFortune() {
        PersonBean person = new PersonBean();
        person.setCurrentPartners(2);
        person.setFirstName("Malcolm");
        person.setHaircolor("Brown");
        person.setLastName("Rudhag");
        person.setShoesize(41);
        person.setZodiacSign("Skytte");

        for (int i = 0; i < 1000; i++) {
            assertNotNull(translator.generateFortune(person));
            assertNotEquals(translator.generateFortune(person).length(),0);
        }
    }
}