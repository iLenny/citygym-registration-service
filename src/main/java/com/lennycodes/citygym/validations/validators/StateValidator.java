package com.lennycodes.citygym.validations.validators;

import com.lennycodes.citygym.validations.validators.constants.States;

public class StateValidator implements Validator<String>{
    @Override
    public boolean validate(String val) {
        if(val == null || val.isBlank()) return false;
        if(val.length() != 2) return false;
        String state = States.stateMap.get(val.toUpperCase());
        if(state == null) return false;

        return true;
    }
}
