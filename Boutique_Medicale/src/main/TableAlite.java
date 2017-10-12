package main;

public class TableAlite extends SupportHorizontal {
	//ATTRIBUTS
	private boolean pivotable;

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
	 * @param pivotable
	 */
	public TableAlite(String reference, Marque marque, Modele modele, double prixJourLocation, int quantite,
			double hauteur, double longueur, double largeur, double poidsMax, boolean pivotable) {
		super(reference, marque, modele, prixJourLocation, quantite, hauteur, longueur, largeur, poidsMax);
		this.pivotable = pivotable;
	}
	
	//GETTERS & SETTERS
	/**
	 * @return the pivotable
	 */
	public boolean isPivotable() {
		return pivotable;
	}

	/**
	 * @param pivotable the pivotable to set
	 */
	public void setPivotable(boolean pivotable) {
		this.pivotable = pivotable;
	}
	//FIN GETTERS & SETTERS
	
}
