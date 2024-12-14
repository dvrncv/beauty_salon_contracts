package controllers;

import form.CreateServiceInputModel;
import form.SearchInputModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/service")
public interface ServiceController {

    @GetMapping(path = "/create")
    String createService(Model model);

    @PostMapping(path = "/create")
    String createService(
            @Valid
            @ModelAttribute("createService") CreateServiceInputModel createService,
            Model model
    );

    @GetMapping(path = "/update/{id}")
    String updateService(@PathVariable Long id, Model model);

    @PostMapping(path = "/update/{id}")
    String updateService(
            @PathVariable("id") Long id,
            @Valid
            @ModelAttribute("updateService") CreateServiceInputModel createServiceInputModel,
            Model model
     );

    @GetMapping(path = "/delete/{id}")
    String deleteService(
            @PathVariable("id") Long id,
            Model model
    );

//    @GetMapping("/{id}")
//    String singleServicePage(
//            @PathVariable("id") Long id
//    );
//
//    @GetMapping("search")
//    String search(
//            @ModelAttribute("search") SearchInputModel searchInputModel,
//            Model model
//    );
}
