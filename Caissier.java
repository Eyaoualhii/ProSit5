package tn.tuniprob.gestionmagasin.model;

public class Caissier extends Employe{

private int numeroDeCaisse;


    public Caissier(int identifiant, String nom, String adresse, int nb_heures,int numeroDeCaisse) {
        super(identifiant, nom, adresse, nb_heures);
        this.numeroDeCaisse=numeroDeCaisse;
    }

    public Caissier(int identifiant, String nom, String adresse, int nb_heures) {
        super(identifiant, nom, adresse, nb_heures);
    }




    public int getNumeroDeCaisse() {
        return numeroDeCaisse;
    }

    public void setNumeroDeCaisse(int numeroDeCaisse) {
        this.numeroDeCaisse = numeroDeCaisse;
    }


    @Override
    public double calculerSalaire() {
        double salaire = getNb_heures() * 5;
        if (getNb_heures() > 180) {
            salaire += (getNb_heures() - 180) * 0.15 * 5;
        }
        return salaire;
    }
}
