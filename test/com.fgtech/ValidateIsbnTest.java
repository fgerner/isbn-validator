package com.fgtech;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateIsbnTest {
    @Test
    public void CheckValidIsbn() {
        ValidateIsbn validator = new ValidateIsbn();
        boolean result = validator.checkIsbn("0134685997");
        assertTrue(result);
        boolean secondResult = validator.checkIsbn("1260440230");
        assertTrue(secondResult);
    }

    @Test
    public void CheckInValidIsbn() {
        ValidateIsbn validator = new ValidateIsbn();
        boolean result = validator.checkIsbn("0134685987");
        assertFalse(result);
    }

    @Test(expected = NumberFormatException.class)
    public void NineDigitNumbersAreNotAllowed(){
        ValidateIsbn validator = new ValidateIsbn();
        validator.checkIsbn("123456789");
    }

}