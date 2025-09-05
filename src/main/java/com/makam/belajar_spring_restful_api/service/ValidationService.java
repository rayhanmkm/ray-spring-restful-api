package com.makam.belajar_spring_restful_api.service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ValidationService {

    private final Validator validator;

    public ValidationService(Validator validator) {
        this.validator = validator;
    }

    public <T> void validate(T request) {
        Set<ConstraintViolation<T>> violations = validator.validate(request);
        if (!violations.isEmpty()) {
            // Bisa juga bikin custom exception, misalnya ValidationException
            throw new RuntimeException("Validation failed: " + violations);
        }
    }
}

