package com.devjdib.VolFas_Store.dto.response;

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
public class UserInfoResponse {
    String id;
    String firstName;
    String lastName;
    String phoneNumber;
    String address;
    String email;
    String password;
    LocalDate joinDate;
    int status;
    Set<String> roles;
}
