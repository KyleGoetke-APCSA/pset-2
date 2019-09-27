/**
 * Problem Set 2.
 *
 * It's time to put your skills to the test. This problem set focuses on prompting
 * the user for information, manipulating that information, and printing it in
 * specific formats.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section (as well as the Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
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

		 System.out.printf("\nDOLLARS  : %.0f\nQUARTERS : %.0f\nDIMES    : %.0f\nNICKELS  : %.0f\nPENNIES  : %.0f\n", dollars,
		   quarters, dimes, nickels, pennies);

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

		 System.out.printf("\nKILOMETERS  : %d\nMETERS      : %d\nCENTIMETERS : %d\n", kilometers, meters, totalCentimeters);

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



        /*
         * Exercise 8.
         *
         * Given a side length, print the area and perimeter of the corresponding hexagon.
         */



        /*
         * Exercise 9.
         *
         * Given a string, reverse and print the first and second halves of that string.
         */



        /*
         * Exercise 10.
         *
         * Given a first, middle, and last name, print the corresponding initials.
         */



        in.close();
    }
}
