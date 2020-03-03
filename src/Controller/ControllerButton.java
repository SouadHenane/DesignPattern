/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Personne;
import Observer.Observateur;
import View.VieProfessionnelle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author User
 */
public class ControllerButton  extends Controller implements Observateur{

  
    
     public ControllerButton(VieProfessionnelle vue,Personne modele) {
         super();
        this.vue = vue;
        this.modele = modele;
        modele.ajoute(this);
        actualise();
       
    }

    private static class AjouterListener {

        private AjouterListener() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

      }
    
    
      private static class SupprimerListener{
         private SupprimerListener() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

       }

      
      
      private static class ModifierListener{
         private ModifierListener() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

       }
      
      
      private static class RechercheListener{
         private RechercheListener() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

       }


       

  @Override
    public void actualise() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
       
    }

