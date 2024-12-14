package controllers;

import form.LoginInputModel;
import form.RegistrationInputModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.naming.Binding;

@RequestMapping("/auth")
public interface AuthController {

    @GetMapping("/register")
    String registerForm(Model model);

    @PostMapping("/register")
    String register(
            @Valid
            @ModelAttribute("register") RegistrationInputModel registrationInputModel, BindingResult bindingResult, Model model);

    @GetMapping("/login")
    String loginForm(Model model);

    @PostMapping("/login")
    String login(@Valid
                 @ModelAttribute("login") LoginInputModel loginInputModel, BindingResult bindingResult, Model model);

}
