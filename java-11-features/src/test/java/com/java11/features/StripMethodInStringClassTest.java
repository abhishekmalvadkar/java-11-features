package com.java11.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StripMethodInStringClassTest {

	@Test
	void testFeatureIfStringHasTrailingSpace() {
		var featureClass = new StripMethodInStringClass();
		String email = "abc@xyz.com ";
		String result = featureClass.feature(email);
		assertThat(result).hasSize(11);
	}
	
	@Test
	void testFeatureIfStringHasLeadingSpace() {
		var featureClass = new StripMethodInStringClass();
		String email = " abc@xyz.com";
		String result = featureClass.feature(email);
		assertThat(result).hasSize(11);
	}
	
	@Test
	void testFeatureIfStringHasTrailingAndLeadingSpace() {
		var featureClass = new StripMethodInStringClass();
		String email = " abc@xyz.com ";
		String result = featureClass.feature(email);
		assertThat(result).hasSize(11);
	}
	
	@Test
	void testFeatureIfStringHasOnlyOneSpace() {
		var featureClass = new StripMethodInStringClass();
		String email = " ";
		String result = featureClass.feature(email);
		assertThat(result).isEmpty();
	}

}
