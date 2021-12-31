package com.lennycodes.citygym.validations.validators;

import com.lennycodes.citygym.validations.validators.LegalAgeValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LegalAgeValidatorTest {

    LegalAgeValidator legalAgeValidator;

    @BeforeEach
    public void setup() {
        legalAgeValidator = new LegalAgeValidator();
    }

    @Test
    public void validate_returnFalseIfNull() {
        assertFalse(legalAgeValidator.validate(null));
    }

    @Test
    public void validate_returnFalseIfNotLegalAge() {
        LocalDate year5 = LocalDate.now().minusYears(5);
        LocalDate year10 = LocalDate.now().minusYears(10);
        LocalDate year17 = LocalDate.now().minusYears(17);

        assertFalse(legalAgeValidator.validate(year5));
        assertFalse(legalAgeValidator.validate(year10));
        assertFalse(legalAgeValidator.validate(year17));
    }

    @Test
    public void validate_returnTrueIfLegalAge() {
        LocalDate year18 = LocalDate.now().minusYears(18);
        LocalDate year20 = LocalDate.now().minusYears(20);
        LocalDate year25 = LocalDate.now().minusYears(25);
        LocalDate year50 = LocalDate.now().minusYears(50);

        assertTrue(legalAgeValidator.validate(year18));
        assertTrue(legalAgeValidator.validate(year20));
        assertTrue(legalAgeValidator.validate(year25));
        assertTrue(legalAgeValidator.validate(year50));
    }

    @Test
    public void validate_returnTrueIfLegalAgeSameMonth() {
        LocalDate dob = LocalDate.now().minusYears(18);
        dob = dob.minusDays(1);
        assertTrue(legalAgeValidator.validate(dob));

        dob = dob.plusDays(3);
        assertFalse(legalAgeValidator.validate(dob));
    }
}