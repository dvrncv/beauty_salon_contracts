package controllers;

import input.FilterCategoryInputModel;
import input.SigningServiceInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/service")
public interface ServiceController {
    @GetMapping
    String listService(
            @ModelAttribute("signingService") SigningServiceInputModel signingService,
            Model model
    );
    @GetMapping
    String listCategories(
            @ModelAttribute("filter") FilterCategoryInputModel filter,
            Model model
    );
}
