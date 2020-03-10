package TPjAVA.exo3;


import java.awt.List;
import java.util.ArrayList;

public class entreprise {
	
	private ArrayList<employe> listeEmp;
	
	public entreprise() {
		listeEmp = new ArrayList<employe>();
	}
	
	public void addEmploye(employe E) {
		this.listeEmp.add(E);
	}
	
	public double calculSommeSalaires() {
		double Somme;
		Somme=0;
		
		for(employe E: listeEmp) {
			Somme= Somme+E.salaire_Emp();
		}
		return Somme;
	}
	
}