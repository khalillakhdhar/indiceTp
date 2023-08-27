package indiceTp.implementation;

import indiceTp.Personne;
import indiceTp.PersonneInterface;

public class PersonneImplement implements PersonneInterface {
private Personne personne;
	
	
	public Personne getPersonne() {
	return personne;
}

public void setPersonne(Personne personne) {
	this.personne = personne;
}

	@Override
	public int indices() {
		// TODO Auto-generated method stub
		return (int) Math.round(personne.getPoids()/Math.pow(personne.getTaille(), 2)) ;
	}

	@Override
	public String interpretation() {
		// TODO Auto-generated method stub
		int imc=this.indices();
		if(imc<20)
			return "maigre";
		else if(imc<=25)
			return "idéale";
		else if(imc<=30)
			return "surpoids";
		else
			return "obésité";
		
	}

	@Override
	public String toString() {
		return "PersonneImplement [personne=" + personne.toString() + ", indices=" + indices() + ", interpretation="
				+ interpretation() + "]";
	}
	
	
	
	

}
