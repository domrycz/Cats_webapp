package pl.domrycz.dto;

import org.hibernate.validator.constraints.NotBlank;
import javax.validation.constraints.*;

public class CatDTO {

    @NotBlank(message = "This field can't be empty!")
    @Size(min = 3, max = 15)
    private String name;

    @NotBlank(message = "This field can't be empty!")
    @Pattern(regexp="[1-2][0-9]{3}-[0-1][0-9]-[0-3][0-9]")
    private String date;

    @NotNull(message = "This field can't be empty!")
    @Min(0)
    @Max(99)
    private Float weight;

    @NotBlank(message = "This field can't be empty!")
    @Size(min = 2, max = 30)
    private String keeper;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
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
}
