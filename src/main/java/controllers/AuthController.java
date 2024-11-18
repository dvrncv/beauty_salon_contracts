package controllers;

import input.UserAuthenticationInputModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/auth")
public interface AuthController {
    @GetMapping("login")
    String login(
            @ModelAttribute("input") UserAuthenticationInputModel userAuthentication,
            Model model
    );
    @GetMapping("registration")
    String registration(
            @ModelAttribute("input")UserAuthenticationInputModel userAuthentication,
            Model model
    );
}
