/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zebraska
 */
public class ControleurData {
    
    BufferedReader br;
    File file;
    String ligne;
    String[] data = new String[10];

    public Magasin chargerMagasin() {
        HashMap<String, Modele> modeles = chargerModeles();
        HashMap<String, Marque> marques = chargerMarques();
        ArrayList<Article> articles = chargerArticles(modeles,marques);
        ArrayList<Client> clients = chargerClients();
        
        return new Magasin(1, clients, articles);
    }

    //Charge les modèles dans modeles.txt
    public HashMap<String, Modele>  chargerModeles() {
        file = new File("Ressources/modeles.txt");
        HashMap<String, Modele> modeles = new HashMap<>();
        
        try {
            br = new BufferedReader(new FileReader(file));
            try {
                while ((ligne = br.readLine()) != null) {
                    data = ligne.split(";");
                    modeles.put(data[0],new Modele(Integer.parseInt(data[0]), data[1]));
                }
            } catch (IOException ex) {
                Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return modeles;
    }
    
    //Charge les modèles dans marques.txt
    public HashMap<String, Marque> chargerMarques() {
        file = new File("Ressources/marques.txt");
        HashMap<String, Marque> marques = new HashMap<>();
        
        try {
            br = new BufferedReader(new FileReader(file));
            try {
                while ((ligne = br.readLine()) != null) {
                    data = ligne.split(";");
                    marques.put(data[0],new Marque(Integer.parseInt(data[0]), data[1]));
                }
            } catch (IOException ex) {
                Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return marques;
    }

    //Charge les articles du magasin dans articles.txt
    public ArrayList<Article> chargerArticles(HashMap<String, Modele> modeles,HashMap<String, Marque> marques) {
        file = new File("Ressources/articles.txt");
        ArrayList<Article> articles = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(file));
            try {
                while ((ligne = br.readLine()) != null) {
                    data = ligne.split(";");
                    switch (data[0]) {
                        case "1":
                            articles.add(new FauteuilRoulant(
                                    data[1], 
                                    marques.get(data[2]), 
                                    modeles.get(data[3]), 
                                    Double.parseDouble(data[4]), 
                                    Integer.parseInt(data[5]),
                                    Double.parseDouble(data[6]),
                                    Double.parseDouble(data[7])
                            ));
                        break;
                            
                        case "2":
                            articles.add(new Lit(
                                    data[1], 
                                    marques.get(data[2]), 
                                    modeles.get(data[3]), 
                                    Double.parseDouble(data[4]), 
                                    Integer.parseInt(data[5]),
                                    Double.parseDouble(data[6]),
                                    Double.parseDouble(data[7]),
                                    Double.parseDouble(data[8]),
                                    Double.parseDouble(data[9]),
                                    Double.parseDouble(data[10])
                            ));
                        break;
                            
                        case "3":
                            articles.add(new Matelas(
                                    data[1], 
                                    marques.get(data[2]), 
                                    modeles.get(data[3]), 
                                    Double.parseDouble(data[4]), 
                                    Integer.parseInt(data[5]),
                                    Double.parseDouble(data[6]),
                                    Double.parseDouble(data[7]),
                                    Double.parseDouble(data[8]),
                                    Double.parseDouble(data[9]),
                                    Double.parseDouble(data[10])
                            ));
                        break;
                            
                        case "4":
                            articles.add(new SouleveMalade(
                                    data[1], 
                                    marques.get(data[2]), 
                                    modeles.get(data[3]), 
                                    Double.parseDouble(data[4]), 
                                    Integer.parseInt(data[5]),
                                    Double.parseDouble(data[6]),
                                    Double.parseDouble(data[7])
                            ));
                        break;
                            
                        case "5":
                            articles.add(new TableAlite(
                                    data[1], 
                                    marques.get(data[2]), 
                                    modeles.get(data[3]), 
                                    Double.parseDouble(data[4]), 
                                    Integer.parseInt(data[5]),
                                    Double.parseDouble(data[6]),
                                    Double.parseDouble(data[7]),
                                    Double.parseDouble(data[8]),
                                    Double.parseDouble(data[9]),
                                    Boolean.parseBoolean(data[10])
                            ));
                        break;
                    }

                }
            } catch (IOException ex) {
                Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return articles;
    }
    
    //Charge les clients du magasin dans clients.txt
    public ArrayList<Client> chargerClients() {
        file = new File("Ressources/clients.txt");
        ArrayList<Client> clients = new ArrayList<>();
        
        try {
            br = new BufferedReader(new FileReader(file));
            try {
                while ((ligne = br.readLine()) != null) {
                    data = ligne.split(";");
                    clients.add(new Client(
                            Integer.parseInt(data[0]), 
                            data[1],
                            data[2],
                            data[3],
                            data[4]
                    ));
                }
            } catch (IOException ex) {
                Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ControleurPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return clients;
        
    }
}
