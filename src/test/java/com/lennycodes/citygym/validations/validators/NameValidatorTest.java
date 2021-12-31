package com.lennycodes.citygym.validations.validators;

import com.lennycodes.citygym.validations.validators.NameValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameValidatorTest {
    NameValidator nameValidator;

    @BeforeEach
    public void setup() {
        nameValidator = new NameValidator();
    }

    @Test
    public void validate_returnsFalseWhenNullOrEmpty() {
        assertFalse(nameValidator.validate(null));
        assertFalse(nameValidator.validate(""));
        assertFalse(nameValidator.validate("    "));
        assertFalse(nameValidator.validate(" "));
    }

    @Test
    public void validate_returnsFalseWhenNonAlaphabetic() {
        assertFalse(nameValidator.validate("hello123"));
        assertFalse(nameValidator.validate("1231232"));
        assertFalse(nameValidator.validate("you_$"));
        assertFalse(nameValidator.validate("gr3at%"));
    }

    @Test
    public void validate_returnsTrueWhenValid() {
        assertTrue(nameValidator.validate("David"));
        assertTrue(nameValidator.validate("david davidson"));
        assertTrue(nameValidator.validate("Bob"));
        assertTrue(nameValidator.validate("Bob B Bobberson"));
    }

}