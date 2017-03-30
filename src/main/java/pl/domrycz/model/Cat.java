package pl.domrycz.model;

import java.util.Date;

public class Cat {
    private String name;
    private Date date = new Date();
    private double weight;
    private String keeper;

    void introduce() {
        System.out.println("Name: " + this.name + ", Birth date: " + this.date + ", weight: "
        + this.weight + ", my keeper: " +  this.keeper);
    }

}