package edu.pdx.cs410J.katas;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper  {
    private int row;
    private int col;
    List<String> board = new ArrayList<>();

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

        board.add(s);
    }

    public String solve() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (board.get(i).charAt(j) == '*') {
                    str.append('*');
                } else {
                    int numMine = getNumMine(i, j);
                    str.append(Character.forDigit(numMine, 10));
                }
            }

            if (i != row - 1) {
                str.append('\n');
            }
        }

        return  str.toString();
    }

    private int getNumMine(int i, int j) {
        int count = 0;

        int []x = {1, 0, -1};
        int []y = {1, 0, -1};

        for (int xD : x) {
            for (int yD : y) {
                if (xD == 0 && yD == 0)
                    continue;
                int newI = i + xD;
                int newJ = j + yD;
                if (newI >= 0 && newI < row &&
                     newJ >= 0 && newJ < col && board.get(newI).charAt(newJ) == '*') {
                    ++count;
                }
            }
        }

        return count;
    }
}
