package com.lennycodes.citygym.common;

import java.util.Random;

public class SaltKeyGenerator implements KeyGenerator{
    public static final int LENGTH = 20;

    @Override
    public String generateKey() {
        StringBuilder keyBuilder = new StringBuilder();
        String possibleChars = "abcdef0123456789";
        Random random = new Random();
        for(int i = 0; i < LENGTH; i++) {
            int randomIndex = random.nextInt(possibleChars.length());
            keyBuilder.append(possibleChars.charAt(randomIndex));
        }
        return keyBuilder.toString();
    }
}
