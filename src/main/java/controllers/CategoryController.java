package controllers;

import form.CreateCategoryInputModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;


@RequestMapping("/category")
public interface CategoryController {

    @GetMapping("/list")
    String listCategories(Principal principal, Model model);

    @GetMapping("/create")
    String createCategory(Principal principal,Model model);

    @PostMapping("/create")
    String createCategory(@Valid @ModelAttribute("createCategory") CreateCategoryInputModel createCategory,
                          Principal principal, Model model);

    @GetMapping("/update/{id}")
    String updateCategory(@PathVariable("id") Long id,
                          Principal principal, Model model);

    @PostMapping("/update/{id}")
    String updateCategory(@PathVariable("id") Long id,
                          @Valid @ModelAttribute("updateCategory") CreateCategoryInputModel createCategoryInputModel,
                          Principal principal, Model model);
}
