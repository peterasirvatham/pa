package com.pa.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MatheratorTest {

	private Matherator matherator;

	@Before
	public void setUp() throws Exception {
		matherator = new Matherator();
	}

	@Test
	public void testAdd() {
		// Let Java add it up
		long result = 10 + 23 + (-1) + 16;
		// Compare that to what the Matherator gives us
		assertEquals(result, matherator.add(10, 23, -1, 16));

		result = 100 + 102;
		assertEquals(result, matherator.add(100 + 102));

		result = 0;
		assertEquals(result, matherator.add(0));

	}

	@Test
	public void testSubtract() {
		long result = 100 - 34 - (-17) - 4;

		assertEquals(result, matherator.subtract(100, 34, -17, 4));

		result = 0;

		assertEquals(result, matherator.subtract(0, 0, 0, 0));
	}

}
