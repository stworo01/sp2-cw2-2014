package stworo01;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * A junit test class to test class Fraction as part of coursework 2 
 * for module Software and Programming 2
 * Birkbeck College, University of London.
 * @author stefan Tworogal
 * 
 *
 */
public class FractionTest {

// try catch divide by zero
	@Test
	public void testFraction() {
		int input1 = 1;
		int input2 = 0;
		new Fraction(input1,input2);
	}
	// test multiply
	@Test
	public void testMultiply() {
		assertTrue ((new Fraction(3, 10)).equals(new Fraction(1, 2).multiply(new Fraction(3, 5))));
	}
	
	 // test equals
	@Test
	public void testEqual() {
		assertTrue (new Fraction(1, 2).equals(new Fraction(1, 2)));
	}
	@Test
	public void testEquals2() {		
		assertTrue (new Fraction(1, 2).equals(new Fraction(3, 6)));
	}
	@Test
	public void testEquals3() {
		assertTrue (new Fraction(-1, 2).equals(new Fraction(1, -2)));
	}
	@Test 
	public void testEquals4() {
		assertTrue (new Fraction(-1, -2).equals(new Fraction(1, 2)));
    // extend with extra tests
	}
	@Test
	public void testadd() {
		assertTrue ((new Fraction(1, 2)).equals(new Fraction(1, 4).add(new Fraction(1, 4))));
	}
	@Test
	public void testadd2() {
		assertTrue ((new Fraction(1, 4).equals(new Fraction(1, 4).add(new Fraction(0, 1)))));
	}
	
	
}
