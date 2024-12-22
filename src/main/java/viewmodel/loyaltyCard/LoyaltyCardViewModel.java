package viewmodel.loyaltyCard;

import java.time.LocalDate;

public record LoyaltyCardViewModel(
        Long numberCard,
        Integer balancePoint,
        LocalDate dateIssue,
        String status,
        String clientName,
        String clientSurname
) {
}
