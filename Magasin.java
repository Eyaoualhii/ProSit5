package tn.tuniprob.gestionmagasin.model;

import java.util.Arrays;

public class Magasin {
    private int idMagasin;
    private String nomMagasin;
    private String adresse;
    private int capacité;
    private int nbrProduit = 0;
    private int nbrEmployes = 0;
    Produit[] produits = new Produit[50];

    Employe[] employes = new Employe[20];

    public Magasin(int idMagasin, String nomMagasin, String adresse, int capacité, int nbrProduit, Produit[] produits) {
        this.idMagasin = idMagasin;
        this.nomMagasin = nomMagasin;
        this.adresse = adresse;
        this.capacité = capacité;
        this.nbrProduit = nbrProduit;
        this.produits = produits;
    }

    public Magasin(int idMagasin, String adresse, int capacité) {
        this.idMagasin = idMagasin;
        this.adresse = adresse;
        this.capacité = capacité;
    }

    public Magasin(int idMagasin, String nomMagasin, String adresse) {
        this.idMagasin = idMagasin;
        this.nomMagasin = nomMagasin;
        this.adresse = adresse;
    }

    public Magasin() {
    }

    public void ajoutProduit(Produit p) {
        if (chercherProduit(p) == false) {
            if (this.nbrProduit < 50) {
                this.produits[nbrProduit] = p;
                nbrProduit++;
                System.out.println("Le produit est ajouté");
            } else {
                System.out.println("le magasin est plein");
            }} else {
            System.out.println("le produit existe deja");
        }
    }



    public int nombreProduits() {
        int s = 0;
        for (Produit produit : produits) {
            if (produit != null) {
                s++;
            }
        }

        return s;
    }

    public boolean chercherProduit(Produit p) {
        if (p != null) {
        for (int i = 0; i < nbrProduit; i++) {
            if (Produit.comparer(p, produits[i])) {
                return true;
            }
        }
        }
        return false;
    }

    public int chercherProduit2(Produit p) {
        if (p != null) {
            for (int i = 0; i < nbrProduit; i++) {
                if (Produit.comparer(p, produits[i])) {
                    return i;
                }
            }
        }
        return -1;
    }
    public boolean supprimerProduit(Produit p) {
       int indice =chercherProduit2(p);
        if (indice == -1) {
            return false;
        }else {
            for (int i=0;i<nbrProduit;i++){
                produits[i]=produits[i+1];
            }
            produits[nbrProduit]=null;
            nbrProduit--;
            System.out.println("Produit supprimé");
            return true;
        }
    }

    public Magasin maxProduits(Magasin m1){
        for (int i=0;i<nbrProduit;i++){
            if(this.nbrProduit > m1.nbrProduit)
                return this;
            else
                return m1;
        }
            return null;
        }
    public void ajoutEmploye(Employe e) {

            if (this.nbrEmployes < 20) {

                this.employes[nbrEmployes] = e;
                nbrEmployes++;
                System.out.println("L employe est ajouté");
            } else {
                System.out.println("Le nombre d employes maximal est atteint");
            }
        }


    @Override
    public String toString() {
        return "Magasin{" +
                "idMagasin=" + idMagasin +
                ", nomMagasin='" + nomMagasin + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capacité=" + capacité +
                ", nbrProduit=" + nbrProduit +
                ", nbrEmployes=" + nbrEmployes +
                ", produits=" + Arrays.toString(produits) +
                ", employes=" + Arrays.toString(employes) +
                '}';
    }


    public void afficheSalaire() {
        for (Employe e : employes) {
            if(e!=null) {
                System.out.println("Le salaire du " + e.getNom() + ":" + e.calculerSalaire());
            }
        }
    }
    public void nombreEmploye() {
        int nbrEmploye = 0;
        int nbrEmployeC=0;
        int nbrEmployeV=0;
        int nbrEmployeR=0;

        for (Employe e : employes) {
            if (e != null) {
                if (e instanceof Caissier) {
                    nbrEmployeC++;
                } else if (e instanceof Responsable) {
                    nbrEmployeR++;
                } else if (e instanceof Vendeur) {
                    nbrEmployeV++;
                } else {
                    nbrEmploye++;
                }

            }
        }
        System.out.println("Le nombre des caissiers : " + nbrEmployeC + "le nombre des vendeurs : " +nbrEmployeV +" le nombre des responsables : " +nbrEmployeR);
    }
}



