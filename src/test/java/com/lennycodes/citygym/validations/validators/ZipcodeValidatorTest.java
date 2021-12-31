package com.lennycodes.citygym.validations.validators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZipcodeValidatorTest {

    ZipcodeValidator zipcodeValidator;

    @BeforeEach
    void setup() {
        zipcodeValidator = new ZipcodeValidator();
    }

    @Test
    void validate_returnsFalseWhenNullOrBlank() {
        assertFalse(zipcodeValidator.validate(null));
        assertFalse(zipcodeValidator.validate(""));
        assertFalse(zipcodeValidator.validate("   "));
    }

    @Test
    void validate_returnsFalseWhenIsNotDigitsOnly() {
        assertFalse(zipcodeValidator.validate("ABCDE"));
        assertFalse(zipcodeValidator.validate("a2345"));
        assertFalse(zipcodeValidator.validate("1010a"));
        assertFalse(zipcodeValidator.validate("10a05"));
    }

    @Test
    void validate_returnsFalseWhenLengthIsNot5() {
        assertFalse(zipcodeValidator.validate("123456"));
        assertFalse(zipcodeValidator.validate("1234"));
        assertFalse(zipcodeValidator.validate("12345abcde"));
    }

    @Test
    void validate_returnsTrueWhenIsValid() {
        assertTrue(zipcodeValidator.validate("60062"));
        assertTrue(zipcodeValidator.validate("10009"));
        assertTrue(zipcodeValidator.validate("12345"));
    }
}