/*
 * Contant Cyril
 * Ringeard Gwénaël
 */
package main;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Zebraska
 */
public class VueConsole {

    public VueConsole() {

    }

    public void afficherMenuPrincipal() {
        System.out.println("============================================");
        System.out.println("Menu principal");
        System.out.println("1 - Afficher les articles du magasin");
        System.out.println("2 - Enregistrer une location");
        System.out.println("3 - Afficher les locations en cours d'un client");
        System.out.println("4 - Afficher les recettes sur une période");
        System.out.println("0 - Quitter");
        System.out.println("Indiquez votre choix :");
    }

    public void afficherArticles(Magasin magasin) {
        System.out.println("============================================");
        System.out.println("Articles :");

        magasin.AfficherArticles();

        System.out.println("Menu articles");
        System.out.println("1 - Trier par référence");
        System.out.println("2 - Trier par marque");
        System.out.println("3 - Trier par modèle");
        System.out.println("4 - Trier par prix par jour de location");
        System.out.println("0 - Retour menu principal");
        System.out.println("Indiquez votre choix :");
    }

    public void afficherArticlesTri(Magasin magasin, String codeTri) {
        System.out.println("============================================");
        System.out.println("Articles triés par " + codeTri + " :");

        magasin.AfficherArticlesTri(codeTri);

        System.out.println("Menu articles");
        System.out.println("1 - Trier par référence");
        System.out.println("2 - Trier par marque");
        System.out.println("3 - Trier par modèle");
        System.out.println("4 - Trier par prix par jour de location");
        System.out.println("0 - Retour menu principal");
        System.out.println("Indiquez votre choix :");
    }

    void afficherLocationsClient(Magasin magasin, int indexClient) {
        System.out.println("============================================");
        magasin.getClients().get(indexClient-1).afficherLocationsEnCours();
        System.out.println("1 - Changer de client");
        System.out.println("0 - Retour menu principal");
        System.out.println("Indiquez votre choix :");
    }

    void AfficherChoixClientMagasin(ArrayList<Client> clients) {
        System.out.println("============================================");
        System.out.println("Choix du client");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println((i+1) + " - " + clients.get(i).getPrenom() + " " + clients.get(i).getNom());
        }
        System.out.println("0 - Retour menu principal");
        System.out.println("Indiquez votre choix :");
    }
    
    void demanderDateDebut() {
        System.out.println("============================================");
        System.out.println("Date de début : (format mm/dd/aaaa)");
    }
    
    void demanderDateFin() {
        System.out.println("Date de fin : (format mm/dd/aaaa)");
    }

    void afficherRecettesPeriode(Magasin magasin, Date dateDebut,Date dateFin) {
        System.out.println("Montant total des recettes : "+magasin.montantTotalRecettes(dateDebut, dateFin));
        System.out.println("1 - Changer de période");
        System.out.println("0 - Retour menu principal");
        System.out.println("Indiquez votre choix :");
    }

    void afficherChoixArticlesMagasin(ArrayList<Article> articles) {
        System.out.println("============================================");
        System.out.println("Choix des articles");
        for (int i = 0; i < articles.size(); i++) {
            System.out.println((i+1) + " - " + articles.get(i).toString());
            /*System.out.println((i+1) + " - " + articles.get(i).getReference() 
                    + " " + articles.get(i).getMarque().getNom()
                    + " " + articles.get(i).getModele().getNom()
                    + " " + articles.get(i).getPrixJourLocation()
                    + " " + articles.get(i).getQuantite());*/
        }
        System.out.println("0 - Valider le choix des articles");
        System.out.println("Indiquez votre choix :");
    }

    void demanderQuantite() {
        System.out.println("Quantité :");
        System.out.println("Indiquez votre choix :");
    }

    void demanderId() {
        System.out.println("============================================");
        System.out.println("Id :");
        System.out.println("Indiquez votre choix :");
    }
}
