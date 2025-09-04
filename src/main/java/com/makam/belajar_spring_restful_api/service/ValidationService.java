package com.makam.belajar_spring_restful_api.service;

import com.makam.belajar_spring_restful_api.model.LoginUserRequest;
import com.makam.belajar_spring_restful_api.model.RegisterUserRequest;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validator;
import org.springframework.stereotype.Service;

import java.util.Set;


@Service
public class ValidationService {

    private Validator validator;

    public void validate(Object request) {
        Set<ConstraintViolation<Object>> constraintViolations = validator.validate(request);
        if(constraintViolations.size() != 0){
            throw new ConstraintViolationException(constraintViolations);
        }
    }
}
