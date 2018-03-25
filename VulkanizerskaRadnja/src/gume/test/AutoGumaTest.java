
package gume.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

public class AutoGumaTest {

	private AutoGuma guma;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	
	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	
	@After
	public void tearDown() throws Exception {
		guma= null;
	}

	
	@Test
	public void testSetMarkaModel() {
		guma.setMarkaModel("ubaciMarkuUbaciModel");
		assertEquals("ubaciMarkuUbaciModel", guma.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		guma.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelKratakString() {
		guma.setMarkaModel("gm");
		}
	
	
	
	@Test 
	public void testSetPrecnik() { 
		guma.setPrecnik(21);
		assertEquals(21, guma.getPrecnik());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikGreska() { 
		guma.setPrecnik(40000);		//	Test pokazuje da metoda ne baca izuzetak iako bi trebala 
									// U uslovu metode umesto && treba staviti ||
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjaVrednost() { 
		guma.setPrecnik(5);
		
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVecaVrednost() { 
		guma.setPrecnik(80);
		
	}
	
	@Test
	public void testSetSirina() {
		guma.setSirina(300);
		assertEquals(300, guma.getSirina());
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaGreska() {
		
		guma.setSirina(340000);			//Metoda ima manu
										//treba promeniti u if uslovu && i staviti ||
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaVrednost() {
		
		guma.setSirina(0);	
		
	}
	
	@Test
	public void testSetVisina() {
		guma.setVisina(50);
		assertEquals(50, guma.getVisina());
	}

	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaVrednost() {
		guma.setVisina(10);
		
	}
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaVrednost() {
		guma.setVisina(500);
		
	}
	
	@Test
	public void testToString() {
		guma.setMarkaModel("TigarWT");
		guma.setPrecnik(21);
		guma.setSirina(200);
		guma.setVisina(30);
		
		assertEquals("AutoGuma [markaModel=TigarWT, precnik=21, sirina=200, visina=30]", guma.toString());
	}

	
	@Test
	public void testEqualsObject() {
		guma.setMarkaModel("TigarWT");
		guma.setPrecnik(21);
		guma.setSirina(200);
		guma.setVisina(30);
		
		AutoGuma g2 = new AutoGuma();
		g2.setMarkaModel("TigarWT");
		g2.setPrecnik(21);
		g2.setSirina(200);
		g2.setVisina(30);
		
		assertTrue(guma.equals(g2));
	}

}
