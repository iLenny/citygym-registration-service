package com.lennycodes.citygym.common;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SaltKeyGeneratorTest {

    SaltKeyGenerator generator;

    @BeforeEach
    public void beforeAll() {
        generator = new SaltKeyGenerator();
    }

    @Test
    public void generateKey_mustNotReturnNullNorBlank() {
        assertNotNull(generator.generateKey());
        assertFalse(generator.generateKey().isBlank());
    }

    @Test
    public void generateKey_mustGenerateDifferntKeyEachTime() {
        String key1 = generator.generateKey();
        String key2 = generator.generateKey();
        String key3 = generator.generateKey();

        assertNotEquals(key1, key2);
        assertNotEquals(key1, key3);
        assertNotEquals(key2, key3);

        // Must not start the same way
        assertNotEquals(key1.substring(0,5), key2.substring(0,5));
        assertNotEquals(key1.substring(0,5), key3.substring(0,5));
        assertNotEquals(key2.substring(0,5), key3.substring(0,5));
    }



    @Test
    public void generateKey_mustHaveTheSameLength() {
        String key1 = generator.generateKey();
        String key2 = generator.generateKey();
        String key3 = generator.generateKey();

        // Expected Length 20
        assertEquals(20, key1.length());
        assertEquals(20, key2.length());
        assertEquals(20, key3.length());
    }

    @Test
    public void generateKey_mustHaveTheSameLengt() {
        String key1 = generator.generateKey();
        String key2 = generator.generateKey();
        String key3 = generator.generateKey();

        assertEquals(key1.length(), key2.length());
        assertEquals(key1.length(), key3.length());
        assertEquals(key2.length(), key3.length());
    }


}