package viewmodel;

import java.time.LocalTime;

public record ServiceViewModel (
        String name,
        Integer price,
        LocalTime duration,
        String description,
        String Url
)
{ }
