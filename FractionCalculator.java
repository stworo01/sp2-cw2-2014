package stworo01;
import java.util.Scanner;

/**
 * @author stefan Tworogal
 *
 */
public class FractionCalculator {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Open FractionCalculator
		FractionCalculator calc = new FractionCalculator();
		// display welcome and instructions
		String welcome = "Hello and wellcome to the Fraction calculator";
		String inputDataString = "Enter expression: ";	
		System.out.println();
		System.out.println(welcome);
		Fraction initialValue = new Fraction(0,1);
		System.out.println(inputDataString);
		String in = sc.nextLine();
		Fraction result = calc.evaluate(initialValue, in);
		String out = result.toString();
		System.out.println("The answer is: "+out);		
		sc.close();	
	}
	/**
	 * A method that checks if the first character is a digit
	 * @param str
	 * @return
	 */
	public boolean isNum(String str) {
		char c =str.charAt(0);
		if (Character.isDigit(c)) {return true;}
		return false;
	}
	/**
	 * Method that takes a fraction object and a user input string and carries
	 * out calculations based on the operators and numbers contained in the
	 * string.
	 * 
	 * @param frac
	 * @param input
	 * @return
	 */
	
	public Fraction evaluate(Fraction frac, String input) {
		int numerator = 0;
		int denominator = 1;
		
		// split string
		String delimiter = "[ /]";
		String [] inputArray = input.split(delimiter);
		// first fraction 
		Fraction stored = new Fraction (numerator,denominator);

		for (int i = 0; i < inputArray.length - 1; i++) {
			
			if(isNum(inputArray[i])) {
				int numerator1 = Integer.parseInt(inputArray[0]);
				int denominator1 = Integer.parseInt(inputArray[1]);
				stored = new Fraction(numerator1, denominator1);
				
			}
			//addition
			if(inputArray[i].equals("+")) {
				int num = Integer.parseInt(inputArray[i + 1]);
				int denm = Integer.parseInt(inputArray[i + 2]);
				System.out.println("i'm here");
				System.out.println(stored.toString());//test
				Fraction fracTwo = new Fraction(num,denm);
				stored = stored.add(fracTwo);
				System.out.println(stored.toString());//test
			}
			//multiply
			if(inputArray[i].equals("*")) {
				int num = Integer.parseInt(inputArray[i + 1]);
				int denm = Integer.parseInt(inputArray[i + 2]);
				Fraction fracTwo = new Fraction(num,denm);
				stored = stored.multiply(fracTwo);	
			}
			//subtract
			if(inputArray[i].equals("-")) {
				int num = Integer.parseInt(inputArray[i + 1]);
				int denm = Integer.parseInt(inputArray[i + 2]);
				Fraction fracTwo = new Fraction(num,denm);
				stored = stored.sub(fracTwo);
				;
			}
		}
		System.out.println(stored.toString());//test
		return stored;
	}
	
}
