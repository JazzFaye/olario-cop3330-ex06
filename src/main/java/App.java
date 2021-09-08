/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.time.Year;  //to extract current year
import java.util.Scanner;   //using class scanner

public class App {
    public static void main(String[] args) {
        // main method begins execution of Java application
        Scanner calculator = new Scanner(System.in); //Scanner to obtain input

        System.out.println("What is your current age? ");
        String current = calculator.nextLine(); //Reads the age from the user

        System.out.println("At what age would you like to retire? ");
        String retire = calculator.nextLine();  //Reads the retired age from the user

        int a = Integer.parseInt(current);  //Converts age to integer
        int b = Integer.parseInt(retire);   //Converts retired age to integer
        int years = b - a;                  //Formula to get how many years left
        int year = Year.now().getValue();   //To get the value of the current year
        int retireyear = years + year;      //Formula to get what year the user can retire

        System.out.printf("You have %d years left until you can retire." ,years); //Displays how many years left
        //Displays the current year and what year the user can retire
        System.out.printf("\nIt's %d, you can retire in %d.", year, retireyear);
    }
}
