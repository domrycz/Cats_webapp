package pl.domrycz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.domrycz.CatDAO;

@Controller
public class CatsController {

    @Autowired
    CatDAO catDAO;

    @RequestMapping("/add")
    public String addCat(Model model) {
        return "add";
    }

    @RequestMapping("/showAll")
    public String showAllCats(Model model) {
        model.addAttribute("catsList", catDAO.getCatsList());
        return "showAll";
    }

    @RequestMapping("/cat-{id}")
    public String showDetails(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("cat", catDAO.getCatbyId(id));
        return "showDetails";
    }
}
