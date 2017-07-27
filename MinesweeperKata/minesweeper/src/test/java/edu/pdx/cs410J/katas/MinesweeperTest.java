package edu.pdx.cs410J.katas;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the {@link Minesweeper} class.
 */
public class MinesweeperTest {

    @Ignore
    @Test(expected = ZeroSizedBoardException.class)
    public void zeroSizedBoardThrowException() {
        new Minesweeper(0, 0);
    }

    @Ignore
    @Test(expected = ZeroSizedBoardException.class)
    public void boardWithZeroRowsThrowsException() {
        new Minesweeper(0, 5);
    }

    @Ignore
    @Test(expected = ZeroSizedBoardException.class)
    public void boardWithZeroColumnsThrowsException() {
        new Minesweeper(5, 0);
    }

    @Ignore
    @Test(expected = RaggedBoardException.class)
    public void raggedInputRowThrowsException() {
        Minesweeper board = new Minesweeper(1, 2);
        board.addRow(".");
    }

    @Ignore
    @Test(expected = RaggedBoardException.class)
    public void raggedInputColumnThrowsException() {
        Minesweeper board = new Minesweeper(2, 1);
        board.addRow(".");
        board.addRow("..");
    }

    @Ignore
    @Test
    public void oneSquareWithMine() {
        Minesweeper board = new Minesweeper(1, 1);
        board.addRow("*");

        String solved = board.solve();
        assertThat(solved, equalTo("*"));
    }

    @Ignore
    @Test
    public void oneSquareWithNoMine() {
        Minesweeper board = new Minesweeper(1, 1);
        board.addRow(".");

        String solved = board.solve();
        assertThat(solved, equalTo("0"));
    }

    @Ignore
    @Test
    public void twoByTwoBoardWithMineAtZeroZero() {
        Minesweeper board = new Minesweeper(2, 2);
        board.addRow("*.");
        board.addRow("..");

        String solved = board.solve();
        assertThat(solved, equalTo("*1\n11"));

    }

}