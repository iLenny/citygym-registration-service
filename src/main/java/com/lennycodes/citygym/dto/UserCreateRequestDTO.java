package com.lennycodes.citygym.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserCreateRequestDTO {
    private String role;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;
    private String gender;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String zipcode;
    private String email;
    private String password;
}
