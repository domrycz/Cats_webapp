package pl.domrycz;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Cat")
public class Cat {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private Float weight;
    @Column(nullable = false)
    private String keeper;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
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