package controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@RequestMapping("/home")
public interface HomeController {

    @GetMapping
    String homePage(Principal principal, Model model);
}
