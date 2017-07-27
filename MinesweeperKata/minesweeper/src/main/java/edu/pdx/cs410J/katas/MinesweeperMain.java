package edu.pdx.cs410J.katas;

/**
 * The main class for the Minesweeper Kata
 */
public class MinesweeperMain {

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    for (String arg : args) {
      System.out.println(arg);
    }
    System.exit(1);
  }

}