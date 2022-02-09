package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is inspired by Question 2-13 in Liang's Intro to Java textbook and current economic events.
 * 
 * Complete this program such that it:
 *  - prompts the user to enter an amount the user adds to their savings account each month
 *  - (use the Scanner class's nextLine() function to get user input as a String)
 *  - displays the equivalent value of the account, in today's dollars, after the sixth month of savings mixed with heavy inflation
 *  - (note that today's dollars are worth more than future dollars, since dollars lose their purchasing power each month by the monthly inflation rate)
 *
 * Assume the following:
 *  - a 10% annual inflation rate 
 *  - (i.e. the value of each dollar decreases every month at a monthly rate of 0.10/12 = 0.008333333333333)
 *  - use (int) Math.round(someNumberWithDecimalPlaces) to round all displayed numbers to the nearest dollar... do not output any decimal places.
 *  - assume the user will enter a valid number with or without a decimal place... don't worry about handling any other type of user input
 * 
 * Sample output, including example user input. Your program should format the output exactly like this: 
 *  Please enter your monthly savings rate: 120
 *  If you save $120 per month with 10% annual inflation, after 6 months, your account will hold an amount equivalent to $114 today.
 */
 public class CompoundInflation {
    
    public static void main(String[] args) {
        
        // Monthly inflation:
        double monthly_inflation = 0.10/12;

        //Scanner so we can read input from user:
        Scanner scnr = new Scanner(System.in);
        
        // Collecting input as form of a string:
        System.out.println("Enter savings per month: ");
        String savings_str = scnr.nextLine();

        // Transform string to double to perform mathematical expressions:
        double savings_num = Double.parseDouble(savings_str);

        // Since we are compounding for six months, we multiply savings times 1 - inflation to the 6th power:
        double total = savings_num * Math.pow(1 - monthly_inflation, 6);

        // Print formatted result:
        System.out.println("If you save $" + Math.round(savings_num)+ " per month with 10% annual inflation, after 6 months, your account will hold an amount equivalent to $" + Math.round(total)+" today.");
        
        // Close Scanner:
        scnr.close();
    }
}
