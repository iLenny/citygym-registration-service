package com.lennycodes.citygym.validations.validators;

import java.util.stream.Stream;

public class NameValidator implements Validator<String>{
    @Override
    public boolean validate(String val) {
        if(val == null) return false;
        if(val.isBlank()) return false;

        Stream<Character> charStream = val.chars().mapToObj(c-> (char) c);
        boolean nonAlphabeticFound = charStream.anyMatch(c -> !Character.isAlphabetic(c) && c != ' ');

        return !nonAlphabeticFound;
    }
}
