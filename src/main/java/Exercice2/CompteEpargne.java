package Exercice2;

public class CompteEpargne extends CompteBancaire{
    private double tauxInteret;

    public CompteEpargne(int numeroCompte, double solde, String titulaire, double tauxInteret) {
        super(numeroCompte, solde, titulaire);
        this.tauxInteret = tauxInteret;
    }

    public void ajouterInterets() {
        double interets = getsolde() * tauxInteret / 100;
        this.depotArgent(interets);
        System.out.println("Intérêts de " + interets + " ajoutés au compte.");
    }
}

