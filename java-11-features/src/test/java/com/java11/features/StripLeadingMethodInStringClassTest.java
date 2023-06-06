package com.java11.features;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class StripLeadingMethodInStringClassTest {

	@Test
	void testFeatureIfStringHasLeadingSpace() {
		var featureClass = new StripLeadingMethodInStringClass();
		String userName = " abhi";
		String result = featureClass.feature(userName);
		assertThat(result.length()).isEqualTo(4);
	}
	
	@Test
	void testFeatureIfStringHasLeadingAndTrainlingSpace() {
		var featureClass = new StripLeadingMethodInStringClass();
		String userName = " abhi ";
		String result = featureClass.feature(userName);
		assertThat(result.length()).isEqualTo(5);
	}
	
	@Test
	void testFeatureIfStringDoesNotHasLeadingAndTrainlingSpace() {
		var featureClass = new StripLeadingMethodInStringClass();
		String userName = "abhi";
		String result = featureClass.feature(userName);
		assertThat(result.length()).isEqualTo(4);
	}

}
