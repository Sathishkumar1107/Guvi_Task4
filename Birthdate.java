package com.java.Demos;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Birthdate {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);


        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
        String input = obj.nextLine();

        try {

            LocalDate birthDate = LocalDate.parse(input);
            LocalDate currentDate = LocalDate.now();


            if (birthDate.isAfter(currentDate)) {
                System.out.println("Birthdate cannot be in the future.");
                return;
            }


            Period age = Period.between(birthDate, currentDate);


            System.out.printf("Your age is: %d years, %d months, and %d days.%n",
                    age.getYears(), age.getMonths(), age.getDays());
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-mm-dd.");
        }

    }
}
