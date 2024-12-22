package controllers;

import form.ServiceSerachInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RequestMapping("/catalog")
public interface CatalogController {

        @GetMapping
        String getCatalogPage(@ModelAttribute ServiceSerachInputModel serviceSerachInputModel,
                              @RequestParam(value = "page", defaultValue = "1") int page,
                              @RequestParam(value = "size", defaultValue = "10") int size,
                              @RequestParam(value = "searchService", required = false) String searchService,
                              Principal principal, Model model);

        @GetMapping("/category/{categoryId}")
        String getServicesByCategory(@PathVariable Long categoryId, @ModelAttribute ServiceSerachInputModel serviceSerachInputModel,
                                     @RequestParam(value = "page", defaultValue = "1") int page,
                                     @RequestParam(value = "size", defaultValue = "10") int size,
                                     Principal principal,Model model);

        @GetMapping("/service/{serviceId}")
        String getServiceDetails(@PathVariable Long serviceId, Principal principal, Model model);
}
