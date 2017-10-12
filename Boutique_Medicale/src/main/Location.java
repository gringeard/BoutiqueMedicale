package main;
import java.util.*;

public class Location {
	private int id;								//Identifiant
	private Date dateDebut;						//Date de début de la location
	private Date dateFin;						//Date de fin de la location
	private double montant;						//Montant de la location
	private HashMap<Article, Integer> articles;	//Articles avec leur quantité
	
	//CONSTRUCTEUR
	/**
	 * @param id
	 * @param dateDebut
	 * @param dateFin
	 * @param montant
	 * @param articles
	 */
	public Location(int id, Date dateDebut, Date dateFin, HashMap<Article, Integer> articles) {
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.articles = articles;
		genererMontant();
	}
	
	//CONSTRUCTEUR qui instancie tout sauf articles
	/**
	 * @param id
	 * @param dateDebut
	 * @param dateFin
	 * @param montant
	 * @param articles
	 */
	public Location(int id, Date dateDebut, Date dateFin) {
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.montant = 0;
		this.articles = new HashMap<Article, Integer>();
	}

	//GETTER & SETTER
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the dateDebut
	 */
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * @return the articles
	 */
	public HashMap<Article, Integer> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(HashMap<Article, Integer> articles) {
		this.articles = articles;
	}
	//FIN GETTER & SETTER
	
	/**
	 * @param key
	 * @param value
	 * @return
	 * @see java.util.HashMap#put(java.lang.Object, java.lang.Object)
	 */
	public Integer put(Article key, Integer value) {
		return articles.put(key, value);
	}
	
	private void genererMontant(){
		this.montant = 0;
		//Durée d'un jour en millisecondes
		final long DUREE_JOUR = 1000l * 60 * 60 * 24;
		//Nombre de jours entre la date début et date fin
		long duree = (this.dateFin.getTime() - this.dateDebut.getTime()) / DUREE_JOUR;
		//Pour chaque article de la location, on ajoute au montant le cout en
		//fonction du prix par jour, de la quantité et de la durée
		for(Article unArticle : articles.keySet()){
			montant += (articles.get(unArticle) * unArticle.getPrixJourLocation()) * duree;
		}
	}

        @Override
        public String toString() {
            return "Location{" + "id=" + id + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + ", montant=" + montant + ", articles=" + articles + '}';
        }
        
        

	
	
}
