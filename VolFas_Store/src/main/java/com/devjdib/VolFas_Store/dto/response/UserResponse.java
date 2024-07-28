package com.devjdib.VolFas_Store.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {
    String id;
    String firstName;
    String lastName;
    String phoneNumber;
    String address;
    String email;
    String password;
    LocalDate joinDate;
    boolean userType;
    int status;
}
