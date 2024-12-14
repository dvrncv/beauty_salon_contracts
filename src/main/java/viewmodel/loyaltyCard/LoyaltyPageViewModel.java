package viewmodel.loyaltyCard;

import viewmodel.BaseViewModel;

public record LoyaltyPageViewModel(
        BaseViewModel baseViewModel,
        LoyaltyCardViewModel loyaltyCardViewModel
) {
}
