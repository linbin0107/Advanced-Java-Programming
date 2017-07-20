package edu.pdx.cs410J.numbers2words;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * An integration test for the {@link NumbersToWordsMain} main class.
 */
public class NumbersToWordsMainIT extends InvokeMainTestCase {

    /**
     * Invokes the main method of {@link NumbersToWordsMain} with the given arguments.
     */
    private MainMethodResult invokeMain(String... args) {
        return invokeMain( NumbersToWordsMain.class, args );
    }

  /**
   * Tests that invoking the main method with no arguments issues an error
   */
  @Test
  public void testNoCommandLineArguments() {
    MainMethodResult result = invokeMain();
    assertThat(result.getExitCode(), equalTo(1));
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

}