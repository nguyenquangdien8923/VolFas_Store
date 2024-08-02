package com.devjdib.VolFas_Store.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error!"),
    INVALID_KEY(1111, "Uncategorized error!"),
    EMAIL_EXISTED(1001, "Email existed!"),
    INVALID_EMAIL(1002, "Invalid email!"),
    BLANK_FIELD(1003, "Please do not leave this field blank!"),
    EMPTY_FIELD(1004, "Please do not leave this field empty!"),
    INVALID_THREE_CHARACTER(1005, "This field must contain at least three character!"),
    INVALID_PHONE_NUMBER(1006, "Invalid phone number!"),
    INVALID_PASSWORD(1007, "Invalid password!"),
    USER_NOT_FOUND(1008, "User not found!"),
    USER_NOT_EXISTED(1009, "User not existed!"),
    INCORRECT_PASSWORD(1010, "Password is incorrect!"),
    INVALID_TOKEN(1011, "Invalid token!")
    ;

    int code;
    String message;
}
