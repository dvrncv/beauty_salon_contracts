package controllers;

import form.CreateGrafikInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;


@RequestMapping("/employee")
public interface EmployeeController {

    @GetMapping(path = "/list")
    String employeeList(Principal principal, Model model);

    @GetMapping(path = "/create/grafik")
    String createGrafik(Model model, Principal principal);

    @PostMapping(path = "/create/grafik")
    String createGrafik(@ModelAttribute("createGrafik") CreateGrafikInputModel createGrafikInputModel,
                        Principal principal, Model model);

    @GetMapping("/grafik")
    String getGrafik (Principal principal, Model model);

    @GetMapping(path = "/appointment")
    String getEmployeeGrafik(Principal principal,Model model);
}

