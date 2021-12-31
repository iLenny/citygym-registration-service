package com.lennycodes.citygym.validations.validators;

import java.util.regex.Pattern;

public class EmailValidator implements Validator<String>{
    public static final String PATTERN = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*"
            + "@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

    @Override
    public boolean validate(String email) {
        if(email == null || email.isBlank()) return false;
        return Pattern.compile(PATTERN).matcher(email).matches();
    }
}
