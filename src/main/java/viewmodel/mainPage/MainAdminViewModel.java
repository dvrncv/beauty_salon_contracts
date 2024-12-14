package viewmodel.mainPage;

import viewmodel.BaseViewModel;
import viewmodel.order.OrderCardViewModel;

import java.util.List;

public record MainAdminViewModel (
        BaseViewModel baseViewModel,
        List<OrderCardViewModel> orderCardViewModel

        ){

}
