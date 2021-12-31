package com.lennycodes.citygym.validations.validators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator passwordValidator;

    @BeforeEach
    public void setup() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void validate_returnsFalseIfNullOrBlank() {
        assertFalse(passwordValidator.validate(null));
        assertFalse(passwordValidator.validate(""));
        assertFalse(passwordValidator.validate("   "));
    }

    @Test
    public void validate_returnsFalseWhenNotInCharLength() {
        assertFalse(passwordValidator.validate("Test$1")); // less than 8 chars
        assertFalse(passwordValidator.validate("Test$2TooLongOfAPassword")); // more than 20
    }

    @Test
    public void validate_returnsFalseWhenNoUpperCase() {
        assertFalse(passwordValidator.validate("test$test1"));
        assertFalse(passwordValidator.validate("test#200test"));
    }

    @Test
    public void validate_returnsFalseWhenNoLowerCase() {
        assertFalse(passwordValidator.validate("TEST$TEST1"));
        assertFalse(passwordValidator.validate("TEST#200TEST"));
    }

    @Test
    public void validate_returnsFalseWhenNoSpecialChars() {
        assertFalse(passwordValidator.validate("TestTest1"));
        assertFalse(passwordValidator.validate("Test200Test"));
    }

    @Test
    public void validate_returnsTrueWhenValid() {

        assertTrue(passwordValidator.validate("Test!100")); // exactly 8 chars
        assertTrue(passwordValidator.validate("Test$Test1"));
        assertTrue(passwordValidator.validate("Test#200Test"));
        assertTrue(passwordValidator.validate("Test@300Test"));
        assertTrue(passwordValidator.validate("Test*5Test"));
        assertTrue(passwordValidator.validate("Test*5TestTestTest10")); // exactly 20 chars
    }

}