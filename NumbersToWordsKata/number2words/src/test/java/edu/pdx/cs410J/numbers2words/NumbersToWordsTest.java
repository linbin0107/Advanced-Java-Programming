package edu.pdx.cs410J.numbers2words;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Unit tests for the {@link NumbersToWords} class.
 */
public class NumbersToWordsTest {

    private NumbersToWords ntw;

    @Before
    public void setUp() throws Exception {
        ntw = new NumbersToWords();
    }

    @Test(expected = IllegalArgumentException.class)
    public void doesNotSupportNonNumbers() {
        ntw.parse("chicken");
    }

    @Test
    public void testSingleStringToNumber(){
        assertThat(ntw.parse("1"), equalTo("One Dollar"));
    }

    @Test
    public void number2ReturnsTwo(){
        assertThat(ntw.parse("2"), equalTo("Two"));
    }
  
}
