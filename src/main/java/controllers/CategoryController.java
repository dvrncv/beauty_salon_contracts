package controllers;

import input.CreateCategoryInputModel;
import input.CreateServiceInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/category")
public interface CategoryController {
    @GetMapping(path = "create")
    String create(
            @ModelAttribute("createCategory") CreateCategoryInputModel createCategory,
            Model model
    );
}
