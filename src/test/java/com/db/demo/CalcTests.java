package com.db.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

import com.db.demo.math.Calc;

@Testable
public class CalcTests {

	static Calc calc;

	@BeforeAll
	public static void setUp() {
		calc = new Calc();
	}

	@AfterAll
	public static void tearDown() {
		calc = null;
	}

	@Test
	public void testAddNums() {
		assertEquals(10, calc.addNums(5, 5));
	}

	@Test
	public void testAddNums2() {
		assertNotEquals(11, calc.addNums(5, 5));
	}

	@Test
	public void testSubNums() {
		assertEquals(5, calc.subNums(10, 5));
	}

	@Test
	public void testSubNums2() {
		assertNotEquals(4, calc.subNums(10, 5));
	}
}
