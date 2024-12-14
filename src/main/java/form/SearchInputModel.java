package form;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public class SearchInputModel {
    @NotNull(message = "Введите цену больше 0")
    String fromSize;
    @NotNull(message = "Введите цену больше 0")
    String toSize;
    @NotNull(message = "Введите страницу больше 0")
    Integer page;
    @NotNull(message = "Введите размер больше 0")
    Integer size;

    private List<String> categories;

    public SearchInputModel(String fromSize, String toSize, Integer page, Integer size, List<String> categories) {
        this.fromSize = fromSize;
        this.toSize = toSize;
        this.page = page;
        this.size = size;
        this.categories = categories;
    }

    public String getFromSize() {
        return fromSize;
    }

    public void setFromSize(String fromSize) {
        this.fromSize = fromSize;
    }

    public  String getToSize() {
        return toSize;
    }

    public void setToSize(String toSize) {
        this.toSize = toSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage( Integer page) {
        this.page = page;
    }

    public  Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }
}
