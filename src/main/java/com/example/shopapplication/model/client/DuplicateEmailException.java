package com.example.shopapplication.model.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(
        value = HttpStatus.BAD_REQUEST,
        reason = "Klient o podanym e-mailu już istnieje"
)
public class DuplicateEmailException extends RuntimeException {
}
