package tn.tuniprob.gestionmagasin.model;

public class Employe {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int nb_heures;

    public Employe(int identifiant, String nom, String adresse, int nb_heures) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.adresse = adresse;
        this.nb_heures = nb_heures;
   }



    @Override
    public String toString() {
        return "Employe{" +
                "identifiant=" + identifiant +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nb_heures=" + nb_heures +
                '}';
    }

    public double calculerSalaire() {
        return 0;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNb_heures() {
        return nb_heures;
    }

    public void setNb_heures(int nb_heures) {
        this.nb_heures = nb_heures;
    }

    public boolean equals(Employe e){
        boolean egal = false;
    if ((this.identifiant == e.identifiant ) && (this.nom == e.nom)){
        egal = true;
        }
        return egal;
    }
}
