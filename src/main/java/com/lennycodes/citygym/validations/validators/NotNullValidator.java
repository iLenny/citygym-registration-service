package com.lennycodes.citygym.validations.validators;

public class NotNullValidator implements Validator<Object>{
    @Override
    public boolean validate(Object o) {
        return o != null;
    }
}
