package tn.tuniprob.gestionmagasin.model;

import java.util.Date;

public class Produit {


    private int id;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;

    public Produit(int id, String libelle, String marque, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }
    public Produit(int id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        if(prix>0){
            this.prix = prix;
        }
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public void afficher() {
        System.out.println("Le produit est : " + getId() + " son libelle est " + getLibelle() + " sa marque est " + getMarque() + " son prix est " + getPrix());
    }

    public String toString() {
        return "Le produit {" + "Id=" + id + ", Son libelle='" + libelle + '\'' + ", Sa marque='" + marque + '\'' + ", Son prix=" + prix + '}';
    }

    public boolean comparer(Produit p){
        if ( this.id==p.id && this.libelle == p.libelle && this.prix == p.prix){
            return true;
        }
        return false;
    }
    public static boolean comparer(Produit p1, Produit p2){
        if (p1 != null && p2!=null) {
            if (p1.id == p2.id && p1.libelle == p2.libelle && p1.prix == p2.prix) {
                return true;
            }
        }
        return false;
    }
}
