package input;

import jakarta.validation.constraints.NotBlank;

public class UserAuthenticationInputModel {
    @NotBlank(message = "Логин не должен быть пустым")
     private String login;

    @NotBlank(message = "Пароль не должен быть пустым")
    private String password;
}
