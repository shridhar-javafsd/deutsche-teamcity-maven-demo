package com.db.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class AppTest {

	@Test
	public void testTest() {
		assertEquals(10, 5 + 5);
	}

}
