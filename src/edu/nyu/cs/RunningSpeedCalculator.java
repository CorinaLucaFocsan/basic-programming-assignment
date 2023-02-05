package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is based on Question 1-10 in Liang's Intro to Java textbook.
 * 
 * Program:
 *  - asks the user how many kilometers they have run
 *  - asks the user how many minutes it took them to run that distance
 *  - displays the average speed of the runner in miles per hour
 * 
 */
public class RunningSpeedCalculator {

  /**
   * Assumes 1 mile = 1.609344 kilometers.
   * 
   * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
   * @throws Exception.
   */
  public static void main(String[] args) throws Exception {
    
      // Scanner to read input:
      Scanner scnr = new Scanner(System.in);

      // Ask how many km and store as String
      System.out.println("How many kilometers did you run?");
      String km = scnr.nextLine();
      
      // Ask how many minutes and store as String
      System.out.println("How many minutes did it take you?");
      String minutes = scnr.nextLine();

      // Convert km to a double to perform mathematica operations that will make it a mile
      double miles = Double.parseDouble(km) / 1.609344;

      // Transform minutes into a double and divide by 60 to make it an hour. Then divide miles over this to get answer.
      double miles_hr = miles / (Double.parseDouble(minutes) / 60);

      // Print formatted output:
      System.out.println("Your average speed was " + miles_hr+ " miles per hour.");

      // Close scanner:
      scnr.close();





  }


}
