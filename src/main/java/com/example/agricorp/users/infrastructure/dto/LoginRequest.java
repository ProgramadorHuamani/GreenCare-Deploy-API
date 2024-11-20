package com.example.agricorp.users.infrastructure.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginRequest {
    @NotEmpty(message = "El correo no puede estar vacío")
    @Email(message = "Debe ser un correo válido")
    private String email;

    @NotEmpty(message = "La contraseña no puede estar vacía")
    private String password;
}
