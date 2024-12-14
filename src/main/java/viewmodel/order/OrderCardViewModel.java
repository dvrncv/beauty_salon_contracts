package viewmodel.order;

import java.time.LocalDate;
import java.time.LocalTime;

public record OrderCardViewModel(
        String number,
        String nameService,
        Integer duration,
        String nameEmployee,
        String surnameEmployee,
        String nameUser,
        String surnameUser,
        LocalDate startDate,
        LocalTime startTime

) {
}
