package edu.pdx.cs410J.numbers2words;

import edu.pdx.cs410J.AbstractAirline;

/**
 * The main class for the CS410J airline Project
 */
public class NumbersToWordsMain {

  public static void main(String[] args) {
    // Refer to one of Dave's classes so that we can be sure it is on the classpath
    Class c = AbstractAirline.class;  
    System.err.println("Missing command line arguments");
    for (String arg : args) {
      System.out.println(arg);
    }
    System.exit(1);
  }

}
