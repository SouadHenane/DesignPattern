/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class PersonneRetraité extends EtatPersonne
{

     public PersonneRetraité(Personne person)
	  {
	    super(person);
	  }

	  public EtatPersonne etatSuivant()
	  {
	    return this;
	  }
	}
