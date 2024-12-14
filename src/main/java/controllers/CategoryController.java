package controllers;

import form.CreateCategoryInputModel;
import form.CreateServiceInputModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/category")

public interface CategoryController {
    @GetMapping(path = "/create")
    String createCategory(Model model);

    @PostMapping(path = "/create")
    String createCategory(
            @Valid
            @ModelAttribute("createCategory") CreateCategoryInputModel createCategory,
            Model model
    );

    @GetMapping(path = "/update/{id}")
    String updateCategory(@PathVariable Long id, Model model);

    @PostMapping(path = "/update/{id}")
    String updateCategory(
            @PathVariable("id") Long id,
            @Valid
            @ModelAttribute("updateCategory") CreateCategoryInputModel createCategoryInputModel,
            Model model
    );
}
