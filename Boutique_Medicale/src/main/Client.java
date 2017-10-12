package main;
import java.util.*;

public class Client {
	private int id; 						//Identifiant
	private String nom;						//Nom du client
	private String prenom;					//Prénom du client
	private String adresse;					//Adresse du client
	private String telephone;				//Numéro de téléphone du client
	private ArrayList<Location> locations; 	//Les locations du client
	
	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param locations
	 */
	public Client(int id, String nom, String prenom, String adresse, String telephone, ArrayList<Location> locations) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.locations = locations;
	}
	
	//CONSTRUCTEUR qui instancie un client sans location
	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 */
	public Client(int id, String nom, String prenom, String adresse, String telephone) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.locations = new ArrayList<Location>();
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

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the locations
	 */
	public ArrayList<Location> getLocations() {
		return locations;
	}

	/**
	 * @param locations the locations to set
	 */
	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}
	//FIN GETTER & SETTER

	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean addLocation(Location e) {
		return locations.add(e);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", telephone="
				+ telephone + ", locations=" + locations + "]";
	}

	
	public void afficherLocationsEnCours() {
            ArrayList<Location> desLocations = new ArrayList<>();
            for(Location uneLocation : this.locations){
                if(uneLocation.getDateDebut().compareTo(new Date()) < 0 && uneLocation.getDateFin().compareTo(new Date()) > 0 ){
                    desLocations.add(uneLocation);
                    System.out.println(uneLocation);;
                }
            }
	}
	
	
}
