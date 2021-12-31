package com.lennycodes.citygym.validations.validators;

import java.time.LocalDate;

public class LegalAgeValidator implements Validator<LocalDate>{
    @Override
    public boolean validate(LocalDate dob) {
        if(dob == null) return false;

        LocalDate current = LocalDate.now();
        int years = current.minusYears(dob.getYear()).getYear();

        int dobMonth = dob.getMonthValue();
        int currentMonth = dob.getMonthValue();

        boolean monthPassed = dobMonth <= currentMonth;
        boolean dayPassed = true;

        if(dobMonth == currentMonth) {
            if(dob.getDayOfMonth() > current.getDayOfMonth()) {
                dayPassed = false;
            }
        }

        if(years >= 18 && monthPassed && dayPassed) return true;
        return false;
    }
}
