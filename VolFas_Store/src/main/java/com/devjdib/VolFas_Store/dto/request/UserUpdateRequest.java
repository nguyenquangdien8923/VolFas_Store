package com.devjdib.VolFas_Store.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

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

    @NotBlank(message = "BLANK_FIELD")
    String address;

    @Size(min = 8, message = "INVALID_PASSWORD")
    String password;

    int status;
}
