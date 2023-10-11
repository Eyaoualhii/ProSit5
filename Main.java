import tn.tuniprob.gestionmagasin.model.*;

import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Produit p1 = new Produit(1021, "Lait", "Delice");
        Produit p2 = new Produit(2510, "Yaourt", "Vitalait");
        Produit p5 = new Produit(5000, "Fromage", "President");
//        Magasin m1 = new Magasin(1,"tunis",20);
//        Magasin m2 = new Magasin(2,"charguia",40);
//        // Ajouter produits dans magasin
//        m1.ajoutProduit(p1);
//        m1.ajoutProduit(p2);
//        System.out.println( m1.toString());
//        m2.ajoutProduit(p1);
//        m2.ajoutProduit(p2);
//        System.out.println( m2.toString());
//        // Calculer nombre de produits
//        System.out.println(m1.nombreProduits());
//        System.out.println(m2.nombreProduits());
//        System.out.println(p1.comparer(p2));
//        // Comparer deux produits
//        System.out.println(Produit.comparer(p2,p5));
//        // chercher produit
//        System.out.println(m1.chercherProduit2(p1));
//
//        // Tester l'ajout
//        m1.ajoutProduit(p2);
//        // Tester suppression
//        m1.supprimerProduit(p2);
//        // Tester quel magasin ayant le plus de produits
//        System.out.println(m1.maxProduits(m2));


        Magasin m1 = new Magasin(1,"Carrefour","Centre Ville");
        Magasin m2 = new Magasin(2,"Monoprix","Menzah 6");
        Caissier c1 = new Caissier(1,"ahmed","tunis",190);
        Caissier c2 = new Caissier(1,"sadek","tunis",40);
        m1.ajoutEmploye(c1);
        m1.ajoutEmploye(c2);

        Vendeur v1 = new Vendeur(1,"eya","tunis",60,0.5);
        Vendeur v2 = new Vendeur(2,"ameni","tunis",80,0.5);
        Vendeur v3 = new Vendeur(3,"youssef","tunis",100,0.9);
        m2.ajoutEmploye(v1);
        m2.ajoutEmploye(v2);
        m2.ajoutEmploye(v3);
        Responsable r1 = new Responsable(1,"sadek","tunis",180,170);
        m2.ajoutEmploye(r1);

        System.out.println(m1.toString());
        System.out.println(m2.toString());

        m1.ajoutProduit(p1);
        m1.ajoutProduit(p2);
        m2.ajoutProduit(p5);
        //Mise à jour de la méthode toString dans la classe Magasin
        System.out.println(m1.toString());
        System.out.println(m2.toString());

        //Afficher les salaires de tous les employés dans un magasin

        m1.afficheSalaire();
        m2.afficheSalaire();

        //Afficher la prime que des responsable dans le magasin
        r1.affichePrimeResponsable();
       //Afficher le nombre des employés par type dans le magasin
        m1.nombreEmploye();
        m2.nombreEmploye();
        //Ajouter la méthode public boolean equals(Object o) dans la classe Employe qui permet de comparer les employes selon l'identifiant et le nom
        c1.equals(c2);
    }
}