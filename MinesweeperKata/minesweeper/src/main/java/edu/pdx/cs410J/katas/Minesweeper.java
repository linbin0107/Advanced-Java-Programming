package edu.pdx.cs410J.katas;

public class Minesweeper  {
    private int row;
    private int col;

    public Minesweeper(int row, int col) throws ZeroSizedBoardException {
        if (row == 0 || col == 0) {
            throw new ZeroSizedBoardException();
        }
        this.row = row;
        this.col = col;
    }

    public void addRow(String s) throws RaggedBoardException {
        if (s.length() != col) {
            throw new RaggedBoardException();
        }
    }

    public String solve() {

        return  null;
    }
}
