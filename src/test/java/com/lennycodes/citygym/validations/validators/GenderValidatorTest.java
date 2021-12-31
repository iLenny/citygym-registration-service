package com.lennycodes.citygym.validations.validators;

import com.lennycodes.citygym.validations.validators.GenderValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderValidatorTest {

    GenderValidator genderValidator;

    @BeforeEach
    public void setup() {
        genderValidator = new GenderValidator();
    }

    @Test
    public void validate_returnsFalseIfNullOrBlank() {
        assertFalse(genderValidator.validate(null));
        assertFalse(genderValidator.validate(""));
        assertFalse(genderValidator.validate("   "));
    }

    @Test
    public void validate_returnsTrueIfMaleNotCaseSensitive() {
        assertTrue(genderValidator.validate("male"));
        assertTrue(genderValidator.validate("Male"));
        assertTrue(genderValidator.validate("mAle"));
        assertTrue(genderValidator.validate("MALE"));
    }

    @Test
    public void validate_returnsTrueIfFemaleNotCaseSensitive() {
        assertTrue(genderValidator.validate("female"));
        assertTrue(genderValidator.validate("Female"));
        assertTrue(genderValidator.validate("FEMALE"));
        assertTrue(genderValidator.validate("FeMaLE"));
    }

    @Test
    public void validate_returnsTrueIfNonBinaryNotCaseSensitive() {
        assertTrue(genderValidator.validate("nonbinary"));
        assertTrue(genderValidator.validate("NonBinary"));
        assertTrue(genderValidator.validate("NONBinary"));
        assertTrue(genderValidator.validate("NONBINARY"));
    }

}