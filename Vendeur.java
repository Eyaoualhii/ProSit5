package tn.tuniprob.gestionmagasin.model;

public class Vendeur extends Employe{

    private double tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nb_heures,double tauxDeVente) {
        super(identifiant, nom, adresse, nb_heures);
        this.tauxDeVente=tauxDeVente;
    }

    public Vendeur(int identifiant, String nom, String adresse, int nb_heures) {
        super(identifiant, nom, adresse, nb_heures);
    }

    public double getTauxDeVente() {
        return tauxDeVente;
    }

    public void setTauxDeVente(double tauxDeVente) {
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * getTauxDeVente();
    }
}
