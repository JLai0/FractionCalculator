import java.util.Scanner;

public class FractionCalculatorFinal {
	static boolean quit;

	/*
	 * Test Case: Multiplication: Simple fractions same denominator: 1/7 * 3/7 =
	 * 3/49, 1/6 * 1/5 = 1/30, Simple fractions different denominator: 1/3 * -1/5 =
	 * -1/15, 2/5 * 1/3 = 2/15, Simple fractions result reduced: 1/2 * 2/3 = 1/3,
	 * 1/3 * 6/6 = 1/3, Whole numbers: 3 * -1 = -3, 5 * 10 = 50, Mixed fractions:
	 * 1_11/25 * 3_1/8 = 4_1/2, 5_0/5 * 5_0/5 = 25, Improper fraction unit result:
	 * 3/10 * 10/3 = 1, 13/3 * 2/10 = 13/15, Negatives: -3/4 * -1 = 3/4, -2 * -3 = 6
	 * 
	 * Test Case: Addition: Simple fractions same denominator: 1/7 + 3/7 = 4/7,
	 * Simple fractions different denominator: 1/3 + -1/5 = 8/15, Simple fractions
	 * reduced: 1/2 + -5/6 = -1/3, Whole numbers: 103 + 20 = 123, Mixed Fractions:
	 * 4_15/16 + -3_11/16 = 1_1/4, Improper fractions zero result: 1_3/10 + -13/10 =
	 * 0, Negatives: -3/4 + -1 = -1_3/4
	 * 
	 * Test Case: Division: Simple fractions same denominator: 3/4 / 4/3 = 1, Simple
	 * fractions different denominator: 3/4 / 4/3 = 9/16, Simple fractions result
	 * reduced: 16/4 / -3/2 = -2_2/3, Whole numbers: 5 / 5 = 1, Mixed fractions: -13
	 * / -8 = 1_5/8, Improper fractions zero result: 0 / 5/4 = 0, Negatives: 2/3 /
	 * -1_3/4 = -8/21
	 * 
	 * Test Case: Subtraction: Simple fractions same denominator: 3/5 - 2/5 = 1/5,
	 * Simple fractions different denominator: 5/1 - 5/2 = 2_1/2, Simple fractions
	 * result reduced: 9/10 - 1/10 = 4/5, Whole numbers: 5 - 5 = 0, Mixed fractions:
	 * 4_1/2 - 4_1/2 = 0, Improper fractions zero result 5/4 - 5/4 = 0, Negatives:
	 * -12_3/7 - -20_2/3 = 8_5/21
	 */

	public static void main(String[] args) {
		while (!quit == true) {
			// while quit is not true keep running program
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
			/*
			 * Turns saved input into a scanner so that it can under go basic parsing
			 * (fraction 1, fraction 2, and operator)
			 */
			boolean end = loopQuit(saved);
			// loopQuit returns false to end if quit is entered into console
			if (end == true) {
				// If end == true end while loop
				System.out.println("Calculator Ended.");
				break;
			}
			int spaceCheck = saved.indexOf(' ');
			//checks if there are no spaces
			if (spaceCheck>= 0) {
				//if there are spaces, which are needed to parse correctly then run code
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
				System.out.println(
						numerator1 + "/" + denominator1 + " " + operator + " " + numerator2 + "/" + denominator2);
				if (operator.equals("*")) {
					// if the operator is a multiplication sign then multiply the fractions by
					// placing the values inside of the multiplication method
					String product = multiplication(numerator1, denominator1, numerator2, denominator2);
					System.out.println(product);
				}
				if (operator.equals("+")) {
					// if the operator is a multiplication sign then multiply the fractions by
					// placing the values inside of the multiplication method
					String sum = addition(numerator1, denominator1, numerator2, denominator2);
					System.out.println(sum);
					// once the product is calculated print it out
				}
				if (operator.equals("/")) {
					// if the operator is a multiplication sign then multiply the fractions by
					// placing the values inside of the multiplication method
					String quotient = division(numerator1, denominator1, numerator2, denominator2);
					System.out.println(quotient);
					// once the product is calculated print it out
				}

				if (operator.equals("-")) {
					// if the operator is a multiplication sign then multiply the fractions by
					// placing the values inside of the multiplication method
					String difference = subtraction(numerator1, denominator1, numerator2, denominator2);
					System.out.println(difference);
					// once the product is calculated print it out
				}

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
			} else {
				System.out.println("Error: No spaces");
				break;
			}

		}
	}

