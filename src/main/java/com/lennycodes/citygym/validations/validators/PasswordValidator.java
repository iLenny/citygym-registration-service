package com.lennycodes.citygym.validations.validators;

import java.util.regex.Pattern;

public class PasswordValidator implements Validator<String>{
    public static final String PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";

    @Override
    public boolean validate(String password) {
        if(password == null || password.isBlank()) return false;
        return Pattern.compile(PATTERN).matcher(password).matches();
    }
}
