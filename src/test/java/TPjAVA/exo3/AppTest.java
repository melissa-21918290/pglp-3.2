package TPjAVA.exo3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	employe emp;
	vendeur ven;
	manager man; 
	entreprise ent;
	@Test
	public final void test_salaireEmp() {
		emp = new employe(1500,2020,2015);
	    assertTrue(emp.salaire_Emp()==1600);
	}

	@Test
	public void testNotNull() {
		emp = new employe(1500,2020,2000);
		assertNotNull(emp);
	}
	
	@Test
	public final void test_salaireVen() {
		ven = new vendeur(1500,2020,2015);
		assertEquals(1900,ven.salaire_Ven(300));
	}
	
	/*
	
	@Test
	public final void test_salaireTotal() {
		emp = new employe(1500,2020,2015);
		ven =new vendeur(1500,2020,2015);
		man=new manager (1500,2020,2015);
		
	    assertFalse(ent.calculSommeSalaires()==115600);
	}
	
	*/
	@Test
	public final void test_salaire_Man() {
		man = new manager(1500,2020,2015);
	    assertTrue(man.salaire_Man(5)==2100);
	}

}
