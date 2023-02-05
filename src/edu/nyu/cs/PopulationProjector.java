package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is based on Question 1-11 in Liang's Intro to Java textbook.
 *
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  - Current population: 332,403,650
 *  - Each year has 365 days
 *  - One birth every 7 seconds
 *  - One death every 13 seconds
 *  - One new immigrant every 45 seconds
 * 
 */
public class PopulationProjector {

    /**
     * The main function is automatically called first in a Java program.
     * 
     * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
     * @throws Exception.
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
