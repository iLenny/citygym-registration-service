package com.lennycodes.citygym.validations.validators;

public class GenderValidator implements Validator<String>{
    @Override
    public boolean validate(String val) {
        if(val == null || val.isBlank()) return false;

        if(val.equalsIgnoreCase("male") ||
           val.equalsIgnoreCase("female") ||
           val.equalsIgnoreCase("nonbinary")) {
            return true;
        }

        return false;
    }
}
