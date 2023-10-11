package tn.tuniprob.gestionmagasin.model;

public class Responsable extends Employe{

    private int prime;

    public Responsable(int identifiant, String nom, String adresse, int nb_heures,int prime) {
        super(identifiant, nom, adresse, nb_heures);
        this.prime=prime;
    }

    public Responsable(int identifiant, String nom, String adresse, int nb_heures) {
        super(identifiant, nom, adresse, nb_heures);
    }

    public int getPrime() {
        return prime;
    }

    public void setPrime(int prime) {
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = getNb_heures() * 10;
        if (getNb_heures() > 160) {
            salaire += (getNb_heures() - 160) * 0.20 * 10;
        }
        salaire += prime;
        return salaire;
    }


    public void affichePrimeResponsable (){
        System.out.println("Le prime du responsable "+getNom()+" est :"+getPrime());
    }
}
