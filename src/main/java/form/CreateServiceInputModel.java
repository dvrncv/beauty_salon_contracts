package form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class CreateServiceInputModel {
    String name;
    Integer price;
    Integer duration;
    String description;
    Long categoryId;

    @NotBlank(message = "Название обязательно")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NotNull(message = "Цена не должна быть равна 0")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @NotNull(message = "Продолжительность обязательно")
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @NotBlank(message = "Описание обязательно")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotNull(message = "Категория обязательна")
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@NotNull(message = "Категория обязательна") Long categoryId) {
        this.categoryId = categoryId;
    }
}

