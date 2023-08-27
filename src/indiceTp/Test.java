package indiceTp;

import indiceTp.implementation.PersonneImplement;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1=new Personne("Ahmed Ben Mohamed", 80, 1.86);
		PersonneImplement pi=new PersonneImplement();
		pi.setPersonne(p1);
		System.out.println(pi.toString());

	}

}
