import java.util.Scanner;

public class UnitTwoExercises {

	public static void main(String[] args) {
		// System.out.println("Exercise 1:");
		// exercise1(4);
		// System.out.println("Exercise 1 Loop:");
		// exercise1loop(4);
		// System.out.println("Exercise 2:");
		// exercise2(0.0);
		// System.out.println("Exercise 3:");
		// exercise3();
		// System.out.println("Exercise 4:");
		// whatsThis("hello");
		// whatsThis(5);
		// whatsThis(3 + 3);
		// whatsThis(1.2+3.5);
		// Doesn't work because it enters doubles and my methods only take strings and
		// integers
		// whatsThis(1 + 'a');
		// whatsThis("hello" + "world");
		// System.out.println("Exercise 5:");
		// processName("Jonathan", "Lai");
		// System.out.println("Exercise 6:");
		// exercise6();
		// System.out.println("Exercise 7:");
		// exercise7();
		// System.out.println("Homework 1:");
		// String first = "Jonathan";
		// String last = "Lai";
		// myName(first, last);
		// System.out.println("Homework 8:");
		// exercise8();
		// System.out.println("Homework 9:");
		// exercise9();
		// long result = factorial(5);
		// promptForInt();
		// System.out.println(result);
		ex_2_11();
		// ex_2_12();
		// sumColonSeparatedNumbers();
		//ex_2_13();
		// ex_2_14();
		// ex_2_15();

	}

	public static void exercise1(int numStars) {
		for (int y = 1; y <= 3; y++) {
			for (int i = 1; i <= numStars; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

	public static void exercise1loop(int numStars) {
		for (int i = 1; i <= numStars; i++) {
			for (int b = 1; b <= i; b++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void exercise2(double cube) {
		for (int i = 1; i <= 20; i++) {
			cube = 0.5 * i;
			System.out.print("The cube of " + cube + " is ");
			System.out.print(cube * cube * cube);
			System.out.println("");
		}

	}

	public static void exercise3() {
		String result1 = address();
		String result2 = name();
		String result3 = studentID();
		System.out.println("Library: " + result2 + " and " + result3);
		System.out.println("Transcript: " + result2 + ", " + result3 + ", and " + result1);
		System.out.println("Letter: " + result2 + " and " + result1);

	}

	public static String address() {

		String result1 = "903 Liberty Court Chesterfield, VA 23832";
		return result1;

	}

	public static String name() {
		String result2 = "Jonathan Lai";
		return result2;
	}

	public static String studentID() {
		String result3 = "107214";
		return result3;
	}

	public static void whatsThis(int a) {
		System.out.println(a);

	}

	public static void whatsThis(String a) {
		System.out.println(a);

	}

	public static void processName(String first, String last) {
		System.out.println("First: " + first);
		System.out.println("Last: " + last);
		System.out.println("Your name in reverse is: " + last + " " + first);

	}

	public static void exercise6() {
		// Scanner input = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		// String in = input.nextLine();
		// System.out.println(in);

	}

	public static void exercise7() {
		System.out.println("Enter a sentence:");
		Scanner input = new Scanner(System.in);
		String total = input.nextLine();
		Scanner s = new Scanner(total);
		System.out.print(s.next());
		String x = s.next();
		String y = s.next();
		String z = s.next();
		double score1 = Double.parseDouble(x);
		double score2 = Double.parseDouble(y);
		double score3 = Double.parseDouble(z);
		double average = score1 + score2 + score3;
		System.out.print(" " + average / 3);
		input.close();
		s.close();

	}

	public static void myName(String x, String y) {
		System.out.println("Enter Name:");
		System.out.println("Hello " + x + " " + y);

	}

	public static void exercise8() {
		System.out.println("Enter an Integer:");
		Scanner integer = new Scanner(System.in);
		String number = integer.nextLine();
		int stored = Integer.parseInt(number);
		if (stored % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}

	}

	public static void exercise9() {
		System.out.println("Enter a String and Integer:");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		Scanner n = new Scanner(s);
		String word = n.next();
		int num = n.nextInt();
		int length = word.length();
		if (length < num) {
			System.out.println(length + " < " + num);
			System.out.println("Integer is larger than string");
		}
		if (length > num) {
			System.out.println(length + " > " + num);
			System.out.println("String is larger than integer");
		} else {
			System.out.println(length + " = " + num);
			System.out.println("They are equal");
		}

	}

	public static void ex_2_10(int x, long factorial) {
		System.out.println("Enter integer x: " + x);
		System.out.println("x = " + factorial);

	}

	public static int promptForInt() {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		return x;

	}

	public static long factorial(int b) {
		int y = b;
		while (y != 2) {
			y--;
			b *= y;
		}
		return b;

	}

	public static void ex_2_11() {
		int a = promptForInt();
		int b = promptForInt();

		if (isEven(a) == true && isEven(b) == true) {
			System.out.println("Both values are even");
		}

		else {
			System.out.println("Both values are not even even");
		}
	}

	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static void ex_2_12() {
		boolean quit = false;
		int averageNumber = 0;
		int totalNumber = 0;
		int i = 0;
		while (!quit == true) {
			Scanner input = new Scanner(System.in);
			int positiveNumber = input.nextInt();
			if (positiveNumber < 0) {
				System.out.println("Negative number entered");
				break;
			}
			totalNumber += positiveNumber;
			i++;
			averageNumber = totalNumber / i;
		}
		System.out.println("average: " + averageNumber);
	}

	public static int sumColonSeparatedNumbers() {
		Scanner input = new Scanner(System.in);
		String listOfInt = input.nextLine();
		int colons = 0;
		for (int i = 0; i < listOfInt.length(); i++) {
			if (listOfInt.charAt(i) == ':') {
				colons++;
			}
		}
		Scanner basicParse = new Scanner(listOfInt).useDelimiter(":");
		int counter = 0;
		int numberList = 0;
		int number = 0;
		for (int i = 1; i <= (colons + 1); i++) {
			number = basicParse.nextInt();
			numberList += number;
		}
		System.out.println(numberList);
		double finalAverage = (double) numberList / (colons + 1);
		System.out.println("Average is: " + finalAverage);
		return numberList;

	}

	/*
	 * public static void ex_2_13() { String numberStr = "10:45:45:-34"; if
	 * (sumColonSeparatedNumbers(numberStr) == 66) { System.out.println("Correct");
	 * } }
	 */

	public static void ex_2_14() {
		int i;
		double d;
		char c;
		float f;
		long l;
		short s;

		i = 10;
		d = i;
		i = (int) d; // down cast
		c = '5';
		i = c;
		c = (char) i; // down cast
		s = (short) i; // down cast
		l = s;
		f = i;
		i = (int) f; // down cast
		d = i;
		i = (int) d; // down cast

		// the rule seems to be that if it is a bigger data value type then it must be
		// down casted
		// or the smaller data value can be up casted

		// when changing from a char to an int the ASCII value is what results
	}

	public static int alphaIndex(char c) {
		char input = c;
		if ((int) input - 97 <= 26 && (int) input - 97 >= 0) {
			int value = (int) input - 97;
			return value;
		}
		if ((int) input - 65 <= 26 && (int) input - 65 >= 0) {
			int value = (int) input - 65;
			return value;
		} else {
			int value = -1;
			return value;
		}

	}

	public static void ex_2_15() {
		if ((alphaIndex(':') == -1) && (alphaIndex('f') == 5) && (alphaIndex('a') == 0)) {
			System.out.println("Correct");
		}
	}

}
