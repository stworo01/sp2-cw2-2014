package stworo01;
/**
 * Created by keith for the second coursework assignment.
 * Modified and expanded by Stefan Tworogal as part of coursework 2 
 * for module Software and Programming 2
 * Birkbeck College, University of London.
 * @author stefan Tworogal
 * @version 21/10/14
 */
public class Fraction {
    private int numerator;
    private int denominator;
/** 
 * Constructs a Fraction, if denominator is 0 returns error
 * @param num
 * @param denom
 */
    public Fraction(int num, int denom) {
    	try {
    		int gcd = myGcd(num, denom);
    		setNumerator(num / gcd);
    		setDenominator(denom / gcd);
    	}
    	catch (ArithmeticException e) {
    		System.out.println("Invalid fraction with denominator 0");
    	}
    }
    
    
/**
 * Method overrides the toSting() method
 * 
 */
    @Override
    public String toString() {
        return "" + getNumerator() + '/' + getDenominator();
    }
/**
 * Accessor method 
 * @return numerator of Fraction
 */
    public int getNumerator() {
        return numerator;
    }
/**
 * 
 * @param num
 */
    public void setNumerator(int num) {
        numerator = num;
    }
/**
 * Accessor method
 * @return denominator of Fraction
 */
    public int getDenominator() {
        return denominator;
    }
/**
 * 
 * @param num
 */
    public void setDenominator(int num) {
        denominator = num;
    }
/**
 * Method overrides the equals method
 */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        if (getNumerator() != fraction.getNumerator()) return false;

        return true;
    }
/**
 * Method overrides the hashCode method
 */
    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }
/**
 * Method that multipies two fractions
 * @param frac
 * @return object of type Fraction that is the product of two fractions
 */
    public Fraction multiply(Fraction frac) {

        int num = this.getNumerator() * frac.getNumerator();
        int denom = this.getDenominator() * frac.getDenominator();
        return new Fraction(num, denom);
    }
/**
 * Method that calculates the Greatest common denominator of two integers
 * @param a
 * @param b
 * @return 
 */
    private int myGcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
/**
 * Method that adds two fraction
 * @param frac
 * @return object of the type Fraction that is the sum of two fractions
 */
	public Fraction add(Fraction frac) {
		int num = (this.getNumerator() * frac.getDenominator()) + (frac.getNumerator() * this.getDenominator());
		int denom = (this.getDenominator() * frac.getDenominator());
		return new Fraction(num, denom);
	}
}
