package java8.reference.ex5;

import java.util.Optional;

public class TestService {

	public static void main(String[] args) {
		CompteService compteService = new CompteService();
		Optional<Compte> opt = Optional.ofNullable(compteService.findByCode("Coucou"));
		opt.get();
		System.out.println("OK");
	}

}
