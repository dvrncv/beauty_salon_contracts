package viewmodel;

import java.time.LocalDate;

public record EmployeePickViewModel(
        String surname,
        String name,
        LocalDate startDate
) {
}
