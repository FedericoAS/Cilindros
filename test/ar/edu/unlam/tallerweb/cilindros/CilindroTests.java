package ar.edu.unlam.tallerweb.cilindros;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class CilindroTests {

	@Test
	public void testAreaCirculo() {
		Circulo c = new Circulo(5.0);
		Assert.assertEquals(78.5, c.getArea(), 0.1);
	}
	
	@Test
	public void testVolumenCilindro() {
		Circulo circulo = new Circulo(5.0);
		Cilindro cilindro = new Cilindro(circulo, 2.0);
		Assert.assertEquals(157.0, cilindro.getVolumen(), 0.1);
	}
	
	@Test
	public void testCompararVolumenCilindroIguales() {
		Circulo circulo1 = new Circulo(5.0);
		Cilindro cilindro1 = new Cilindro(circulo1, 2.0);
		
		Circulo circulo2 = new Circulo(5.0);
		Cilindro cilindro2 = new Cilindro(circulo2, 2.0);

		Assert.assertEquals(0, cilindro1.compareTo(cilindro2));
	}
	
	@Test
	public void testCompararVolumenCilindroPrimeroMayor() {
		Circulo circulo1 = new Circulo(6.0);
		Cilindro cilindro1 = new Cilindro(circulo1, 2.0);
		
		Circulo circulo2 = new Circulo(5.0);
		Cilindro cilindro2 = new Cilindro(circulo2, 2.0);

		Assert.assertTrue(cilindro1.compareTo(cilindro2) > 0);
	}
	
	@Test
	public void testCompararVolumenCilindroPrimeroMenor() {
		Circulo circulo1 = new Circulo(5.0);
		Cilindro cilindro1 = new Cilindro(circulo1, 2.0);
		
		Circulo circulo2 = new Circulo(5.0);
		Cilindro cilindro2 = new Cilindro(circulo2, 3.0);

		Assert.assertTrue(cilindro1.compareTo(cilindro2) < 0);
	}
	
}
