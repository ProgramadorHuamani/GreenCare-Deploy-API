package com.example.agricorp.users.infrastructure.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequest {
    @NotEmpty(message = "El nombre no puede estar vacío")
    private String name;

    @Email(message = "El correo electrónico no tiene un formato válido")
    @NotEmpty(message = "El correo electrónico no puede estar vacío")
    private String email;

    @NotEmpty(message = "La contraseña no puede estar vacía")
    private String password;

    @NotEmpty(message = "La confirmación de contraseña no puede estar vacía")
    private String confirmPassword;
}
