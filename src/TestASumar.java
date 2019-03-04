import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

    @Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar("5");
        String resultado = sumi.mostrar();
        assertEquals("5 = 5",resultado );
    }
    @Test
    public void testUnaCifraNegativa() {
        ASumar sumi = new ASumar("-5");
        String resultado = sumi.mostrar();
        assertEquals("-5 = -5",resultado );
    }
    @Test
    public void testSumaVariasCifras() {
        ASumar sumi = new ASumar("20");
        String resultado = sumi.mostrar();
        assertEquals("5 + 11 = 5",resultado );
}
