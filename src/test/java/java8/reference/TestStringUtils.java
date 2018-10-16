package java8.reference;

import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class TestStringUtils {

	public static void main(String[] args) {
		
		BiFunction<String, String, Integer> avecLambda = (s1, s2) -> StringUtils.levenshteinDistance(s1, s2);
		
		BiFunction<String, String, Integer> avecRefMethod = StringUtils::levenshteinDistance;
		
		Algorithme.displayResult( (s1, s2) -> StringUtils.levenshteinDistance(s1, s2), "coucou", "coucoux");
	}

}
