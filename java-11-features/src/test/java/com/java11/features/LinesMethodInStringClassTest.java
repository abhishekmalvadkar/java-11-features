package com.java11.features;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class LinesMethodInStringClassTest {

	@Test
	void testFeatureIfStringHasTwoLines() {
		String content = "abhishek \n malvadkar";
		Stream<String> lines = content.lines();
		List<String> linesList = lines.toList();
		assertThat(linesList).hasSize(2);
		assertThat(linesList.get(0)).isEqualTo("abhishek ");
		assertThat(linesList.get(1)).isEqualTo(" malvadkar");
	}
	
	@Test
	void testFeatureIfStringIsEmpty() {
		String content = "";
		Stream<String> lines = content.lines();
		List<String> linesList = lines.toList();
		assertThat(linesList).isEmpty();
	}
	
	@Test
	void testFeatureIfStringHasTwoLinesWithSpacesOnly() {
		String content = " \n ";
		Stream<String> lines = content.lines();
		List<String> linesList = lines.toList();
		assertThat(linesList).hasSize(2);
		assertThat(linesList.get(0)).isEqualTo(" ");
		assertThat(linesList.get(1)).isEqualTo(" ");
	}
	
	
	
	
	
	

}
