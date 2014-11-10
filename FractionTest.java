package stworo01;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * A class that carries out tests on the Fraction Class
 * @author Stefan Tworogal
 *
 */
public class FractionTest {

	@Test
	public void testFraction() {
		Fraction fraction = new Fraction(1, 3);
		int dem = fraction.getDenominator();
		int num = fraction.getNumerator();
		int expectedNum = 1;
		int expectedDem = 3;
		assertEquals("wrong answer ", expectedNum, num);
		assertEquals("wrong answer ", expectedDem, dem);

	}

	@Test
	public void testFraction2() {

	}

	// test multiply
	@Test
	public void testMultipy() {
		assertTrue((new Fraction(3, 10)).equals(new Fraction(1, 2)
				.multiply(new Fraction(3, 5))));
	}

	// test equals
	@Test
	public void testEquals() {
		// test equals
		assertTrue(new Fraction(1, 2).equals(new Fraction(1, 2)));
	}

	@Test
	public void testEquals2() {
		assertTrue(new Fraction(1, 2).equals(new Fraction(3, 6)));
	}

	@Test
	public void testEquals3() {
		assertTrue(new Fraction(-1, 2).equals(new Fraction(1, -2)));
	}

	@Test
	public void testEquals4() {
		assertTrue(new Fraction(-1, -2).equals(new Fraction(1, 2)));

	}

	// extend with extra tests
	@Test
	public void testAdd() {
		assertTrue((new Fraction(2, 2)).equals(new Fraction(1, 2)
				.add(new Fraction(1, 2))));
	}

	@Test
	public void testAdd2() {
		assertTrue((new Fraction(1, 2)).equals(new Fraction(1, 4)
				.add(new Fraction(1, 4))));
	}

	@Test
	public void testAdd3() {
		assertTrue((new Fraction(3, 8)).equals(new Fraction(1, 4)
				.add(new Fraction(1, 8))));
	}

	@Test
	public void testToString() {
		Fraction frac = new Fraction(1, 1);
		String expected = "1";
		String s = frac.toString();
		assertEquals("wrong answer ", expected, s);
	}

	@Test
	public void divide() {
		assertTrue((new Fraction(1, 1)).equals(new Fraction(1, 2)
				.divide(new Fraction(1, 2))));
	}

	@Test
	public void divide2() {
		assertTrue((new Fraction(2, 1)).equals(new Fraction(1, 2)
				.divide(new Fraction(1, 4))));
	}
}