package com;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathOperationsTest2 {

	
	MathOperations mathOperations; 
	@BeforeEach
	void setUp() throws Exception {
		mathOperations = new MathOperations();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddNumbers() {
		int result = mathOperations.addNumbers(2, 2);
		assertThat(result, equalTo(4));
	}

	@Test
	void testMultipyNumbers() {
		int result = mathOperations.multipyNumbers(2, 2);
		assertThat(result, equalTo(4));
	}

}
