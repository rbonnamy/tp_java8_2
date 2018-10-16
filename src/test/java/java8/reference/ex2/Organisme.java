package java8.reference.ex2;

public class Organisme {

	public static Compte getCompte(double solde) {
		return new Compte(solde);
	}
}
