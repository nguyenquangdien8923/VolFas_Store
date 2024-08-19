package com.devjdib.VolFas_Store.dto.request;

import com.devjdib.VolFas_Store.validator.DobConstraint;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {
    @Size(min = 3, message = "INVALID_THREE_CHARACTER")
    String firstName;

    @Size(min = 3, message = "INVALID_THREE_CHARACTER")
    String lastName;

    @Pattern(regexp = "^0[0-9]{9}$", message = "INVALID_PHONE_NUMBER")
    String phoneNumber;

    String address;

    @Size(min = 8, message = "INVALID_PASSWORD")
    String password;

    @DobConstraint(min = 18)
    LocalDate dob;

    int status;
    Set<String> roles;
}
