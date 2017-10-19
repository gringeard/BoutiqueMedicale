/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package main;

public class Matelas extends SupportHorizontal {
	//ATTRIBUTS
	private double tempsGonfle;
	
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
	 * @param tempsGonfle
	 */
	public Matelas(String reference, Marque marque, Modele modele, double prixJourLocation, int quantite,
			double hauteur, double longueur, double largeur, double poidsMax, double tempsGonfle) {
		super(reference, marque, modele, prixJourLocation, quantite, hauteur, longueur, largeur, poidsMax);
		this.tempsGonfle = tempsGonfle;
	}

	//GETTERS & SETTERS
	/**
	 * @return the tempsGonfle
	 */
	public double getTempsGonfle() {
		return tempsGonfle;
	}

	/**
	 * @param tempsGonfle the tempsGonfle to set
	 */
	public void setTempsGonfle(double tempsGonfle) {
		this.tempsGonfle = tempsGonfle;
	}
	//FIN GETTERS & SETTERS

        @Override
        public String toString() {
            return "Matelas {" + super.toString() + ", tempsGonfle=" + tempsGonfle + '}';
        }
        
        
	
}
