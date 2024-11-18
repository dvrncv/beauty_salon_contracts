package input;

import jakarta.validation.constraints.NotBlank;

import java.time.LocalTime;
import java.util.List;

public class CreateServiceInputModel {
    @NotBlank(message = "Название обязательно")
    String name;
    @NotBlank(message = "Цена обязательно")
    Integer price;
    @NotBlank(message = "Продолжительность обязательно")
    LocalTime duration;
    @NotBlank(message = "Описание обязательно")
    String description;
    @NotBlank(message = "Фото обязательно")
    String Url;
    @NotBlank(message = "Категория не верна")
    List<Integer> category;
}
