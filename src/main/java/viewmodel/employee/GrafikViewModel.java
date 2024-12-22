package viewmodel.employee;

import java.time.LocalDate;
import java.time.LocalTime;

public record GrafikViewModel (
        LocalDate day,
        LocalTime startTime,
        LocalTime endTime
){}
