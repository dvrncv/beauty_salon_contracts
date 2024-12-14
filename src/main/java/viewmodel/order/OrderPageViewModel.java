package viewmodel.order;

import viewmodel.BaseViewModel;
import viewmodel.service.CardServiceViewModel;

import java.util.List;
/**
* список заказов */

public record OrderPageViewModel(
        BaseViewModel baseViewModel,
        List<OrderCardViewModel> orderCardViewModels
) {
}
