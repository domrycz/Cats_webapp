package pl.domrycz;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CatDAO {
    List<Cat> catsList = new ArrayList<Cat>();

    public void addCat(Cat cat) {
        catsList.add(cat);
        System.out.println("Cat has been added to database!\n");
    }

    public List<Cat> getCatsList() {
        return catsList;
    }

    public Cat getCatbyId(Integer id) {
        if(id < catsList.size())
            return catsList.get(id);
        else
            return null;
    }

}
