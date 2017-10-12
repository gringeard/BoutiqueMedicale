package main;
import java.util.*;

public class Magasin {
	private int id;							//Identifiant du magasin
	private ArrayList<Client> clients; 		//Les clients du magasin
	private ArrayList<Article> articles; 	//Les articles du magasin

	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param id
	 * @param clients
	 * @param articles
	 */
	public Magasin(int id, ArrayList<Client> clients, ArrayList<Article> articles) {
		this.id = id;
		this.clients = clients;
		this.articles = articles;
	}
	
	//CONSTRUCTEUR qui instancie seulement l'id
	/**
	 * @param id
	 */
	public Magasin(int id) {
		this.id = id;
		this.clients = new ArrayList<Client>();
		this.articles = new ArrayList<Article>();
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
	 * @return the clients
	 */
	public ArrayList<Client> getClients() {
		return clients;
	}

	/**
	 * @param clients the clients to set
	 */
	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}

	/**
	 * @return the articles
	 */
	public ArrayList<Article> getArticles() {
		return articles;
	}

	/**
	 * @param articles the articles to set
	 */
	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
	//FIN GETTER & SETTER
	
	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean addClient(Client e) {
		return clients.add(e);
	}

	/**
	 * @param e
	 * @return
	 * @see java.util.ArrayList#add(java.lang.Object)
	 */
	public boolean addArticle(Article e) {
		return articles.add(e);
	}

	/**
	 * @param index
	 * @return
	 * @see java.util.ArrayList#remove(int)
	 */
	public Article removeArticle(int index) {
		return articles.remove(index);
	}

	/**
	 * @param index
	 * @return
	 * @see java.util.ArrayList#remove(int)
	 */
	public Client removeClient(int index) {
		return clients.remove(index);
	}
	
	/**
	 * Affiche l'ensemble des articles du Magasin
	 */
	public void AfficherArticles(){
		for(Article unArt : articles){
			System.out.println(unArt);
		}
	}
	
	public void AfficherArticlesTri(String choixTri){
		Comparator<Article> c;
		
		switch (choixTri){
			case "reference" :
				c = new CompareArticleParRef();
				break;
			case "marque" :
				c = new CompareArticleParMarque();
				break;
			case "modele" :
				c = new CompareArticleParModele();
				break;
			case "prix" :
				c = new CompareArticleParPrix();
				break;
			default :
				c = null;
				System.out.println("Les choix possibles sont reference, marque, modele, prix");
		}
		try{
			Collections.sort(this.articles, c);
			this.AfficherArticles();
		}catch(Exception e){
			
		}			
	}
	
	public void enregistrerLocation(Client unClient, Location uneLocation){
		//Ajout de la location a la liste des locations du client
		unClient.addLocation(uneLocation);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Magasin [id=" + id + ", clients=" + clients + ", articles=" + articles + "]";
	}
	
	
	
	
}
