package com.lennycodes.citygym.validations.validators;

import com.lennycodes.citygym.validations.validators.StateValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StateValidatorTest {
    StateValidator stateValidator;

    @BeforeEach
    public void setup() {
        stateValidator = new StateValidator();
    }

    @Test
    public void validate_returnsFalseWhenNullOrBlank() {
        assertFalse(stateValidator.validate(null));
        assertFalse(stateValidator.validate(""));
        assertFalse(stateValidator.validate("   "));
    }

    @Test
    public void validate_returnsFalseWhenLengthIsNotTwo() {
        assertFalse(stateValidator.validate("L"));
        assertFalse(stateValidator.validate("LLLLL"));
        assertFalse(stateValidator.validate("NYY"));
    }

    @Test
    public void validate_returnsTrueWhenStateIsValid() {
        assertTrue(stateValidator.validate("NY"));
        assertTrue(stateValidator.validate("IL"));
        assertTrue(stateValidator.validate("AL"));
    }

    @Test
    public void validate_returnsTrueWhenStateIsNotValid() {
        assertFalse(stateValidator.validate("XX"));
        assertFalse(stateValidator.validate("PP"));
        assertFalse(stateValidator.validate("JA"));
    }


}