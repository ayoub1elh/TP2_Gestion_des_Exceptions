package Exercice2;

public class CompteBancaire {

    private long numCompte;
    private double solde;
    private String nomTitulaire;


    public CompteBancaire(long numCompte, double solde, String nomTitulaire) {
        this.numCompte = numCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public long getNumCompte() {
        return numCompte;
    }

    public double getsolde() {
        return solde;
    }

    public String getNomTitulaire() {
        return nomTitulaire;
    }

    public void depotArgent(double mnt) {
        if (mnt > 0) {
            this.solde += mnt;
            System.out.println("Dépôt de " + mnt + " effectué avec succès. Nouveau soldee: " + solde);
        }
    }

    public void retraitArgent(double mnt) throws FondsInsuffisantsException{
        if(mnt > this.solde) throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        else {
            this.solde -= mnt;
            System.out.println("Retrait de " + mnt + " effectué avec succès. Nouveau solde: " + solde);
        }
    }

    public String Affichersolde() {
        return "Solde du compte n° " + numCompte + " = " + solde;
    }

    public void transfererArgent(CompteBancaire destination, double mnt) throws FondsInsuffisantsException, CompteInexistantException {
        if (destination == null) {
            throw new CompteInexistantException("Le compte destinataire n'existe pas.");
        }
        if (solde >= mnt) {
            System.out.println("\n**************Démarage du transfert**************");
            retraitArgent(mnt);
            destination.depotArgent(mnt);
            System.out.println("Transfert de " + mnt + " vers le compte " + destination.numCompte + " effectué avec succès.");
            System.out.println("**************Transfert Terminer**************\n");
        } else {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le transfert.");
        }
    }
}