	public static boolean loopQuit(String x) {
		/*
		 * loopQuit works to end the while loop that the program is inside of if the
		 * phrase quit is entered
		 */
		if (x.equals("quit")) {
			quit = true;
			// set quit value to true
		}
		return quit;
		// return quit value to main
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

	public static String multiplication(int numerator1, int denominator1, int numerator2, int denominator2) {
		/*
		 * if the operator is a multiplication sign then the fraction values will be
		 * directed towards this method where multiplication will be performed. The
		 * method works to first multiply the numerators and then the denominators
		 * values. After that they check what values they can be divided out so that the
		 * fraction can be simplified by entering them into another method called
		 * fullyReduce. However, if the denominator is equal to 1 then a whole number is
		 * printed not a fraction. If the whole number is equal to 0 then a whole number
		 * will not be printed out with the final fraction.
		 */
		int numerator = numerator1 * numerator2;
		// multiply out numerator values for fraction 1 and fraction 2
		int denominator = denominator1 * denominator2;
		// multiply out numerator values for fraction 1 and fraction 2
		if (numerator == 0) {
			// Make sure that neither the numerator or denominator is not equal to 0 or else
			// simplification is redundant
			String finalProduct = "0";
			return finalProduct;
		}
		if (denominator == 0) {
			String finalProduct = "Undefined";
			return finalProduct;
		}
		if (denominator == numerator) {
			String finalProduct = "1";
			return finalProduct;
		}
		if (denominator == 1) {
			// If the denominator is equal to 1, however, there is no need to simplify just
			// remove
			// the denominator and print out a whole number
			String finalProduct = numerator + " ";
			return finalProduct;
		} else {
			// if the denominator is not equal 1 then further simplify fraction by dividing
			// out
			// and getting the whole number value.
			int wholeNumber;
			// Initializes wholeNumber, the integer for the whole number in the mixed number
			// that
			// I will get by dividing the fully numerator out by the denominator
			int calculatedNumerator;
			// Initializes calculatedNumerator, the integer for the new calculatedNumerator
			// I will get after calculating the whole number in the mixed fraction
			wholeNumber = numerator / denominator;
			// Get the whole number by dividing numerator by denominator
			calculatedNumerator = numerator % denominator;
			// Gets the new numerator by finding the remainder of the numerator by
			// denominator
			if (fullyReduce(numerator, denominator).equals(" ")) {
				String finalProduct = Integer.toString(wholeNumber);
				return finalProduct;
			}
			if (wholeNumber != 0) {
				// if the whole number is not equal to 0 then print it out with the final value
				String finalProduct = wholeNumber + "_" + fullyReduce(Math.abs(calculatedNumerator), denominator);
				return finalProduct;
				// Return the fraction value to the main as a string
			} else {
				// if the whole number is equal to 0 then do not print it out with the final
				// value
				String finalProduct = fullyReduce(numerator, denominator);
				return finalProduct;
				// Return the fraction value to the main as a string
			}
		}

	}

	public static String division(int numerator1, int denominator1, int numerator2, int denominator2) {
		/*
		 * if the operator is a division sign then the fraction values will be directed
		 * towards this method where division will be performed. The method works to
		 * first multiply out the numerators by the denominators values. After that they
		 * check what values they can be divided out so that the fraction can be
		 * simplified by entering them into another method called fullyReduce. However,
		 * if the denominator is equal to 1 then a whole number is printed not a
		 * fraction. If the whole number is equal to 0 then a whole number will not be
		 * printed out with the final fraction.
		 */
		int numerator = numerator1 * denominator2;
		// multiply out numerator values for fraction 1 and fraction 2
		int denominator = denominator1 * numerator2;
		// multiply out numerator values for fraction 1 and fraction 2
		if (numerator == 0) {
			// Make sure that neither the numerator or denominator is not equal to 0 or else
			// simplification is redundant
			String finalQuotient = "0";
			return finalQuotient;
		}
		if (denominator == 0) {
			String finalQuotient = "Undefined";
			return finalQuotient;
		}
		if (denominator == numerator) {
			String finalQuotient = "1";
			return finalQuotient;
		}
		if (denominator == 1) {
			// If the denominator is equal to 1, however, there is no need to simplify just
			// remove
			// the denominator and print out a whole number
			String finalQuotient = numerator + " ";
			return finalQuotient;
		} else {
			// if the denominator is not equal 1 then further simplify fraction by dividing
			// out
			// and getting the whole number value.
			int wholeNumber;
			// Initializes wholeNumber, the integer for the whole number in the mixed number
			// that
			// I will get by dividing the fully numerator out by the denominator
			int calculatedNumerator;
			// Initializes calculatedNumerator, the integer for the new calculatedNumerator
			// I will get after calculating the whole number in the mixed fraction
			wholeNumber = numerator / denominator;
			// Get the whole number by dividing numerator by denominator
			calculatedNumerator = numerator % denominator;
			// Gets the new numerator by finding the remainder of the numerator by
			// denominator
			if (fullyReduce(numerator, denominator).equals(" ")) {
				String finalQuotient = Integer.toString(wholeNumber);
				return finalQuotient;
			}
			if (wholeNumber != 0) {
				// if the whole number is not equal to 0 then print it out with the final value
				String finalQuotient = wholeNumber + "_"
						+ fullyReduce(Math.abs(calculatedNumerator), Math.abs(denominator));
				return finalQuotient;
				// Return the fraction value to the main as a string
			} else {
				// if the whole number is equal to 0 then do not print it out with the final
				// value
				if (denominator <= 0) {
					String finalQuotient = fullyReduce(-numerator, Math.abs(denominator));
					return finalQuotient;
				}
				else {
				String finalQuotient = fullyReduce(numerator, Math.abs(denominator));
				return finalQuotient;
				}
				// Return the fraction value to the main as a string
			}
		}

	}

	public static String addition(int numerator1, int denominator1, int numerator2, int denominator2) {
		/*
		 * if the operator is an addition sign then the fraction values will be directed
		 * towards this method where addition will be performed. The method works to
		 * first find a common denominator by multiply out the numerators by the other
		 * fraction's denominator and then multiplying the denominators together.
		 * Fraction1 is then added to fraction2. After that they check what values they
		 * can be divided out so that the fraction can be simplified by entering them
		 * into another method called fullyReduce. However, if the denominator is equal
		 * to 1 then a whole number is printed not a fraction. If the whole number is
		 * equal to 0 then a whole number will not be printed out with the final
		 * fraction.
		 */
		if (denominator1 == denominator2) {
			int unsimplifiedAddedNumerator = numerator1 + numerator2;
			int commonDenominator = denominator1;
			if (commonDenominator == 1) {
				// If the denominator is equal to 1, however, there is no need to simplify just
				// remove
				// the denominator and print out a whole number
				String finalSum = Integer.toString(unsimplifiedAddedNumerator);
				return finalSum;
			} else {
				// if the denominator is not equal 1 then further simplify fraction by dividing
				// out
				// and getting the whole number value.
				int wholeNumber;
				// Initializes wholeNumber, the integer for the whole number in the mixed number
				// that
				// I will get by dividing the fully numerator out by the denominator
				int calculatedNumerator;
				// Initializes calculatedNumerator, the integer for the new calculatedNumerator
				// I will get after calculating the whole number in the mixed fraction
				if (commonDenominator == 0) {
					String finalSum = "Undefined";
					return finalSum;
				}
				wholeNumber = unsimplifiedAddedNumerator / commonDenominator;
				// Get the whole number by dividing numerator by denominator
				calculatedNumerator = unsimplifiedAddedNumerator % commonDenominator;
				// Gets the new numerator by finding the remainder of the numerator by
				// denominator
				if (wholeNumber != 0) {
					// if the whole number is not equal to 0 then print it out with the final value
					String finalSum = wholeNumber + "_" + fullyReduce(Math.abs(calculatedNumerator), commonDenominator);
					return finalSum;
					// Return the fraction value to the main as a string
				} else {
					// if the whole number is equal to 0 then do not print it out with the final
					// value
					String finalSum = fullyReduce(unsimplifiedAddedNumerator, commonDenominator);
					return finalSum;
					// Return the fraction value to the main as a string
				}
			}
		} else {
			int commonDenominator = denominator1 * denominator2;
			int commonNumerator1 = numerator1 * denominator2;
			int commonNumerator2 = numerator2 * denominator1;
			/*
			 * Instead of using a least common denominator method multiplied denominator by
			 * one another and numerator1 by denominator2 and numerator2 by denominator 1 in
			 * order to get the same denominator so that the two can be added. The fraction
			 * will be simplified later regardless so the least common denominator is not
			 * needed.
			 */
			int unsimplifiedAddedNumerator = commonNumerator1 + commonNumerator2;
			// if the denominator is not equal 1 then further simplify fraction by dividing
			// out
			// and getting the whole number value.
			if (commonDenominator == 0) {
				String finalSum = "Undefined";
				return finalSum;
			}
			int wholeNumber;
			// Initializes wholeNumber, the integer for the whole number in the mixed number
			// that
			// I will get by dividing the fully numerator out by the denominator
			int calculatedNumerator;
			// Initializes calculatedNumerator, the integer for the new calculatedNumerator
			// I will get after calculating the whole number in the mixed fraction
			wholeNumber = unsimplifiedAddedNumerator / commonDenominator;
			// Get the whole number by dividing numerator by denominator
			calculatedNumerator = unsimplifiedAddedNumerator % commonDenominator;
			// Gets the new numerator by finding the remainder of the numerator by
			// denominator
			if (fullyReduce(calculatedNumerator, commonDenominator).equals(" ")) {
				String finalSum = Integer.toString(wholeNumber);
				return finalSum;
			}
			if (wholeNumber != 0) {
				// if the whole number is not equal to 0 then print it out with the final value
				String finalSum = wholeNumber + "_" + fullyReduce(Math.abs(calculatedNumerator), commonDenominator);
				return finalSum;
				// Return the fraction value to the main as a string
			} else {
				// if the whole number is equal to 0 then do not print it out with the final
				// value
				String finalSum = fullyReduce(unsimplifiedAddedNumerator, commonDenominator);
				return finalSum;
				// Return the fraction value to the main as a string
			}
		}

	}

	public static String subtraction(int numerator1, int denominator1, int numerator2, int denominator2) {
		/*
		 * if the operator is a subtraction sign then the fraction values will be
		 * directed towards this method where subtraction will be performed. The method
		 * works to first find a common denominator by multiply out the numerators by
		 * the other fraction's denominator and then multiplying the denominators
		 * together. Fraction2 is then subtracted from fraction1. After that they check
		 * what values they can be divided out so that the fraction can be simplified by
		 * entering them into another method called fullyReduce. However, if the
		 * denominator is equal to 1 then a whole number is printed not a fraction. If
		 * the whole number is equal to 0 then a whole number will not be printed out
		 * with the final fraction.
		 */
		if (denominator1 == denominator2) {
			int unsimplifiedSubtractedNumerator = numerator1 - numerator2;
			int commonDenominator = denominator1;
			if (commonDenominator == 1) {
				// If the denominator is equal to 1, however, there is no need to simplify just
				// remove
				// the denominator and print out a whole number
				String finalDifference = Integer.toString(unsimplifiedSubtractedNumerator);
				return finalDifference;
			} else {
				// if the denominator is not equal 1 then further simplify fraction by dividing
				// out
				// and getting the whole number value.
				int wholeNumber;
				// Initializes wholeNumber, the integer for the whole number in the mixed number
				// that
				// I will get by dividing the fully numerator out by the denominator
				int calculatedNumerator;
				// Initializes calculatedNumerator, the integer for the new calculatedNumerator
				// I will get after calculating the whole number in the mixed fraction
				if (commonDenominator == 0) {
					String finalDifference = "Undefined";
					return finalDifference;
				}
				if (unsimplifiedSubtractedNumerator == 0) {
					String finalDifference = "0";
					return finalDifference;
				}
				wholeNumber = unsimplifiedSubtractedNumerator / commonDenominator;
				// Get the whole number by dividing numerator by denominator
				calculatedNumerator = unsimplifiedSubtractedNumerator % commonDenominator;
				// Gets the new numerator by finding the remainder of the numerator by
				// denominator
				if (wholeNumber != 0) {
					// if the whole number is not equal to 0 then print it out with the final value
					String finalDifference = wholeNumber + "_"
							+ fullyReduce(Math.abs(calculatedNumerator), commonDenominator);
					return finalDifference;
					// Return the fraction value to the main as a string
				} else {
					// if the whole number is equal to 0 then do not print it out with the final
					// value
					String finalDifference = fullyReduce(unsimplifiedSubtractedNumerator, commonDenominator);
					return finalDifference;
					// Return the fraction value to the main as a string
				}
			}
		} else {
			int commonDenominator = denominator1 * denominator2;
			int commonNumerator1 = numerator1 * denominator2;
			int commonNumerator2 = numerator2 * denominator1;
			/*
			 * Instead of using a least common denominator method multiplied denominator by
			 * one another and numerator1 by denominator2 and numerator2 by denominator 1 in
			 * order to get the same denominator so that the two can be added. The fraction
			 * will be simplified later regardless so the least common denominator is not
			 * needed.
			 */
			int unsimplifiedSubtractedNumerator = commonNumerator1 - commonNumerator2;
			// if the denominator is not equal 1 then further simplify fraction by dividing
			// out
			// and getting the whole number value.
			if (commonDenominator == 0) {
				String finalDifference = "Undefined";
				return finalDifference;
			}
			if (unsimplifiedSubtractedNumerator == 0) {
				String finalDifference = "0";
				return finalDifference;
			}
			int wholeNumber;
			// Initializes wholeNumber, the integer for the whole number in the mixed number
			// that
			// I will get by dividing the fully numerator out by the denominator
			int calculatedNumerator;
			// Initializes calculatedNumerator, the integer for the new calculatedNumerator
			// I will get after calculating the whole number in the mixed fraction
			wholeNumber = unsimplifiedSubtractedNumerator / commonDenominator;
			// Get the whole number by dividing numerator by denominator
			calculatedNumerator = unsimplifiedSubtractedNumerator % commonDenominator;
			// Gets the new numerator by finding the remainder of the numerator by
			// denominator
			if (fullyReduce(calculatedNumerator, commonDenominator).equals(" ")) {
				String finalDifference = Integer.toString(wholeNumber);
				return finalDifference;
			}
			if (wholeNumber != 0) {
				// if the whole number is not equal to 0 then print it out with the final value
				String finalDifference = wholeNumber + "_"
						+ fullyReduce(Math.abs(calculatedNumerator), commonDenominator);
				return finalDifference;
				// Return the fraction value to the main as a string
			} else {
				// if the whole number is equal to 0 then do not print it out with the final
				// value
				System.out.println("LOL");
				String finalDifference = fullyReduce(unsimplifiedSubtractedNumerator, commonDenominator);
				return finalDifference;
				// Return the fraction value to the main as a string
			}
		}

	}

	public static String fullyReduce(int numerator, int denominator) {
		/*
		 * Fully fullReduce is a method that is used to simplify and reduce fractions
		 * down. These values are returned to their corresponding methods in which they
		 * are called. They are returned as strings and the whole numbers are calculated
		 * within the actual methods.
		 * 
		 */
		while (numerator % 2 == 0 && denominator % 2 == 0) {
			// if numerator and denominator can be simplified with a value of 2 divide out
			// by 2
			numerator /= 2;
			denominator /= 2;
		}
		while (numerator % 3 == 0 && denominator % 3 == 0) {
			// if numerator and denominator can be simplified with a value of 3 divide out
			// by 3
			numerator /= 3;
			denominator /= 3;
		}
		while (numerator % 5 == 0 && denominator % 5 == 0) {
			// if numerator and denominator can be simplified with a value of 5 divide out
			// by 5
			numerator /= 5;
			denominator /= 5;
		}
		while (numerator % 7 == 0 && denominator % 7 == 0) {
			// if numerator and denominator can be simplified with a value of 7 divide out
			// by 7
			numerator /= 7;
			denominator /= 7;
		}
		if (denominator == 1) {
			// If the denominator is equal to 1, however, there is no need to simplify just
			// remove
			// the denominator and print out a whole number
			String reduced = " ";
			return reduced;
		} else {
			String reduced = numerator + "/" + denominator;
			return reduced;
		}
	}
}