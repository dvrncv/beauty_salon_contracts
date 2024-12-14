package controllers;

import form.CreateLoyaltyCardInput;
import form.CreateServiceInputModel;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/loyalty")
public interface LoyaltyCardController {
    @GetMapping(path = "/create")
    String createLoyaltyCard(Model model);

    @PostMapping(path = "/create")
    String createLoyaltyCard(
            @Valid
            @ModelAttribute("createLoyaltyCard") CreateLoyaltyCardInput createLoyaltyCard,
            Model model
    );
}
