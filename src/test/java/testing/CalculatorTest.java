package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class CalculatorTest {
//	A-Arrange A-Act A-Assert
	Calculator calculator;

	@BeforeEach
	void init() {
		calculator = new Calculator(); // arrange
		System.out.println("init");

	}

	@Test
	void testAdd() {

		int result = calculator.add(1, 3); // act
		assertEquals(4, result, "Test Failed");
	}

	@Test
	void testAddFloat() {
		float result = calculator.add(1.2F, 3.1F);
		assertEquals(4.3F, result);

	}

	@Test
	void testAddNegative() {
		int result = calculator.add(-150, 200);
		assertEquals(50, result);
	}

	@Test
	void testAddBothNegative() {
		int result = calculator.add(-10, -54);
		assertEquals(-64, result);
	}

	@Test
	void testDivide() {
		double result = calculator.divide(-11.0, -2.0);
		assertEquals(5.5, result);
	}

	@Test
	void testDivideDenominatorIsZero() {
		try {
			double result = calculator.divide(10.0, 0.0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}

	}

	@Test
	void testDivideSmallerNumerator() {
		double result = calculator.divide(2.0, 4.0);
		assertEquals(0.5, result);
	}

	@Test
	void testGreaterThanTwoCondition() {
		float result = calculator.add(3.0F, 6.0F);
		assertEquals(9.0F, result);
	}

}
