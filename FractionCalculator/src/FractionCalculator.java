import java.util.Scanner;

public class FractionCalculator {

	public static void main(String[] args) {
		System.out.println("Enter input:");
		// Simple system print asking for input
		Scanner input = new Scanner(System.in);
		// Initial scanner that takes in first two fractions and operator
		String saved = input.nextLine();
		// Stores the input as a string so that it can be turned into a scanner to be
		// parsed
		Scanner basicParse = new Scanner(saved);
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
		parseNumerator(fraction1);
		// passes the string for fraction 1 as an argument into the method
		// "parseNumerator"
		parseDenominator(fraction1);
		// passes the string fraction 1 as an argument into the method
		// "parseDenominator"
		int simplifiedNumerator1;
		// first numerator stored as an integer in main from parseNumerator1
		int denominator1;
		// first denominator stored as an integer in main from parseDenominator1
		System.out.println("Operation is " + operator);
		// prints out operation
		parseNumerator2(fraction2);
		// passes the string for fraction 2 as an argument into the method
		parseDenominator2(fraction2);
		// passes the string fraction 2 as an argument into the method
		// "parseDenominator"
		int denominator2;
		// second denominator stored as an integer in main from parseDenominator2
		int simplifiedNumerator2;
		// second numerator stored as an integer in main from parseNumerator2
	}

	public static int parseNumerator(String x) {
		/*
		 * The method "parseNumerator" parameters only accepts strings. In this case the
		 * string it takes will be fraction one which will be parsed for it's numerator.
		 * This will be achieved by taking the whole number (if there is one) and
		 * multiplying it by the denominator and taking and storing that value. This is
		 * achieved by delimiting/removing the "_" and "/" symbols so that the integers
		 * can be pulled. The first numerator's value is returned as an integer.
		 */
		int wholeNumberTest1 = x.indexOf('_');
		if (wholeNumberTest1 >= 0) {
			// looks for whether or not the input has a whole number
			Scanner fraction1 = new Scanner(x).useDelimiter("_|/");
			// Looks for "_" and "/" to be removed from strings
			int wholeNumber1 = fraction1.nextInt();
			// sets first integer as the "whole number"
			int numerator1 = fraction1.nextInt();
			// sets the second integer as "numerator"
			int denominator1 = fraction1.nextInt();
			// sets the third integer as "denominator"
			int simplifiedWhole1 = denominator1 * wholeNumber1;
			// simplifies the fraction by multiplying it by the denominator
			int simplifiedNumerator1 = numerator1 + simplifiedWhole1;
			// adds the product of the denominator to the numerator's value giving the
			// simplified numerator
			System.out.println("Fraction 1 is " + simplifiedNumerator1 + "/" + denominator1);
			// prints out simplified numerator + denominator in order to give fraction
			System.out.println("Numerator 1 is " + simplifiedNumerator1);
			// prints out the simplified numerator
			return simplifiedNumerator1;
			// returns the numerator's value to main
		} else {
			// if no whole number do this
			Scanner fraction1 = new Scanner(x).useDelimiter("/");
			// searches for fraction symbol to be removed
			int simplifiedNumerator1 = fraction1.nextInt();
			// sets the first number as the numerator that does not need to be simplified
			int denominator1 = fraction1.nextInt();
			// sets the next number as the denominator
			System.out.println("Fraction 1 is " + simplifiedNumerator1 + "/" + denominator1);
			// combines denominator + numerator to give the fraction and prints out fraction
			System.out.println("Numerator 1 is " + simplifiedNumerator1);
			// prints out numerator by itself
			return simplifiedNumerator1;
			// returns the numerator to the main
		}
	}

