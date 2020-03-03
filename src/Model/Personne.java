/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Observer.Sujet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Personne extends Sujet{
	
	protected int ID;
	protected String Nom;
	protected EtatPersonne etatPersonne;
	protected int nbPoints;
	public int getID() {
		return ID;
	}
        public Personne()
  {
    etatPersonne= new PersonneEtudiant(this);
  }

        
	public int getId() {
		return ID;
	}

	
	public String getNom() {
		return Nom;
	}
	/*public void setNom(String nom) {
		this.Nom = Nom;
	}*/
	 public EtatPersonne getEtat() {
		return etatPersonne;
	}
	public int getNbPoints() {
		return nbPoints;
	}
	/*public void setNbPoints(int nbPoints) {
		this.nbPoints = nbPoints;
	}*/

        
        
      

           
}

