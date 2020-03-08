package TPjAVA.exo3;

public class manager extends employe {
	
	public manager(int salaire, int annee_courant, int annee_entree) {
		super(salaire, annee_courant, annee_entree);
	}

	public int salaire_Man(int nbrordres) {
	   	  return super.salaire_Emp()+(100*nbrordres);
	     }
}