	public static int parseNumerator2(String y) {
		/*
		 * The method "parseNumerator2" parameters only accepts strings. In this case
		 * the string it takes will be fraction two which will be parsed for it's
		 * numerator. This will be achieved by taking the whole number (if there is one)
		 * and multiplying it by the denominator and taking and storing that value. This
		 * is achieved by delimiting/removing the "_" and "/" symbols so that the
		 * integers can be pulled. The second numerator's value is returned as an
		 * integer.
		 */
		int wholeNumberTest2 = y.indexOf('_');
		if (wholeNumberTest2 >= 0) {
			// looks for whether or not the input has a whole number
			Scanner fraction2 = new Scanner(y).useDelimiter("_|/");
			// Looks for "_" and "/" to be removed from strings
			int wholeNumber2 = fraction2.nextInt();
			// sets first integer as the "whole number"
			int numerator2 = fraction2.nextInt();
			// sets the second integer as "numerator"
			int denominator2 = fraction2.nextInt();
			// sets the third integer as "denominator"
			int simplifiedWhole2 = denominator2 * wholeNumber2;
			// simplifies the fraction by multiplying it by the denominator
			int simplifiedNumerator2 = numerator2 + simplifiedWhole2;
			// adds the product of the denominator to the numerator's value giving the
			// simplified numerator
			System.out.println("Fraction 2 is " + simplifiedNumerator2 + "/" + denominator2);
			// prints out simplified numerator + denominator in order to give fraction
			System.out.println("Numerator 2 is " + simplifiedNumerator2);
			// prints out the simplified numerator
			return simplifiedNumerator2;
			// returns the numerator's value to main
		} else {
			// if no whole number do this
			Scanner fraction2 = new Scanner(y).useDelimiter("/");
			// searches for fraction symbol to be removed
			int simplifiedNumerator2 = fraction2.nextInt();
			// sets the first number as the numerator that does not need to be simplified
			int denominator2 = fraction2.nextInt();
			// sets the next number as the denominator
			System.out.println("Fraction 2 is " + simplifiedNumerator2 + "/" + denominator2);
			// combines denominator + numerator to give the fraction and prints out fraction
			System.out.println("Numerator 2 is " + simplifiedNumerator2);
			// prints out numerator by itself
			return simplifiedNumerator2;
			// returns the numerator to the main
		}

	}

	public static int parseDenominator(String x) {
		/*
		 * The method "parseDenominator" parameters only accepts strings. In this case
		 * the string it takes will be fraction one which will be parsed for it's
		 * denominator. This is achieved by delimiting/removing the "_" and "/" symbols
		 * so that the integers can be pulled. The first denominator's value is returned
		 * as an integer.
		 */
		int wholeNumberTest2 = x.indexOf('_');
		// looks for if there is a whole number
		if (wholeNumberTest2 >= 0) {
			// if there is a whole number do this
			Scanner fraction1 = new Scanner(x).useDelimiter("_|/");
			// searches and removes fraction symbol "/" and whole number symbol
			int wholeNumber1 = fraction1.nextInt();
			// first integer is stored as wholeNumber
			int numerator1 = fraction1.nextInt();
			// second integer is stored as numerator
			int denominator1 = fraction1.nextInt();
			// third integer is stored as denominator
			System.out.println("Denominator 1 is " + denominator1);
			return denominator1;
		} else {
			// if there is no whole number do this
			Scanner fraction1 = new Scanner(x).useDelimiter("/");
			// searches and removes fraction symbol "/"
			int numerator1 = fraction1.nextInt();
			// saves the first integer as numerator1
			int denominator1 = fraction1.nextInt();
			// saves the second integer as denominator1
			System.out.println("Denominator 1 is " + denominator1);
			// denominator is printed out
			return denominator1;
			// returns denominator value for fraction 1 to main
		}
	}

	public static int parseDenominator2(String y) {
		/*
		 * The method "parseDenominator" parameters only accepts strings. In this case
		 * the string it takes will be fraction two which will be parsed for it's
		 * denominator. This is achieved by delimiting/removing the "_" and "/" symbols
		 * so that the integers can be pulled. The second denominator's value is
		 * returned as an integer.
		 */
		int wholeNumberTest2 = y.indexOf('_');
		// looks for if there is a whole number
		if (wholeNumberTest2 >= 0) {
			// if there is a whole number do this
			Scanner fraction2 = new Scanner(y).useDelimiter("_|/");
			// searches and removes fraction symbol "/" and whole number symbol
			int wholeNumber2 = fraction2.nextInt();
			// first integer is stored as wholeNumber
			int numerator2 = fraction2.nextInt();
			// second integer is stored as numerator
			int denominator2 = fraction2.nextInt();
			// third integer is stored as denominator
			System.out.println("Denominator 2 is " + denominator2);
			return denominator2;
		} else {
			// if there is no whole number do this
			Scanner fraction2 = new Scanner(y).useDelimiter("/");
			// searches and removes fraction symbol "/"
			int numerator2 = fraction2.nextInt();
			// saves the first integer as numerator1
			int denominator2 = fraction2.nextInt();
			// saves the second integer as denominator1
			System.out.println("Denominator 2 is " + denominator2);
			// denominator is printed out
			return denominator2;
			// returns denominator value for fraction 1 to main

		}
	}
}
