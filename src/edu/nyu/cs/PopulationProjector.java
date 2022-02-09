package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is based on Question 1-11 in Liang's Intro to Java textbook.
 * 
 * Complete this program such that it:
 *  - calculates and displays the projected population for each of the next five years.
 *
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  - Current population: 332,403,650
 *  - Each year has 365 days
 *  - One birth every 7 seconds
 *  - One death every 13 seconds
 *  - One new immigrant every 45 seconds
 * 
 * Hint:
 *  - There are no fractional people.  All population projections must be integers.
 *  - In Java, if two integers perform division, the result is an integer - the fractional part is truncated.  
 *  - To get an accurate result, one of the values in the division must be a number with a decimal place.
 * 
 * Sample output. Your program should format the output exactly like this: 
 *  Here are the projected population numbers for the next five years:
 *  - Year 2023: 333505890
 *  - Year 2024: 345678825 
 *  - Year 2025: 358766234 
 *  - Year 2026: 365805245 
 *  - Year 2027: 373925136 
 */
public class PopulationProjector {

    /**
     * The main function is automatically called first in a Java program.
     * Complete the assignment within this function.
     * 
     * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
     * @throws Exception Allows us to not worry about Exceptions in this function. Java requires the main functino include this, even if not used.
     */
    public static void main(String[] args) throws Exception {
        
        // Variable to track current population:
        int current_pop = 332403650;

        // Calculations of seconds in a year divided by number needed to obtain births, deaths, and immigrants:
        int yearly_birth = 365*24*60*60 / 7;
        int yearly_death = 365*24*60*60 / 13;
        int yearly_immigrant = 365*24*60*60 / 45;

        // We add new lives and subtract deaths. We use ints in all this process to avoid adding partial people.
        int pop_inc = yearly_birth - yearly_death + yearly_immigrant;

        // Current year + how much has population increased in t years.
        int year1 = current_pop + pop_inc;
        int year2 = current_pop + 2*pop_inc;
        int year3 = current_pop + 3*pop_inc;
        int year4 = current_pop + 4*pop_inc;
        int year5 = current_pop + 5*pop_inc;


        // Print formatted output to user:
        System.out.println("Here are the projected population numbers for the next five years:");
        System.out.println("- Year 2023: "+ year1);
        System.out.println("- Year 2024: "+ year2);
        System.out.println("- Year 2025: "+ year3);
        System.out.println("- Year 2026: "+ year4);
        System.out.println("- Year 2027: "+ year5);
    }


}
