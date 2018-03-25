package radnja.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja v;
	AutoGuma g;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		g = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		v = null;
		g = null;
	}

	@Test
	public void testDodajGumu() {
		g.setMarkaModel("GumaMarka");
		v.dodajGumu(g);
		assertEquals(1,v.pronadjiGumu(g.getMarkaModel()).size());
	}
	
	//Nadjena greska. Metoda je uporedjivala objekat sa Stringom i zato nikad nije mogla
	// da nadje gumu. Greska ispravljena
	
	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		v.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecPostoji() {
		g.setMarkaModel("zimskaGuma");
		v.dodajGumu(g);
		
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("zimskaGuma");
		v.dodajGumu(g1);	
	}
	
	@Test
	public void testPronadjiGumu() {
		g.setMarkaModel("zimskaGuma");
		v.dodajGumu(g);
		assertEquals(1, v.pronadjiGumu(g.getMarkaModel()).size()); 
	}

	@Test
	public void testPronadjiGumuNull() {
		assertEquals(v.pronadjiGumu(null), null);
		
	}
	
	@Test
	public void testPronadjiGumuNemaGume() {
		g.setMarkaModel("najboljaGuma");
		v.dodajGumu(g);
		assertEquals(v.pronadjiGumu("najGuma").size(),0);
		
	}

	@Test
	public void testPronadjiGumu3() {
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("novaGuma");
		g1.setVisina(34);
		g1.setPrecnik(19);
		g1.setSirina(160);
		v.dodajGumu(g1);
		
		g.setMarkaModel("novaGuma");
		g1.setVisina(30);
		g1.setPrecnik(21);
		g1.setSirina(200);
		v.dodajGumu(g);
		
		assertEquals(v.pronadjiGumu(g.getMarkaModel()).size(),2);
		
	}
	

}
