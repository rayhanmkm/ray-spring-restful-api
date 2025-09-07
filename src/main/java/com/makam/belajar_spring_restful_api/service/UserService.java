package com.makam.belajar_spring_restful_api.service;

import com.makam.belajar_spring_restful_api.entity.User;
import com.makam.belajar_spring_restful_api.model.LoginUserRequest;
import com.makam.belajar_spring_restful_api.model.RegisterUserRequest;
import com.makam.belajar_spring_restful_api.model.UserResponse;
import com.makam.belajar_spring_restful_api.repository.UserRepository;
import com.makam.belajar_spring_restful_api.security.BCrypt;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ValidationService validationService;
    //untuk validasi aturan bisnis (misalnya "username harus unik", "saldo minimal Rp 10.000").

    @Transactional
    public void register(RegisterUserRequest request){
        validationService.validate(request);

        if (userRepository.existsById(request.getUsername())){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Username already exists");
        }

        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(BCrypt.hashpw(request.getPassword(), BCrypt.gensalt()));
        user.setName(request.getName());

        userRepository.save(user);
    }

    public UserResponse get(User user){
        return UserResponse.builder()
                .username(user.getUsername())
                .name(user.getName())
                .build();
    }
}
