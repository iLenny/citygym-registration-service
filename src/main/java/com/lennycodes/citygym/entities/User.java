package com.lennycodes.citygym.entities;

import com.lennycodes.citygym.entities.constants.UserGender;
import com.lennycodes.citygym.entities.constants.UserRole;
import com.lennycodes.citygym.entities.constants.UserStatus;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Enumerated(EnumType.STRING)
    private UserStatus status;

    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;

    @Enumerated(EnumType.STRING)
    private UserGender gender;

    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private String saltKey;
    private String hashedPassword;

    @CreationTimestamp
    private LocalDateTime memberSince;

    private LocalDateTime lastUpdated;
    private LocalDateTime lastActive;
    private LocalDateTime lastPasswordAttempt;
    private int numOfAttempts;
}
