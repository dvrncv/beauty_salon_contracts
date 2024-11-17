package viewmodel;

import java.util.List;

public record CardServiceViewModel(
        BaseViewModel base,
        List<EmployeePickViewModel> employeePick,
        ServiceViewModel service,
        LoyaltyCardViewModel loyaltyCard
) { }
