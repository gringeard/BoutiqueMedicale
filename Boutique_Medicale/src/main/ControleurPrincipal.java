/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Zebraska
 */
public class ControleurPrincipal {

    private VueConsole vc;
    private Magasin magasin;
    Scanner scanner;

    public ControleurPrincipal() {
        this.vc = new VueConsole();
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ControleurPrincipal cp = new ControleurPrincipal();
        ControleurData cd = new ControleurData();

        cp.magasin = cd.chargerMagasin();
        while(!"0".equals(cp.menuPrincipal())){}
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listeLocationsClient() {
        vc.AfficherChoixClientMagasin(this.magasin.getClients());
        int indexClient = scanner.nextInt();
        if(indexClient!=0){
            vc.afficherLocationsClient(this.magasin,indexClient);
            if(scanner.nextInt()==1){
                this.listeLocationsClient();
            }
        }
    }

    private void recetteSurPeriode() {
        vc.demanderDateDebut();
        Date dateDebut = new Date(scanner.next());
        vc.demanderDateFin();
        Date dateFin = new Date(scanner.next());
        vc.afficherRecettesPeriode(magasin,dateDebut,dateFin);
        while(scanner.nextInt()!=0){
            recetteSurPeriode();
        }
    }
}
