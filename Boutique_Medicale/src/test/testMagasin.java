/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.*;

public class testMagasin {

	public static void main(String[] args) {
		
		//Déclaration et instanciation d'un magasin
		Magasin unMagasin = new Magasin(1);
		
		//Déclaration et instanciation de 2 clients
		Client client1 = new Client(1, "Contant", "Cyril", "Nantes", "0200000000");
		Client client2 = new Client(2, "Ringeard", "Gwenael", "La Varenne", "0240000000");
		
		//Ajout des clients au magasin
		unMagasin.addClient(client1);
		unMagasin.addClient(client2);
		
		//Déclaration et instanciation de 2 articles
		FauteuilRoulant article1 = new FauteuilRoulant("a1237", new Marque(1, "Yoplait"), 
				new Modele(1,"coundelitch"), 12.5, 3, 30, 25);
		SouleveMalade article2 = new SouleveMalade("a1236", new Marque(2, "Boiron"),
				new Modele(2,"flubuck"), 17, 7, 120, 45);
		SouleveMalade article3 = new SouleveMalade("a1239", new Marque(3, "Bayer"),
				new Modele(2,"tchek"), 18, 6, 130, 42);
		
		//Ajout des articles au magasin
		unMagasin.addArticle(article1);
		unMagasin.addArticle(article2);
		unMagasin.addArticle(article3);
		
		//Affichage du magasin
                System.out.println("Affichage du magasin :");
		System.out.println(unMagasin);
		
		//Affichage de tous les articles
		System.out.println(" ");
                System.out.println("Affichage de tous les articles :");
		unMagasin.AfficherArticles();
		
		//Affichage de tous les articles triés par reference
		System.out.println(" ");
                System.out.println("Affichage de tous les articles triés par reference :");
		unMagasin.AfficherArticlesTri("reference");
		
		//Affichage de tous les articles triés par marque
		System.out.println(" ");
                System.out.println("Affichage de tous les articles triés par marque :");
		unMagasin.AfficherArticlesTri("marque");
		
		//Affichage de tous les articles triés par modèle
		System.out.println(" ");
                System.out.println("Affichage de tous les articles triés par modèle :");
		unMagasin.AfficherArticlesTri("modele");
		
		//Affichage de tous les articles triés par prix
		System.out.println(" ");
                System.out.println("Affichage de tous les articles triés par prix");
		unMagasin.AfficherArticlesTri("prix");
		
		//Affichage de tous les articles triés par "Erreur"
		System.out.println(" ");
                System.out.println("Affichage de tous les articles triés par \"Erreur\"");
		unMagasin.AfficherArticlesTri("test");
		
		//Test Enregistrement location
                HashMap<Article, Integer> desArticlesLoues = new HashMap<>();
                desArticlesLoues.put(article1, 3);
                desArticlesLoues.put(article2, 2);
		Location uneLocation = new Location(1, new Date(117,8,1), new Date(117,8,21), desArticlesLoues);
                System.out.println(" ");
                System.out.println("Affichage d'une location :");
                System.out.println(uneLocation);
                double montant = (17*2+12.5*3)*20;
                System.out.println(" ");
                System.out.println("Vérification du montant de la location :");
                System.out.println("Montant de la location ok ? " + (montant == uneLocation.getMontant()));
                
                unMagasin.enregistrerLocation(client1, uneLocation);
                System.out.println(" ");
                System.out.println("Affichage des locations du magasin pour le client1 :");
                System.out.println(client1.getLocations());
                                
                
                //Ajout d'une location
                HashMap<Article, Integer> desArticlesLoues2 = new HashMap<>();
                desArticlesLoues2.put(article2, 4);
                desArticlesLoues2.put(article3, 3);
		Location uneLocation2 = new Location(2, new Date(117,7,1), new Date(117,10,21), desArticlesLoues2);
                System.out.println(" ");
                System.out.println("Ajout d'une location :");
                System.out.println(uneLocation2);
                unMagasin.enregistrerLocation(client1, uneLocation2);
                System.out.println(" ");
                System.out.println("Affichage des locations du magasin pour le client1 :");
                System.out.println(client1.getLocations());
                
                //Afficher l'ensemble des locations en cours pour un client donné
                System.out.println(" ");
                System.out.println("Liste des locations en cours pour le client1 :");
                client1.afficherLocationsEnCours();
                
                //Ajout d'une location
                HashMap<Article, Integer> desArticlesLoues3 = new HashMap<>();
                desArticlesLoues3.put(article2, 7);
                desArticlesLoues3.put(article3, 1);
		Location uneLocation3 = new Location(3, new Date(117,8,1), new Date(117,8,23), desArticlesLoues3);
                unMagasin.enregistrerLocation(client2, uneLocation3);
                System.out.println(" ");
                System.out.println("Ajout d'une location :");
                System.out.println(uneLocation3);
                
                //archiver les locations
                ArrayList<Location> lesLocations = new ArrayList<>();
                lesLocations.add(uneLocation);
                lesLocations.add(uneLocation2);
                lesLocations.add(uneLocation3);
                try {
                    unMagasin.archiverLocation();
                } catch (IOException ex) {
                    Logger.getLogger(testMagasin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                //Calculer le montant total des recettes sur une période
                double montantRecettes = unMagasin.montantTotalRecettes(new Date(117,8,1), new Date());
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                System.out.println(" ");
                System.out.println("le montant des recettes entre " + sdf.format(new Date(117,8,1)) + " et " + sdf.format(new Date()) + " est de " + montantRecettes);
	}

}
