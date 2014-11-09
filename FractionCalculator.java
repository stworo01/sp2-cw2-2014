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
	 * Method that takes a fraction object and a user input string and carries
	 * out calculations based on the operators and numbers contained in the
	 * string.
	 * 
	 * @param frac
	 * @param input
	 * @return
	 */

	public Fraction evaluate(Fraction frac, String input) {
		// split string
		String delimiter = "[ /]";
		String [] inputArray = input.split(delimiter);
		// first fraction 
		int numerator = Integer.parseInt(inputArray[0]);
		int denominator = Integer.parseInt(inputArray[1]);
		Fraction stored = new Fraction (numerator,denominator);
		for (int i = 2; i < inputArray.length; i++) {
			
			//addition
			if(inputArray[i].equals("+")) {
				int num = Integer.parseInt(inputArray[i + 1]);
				int denm = Integer.parseInt(inputArray[i + 2]);
				Fraction fracTwo = new Fraction(num,denm);
				stored = stored.add(fracTwo);			
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
			}
		}
		return stored;
	}
}
