package br.edu.mateluca;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestadorTest {

	private Testador t;

	@BeforeEach
	private void setUp() {
	    t = new Testador();
	}

	@Test
	public void testeA() {
	    assertTrue(t.testeA());
	}

	@Test
	public void testeB() {
	    assertTrue(t.testeB());
	}

	@Test
	public void testeC() {
	    assertTrue(t.testeC());
	}

	@Test
	public void testeD() {
	    assertTrue(t.testeD());
	}

	@Test
	public void testeE() {
	    assertTrue(t.testeE());
	}
	
}
