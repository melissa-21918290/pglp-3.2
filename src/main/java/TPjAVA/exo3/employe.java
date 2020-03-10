package TPjAVA.exo3;



import java.util.ArrayList;
import java.util.Calendar;

public class employe {
	
      private int salaire=1500;
      private int annee_courante;
      private int annee_entree;
      
      public employe(int salaire,int annee_courant,int annee_entree) {
    	  this.salaire=1500;
    	  this.annee_courante=annee_courant;
    	  this.annee_entree=annee_entree;
      }
      
      public int salaire_Emp() {
    	  Calendar c = Calendar.getInstance();
  		int annee_courante = c.get(Calendar.YEAR);
  		return 1500+20*(annee_courante-annee_entree);
    	  
    	
      }
      
      private ArrayList employes = new ArrayList();
      
      public int salaire_total() {
    	  for(int i = 0; i < employes.size(); i++)
    	  {
    		  salaire+= (Integer)employes.get(i);
      }
	return salaire;
      }
}
