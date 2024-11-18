package input;

import jakarta.validation.constraints.NotBlank;

public class CreateCategoryInputModel {
    @NotBlank(message="Название обязательно")
    String name;

}
