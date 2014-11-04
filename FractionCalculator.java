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
		// TODO Auto-generated method stub

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
		Fraction result = new Fraction(0, 1);
		char ch = input.charAt(0);
		char ch2 = input.charAt(2);
		int numerator = Character.getNumericValue(ch);
		int denominator = Character.getNumericValue(ch2);
		result = frac.add(new Fraction(numerator, denominator));

		return result;

	}

}
