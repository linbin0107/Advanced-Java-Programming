package edu.pdx.cs410J.numbers2words;

import java.util.ArrayList;
import java.util.List;

/**
 * The main class for the CS410J airline Project
 */
public class NumbersToWordsMain {

  public static void main(String[] args) {
    // Refer to one of Dave's classes so that we can be sure it is on the classpath
    // System.err.println("Missing command line arguments");

    NumbersToWords numbersToWords = new NumbersToWords();

    for (String arg : args) {
      System.out.println(numbersToWords.numberToWords(Integer.parseInt(arg)));
    }

    System.exit(0);
  }

}
