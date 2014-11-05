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
		Fraction stored = new Fraction(0, 1);
		String[] elem = input.split(" ");
		String newFrac = elem[0];
		String[] fstring = newFrac.split("/");
		int numerator = Integer.parseInt(fstring[0]);
		int demoninator = Integer.parseInt(fstring[1]);
		stored = new Fraction(numerator, demoninator).add(stored);
		for (int i = 1; i < fstring.length; i++) {
			if (elem[i].equals("+")) {
				String nfrac = elem[i + 1];
				String[] temp = nfrac.split("/");
				numerator = Integer.parseInt(temp[0]);
				demoninator = Integer.parseInt(temp[1]);
				stored = new Fraction(numerator, demoninator).add(stored);
			}

		}
		return stored;

	}

}
