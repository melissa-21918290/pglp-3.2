package TPjAVA.exo3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {
	
	employe emp;
	vendeur ven;
	@Test
	public final void test_salaireEmp() {
		emp = new employe(1700,2030,2000);
	    assertTrue(emp.salaire_Emp()==1520);
	}

	@Test
	public void testNotNull() {
		emp = new employe(1700,2030,2000);
		assertNotNull(emp);
	}
	
	@Test
	public final void test_salaireVen() {
		ven = new vendeur(2100,2030,2000);
		assertEquals(1820,ven.salaire_Ven(300));
	}
	
	
	@Test
	public final void test_salaireTotal() {
		emp = new employe(500,2030,20000);
	    assertFalse(emp.salaire_total()==23344);
	}


}
