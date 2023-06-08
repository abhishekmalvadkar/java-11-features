package com.java11.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StripTrailingMethodInStringClassTest {

	@Test
	void testFeatureIfStringHasTrailingSpace() {
		String email = "abc@xyz.com ";
		String result = email.stripTrailing();
		assertThat(result).hasSize(11);
		
	}
	
	@Test
	void testFeatureIfStringHasDoubleLeadingSpace() {
		String email = "  abc@xyz.com";
		String result = email.stripTrailing();
		assertThat(result).hasSize(13);
		
	}
	
	@Test
	void testFeatureIfStringHasLeadingAndTrailingSpace() {
		String email = " abc@xyz.com ";
		String result = email.stripTrailing();
		assertThat(result).hasSize(12);
		
	}
	
	@Test
	void testFeatureIfStringHasOnlyOneSpace() {
		String email = " ";
		String result = email.stripTrailing();
		assertThat(result).isEmpty();
		
	}
	
	@Test
	void testFeatureIfStringHasFiveSpace() {
		String email = "     ";
		String result = email.stripTrailing();
		assertThat(result).isEmpty();
		
	}
	
	

}
