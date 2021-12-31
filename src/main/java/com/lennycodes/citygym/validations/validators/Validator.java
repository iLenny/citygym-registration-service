package com.lennycodes.citygym.validations.validators;

public interface Validator<T> {
    public boolean validate(T t);

    default boolean validate(T t, InvalidResultAction action) {
        boolean valid = validate(t);

        if(!valid) {
            action.performAction();
        }

        return valid;
    }
}
