/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package main;

public class FauteuilRoulant extends Article {
	//ATTRIBUTS
	private double largeurAssise; 	//largeur d'assise du fauteuil
	private double poids;			//poids du fauteuil
	
	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixJourLocation
	 * @param quantite
	 * @param largeurAssise
	 * @param poids
	 */
	public FauteuilRoulant(String reference, Marque marque, Modele modele, double prixJourLocation, int quantite,
			double largeurAssise, double poids) {
		super(reference, marque, modele, prixJourLocation, quantite);
		this.largeurAssise = largeurAssise;
		this.poids = poids;
	}

	//GETTERS & SETTERS
	/**
	 * @return the largeurAssise
	 */
	public double getLargeurAssise() {
		return largeurAssise;
	}

	/**
	 * @param largeurAssise the largeurAssise to set
	 */
	public void setLargeurAssise(double largeurAssise) {
		this.largeurAssise = largeurAssise;
	}

	/**
	 * @return the poids
	 */
	public double getPoids() {
		return poids;
	}

	/**
	 * @param poids the poids to set
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}
	//FIN GETTERS & SETTERS

        @Override
        public String toString() {
            return "FauteuilRoulant {" + super.toString() + ", largeurAssise=" + largeurAssise + ", poids=" + poids + '}';
        }
	
	
	
	
	
}
