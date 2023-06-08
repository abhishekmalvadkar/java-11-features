package com.java11.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class IsBlankMethodInStringClassTest {

	@Test
	void testFeatureIfStringIsEmpty() {
		String email = "";
		boolean result = email.isBlank();
		assertThat(result).isTrue();
		
	}
	
	@Test
	void testFeatureIfStringHasFiveSpaces() {
		String email = "     ";
		boolean result = email.isBlank();
		assertThat(result).isTrue();
		
	}
	
	@Test
	void testFeatureIfStringIsNotEmptyAndItHasOneCharcter() {
		String email = "a";
		boolean result = email.isBlank();
		assertThat(result).isFalse();
		
	}
	
	
	@Test
	void testFeatureIfStringIsNotEmptyAndItHasFiveCharacter() {
		String email = "abhish";
		boolean result = email.isBlank();
		assertThat(result).isFalse();
		
	}
	
	
	
	

}
