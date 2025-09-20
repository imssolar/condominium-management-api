package com.condominium.management_api.dto.request;

import com.condominium.management_api.enums.UserRole;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class CreateUserRequest {

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El formato del email no es válido")
    private String email;

    @NotBlank(message = "El nombre es obligatorio")
    @Size(min=2,max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String firstName;

    @NotBlank(message = "El apellido es obligatorio")
    @Size(min=2, max= 50, message = "El apellido debe tener entre 2 y 50 caracteres")
    private String lastName;

    @Pattern(regexp = "^(ADMIN|RESIDENT|STAFF)$", message = "El rol debe ser ADMIN, RESIDENT o STAFF")
    private String userRole = UserRole.RESIDENT.name();

    @Pattern(regexp = "^\\+56[0-9]{9}$" ,message = "El teléfono debe tener formato +56 seguido de 9 dígitos")
    private String phoneNumber;

    public CreateUserRequest(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
