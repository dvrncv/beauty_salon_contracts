package form;

public record BeautySalonSearchForm (
        BaseAdminForm base,
        PagesForm pages
) {
    public BeautySalonSearchForm {
        pages = pages == null ? new PagesForm(null, null, null) : pages;
    }
}