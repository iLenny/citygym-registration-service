package com.lennycodes.citygym.validations.validators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {
    EmailValidator emailValidator;

    @BeforeEach
    public void setup() {
        emailValidator = new EmailValidator();
    }

    @Test
    public void validate_returnsFalseIfEmailIsNullOrBlank() {
        assertFalse(emailValidator.validate(null));
        assertFalse(emailValidator.validate(""));
        assertFalse(emailValidator.validate("   "));
    }

    @Test
    public void validate_returnsFalseIfEmailIsNotValid() {
        assertFalse(emailValidator.validate("Testing"));
        assertFalse(emailValidator.validate("test@test"));
        assertFalse(emailValidator.validate("test @ test.com"));
        assertFalse(emailValidator.validate("test @test.com"));
        assertFalse(emailValidator.validate("test-@test-com"));
        assertFalse(emailValidator.validate("test@ test.com"));
        assertFalse(emailValidator.validate("test@@test.com"));
    }

    @Test
    public void validate_returnsTrueIfEmailIsValid() {
        assertTrue(emailValidator.validate("test@example.com"));
        assertTrue(emailValidator.validate("test123@example-test.org"));
        assertTrue(emailValidator.validate("test$123@example.net"));
        assertTrue(emailValidator.validate("te.st$100@example.net"));
    }
}