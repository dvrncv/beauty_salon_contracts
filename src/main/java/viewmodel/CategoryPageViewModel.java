package viewmodel;

import input.ServiceFilterInputModel;

import java.util.List;

public record CategoryPageViewModel(
        BaseViewModel base,
        List<CategoryViewModel> category,
        List<ServiceViewModel> service,
        ServiceFilterInputModel serviceFilterInputModel
) {
}
