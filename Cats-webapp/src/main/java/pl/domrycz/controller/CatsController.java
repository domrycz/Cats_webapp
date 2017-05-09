package pl.domrycz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.domrycz.Cat;
import pl.domrycz.CatDAO;
import pl.domrycz.dto.CatDTO;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
public class CatsController {

    @Autowired
    CatDAO catDAO;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/add")
    public String addCat(HttpServletRequest request, @ModelAttribute("catDTO") @Valid CatDTO catDTO, BindingResult result) {
       if(request.getMethod().equalsIgnoreCase("post") && !result.hasErrors()) {
           Cat cat = new Cat();
           cat.setName(catDTO.getName());
           cat.setDate(catDTO.getDate());
           cat.setWeight(catDTO.getWeight());
           cat.setKeeper(catDTO.getKeeper());
           catDAO.addCat(cat);
           return "redirect:/showAll";
       }
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
