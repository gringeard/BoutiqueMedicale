package main;

public class Marque {
	//ATTRIBUTS
	private int id;		//identifiant de la marque
	private String nom;	//nom de la marque
	
	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param id
	 * @param nom
	 */
	public Marque(int id, String nom) {
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
		return "Marque [id=" + id + ", nom=" + nom + "]";
	}
	
	
	
}
