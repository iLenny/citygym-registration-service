package com.lennycodes.citygym.validations.validators;

import com.lennycodes.citygym.validations.validators.NotNullValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotNullValidatorTest {

    NotNullValidator notNullValidator;

    @BeforeEach
    public void setup() {
        notNullValidator = new NotNullValidator();
    }

    @Test
    public void validate_returnsFalseWhenNull() {
        assertFalse(notNullValidator.validate(null));
    }
}