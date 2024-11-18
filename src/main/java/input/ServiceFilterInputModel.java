package input;

import jakarta.validation.constraints.NotBlank;

public class ServiceFilterInputModel {
    @NotBlank(message = "Категория введена неверно")
    private Long categoryId;
}
