package form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public class LoginInputModel {
    @Email(message = "Некорректно введен email")
    String email;

    @Size(min = 8, message = "Пароль должен содержать от 8 символов")
    String password;
}
