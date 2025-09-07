package com.makam.belajar_spring_restful_api.repository;

import com.makam.belajar_spring_restful_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findFristByToken(String token);
}
