package edu.pdx.cs410J.katas;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * An integration test for the {@link MinesweeperMain} main class.
 */
public class MinesweeperMainIT extends InvokeMainTestCase {

    /**
     * Invokes the main method of {@link MinesweeperMain} with the given arguments.
     */
    private MainMethodResult invokeMain(String... args) {
        return invokeMain( MinesweeperMain.class, args );
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