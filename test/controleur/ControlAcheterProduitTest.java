package controleur;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import villagegaulois.Etal;
import villagegaulois.Village;
import personnages.Chef;
import personnages.Gaulois;
class ControlAcheterProduitTest {
	 private Village village;
	 private Chef abraracourcix;
	 private ControlTrouverEtalVendeur controlTrouverEtalVendeur;
	 @BeforeEach
	    public void initialiserSituation() {
	        System.out.println("Initialisation...");
	        village = new Village("le village des irréductibles", 10, 5);
	        abraracourcix = new Chef("Abraracourcix", 10, village);
	        village.setChef(abraracourcix);
	    }
	@Test
	void testControlAcheterProduit() {
		 ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
	        ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(village);
	        ControlAcheterProduit controlAcheterProduit = new ControlAcheterProduit(controlVerifierIdentite, controlTrouverEtalVendeur, village);
	        
	        assertNotNull(controlAcheterProduit, "Le contrôle d'achat du produit a réussi");
	    }
	

	@Test
	void testVerifierIdentite() {
		 ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(village);
	        assertTrue(controlVerifierIdentite.verifierIdentite("Abraracourcix"), "Vérification de l'identité réussie");
	}

	@Test
	void testTrouverVendeurProduit() {
		ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(village);
		Gaulois[] vendeurs = controlTrouverEtalVendeur.trouverVendeursProduit("Potion");
        assertNotNull(vendeurs, "La recherche de vendeurs a réussi");
	}

	@Test
	void testTrouverEtalVendeur() {
		 ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
		    Etal etal = controlTrouverEtalVendeur.trouverEtalVendeur("Vendeur1");
		    assertNotNull(etal, "La recherche d'étal de vendeur a réussi");
	}

	@Test
	void testAcheterProduit() {
		ControlTrouverEtalVendeur controlTrouverEtalVendeur = new ControlTrouverEtalVendeur(village);
        ControlVerifierIdentite controlVerifierIdentite = new ControlVerifierIdentite(village);
        ControlAcheterProduit controlAcheterProduit = new ControlAcheterProduit(controlVerifierIdentite, controlTrouverEtalVendeur, village);
        
        assertNotNull(controlAcheterProduit, "Le contrôle d'achat du produit a réussi");
	}

}
