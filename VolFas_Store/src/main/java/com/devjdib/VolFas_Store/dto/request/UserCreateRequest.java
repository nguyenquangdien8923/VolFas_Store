package com.devjdib.VolFas_Store.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreateRequest {

    @Size(min = 3, message = "INVALID_THREE_CHARACTER")
    String firstName;

    @Size(min = 3, message = "INVALID_THREE_CHARACTER")
    String lastName;

    @Pattern(regexp = "^0[0-9]{9}$", message = "INVALID_PHONE_NUMBER")
    String phoneNumber;

    @NotBlank(message = "BLANK_FIELD")
    String address;

    @Email(message = "INVALID_EMAIL")
    String email;

    @Size(min = 8, message = "INVALID_PASSWORD")
    String password;

    @Builder.Default
    LocalDate joinDate = LocalDate.now();
    boolean userType = true;
    int status = 0;
}
