package stworo01;

/*
 * @author Stefan Tworogal
 * 
 */

public class Fraction {
	private int numerator;
	private int denominator;

	/**
	 * Constructs a Fraction, if denominator is 0 returns error
	 * 
	 * @param num
	 * @param denom
	 */
	public Fraction(int num, int denom) {
		try {
			int gcd = myGcd(num, denom);
			setNumerator(num / gcd);
			setDenominator(denom / gcd);
		} catch (ArithmeticException e) {
			System.out.println("Invalid fraction with denominator 0");
		}
	}

	@Override
	public String toString() {
		int denominator = getDenominator();
		if (denominator == 1) {
			return "" + getNumerator();
		} else {
			return "" + getNumerator() + '/' + getDenominator();
		}
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int num) {
		numerator = num;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int num) {
		denominator = num;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Fraction fraction = (Fraction) o;

		if (getDenominator() != fraction.getDenominator())
			return false;
		if (getNumerator() != fraction.getNumerator())
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = numerator;
		result = 31 * result + denominator;
		return result;
	}

	private int myGcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	// addition function
	public Fraction add(Fraction frac) {
		int num = (this.getNumerator() * frac.getDenominator())
				+ (frac.getNumerator() * this.getDenominator());
		int denom = (this.getDenominator() * frac.getDenominator());
		return new Fraction(num, denom);
	}

	// subtraction
	public Fraction sub(Fraction frac) {
		int num = (this.getNumerator() * frac.getDenominator())
				- (frac.getNumerator() * this.getDenominator());
		int denom = (this.getDenominator() * frac.getDenominator());
		return new Fraction(num, denom);
	}

	// multiply function
	public Fraction multiply(Fraction frac) {

		int num = this.getNumerator() * frac.getNumerator();
		int denom = this.getDenominator() * frac.getDenominator();
		return new Fraction(num, denom);
	}

	// division
	public Fraction divide(Fraction frac) {
		int num = this.getNumerator() * frac.getDenominator();
		int denom = frac.getNumerator() * this.getDenominator();
		return new Fraction(num, denom);
	}
}
