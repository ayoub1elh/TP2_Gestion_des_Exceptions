package Exercice2;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<CompteBancaire> comptes = new ArrayList<>();
        comptes.add(new CompteBancaire(12345, 19400, "Client1"));
        comptes.add(new CompteCourant(67890, 2000, "Client2", 500));
        comptes.add(new CompteEpargne(13579, 22600, "Client3", 0.05));

        // Suppression d'un compte
        comptes.remove(0);

        try {
            comptes.get(0).retraitArgent(1000);
        } catch (FondsInsuffisantsException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try{
            comptes.get(1).transfererArgent(comptes.get(0), 2500);
        } catch (FondsInsuffisantsException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (CompteInexistantException e) {
            System.out.println("Oops, " + e.getMessage());
        }

        for(CompteBancaire compte : comptes) {
            System.out.println(compte.Affichersolde());
        }
    }

}
