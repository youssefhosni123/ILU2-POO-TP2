package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import villagegaulois.Village;

class ControlAcheterProduitTest {
	private Village viilage;

	@Test
	void testControlAcheterProduit() {
		//todo
	}

	@Test
	void testVerifierIdentite() {
		  // Arrange
        String nomAcheteur = "NomTest";
        
        controlAcheterProduit = null;
		// Act
        boolean identiteVerifiee = controlAcheterProduit.verifierIdentite(nomAcheteur);
        
        // Assert
        assertTrue(identiteVerifiee); // Vérifie que l'identité est vérifiée avec succès
    
	}

	@Test
	void testTrouverVendeurProduit() {
		fail("Not yet implemented");
	}

	@Test
	void testTrouverEtalVendeur() {
		fail("Not yet implemented");
	}

	@Test
	void testAcheterProduit() {
		fail("Not yet implemented");
	}

}
