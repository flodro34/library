package com.studi.library.security.payload.request;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpRequest {

    @NotBlank
    @Size(min = 8, max = 40)
    @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%&]).{10,}", message = "le mot de passe doit contenir au moins 8 caractères, une majuscule, une minuscule, un chiffre et un caractère spécial")
    private String password;

    @NotBlank
    @Size(min = 3, max = 50)
    private String username;


}
