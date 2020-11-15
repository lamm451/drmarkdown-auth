package com.drmarkdown.auth.controllers;

import com.drmarkdown.auth.dtos.UserInfoDTO;
import com.drmarkdown.auth.dtos.UserLoginDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @PostMapping("/create")
    public UserInfoDTO createUser(@RequestBody UserInfoDTO userInfoDTO) {
        UserInfoDTO response = new UserInfoDTO();
        response.setCreatedAt(new Date());
        response.setDisplayName("Pantufas");
        response.setEmail("some.email@example.com");
        response.setUsername("Matilheiro");
        response.setRoles(userInfoDTO.getRoles());
        return response;
    }

    @GetMapping("/info/{userId}")
    public UserInfoDTO getUserInfo(@PathVariable  String userId) {
        UserInfoDTO response = new UserInfoDTO();
        response.setCreatedAt(new Date());
        response.setDisplayName("Pantufas_GET");
        response.setEmail("some.email@example.com");
        response.setUsername("Matilheiro_GET");
        return response;
    }

    @PostMapping("/login")
    public UserInfoDTO loginUser(@RequestBody UserLoginDTO userLoginDTO) {

        UserInfoDTO response = new UserInfoDTO();
        response.setCreatedAt(new Date());
        response.setDisplayName("Pantufas--LOGIN");
        response.setEmail("some.email@example.com");
        response.setUsername("Matilheiro--LOGIN");
        return response;
    }

    // TODO deleteUser, updateUser
}
