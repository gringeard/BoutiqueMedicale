/*
 * Contant Cyril
 * Ringeard Gwénaël
 */
package main;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Zebraska
 */
public class ControleurPrincipal {

    private VueConsole vc;
    private Magasin magasin;
    private Scanner scanner;
    private ControleurData cd;

    public ControleurPrincipal() {
        this.vc = new VueConsole();
        this.scanner = new Scanner(System.in);
        this.cd = new ControleurData();
        this.magasin = cd.chargerMagasin();
    }

    public static void main(String[] args) {
        ControleurPrincipal cp = new ControleurPrincipal();
        while (!"0".equals(cp.menuPrincipal())) {
        }
    }

    public String menuPrincipal() {
        vc.afficherMenuPrincipal();
        String choix = scanner.nextLine();
        switch (choix) {
            case "1":
                this.listeArticles();
                break;
            case "2":
                this.enregistrerLocation();
                break;
            case "3":
                this.listeLocationsClient();
                break;
            case "4":
                this.recetteSurPeriode();

        }
        return choix;
    }

    public void listeArticles() {
        vc.afficherArticles(this.magasin);
        String choix;
        while (!"0".equals(choix = scanner.nextLine())) {
            switch (choix) {
                case "1":
                    vc.afficherArticlesTri(this.magasin, "reference");
                    break;
                case "2":
                    vc.afficherArticlesTri(this.magasin, "marque");
                    break;
                case "3":
                    vc.afficherArticlesTri(this.magasin, "modele");
                    break;
                case "4":
                    vc.afficherArticlesTri(this.magasin, "prix");
                    break;
            }
        }
        this.menuPrincipal();
    }

    private void enregistrerLocation() {
        vc.demanderId();
        int id = scanner.nextInt();
        vc.demanderDateDebut();
        Date dateDebut = new Date(scanner.next());
        vc.demanderDateFin();
        Date dateFin = new Date(scanner.next());

        HashMap<Article, Integer> articles = new HashMap<>();
        int quantite = 0;
        int indexArticle = 1;

        vc.afficherChoixArticlesMagasin(magasin.getArticles());
        indexArticle = scanner.nextInt();
        vc.demanderQuantite();
        quantite = scanner.nextInt();
        while (indexArticle != 0) {
            articles.put(magasin.getArticles().get(indexArticle - 1), quantite);
            vc.afficherChoixArticlesMagasin(magasin.getArticles());
            indexArticle = scanner.nextInt();
            if(indexArticle != 0){
                vc.demanderQuantite();
                quantite = scanner.nextInt();
            }
        }

        if (!articles.isEmpty()) {
            vc.AfficherChoixClientMagasin(this.magasin.getClients());
            int indexClient = scanner.nextInt();
            if (indexClient != 0) {
                Location location = new Location(id, dateDebut, dateFin, articles);
                ArrayList<Client> clients = magasin.getClients();
                Client client = clients.get(indexClient - 1);
                client.addLocation(location);
                clients.set(indexClient - 1, client);
                magasin.setClients(clients);
                System.out.println(location.toString());
                /*System.out.println("Location :");
                System.out.println(". id : " + location.getId());
                System.out.println(". dateDebut : " + location.getDateDebut().toString());
                System.out.println(". dateFin : " + location.getDateFin().toString());
                System.out.println(". articles : ");
                Iterator it = location.getArticles().entrySet().iterator();
                while(it.hasNext()){
                    HashMap.Entry pair = (HashMap.Entry)it.next();
                    System.out.println("    . référence : "+((Article)pair.getKey()).getReference()+" quantité : "+pair.getValue());
                }*/
                System.out.println("enregistrée pour le client :");
                System.out.println(client.toString());
                System.out.println("0 - Retour menu principal");
                scanner.nextInt();
            }
        }
    }

    private void listeLocationsClient() {
        vc.AfficherChoixClientMagasin(this.magasin.getClients());
        int indexClient = scanner.nextInt();
        if (indexClient != 0) {
            vc.afficherLocationsClient(this.magasin, indexClient);
            if (scanner.nextInt() == 1) {
                this.listeLocationsClient();
            }
        }
    }

    private void recetteSurPeriode() {
        vc.demanderDateDebut();
        Date dateDebut = new Date(scanner.next());
        vc.demanderDateFin();
        Date dateFin = new Date(scanner.next());
        vc.afficherRecettesPeriode(magasin, dateDebut, dateFin);
        while (scanner.nextInt() != 0) {
            recetteSurPeriode();
        }
    }
}
