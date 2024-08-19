package com.devjdib.VolFas_Store.dto.response;

import com.devjdib.VolFas_Store.entity.Role;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserResponse {
    String id;
    String firstName;
    String lastName;
    String phoneNumber;
    String address;
    String email;
    LocalDate joinDate;
    LocalDate dob;
    int status;
    Set<Role> roles;
}
