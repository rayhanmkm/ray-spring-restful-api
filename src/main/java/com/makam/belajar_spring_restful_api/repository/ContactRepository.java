package com.makam.belajar_spring_restful_api.repository;

import com.makam.belajar_spring_restful_api.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, String> {
}
