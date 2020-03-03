/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;
import java.util.*;
/**
 *
 * @author User
 */
public abstract class Sujet {
    
	protected List<Observateur> observateurs = 
		    new ArrayList<Observateur>();

		  public void ajoute(Observateur observateur)
		  {
		    observateurs.add(observateur);
		  }

		  public void retire(Observateur observateur)
		  {
		    observateurs.remove(observateur);
		  }

		  public void notifie()
		  {
		    for (Observateur observateur: observateurs)
		      observateur.actualise();
		  }
    
}
