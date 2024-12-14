package viewmodel.service;

import java.time.LocalTime;

public record CardServiceViewModel(
        Long id,
        String name,
        Integer price,
        Integer duration,
        String description,
        String categoryName

) {}



