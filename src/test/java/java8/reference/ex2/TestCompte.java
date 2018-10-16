package java8.reference.ex2;

public class TestCompte {

	public static void main(String[] args) {
		A a1 = d -> new Compte(d);

		A a2 = Organisme::getCompte;
	}

}
