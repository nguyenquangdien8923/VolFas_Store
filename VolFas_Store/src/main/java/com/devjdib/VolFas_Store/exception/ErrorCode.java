package com.devjdib.VolFas_Store.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error!", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1111, "Uncategorized error!", HttpStatus.BAD_REQUEST),
    EMAIL_EXISTED(1001, "Email existed!", HttpStatus.BAD_REQUEST),
    INVALID_EMAIL(1002, "Invalid email!", HttpStatus.BAD_REQUEST),
    BLANK_FIELD(1003, "Please do not leave this field blank!", HttpStatus.BAD_REQUEST),
    EMPTY_FIELD(1004, "Please do not leave this field empty!", HttpStatus.BAD_REQUEST),
    INVALID_THREE_CHARACTER(1005, "This field must contain at least {min} character!", HttpStatus.BAD_REQUEST),
    INVALID_PHONE_NUMBER(1006, "Invalid phone number!", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1007, "Invalid password!", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(1008, "User not found!", HttpStatus.NOT_FOUND),
    USER_NOT_EXISTED(1009, "User not existed!", HttpStatus.BAD_REQUEST),
    INVALID_TOKEN(1010, "Invalid token!", HttpStatus.BAD_REQUEST),
    UNAUTHENTICATED(1011, "Unauthenticated!", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1012, "You don't have permission!", HttpStatus.FORBIDDEN),
    INVALID_DOB(1013, "Your age must be at least {min}!", HttpStatus.BAD_REQUEST),
    ;

    int code;
    String message;
    HttpStatusCode statusCode;
}
