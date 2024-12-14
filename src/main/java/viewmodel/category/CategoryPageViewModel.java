package viewmodel.category;

import form.SearchInputModel;
import form.ServiceFilterInputModel;
import form.ServiceSerachInputModel;
import viewmodel.BaseViewModel;
import viewmodel.service.CardServiceViewModel;

import java.util.List;

public record CategoryPageViewModel(
        BaseViewModel baseViewModel,
        List<CategoryViewModel> category,
        List<CardServiceViewModel> cardServiceViewModel,
        ServiceSerachInputModel serviceSerachInputModel
) {
}
