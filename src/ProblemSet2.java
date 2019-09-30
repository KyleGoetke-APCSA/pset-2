/*
 * Problem Set 2.
 * Copyright (c) 2019. UCVTS and its affiliated.
 * Use is allowed as long as credit is given.
 */

import java.util.Scanner;

public class ProblemSet2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
         * Exercise 1.
         *
         * Prompt the user to enter the following information (in order): first name, last
         * name, grade, age, and hometown.
         */

		System.out.print("\nEnter your first name: ");
        String firstName = in.nextLine();
 		System.out.print("Enter your last name: ");
        String lastName = in.nextLine();
 		System.out.print("Enter your grade: ");
        int grade = in.nextInt();
 		System.out.print("Enter your age: ");
        int age = in.nextInt();
 		in.nextLine();
 		System.out.print("Enter your hometown: ");
        String hometown = in.nextLine();

 		System.out.printf("\nNAME     : %s %s\nGRADE    : %s\nAGE      : %s\nHOMETOWN : %s\n", firstName, lastName,
		  grade, age, hometown);

        /*
         * Exercise 2.

         * Given a dollar amount in the range [0.00, 1.00], print the number of dollar
         * bills, quarters, dimes, nickels, and pennies needed to produce this amount.
         */

		 final double DOLLAR = 1;
		 final double QUARTER = 0.25;
		 final double DIME = 0.1;
		 final double NICKEL = 0.05;
		 final double PENNY = 0.01;

		 System.out.print("\nEnter a dollar amount: ");
         double dollarAmount = in.nextDouble();

		 double dollars = Math.floor(dollarAmount / DOLLAR);
		 dollarAmount -= dollars;

		 double quarters = Math.floor(dollarAmount / QUARTER);
		 dollarAmount -= (quarters * QUARTER);

		 double dimes = Math.floor(dollarAmount / DIME);
		 dollarAmount -= (dimes * DIME);

		 double nickels = Math.floor(dollarAmount / NICKEL);
		 dollarAmount -= (nickels * NICKEL);

		 double pennies = Math.floor(dollarAmount / PENNY);
		 dollarAmount -= (pennies * PENNY);

		 System.out.printf("\nDOLLARS  : %.0f\nQUARTERS : %.0f\nDIMES    : %.0f\nNICKELS  : %.0f\nPENNIES  : %.0f\n",
		   dollars, quarters, dimes, nickels, pennies);

        /*
         * Exercise 3.
         *
         * Given a dollar amount in the range [0.00, 20.00], print the smallest number of
         * bills and coins needed to produce this amount.
         */

		 final int TEN = 10;
		 final int FIVE = 5;

		 System.out.printf("\nEnter a dollar amount: ");
		 dollarAmount = in.nextDouble();

		 double tens = Math.floor(dollarAmount / ((double) TEN));
		 dollarAmount -= tens * TEN;

		 double fives = Math.floor(dollarAmount / FIVE);
		 dollarAmount -= fives * FIVE;

		 dollars = Math.floor(dollarAmount / DOLLAR);
		 dollarAmount -= dollars * DOLLAR;

		 quarters = Math.floor(dollarAmount / QUARTER);
		 dollarAmount -= quarters * QUARTER;

		 dimes = Math.floor(dollarAmount / DIME);
		 dollarAmount -= dimes * DIME;

		 nickels = Math.floor(dollarAmount / NICKEL);
		 dollarAmount -= nickels * NICKEL;

		 pennies = Math.floor(dollarAmount / PENNY);
		 dollarAmount -= pennies * PENNY;

		 int coins = (int) (quarters + dimes + nickels + pennies);
		 int bills = (int) (tens + fives + dollars);

		 System.out.printf("\nBILLS : %d\nCOINS : %d\n", bills, coins);

        /*
         * Exercise 4.
         *
         * Given a number of inches, print the equivalent number of miles, yards, feet,
         * and inches.
         */

		 System.out.printf("\nEnter a number of inches: ");
		 int totalInches = in.nextInt();

		 final int INCH_IN_MILE = 63360;
		 final int INCH_IN_YARD = 36;
		 final int INCH_IN_FOOT = 12;

		 int miles = (int) Math.floor(totalInches / INCH_IN_MILE);
		 totalInches -= miles * INCH_IN_MILE;

		 int yards = (int) Math.floor(totalInches / INCH_IN_YARD);
		 totalInches -= yards * INCH_IN_YARD;

		 int feet = (int) Math.floor(totalInches / INCH_IN_FOOT);
		 totalInches -= feet * INCH_IN_FOOT;

		 System.out.printf("\nMILES  : %d\nYARDS  : %d\nFEET   : %d\nINCHES : %d\n", miles, yards, feet, totalInches);

        /*
         * Exercise 5.
         *
         * Given a number of centimeters, print the equivalent number of kilometers,
         * meters, and centimeters.
         */

		 System.out.printf("\nEnter a number of centimeters: ");
		 int totalCentimeters = in.nextInt();

		 final int CM_IN_KM = 100000;
		 final int CM_IN_M = 100;

		 int kilometers = (int) Math.floor(totalCentimeters / CM_IN_KM);
		 totalCentimeters -= kilometers * CM_IN_KM;

		 int meters = (int) Math.floor(totalCentimeters / CM_IN_M);
		 totalCentimeters -= meters * CM_IN_M;

		 System.out.printf("\nKILOMETERS  : %d\nMETERS      : %d\nCENTIMETERS : %d\n", kilometers, meters,
		   totalCentimeters);

        /*
         * Exercise 6.
         *
         * Given a diameter, print the area and circumference of the corresponding circle.
         */

		 System.out.printf("\nEnter a diameter: ");
		 double diameter = in.nextInt();

		 double circumference = Math.PI * ((double) diameter);
		 double radius = diameter / 2;
		 double area = Math.PI * Math.pow(radius, 2);

		 System.out.printf("\nAREA          : %.2f\nCIRCUMFERENCE : %.2f\n", area, circumference);

        /*
         * Exercise 7.
         *
         * Given a length and width, print the area, perimeter, and diagonal of the
         * corresponding rectangle.
         */

		 System.out.printf("\nEnter a length: ");
		 double length = in.nextInt();
		 System.out.printf("Enter a width: ");
		 double width = in.nextInt();

		 area = length * width;
		 double perimeter = (length * 2) + (width * 2);
		 double diagonal = Math.hypot(length, width);

		 System.out.printf("\nAREA      : %.2f\nPERIMETER : %.2f\nDIAGONAL  : %.2f\n", area, perimeter, diagonal);

        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */

		 System.out.printf("\nEnter a side length: ");
		 double sideLength = in.nextInt();

		 perimeter = sideLength * 6;
		 area = ((3 * Math.sqrt(3)) / 2) * Math.pow(sideLength, 2);

		 System.out.printf("\nAREA      : %.2f\nPERIMETER : %.2f\n", area, perimeter);

        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */

		 System.out.printf("\nEnter a String: ");
		 String originalString = in.next();

		 int halfmeasure = Math.round(originalString.length() / 2);

		 String firstHalf = originalString.substring(0, halfmeasure);
		 String secondHalf = originalString.substring(halfmeasure);
		 String reversedString = secondHalf + firstHalf;

		 System.out.println("\n" + reversedString);

        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */

		 System.out.printf("\nEnter your first name: ");
		 firstName = in.next();
		 System.out.printf("Enter your middle name: ");
		 String middleName = in.next();
		 System.out.printf("Enter your last name: ");
		 lastName = in.next();

		 String initials = String.valueOf(firstName.charAt(0)) + String.valueOf(middleName.charAt(0)) +
		   String.valueOf(lastName.charAt(0));

		 System.out.println("\n" + initials);

        in.close();
    }
}
