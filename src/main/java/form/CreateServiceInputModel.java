package form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalTime;
import java.util.List;

public class CreateServiceInputModel {
    @NotBlank(message = "Название обязательно")
    String name;
    @NotNull(message = "Price cannot be null")
    Integer price;
    @NotNull(message = "Продолжительность обязательно")
    Integer duration;
    @NotBlank(message = "Описание обязательно")
    String description;
    //    @NotBlank(message = "Фото обязательно")
//    String Url;
    @NotNull(message = "Категория обязательна")
    Long categoryId;

    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice( Integer price) {
        this.price = price;
    }

    public  Integer getDuration() {
        return duration;
    }

    public void setDuration( Integer duration) {
        this.duration = duration;
    }

    public  String getDescription() {
        return description;
    }

    public void setDescription ( String description) {
        this.description = description;
    }

//    public @NotBlank(message = "Фото обязательно") String getUrl() {
//        return Url;
//    }
//
//    public void setUrl(@NotBlank(message = "Фото обязательно") String url) {
//        Url = url;
//    }


    public @NotNull(message = "Категория обязательна") Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@NotNull(message = "Категория обязательна") Long categoryId) {
        this.categoryId = categoryId;
    }
}

