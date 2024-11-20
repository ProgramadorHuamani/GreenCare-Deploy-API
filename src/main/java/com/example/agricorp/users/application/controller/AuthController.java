package com.example.agricorp.users.application.controller;

import com.example.agricorp.users.domain.service.UserService;
import com.example.agricorp.users.infrastructure.dto.LoginRequest;
import com.example.agricorp.users.infrastructure.dto.RegisterRequest;
import com.example.agricorp.users.infrastructure.dto.UserResponse;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public ResponseEntity<UserResponse> register(@Valid @RequestBody RegisterRequest registerRequest) {
        UserResponse response = userService.register(registerRequest);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        String token = userService.login(email, password);
        return ResponseEntity.ok(token);
    }
}
