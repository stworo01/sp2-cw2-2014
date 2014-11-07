package stworo01;

/**
 * @author stefan Tworogal
 *
 */
public class FractionCalculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

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
		Fraction answer = new Fraction(0,1);
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
				answer = stored;
			}
		}
		return answer;
	}
}
