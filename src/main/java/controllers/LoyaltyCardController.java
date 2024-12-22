package controllers;

import form.CreateLoyaltyCardInput;
import jakarta.validation.Valid;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.security.Principal;


@RequestMapping("/loyalty")
public interface LoyaltyCardController {
    @GetMapping("/list")
    String listLoyaltyCards(Principal principal, Model model);

    @GetMapping("/create")
    String createLoyaltyCard(Principal principal, Model model);

    @PostMapping("/create")
    String createLoyaltyCard(@Valid @ModelAttribute("createLoyaltyCard") CreateLoyaltyCardInput createLoyaltyCard,
                             Principal principal, Model model);

    @GetMapping("/card")
    String loyaltyCard(Principal principal, Model model);
}
