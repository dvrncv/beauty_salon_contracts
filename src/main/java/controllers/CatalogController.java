package controllers;

import form.SearchInputModel;
import form.ServiceFilterInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public interface CatalogController {
    @RequestMapping("/showService")
    public interface CategoryServiceController {

        @GetMapping(path = "/category")
        String ShowCategoryPage (Model model);

        @GetMapping(path = "/service")
        String getService (Long categoryId, SearchInputModel searchInputModel, Model model);

    }
}
