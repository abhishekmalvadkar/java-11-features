package com.java11.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StripLeadingMethodInStringClassTest {

	@Test
	void testFeatureIfStringHasLeadingSpace() {
		var featureClass = new StripLeadingMethodInStringClass();
		String userName = " abhi";
		String result = featureClass.feature(userName);
		assertThat(result).hasSize(4);
	}
	
	@Test
	void testFeatureIfStringHasLeadingAndTrainlingSpace() {
		var featureClass = new StripLeadingMethodInStringClass();
		String userName = " abhi ";
		String result = featureClass.feature(userName);
		assertThat(result).hasSize(5);
	}
	
	@Test
	void testFeatureIfStringDoesNotHasLeadingAndTrainlingSpace() {
		var featureClass = new StripLeadingMethodInStringClass();
		String userName = "abhi";
		String result = featureClass.feature(userName);
		assertThat(result).hasSize(4);
	}
	
	@Test
	void testFeatureIfStringHasOnlySevenSpace() {
		var featureClass = new StripLeadingMethodInStringClass();
		String email = "       ";
		String result = featureClass.feature(email);
		assertThat(result).isEmpty();
	}

}
