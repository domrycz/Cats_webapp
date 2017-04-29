package pl.domrycz.domain;

import java.util.Date;

public class Cat {
    private String name;
    private Date date = new Date();
    private Float weight;
    private String keeper;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public Float getWeight() {
        return weight;
    }
    public void setWeight(Float weight) {
        this.weight = weight;
    }
    public String getKeeper() {
        return keeper;
    }
    public void setKeeper(String keeper) {
        this.keeper = keeper;
    }

    public void introduce() {
        System.out.println("Name: " + getName() + ", Birth date: " + getDate() + ", weight: "
        + getWeight() + ", my keeper: " +  getKeeper());
    }

}