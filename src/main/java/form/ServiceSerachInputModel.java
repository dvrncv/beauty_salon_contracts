package form;

public class ServiceSerachInputModel {
    String searchService;
    Integer page;
    Integer size;
    Long categoryId;

    public ServiceSerachInputModel(String searchService, Integer page, Integer size, Long categoryId) {
        this.searchService = searchService;
        this.page = page;
        this.size = size;
        this.categoryId = categoryId;
    }

    public ServiceSerachInputModel(){

    }

    public String getSearchService() {
        return searchService;
    }

    public void setSearchService(String searchService) {
        this.searchService = searchService;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
