package Exercice2;

public class CompteCourant extends CompteBancaire{
    private double decouvertAutorise;

    public CompteCourant(long numCompte, double solde, String nomTitulaire, double decouvertAutorise) {
        super(numCompte, solde, nomTitulaire);
        this.decouvertAutorise = decouvertAutorise;
    }

    @Override
    public void retraitArgent(double mnt) throws FondsInsuffisantsException {
        if (getsolde() + decouvertAutorise < mnt) {
            throw new FondsInsuffisantsException("Fonds insuffisants pour effectuer le retrait.");
        } else {
            super.retraitArgent(mnt);
        }
    }
}
