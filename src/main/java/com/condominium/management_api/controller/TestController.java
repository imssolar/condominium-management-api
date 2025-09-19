package com.condominium.management_api.controller;

import com.condominium.management_api.entity.User;
import com.condominium.management_api.repository.ApartmentRepository;
import com.condominium.management_api.repository.UserApartmentRepository;
import com.condominium.management_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ApartmentRepository apartmentRepository;

    @Autowired
    private UserApartmentRepository userApartmentRepository;

    @GetMapping("/test/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/test/user-by-email")
    public User getUserByEmail(){
        return userRepository.findByEmail("juan@test.com");
    }

}
