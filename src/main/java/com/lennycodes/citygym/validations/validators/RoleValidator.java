package com.lennycodes.citygym.validations.validators;

public class RoleValidator implements Validator<String>{
    @Override
    public boolean validate(String val) {
        if(val == null) return false;
        if(val.isBlank()) return false;

        val = val.toLowerCase();

        if(!val.equals("member") && !val.equals("employee_crew") &&
                !val.equals("employee_trainer") && !val.equals("admin")) {
            return false;
        }
        return true;
    }
}
