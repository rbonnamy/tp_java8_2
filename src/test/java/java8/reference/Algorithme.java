package java8.reference;

import java.util.function.BiFunction;

public class Algorithme {

	
	public static void displayResult(BiFunction<String, String, Integer> function, String a, String b){
		
		System.out.println(function.apply(a, b));
	}
}
