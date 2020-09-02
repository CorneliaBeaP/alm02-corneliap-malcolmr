package web;

import ejb.PersonBeanLocal;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class PersonController implements Serializable {

    @EJB
    PersonBeanLocal personBeanLocal;

    private String firstName;
    private String lastName;
    private String haircolor;
    private int shoesize;
    private String zodiacSign;
    private int currentPartners;

    private String fortune = "Welcome to the fortune teller!";

public void createPersonAndReturnFortune(){
    System.out.println(personBeanLocal.createPersonAndReturnFortune(firstName, lastName, haircolor, shoesize, zodiacSign, currentPartners));
    setFortune(personBeanLocal.createPersonAndReturnFortune(firstName, lastName, haircolor, shoesize, zodiacSign, currentPartners));
}
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }

    public int getShoesize() {
        return shoesize;
    }

    public void setShoesize(int shoesize) {
        this.shoesize = shoesize;
    }

    public String getZodiacSign() {
        return zodiacSign;
    }

    public void setZodiacSign(String zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    public int getCurrentPartners() {
        return currentPartners;
    }

    public void setCurrentPartners(int currentPartners) {
        this.currentPartners = currentPartners;
    }

    public String getFortune() {
        return fortune;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }
}
