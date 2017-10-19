/*
 * Contant Cyril
 * Ringeard Gwénaël
 */

package main;

public class Lit extends SupportHorizontal {
	//ATTRIBUTS
	private double degreInclin;

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
	 * @param degreInclin
	 */
	public Lit(String reference, Marque marque, Modele modele, double prixJourLocation, int quantite, double hauteur,
			double longueur, double largeur, double poidsMax, double degreInclin) {
		super(reference, marque, modele, prixJourLocation, quantite, hauteur, longueur, largeur, poidsMax);
		this.degreInclin = degreInclin;
	}

	//GETTERS & SETTERS
	/**
	 * @return the degreInclin
	 */
	public double getDegreInclin() {
		return degreInclin;
	}

	/**
	 * @param degreInclin the degreInclin to set
	 */
	public void setDegreInclin(double degreInclin) {
		this.degreInclin = degreInclin;
	}
	//FIN GETTERS & SETTERS

        @Override
        public String toString() {
            return "Lit {" + super.toString() + ", degreInclin=" + degreInclin + '}';
        }
	
        
        
	
}
