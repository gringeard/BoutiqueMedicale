package main;

public class Modele {
	//ATTRIBUTS
	private int id;		//identifiant du modèle
	private String nom;	//nom du modèle
	
	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param id
	 * @param nom
	 */
	public Modele(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	//GETTERS & SETTERS
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
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}	
	//FIN GETTERS & SETTERS

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Modele [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
