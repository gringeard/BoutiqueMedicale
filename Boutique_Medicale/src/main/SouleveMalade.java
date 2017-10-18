package main;

public class SouleveMalade extends Article {
	//ATTRIBUTS
	private double capaciteLevage;	//capacité de levage du soulève-malade
	private double degreFleau;		//degré de pivotage du fléau du soulève-malade
	
	//CONSTRUCTEUR qui instancie tous les attributs
	/**
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prixJourLocation
	 * @param quantite
	 * @param capaciteLevage
	 * @param degreFleau
	 */
	public SouleveMalade(String reference, Marque marque, Modele modele, double prixJourLocation, int quantite,
			double capaciteLevage, double degreFleau) {
		super(reference, marque, modele, prixJourLocation, quantite);
		this.capaciteLevage = capaciteLevage;
		this.degreFleau = degreFleau;
	}

	//GETTERS & SETTERS
	/**
	 * @return the capaciteLevage
	 */
	public double getCapaciteLevage() {
		return capaciteLevage;
	}

	/**
	 * @param capaciteLevage the capaciteLevage to set
	 */
	public void setCapaciteLevage(double capaciteLevage) {
		this.capaciteLevage = capaciteLevage;
	}

	/**
	 * @return the degreFleau
	 */
	public double getDegreFleau() {
		return degreFleau;
	}

	/**
	 * @param degreFleau the degreFleau to set
	 */
	public void setDegreFleau(double degreFleau) {
		this.degreFleau = degreFleau;
	}
	//FIN GETTERS & SETTERS

        @Override
        public String toString() {
            return "SouleveMalade {" + super.toString() + ", capaciteLevage=" + capaciteLevage + ", degreFleau=" + degreFleau + '}';
        }
	
        
	
}
