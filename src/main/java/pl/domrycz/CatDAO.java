package pl.domrycz;

import java.util.ArrayList;
import java.util.List;

import pl.domrycz.model.Cat;

public class CatDAO {
    List<Cat> catsList = new ArrayList<Cat>();

    public void addCat(Cat cat) {
        catsList.add(cat);
        System.out.println("Cat has been added to database!\n");
    }

    public List<Cat> getCatsList() {
        return catsList;
    }

}
