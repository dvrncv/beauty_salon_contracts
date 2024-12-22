package controllers;

import form.CreateServiceInputModel;
import form.SearchInputModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import viewmodel.service.CardServiceViewModel;

import java.security.Principal;
import java.util.List;

@RequestMapping("/service")
public interface ServiceController {

    @GetMapping("/list")
    String listServices(Principal principal, Model model);

    @GetMapping(path = "/create")
    String createService(Principal principal, Model model);

    @PostMapping(path = "/create")
    String createService(@Valid @ModelAttribute("createService") CreateServiceInputModel createService,
                         Principal principal,
                         Model model);

    @GetMapping(path = "/update/{id}")
    String updateService(@PathVariable Long id, Principal principal, Model model);

    @PostMapping(path = "/update/{id}")
    String updateService(@PathVariable("id") Long id,
                         @Valid @ModelAttribute("updateService") CreateServiceInputModel createServiceInputModel,
                         Principal principal,
                         Model model);

    @GetMapping("/{id}")
    String getServiceDetails(@PathVariable("id") Long id, Principal principal, Model model);
}
