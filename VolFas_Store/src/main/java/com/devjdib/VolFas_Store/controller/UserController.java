package com.devjdib.VolFas_Store.controller;

import com.devjdib.VolFas_Store.dto.request.ApiResponse;
import com.devjdib.VolFas_Store.dto.request.UserCreateRequest;
import com.devjdib.VolFas_Store.dto.request.UserUpdateRequest;
import com.devjdib.VolFas_Store.dto.response.UserInfoResponse;
import com.devjdib.VolFas_Store.dto.response.UserResponse;
import com.devjdib.VolFas_Store.entity.User;
import com.devjdib.VolFas_Store.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserService userService;

    @PostMapping
    ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreateRequest request) {
        var result = userService.createUser(request);

        return ApiResponse.<UserResponse>builder()
                .result(result)
                .build();
    }

    @GetMapping
    ApiResponse<List<UserResponse>> getUsers() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();

        log.info("Username : {}", authentication.getName());
        authentication.getAuthorities().forEach(role -> log.info("Roles : {}", role.getAuthority().toString()));

        var result = userService.getUsers();

        return ApiResponse.<List<UserResponse>>builder()
                .result(result)
                .build();
    }

    @GetMapping("/{userId}")
    ApiResponse<UserResponse> getUserById(@PathVariable String userId) {
        var result = userService.getUserById(userId);

        return ApiResponse.<UserResponse>builder()
                .result(result)
                .build();
    }

    @GetMapping("/myInfo")
    ApiResponse<UserInfoResponse> getMyInfo() {
        var email = SecurityContextHolder.getContext().getAuthentication().getName();

        var result = userService.getMyInfo(email);

        return ApiResponse.<UserInfoResponse>builder()
                .result(result)
                .build();
    }

    @PutMapping("/{userId}")
    ApiResponse<UserResponse> updateUser(@PathVariable String userId, @RequestBody @Valid UserUpdateRequest request) {
        var result = userService.updateUser(userId, request);

        return ApiResponse.<UserResponse>builder()
                .result(result)
                .build();
    }

    @DeleteMapping("/{userId}")
    ApiResponse updateUser(@PathVariable String userId) {
        userService.deleteUser(userId);

        return ApiResponse.<UserResponse>builder()
                .message("Complete deleted.")
                .build();
    }






}
