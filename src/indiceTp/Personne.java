package indiceTp;

public class Personne {
	private String nomComplet;
	private double poids,taille;
	public String getNomComplet() {
		return nomComplet;
	}
	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public Personne(String nomComplet, double poids, double taille) {
		super();
		this.nomComplet = nomComplet;
		this.poids = poids;
		this.taille = taille;
	}
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Personne [nomComplet=" + nomComplet + ", poids=" + poids + ", taille=" + taille + "]";
	}
	

}
