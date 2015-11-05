package vvs;

import org.junit.Test;

import static org.junit.Assert.*;

public class HolaMundoTest {

    @Test
    public void escenario() {
	HolaMundo m = new HolaMundo();
	assertEquals("Hola, Laura", m.saludo("Laura"));
    }

}
