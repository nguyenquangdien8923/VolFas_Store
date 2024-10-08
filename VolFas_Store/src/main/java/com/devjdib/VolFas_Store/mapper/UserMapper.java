package com.devjdib.VolFas_Store.mapper;

import com.devjdib.VolFas_Store.dto.request.UserCreateRequest;
import com.devjdib.VolFas_Store.dto.request.UserUpdateRequest;
import com.devjdib.VolFas_Store.dto.response.UserResponse;
import com.devjdib.VolFas_Store.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreateRequest request);
    List<UserResponse> toUsersResponse(List<User> users);
    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest userUpdateRequest);
}
