package viewmodel.employee;

import java.time.LocalDate;

public record EmployeePickViewModel(
        String surname,
        String name,
        LocalDate startDate
) {
}
