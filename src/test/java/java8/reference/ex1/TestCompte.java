package java8.reference.ex1;

public class TestCompte {

	public static void main(String[] args) {

		A a1 = c -> c.getSolde();

		A a2 = Compte::getSolde;

	}

}
