package com.devjdib.VolFas_Store.controller;

import com.devjdib.VolFas_Store.dto.request.ApiResponse;
import com.devjdib.VolFas_Store.dto.request.UserCreateRequest;
import com.devjdib.VolFas_Store.dto.request.UserUpdateRequest;
import com.devjdib.VolFas_Store.dto.response.UserResponse;
import com.devjdib.VolFas_Store.entity.User;
import com.devjdib.VolFas_Store.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping
    ApiResponse<User> createUser(@RequestBody @Valid UserCreateRequest request) {

        ApiResponse apiResponse = new ApiResponse();

        apiResponse.setResult(userService.createUser(request));

        return apiResponse;
    }

    @GetMapping
    ApiResponse<List<UserResponse>> getUsers() {
        ApiResponse apiResponse = new ApiResponse();

        apiResponse.setResult(userService.getUsers());

        return apiResponse;
    }

    @GetMapping("/{userId}")
    ApiResponse<UserResponse> getUserById(@PathVariable String userId) {
        ApiResponse apiResponse = new ApiResponse();

        apiResponse.setResult(userService.getUserById(userId));

        return apiResponse;
    }

    @PutMapping("/{userId}")
    ApiResponse<UserResponse> updateUser(@PathVariable String userId, @RequestBody @Valid UserUpdateRequest request) {
        ApiResponse apiResponse = new ApiResponse();

        apiResponse.setResult(userService.updateUser(userId, request));

        return apiResponse;
    }

    @DeleteMapping("/{userId}")
    ApiResponse<UserResponse> updateUser(@PathVariable String userId) {
        ApiResponse apiResponse = new ApiResponse();

        userService.deleteUser(userId);
        apiResponse.setMessage("Complete deleted.");

        return apiResponse;
    }






}
