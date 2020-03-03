/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Personne;
import Observer.Observateur;
import View.VieProfessionnelle;




/**
 *
 * @author User
 */
public abstract class Controller implements Observateur {
    protected VieProfessionnelle vue;
    protected Personne modele;
  
}
