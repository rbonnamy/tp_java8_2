package java8.reference.ex3;

public class TestCalcul {

	public static void main(String[] args) {

		// Etape 4: Si le corps de la méthode ne contient qu'une seule
		// instruction, on peut supprimer les accolades. Si cette instruction
		// unique est un return, il faut également le supprimer
		Operation op = (a, b) -> a + b;
	}

}
