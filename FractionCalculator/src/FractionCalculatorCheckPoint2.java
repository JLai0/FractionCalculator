import java.util.Scanner;

public class FractionCalculatorCheckPoint2 {
static boolean quit;

	public static void main(String[] args) {
		while (!quit == true) {
			System.out.println("Enter 'quit' to quit");
			// simple system print telling user to enter 'quit' to quit
			System.out.println("Enter input:");
			// Simple system print asking for input
			Scanner input = new Scanner(System.in);
			// Initial scanner that takes in first two fractions and operator
			String saved = input.nextLine();
			// Stores the input as a string so that it can be turned into a scanner to be
			// parsed
			Scanner basicParse = new Scanner(saved);
			boolean end = loopQuit(saved);
			if (end == true) {
				break;
			}
			/*
			 * Turns saved input into a scanner so that it can under go basic parsing
			 * (fraction 1, fraction 2, and operator)
			 */
			String fraction1 = basicParse.next();
			// Save fraction 1 as a string
			String operator = basicParse.next();
			// Saves the operator as a string
			String fraction2 = basicParse.next();
			// Save fraction 2 as a string
			int numerator1 = parseNumerator(fraction1);
			// first numerator is stored after fraction1 is passed into parseNumerator
			int numerator2 = parseNumerator(fraction2);
			// second numerator is stored in main after fraction2 is passed into
			// parseNumerator
			int denominator1 = parseDenominator(fraction1);
			;
			// first denominator is stored after fraction1 is passed into parseNumerator
			int denominator2 = parseDenominator(fraction2);
			// second denominator is stored after fraction2 is passed into parseNumerator
			System.out.println(numerator1 + "/" + denominator1 + " " + operator + " " + numerator2 + "/" + denominator2);
			/*
			 * System.out.println("Operation is " + operator); // prints out operation
			 * System.out.println("Fraction 1 is " + numerator1 + "/" + denominator1); //
			 * prints out fraction using stored denominator + numerator value
			 * System.out.println("Numerator 1 is " + numerator1); // prints out numerator
			 * with stored denominator value System.out.println("Denominator 1 is " +
			 * denominator1); // prints out denominator with stored denominator value
			 * System.out.println("Fraction 2 is " + numerator2 + "/" + denominator2); //
			 * prints out fraction using stored denominator + numerator value
			 * System.out.println("Numerator 2 is " + numerator2); // prints out numerator
			 * with stored numerator value System.out.println("Denominator 2 is " +
			 * denominator2); // prints out denominator with stored denominator value
			 */
		}
	}

	public static boolean loopQuit(String x) {
		if (x.equals("quit")) {
			quit = true;
		}
		return quit;
	}

	public static int parseNumerator(String y) {
		/*
		 * The method "parseNumerator2" parameters only accepts strings. In this case
		 * the string it takes will be fraction two which will be parsed for it's
		 * numerator. This will be achieved by taking the whole number (if there is one)
		 * and multiplying it by the denominator and taking and storing that value. This
		 * is achieved by delimiting/removing the "_" and "/" symbols so that the
		 * integers can be pulled. The second numerator's value is returned as an
		 * integer.
		 */
		int mixedNumberTest1 = y.indexOf('_');
		if (mixedNumberTest1 >= 0) {
			// checks if number is whole or mixed
			int negativeNumberTest1 = y.indexOf('-');
			if (negativeNumberTest1 >= 0) {
				// looks for whether or not the input is mixed and negative
				Scanner fraction = new Scanner(y).useDelimiter("_|/");
				// Looks for "_" and "/" to be removed from strings
				int wholeNumber = fraction.nextInt();
				// sets first integer as the "whole number"
				int numerator = fraction.nextInt();
				// sets the second integer as "numerator"
				numerator *= -1;
				// sets numerator negative
				int denominator = fraction.nextInt();
				// sets the third integer as "denominator"
				int simplifiedWhole = denominator * wholeNumber;
				// simplifies the fraction by multiplying it by the denominator
				int simplifiedNumerator = numerator + simplifiedWhole;
				// adds the product of the denominator to the numerator's value giving the
				return simplifiedNumerator;
				// returns the numerator's value to main
			} else {
				// if mixed fraction and positive do this
				Scanner fraction = new Scanner(y).useDelimiter("_|/");
				// Looks for "_" and "/" to be removed from strings
				int wholeNumber = fraction.nextInt();
				// sets first integer as the "whole number"
				int numerator = fraction.nextInt();
				// sets the second integer as "numerator"
				int denominator = fraction.nextInt();
				// sets the third integer as "denominator"
				int simplifiedWhole = denominator * wholeNumber;
				// simplifies the fraction by multiplying it by the denominator
				int simplifiedNumerator = numerator + simplifiedWhole;
				// adds the product of the denominator to the numerator's value giving the
				return simplifiedNumerator;
				// returns the numerator's value to main
			}
		} else {
			int negativeNumberTest1 = y.indexOf('-');
			if (negativeNumberTest1 >= 0) {
				// looks for whether or not the input is negative
				Scanner fraction = new Scanner(y).useDelimiter("/");
				// checks whether or not number is a whole number
				int simplifiedNumerator = fraction.nextInt();
				// sets the first number as the numerator that does not need to be simplified
				return simplifiedNumerator;
			} else {
				// if no whole number and not negative do this
				Scanner fraction = new Scanner(y).useDelimiter("/");
				// searches for fraction symbol to be removed
				int simplifiedNumerator = fraction.nextInt();
				// sets the first number as the numerator that does not need to be simplified
				return simplifiedNumerator;
				// returns the numerator to the main

			}
		}

	}

	public static int parseDenominator(String x) {
		/*
		 * The method "parseDenominator" parameters only accepts strings. In this case
		 * the string it takes will fraction1 followed by fraction2 which will be parsed
		 * for it's denominator. This is achieved by delimiting/removing the "/" symbols
		 * so that the integers can be pulled. The first denominator's value is returned
		 * as an integer.
		 */
		int mixedNumberTest = x.indexOf('_');
		// looks for if there is a whole number
		if (mixedNumberTest >= 0) {
			// if there is a whole number do this
			Scanner fraction = new Scanner(x).useDelimiter("_|/");
			// searches and removes fraction symbol "/" and whole number symbol
			int wholeNumber = fraction.nextInt();
			// first integer is stored as wholeNumber
			int numerator = fraction.nextInt();
			// second integer is stored as numerator
			int denominator = fraction.nextInt();
			// third integer is stored as denominator
			return denominator;
		} else {
			int wholeNumberTest = x.indexOf('/');
			// checks if it is a whole number
			if (wholeNumberTest == -1) {
				// if whole number do this
				// sets fraction to scanner that receives fraction
				int denominator = 1;
				// saves the second integer as denominator1
				return denominator;
				// returns denominator value for fraction to main
			} else {
				// if there is no whole number do this
				Scanner fraction = new Scanner(x).useDelimiter("/");
				// searches and removes fraction symbol "/"
				int numerator = fraction.nextInt();
				// saves the first integer as numerator1
				int denominator = fraction.nextInt();
				// saves the second integer as denominator1
				return denominator;
				// returns denominator value for fraction 1 to main
			}

		}

	}

}
