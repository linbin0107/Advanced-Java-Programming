package edu.pdx.cs410J.numbers2words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {
    @Test
    public void number0() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.numberToWords(0), "Zero");
    }

    @Test
    public void number10() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.numberToWords(10), "Ten");
    }

    @Test
    public void number15() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.numberToWords(15), "Fifteen");
    }

    @Test
    public void number99() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.numberToWords(99), "Ninety Nine");
    }

    @Test
    public void number1001() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.numberToWords(1001), "One Thousand One");
    }

    @Test
    public void number2000000000() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.numberToWords(2000000000), "Two Billion");
    }

    @Test
    public void number2100000000() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.numberToWords(2100000000), "Two Billion One Hundred Million");
    }
}
