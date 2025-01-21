package controllers;

import form.LoginInputModel;
import form.RegistrationInputModel;
import form.UserRegistrationInputModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import viewmodel.auth.UserProfileView;

import javax.naming.Binding;
import java.security.Principal;

@RequestMapping("/users")
public interface AuthController {

    @GetMapping("/register-employee")
    String registerEmployee(Principal principal);

    @PostMapping("/register-employee")
    String staffRegister(UserRegistrationInputModel userRegistrationInputModel,
                         BindingResult bindingResult,
                         Principal principal,
                         RedirectAttributes redirectAttributes);


    @GetMapping("/register-client")
    String registerClient();

    @PostMapping("/register-client")
    String doRegisterClient(@Valid UserRegistrationInputModel userRegistrationInputModel,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes);


    @GetMapping("/login")
    String login();

    @PostMapping("/login-error")
    String onFailedLogin(@ModelAttribute("username") String username,
                         RedirectAttributes redirectAttributes);

    @GetMapping("/profile")
    String profile(Principal principal, Model model);
}

