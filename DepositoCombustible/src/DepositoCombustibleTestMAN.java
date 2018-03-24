import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTestMAN {

	@Test
	public void testDepositoCombustible() {
		DepositoCombustible miDeposito=new DepositoCombustible(1000,500);
	}

	@Test
	public void testGetDepositoNivelMAN() {
		DepositoCombustible miDeposito=new DepositoCombustible(1000,500);
		assertEquals(500,miDeposito.getDepositoNivel(),0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible miDeposito=new DepositoCombustible(1000,500);
		assertEquals(1000,miDeposito.getDepositoMax(),0);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible miDeposito=new DepositoCombustible(1000,0);
		assertTrue(miDeposito.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible miDeposito=new DepositoCombustible(1000,1000);
		assertTrue(miDeposito.estaLleno());
	}

	@Test
	public void testFill() {
		DepositoCombustible miDeposito=new DepositoCombustible(1000,100);
		miDeposito.fill(400);
		assertEquals(500,miDeposito.getDepositoNivel(),0);
	}

	@Test
	public void testConsumir() {
		DepositoCombustible miDeposito=new DepositoCombustible(1000,800);
		miDeposito.consumir(200);
		assertEquals(600,miDeposito.getDepositoNivel(),0);
	}

}
