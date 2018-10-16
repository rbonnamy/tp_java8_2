package java8.reference.ex6;

import java.util.List;
import java.util.Optional;

public class LivreServices {

	public Optional<Livre> getLivre(List<Livre> livres, String nomRecherche) {
		for (Livre livre : livres) {
			if (livre.getNom().equals(nomRecherche)) {
				return Optional.of(livre);
			}
		}
		return Optional.empty();
	}

}
