package com.devjdib.VolFas_Store.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;
    String firstName;
    String lastName;
    String phoneNumber;
    String address;
    String email;
    String password;
    LocalDate dob;
    LocalDate joinDate;
    int status;

    @ManyToMany
    Set<Role> roles;
}
