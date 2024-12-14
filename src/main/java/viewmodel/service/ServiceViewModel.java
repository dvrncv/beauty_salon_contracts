package viewmodel.service;

import viewmodel.BaseViewModel;
import viewmodel.loyaltyCard.LoyaltyCardViewModel;
import viewmodel.employee.EmployeePickViewModel;

import java.util.List;

public record ServiceViewModel (
        List<EmployeePickViewModel> employeePick,
        CardServiceViewModel cardServiceViewModel,
        LoyaltyCardViewModel loyaltyCard
)
{ }
