package java8.reference;

import java.util.function.Function;

public class TestCarre {

	public static void main(String[] args) {
		Function<Integer, Integer> carre = i -> i*i;
		
		Calcul c = new Calcul();
			
		Function<Integer, Integer> carreRef = c::carre;

	}

}
