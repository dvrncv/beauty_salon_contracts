package controllers;

import form.BeautySalonSearchForm;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
public interface HomeController {

//    @GetMapping("/admin")
//    String homeAdminPage(
//            @ModelAttribute("form")BeautySalonSearchForm form,
//            BindingResult bindingResult,
//            Model model);


    @GetMapping
    String homePage(
            Model model
    );
}
