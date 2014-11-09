package stworo01;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author stefan01
 *
 */
public class FractionCalculatorTest {

	@Test
	public void testEvaluate() {
		String input = "1/4 + 1/4";
		Fraction expectedOutput = new Fraction(1, 2);

		FractionCalculator addObj = new FractionCalculator();
		Fraction frac = new Fraction(0, 1);
		Fraction actualOutput = addObj.evaluate(frac, input);
		assertEquals("wrong answer", expectedOutput, actualOutput);
	}

	@Test
	public void testEvaluate2() {
		String input = "1/5 + 1/5 + 1/5 + 1/5";
		Fraction expectedOutput = new Fraction(4, 5);

		FractionCalculator addObj = new FractionCalculator();
		Fraction frac = new Fraction(0, 1);
		Fraction actualOutput = addObj.evaluate(frac, input);
		assertEquals("wrong answer", expectedOutput, actualOutput);
	}
	@Test
	public void testEvaluate3() {
		String input = "1/2 * 1/2";
		Fraction expectedOutput = new Fraction(1,4);
		FractionCalculator addObj = new FractionCalculator();
		Fraction frac = new Fraction(0, 1);
		Fraction actualOutput = addObj.evaluate(frac, input);
		assertEquals("wrong answer", expectedOutput, actualOutput);
	}
	//combined multiply and addition
	@Test
	public void testEvaluate4() {
		String input = "1/2 * 1/2 + 1/4";
		Fraction expectedOutput = new Fraction(1,2);
		FractionCalculator addObj = new FractionCalculator();
		Fraction frac = new Fraction(0, 1);
		Fraction actualOutput = addObj.evaluate(frac, input);
		assertEquals("wrong answer", expectedOutput, actualOutput);
	}
	@Test
	// subtract
	public void testEvaluate5() {
		String input = "1/2 - 1/4";
		Fraction expectedOutput = new Fraction(1,4);
		FractionCalculator addObj = new FractionCalculator();
		Fraction frac = new Fraction(0,1);
		Fraction actualOutput = addObj.evaluate(frac, input);
		assertEquals("wrong answer", expectedOutput, actualOutput);
	}
	@Test
	// add a negative number
	public void testEvaluate6() {
		String input = "1/2 + -1/4";
		Fraction expectedOutput = new Fraction(1,4);
		FractionCalculator addObj = new FractionCalculator();
		Fraction frac = new Fraction(0,1);
		Fraction actualOutput = addObj.evaluate(frac, input);
		assertEquals("wrong answer", expectedOutput, actualOutput);
	}

}
