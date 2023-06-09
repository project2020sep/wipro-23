package com.example;

import static org.junit.jupiter.api.Assertions.*;
import static com.example.util.StringUtils.isPalindrome;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.util.StringUtils;

class Example1Test {
	
	@Test
	void testAdd() {
		
		Example1 obj = new Example1();
		
		assertEquals(5, obj.add(2,3));
	}
	
	@ParameterizedTest
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
	    assertTrue(StringUtils.isPalindrome(candidate));
	}

}
