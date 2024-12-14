package viewmodel.auth;

public class UserProfileView {
    private String name;

    private String email;

    private String surname;

    private String numberPhone;

    public UserProfileView() {
    }

    public UserProfileView(String name, String email, String surname, String numberPhone) {
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.numberPhone = numberPhone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
}
