package com.lennycodes.citygym.validations.validators;

public class ZipcodeValidator implements Validator<String> {
    @Override
    public boolean validate(String zipcode) {
        if(zipcode == null || zipcode.isBlank()) return false;
        if(zipcode.length() != 5) return false;

        for(int i = 0; i < 5; i++) {
            if(!Character.isDigit(zipcode.charAt(i))) {
                return false;
            }
        }

        return true;
    }
}
