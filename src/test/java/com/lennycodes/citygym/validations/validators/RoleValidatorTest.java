package com.lennycodes.citygym.validations.validators;

import com.lennycodes.citygym.validations.validators.RoleValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleValidatorTest {
    RoleValidator roleValidator;

    @BeforeEach
    public void setup() {
        roleValidator = new RoleValidator();
    }

    @Test
    public void validate_returnsFalseWhenNullOrBlank() {
        assertFalse(roleValidator.validate(null));
        assertFalse(roleValidator.validate(""));
        assertFalse(roleValidator.validate(" "));
        assertFalse(roleValidator.validate("  "));
    }

    @Test
    public void validate_returnsFalseWhenNotValid() {
        assertFalse(roleValidator.validate("blahblah"));
        assertFalse(roleValidator.validate("Admin1"));
        assertFalse(roleValidator.validate("member2"));
        assertFalse(roleValidator.validate("employee_crew1"));
    }

    @Test
    public void validate_returnsTrueWhenValid() {
        assertTrue(roleValidator.validate("admin"));
        assertTrue(roleValidator.validate("ADMIN"));
        assertTrue(roleValidator.validate("employee_crew"));
        assertTrue(roleValidator.validate("employee_CREW"));
        assertTrue(roleValidator.validate("EMPLOYEE_CREW"));
        assertTrue(roleValidator.validate("EMPLOYEE_trainer"));
        assertTrue(roleValidator.validate("employee_trainer"));
        assertTrue(roleValidator.validate("EMPLOYEE_TRAINER"));
        assertTrue(roleValidator.validate("member"));
        assertTrue(roleValidator.validate("MEMBER"));
    }

}