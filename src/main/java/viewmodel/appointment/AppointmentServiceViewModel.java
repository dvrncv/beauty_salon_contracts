package viewmodel.appointment;

import java.time.LocalDate;
import java.time.LocalTime;

public record AppointmentServiceViewModel(
        LocalDate dateStart,
         LocalTime timeStart,
         String clientName,
         String serviceName,
         Integer totalCost
) {
}
