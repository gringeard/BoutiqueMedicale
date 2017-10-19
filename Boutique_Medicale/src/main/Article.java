/*
 * Contant Cyril
 * Ringeard Gwénaël
 */
package main;

public abstract class Article {
	//ATTRIBUTS
	protected String reference;			//référence de l'article
	protected Marque marque;			//marque de l'article
	protected Modele modele;			//modèle de l'article
	protected double prixJourLocation;	//prix par jour de location
	protected int quantite;				//quantité en stock
	
	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixJourLocation
	 * @param quantite
	 */
	public Article(String reference, Marque marque, Modele modele, double prixJourLocation, int quantite) {
		this.reference = reference;
		this.marque = marque;
		this.modele = modele;
		this.prixJourLocation = prixJourLocation;
		this.quantite = quantite;
	}

	//GETTERS & SETTERS
	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * @return the marque
	 */
	public Marque getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(Marque marque) {
		this.marque = marque;
	}

	/**
	 * @return the modele
	 */
	public Modele getModele() {
		return modele;
	}

	/**
	 * @param modele the modele to set
	 */
	public void setModele(Modele modele) {
		this.modele = modele;
	}

	/**
	 * @return the prixJourLocation
	 */
	public double getPrixJourLocation() {
		return prixJourLocation;
	}

	/**
	 * @param prixJourLocation the prixJourLocation to set
	 */
	public void setPrixJourLocation(double prixJourLocation) {
		this.prixJourLocation = prixJourLocation;
	}

	/**
	 * @return the quantite
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * @param quantite the quantite to set
	 */
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	//FIN GETTERS & SETTERS

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Article [reference=" + reference + ", marque=" + marque + ", modele=" + modele + ", prixJourLocation="
				+ prixJourLocation + ", quantite=" + quantite + "]";
	}
	
	
	
}
