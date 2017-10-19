/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package main;

public abstract class SupportHorizontal extends Article {
	//ATTRIBUTS
	protected double hauteur;
	protected double longueur;
	protected double largeur;
	protected double poidsMax;
	
	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixJourLocation
	 * @param quantite
	 * @param hauteur
	 * @param longueur
	 * @param largeur
	 * @param poidsMax
	 */
	public SupportHorizontal(String reference, Marque marque, Modele modele, double prixJourLocation, int quantite,
			double hauteur, double longueur, double largeur, double poidsMax) {
		super(reference, marque, modele, prixJourLocation, quantite);
		this.hauteur = hauteur;
		this.longueur = longueur;
		this.largeur = largeur;
		this.poidsMax = poidsMax;
	}

	//GETTERS & SETTERS
	/**
	 * @return the hauteur
	 */
	public double getHauteur() {
		return hauteur;
	}

	/**
	 * @param hauteur the hauteur to set
	 */
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	/**
	 * @return the poidsMax
	 */
	public double getPoidsMax() {
		return poidsMax;
	}

	/**
	 * @param poidsMax the poidsMax to set
	 */
	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}
	//FIN GETTERS & SETTERS
	
}
