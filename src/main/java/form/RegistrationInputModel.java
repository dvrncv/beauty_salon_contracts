package form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class RegistrationInputModel {
    @Email(message = "Некорректно введен email")
    String email;

    @NotBlank(message = "Имя не может быть пустым")
    String name;

    @NotBlank(message = "Фамилия не может быть пустым")
    String surname;

    @Size(min = 8, message = "Пароль должен содержать от 8 символов")
    String password;
}
