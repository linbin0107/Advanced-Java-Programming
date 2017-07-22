package edu.pdx.cs510J.linbin;

import edu.pdx.cs410J.AbstractAirline;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The main class for the CS410J airline Project
 */
public class Project1 {
  private static List<String> getOpts(String []args) {
    List<String> options = new ArrayList<String>();

    for (String str : args) {
      if (str.startsWith("-"))
        options.add(str);
    }

    return options;
  }

  private static List<String> getArgs(String []args) {
    List<String> arguments = new ArrayList<String>();

    for (int i = 0; i < args.length; ++i) {
      if (!args[i].startsWith("-")) {
        arguments.add(args[i]);
      }
    }

    return arguments;
  }

  private static void printHelp() {
    System.out.println("Usage: java Project1 [options] <args>");
    System.out.println("args are (in this order):");
    System.out.println("name          The name of the airline");
    System.out.println("flightNumber  The flight number");
    System.out.println("src           Three-letter code of departure airport");
    System.out.println("departTime    Departure date and time (24-hour time)");
    System.out.println("dest          Three-letter code of arrival airport");
    System.out.println("arriveTime    Arrival date and time (24-hour time");
    System.out.println("Options are (options may appear in any order):");
    System.out.println("-print   Prints a description of the new flight");
    System.out.println("-README  Prints a README for this project and exits");
    System.out.println("Date and time should be in the format : mm/dd/yyyy hh:mm");
  }

  private static void printReadme() {
    System.out.print("In this project, we will create the fundamental Airline and Flight classes that we\n" +
                     "will work with for the duration of the course. The goal is that we extend classes\n" +
                     "to perform more complex command line parsing\n\n");
  }

  private static void checkArgsFormat(String []args) {
    // Check the number of arguments passed in
    if (args.length < 8) {
      System.out.println("Missing command line arguments");
      printHelp();
      System.exit(1);
    } else if (args.length > 8) {
      System.out.println("There are extraneous command line arguments");
      printHelp();
      System.exit(1);
    }

    // Check if the flight number is numeric or not
    try {
      Integer.parseInt(args[1]);
    } catch (NumberFormatException e) {
      System.out.println("The flight number is non-numeric");
      System.exit(1);
    }

    // args[3], args[6]
    DateFormat format = new SimpleDateFormat("mm/dd/yyyy");
    format.setLenient(false);
    try {
      Date date1 = format.parse(args[3]);
      Date date2 = format.parse(args[6]);
    } catch (ParseException e) {
      throw new IllegalArgumentException("The date you entered was not valid");
    }

    // args[4], args[7]
    if(!args[4].matches("([01]?[0-9]|2[0-3]):[0-5][0-9]") ||
            !args[7].matches("([01]?[0-9]|2[0-3]):[0-5][0-9]")){
      throw new IllegalArgumentException("The time you entered was not valid");
    }

    // Check if an airport code contains three letters
    if ((args[2].length() != 3) || (args[5].length() != 3) ||
            !args[2].matches("[A-Z]{3}") || !args[5].matches("[A-Z]{3}")) {
      throw new IllegalArgumentException("An airport code does not contain three letters");
    }
  }

  public static void main(String[] args) {
    //Class c = AbstractAirline.class;  // Refer to one of Dave's classes so that we can be sure it is on the classpath
    //System.err.println("Missing command line arguments");

    List<String> options = getOpts(args);
    List<String> arguments = getArgs(args);

    String []argus = new String[arguments.size()];
    argus = arguments.toArray(argus);

    checkArgsFormat(argus);

    Flight flight = new Flight(Integer.parseInt(argus[1]), argus[2], argus[5],
                            argus[3] + " " + argus[4], argus[6] + " " + argus[7]);
    Airline airline = new Airline(argus[0]);
    airline.addFlight(flight);

    System.out.println(airline.toString() + "\n");

    for (String str : options) {
      if (str.endsWith("print")) {
        System.out.println(flight.toString());
      }

      if (str.endsWith("README")) {
        printReadme();
      }
    }

    System.exit(0);
  }

}