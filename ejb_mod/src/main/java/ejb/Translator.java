package ejb;

public class Translator {

    private RandomFactor rf = new RandomFactor();
    private String fortune;

    public String generateFortune(PersonBean person){

        fortune = rf.randomStringFromZodiacSign(person.getZodiacSign());
        fortune += rf.randomStringFromLastName(person.getLastName());
        fortune += rf.randomStringFromCurrentPartners(person.getCurrentPartners());
        fortune += rf.firstNameRandomizer(person.getFirstName());
        fortune += " at ";
        fortune += rf.haircolorRandomizer(person.getHaircolor());
        fortune += "! Your lucky number today is " + rf.shoesizeRandomizer(person.getShoesize()) + "!";

        return fortune;
    }
}