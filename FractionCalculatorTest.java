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
		String input = "1/4 +";
		Fraction expectedOutput = new Fraction(1,4);
	
		FractionCalculator addObj = new FractionCalculator();
		Fraction frac = new Fraction(0,1);
		Fraction actualOutput = addObj.evaluate(frac, input);
		assertEquals("wrong answer", expectedOutput, actualOutput);		
	}
	
}
