import org.junit.Test;

public class HolaMundoest {

    @Test
    public void escenario() {
	HolaMundo m = new HolaMundo();
	assertEquals("Hola, Laura", m.saludo("Laura"));
    }
    
}
