package viewmodel;

import java.util.List;

public record MainPageViewModel(
        BaseViewModel base,
        List<ServiceViewModel> service,
        List<EmployeeViewModel> employee
) { }
