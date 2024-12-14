package viewmodel.mainPage;

import viewmodel.BaseViewModel;
import viewmodel.service.CardServiceViewModel;
import viewmodel.employee.EmployeePickViewModel;

import java.util.List;


public record MainUserPageViewModel(
        BaseViewModel base,
        List<EmployeePickViewModel> employeePick,
        CardServiceViewModel cardServiceViewModel
) { }
