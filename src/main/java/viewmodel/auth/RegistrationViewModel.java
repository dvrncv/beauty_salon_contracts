package viewmodel.auth;

public record RegistrationViewModel(
        String email,
        String name,
        String surname,
        String password
) {
}
