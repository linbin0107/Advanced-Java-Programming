package edu.pdx.cs410J.numbers2words;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {
    @Test
    public void numberZeroReturnZero() {
        NumbersToWords ntw = new NumbersToWords();
        assertEquals(ntw.converter(0), "Zero");
    }
}
