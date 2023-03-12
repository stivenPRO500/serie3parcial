package gt.edu.umg.progra3.parcial1.pilas;

import org.junit.Before;
import org.junit.Test;

public class NotationParserTest {
    Pila pila;
    NotationParser parser;

    @Before
    public void init(){
        //reemplazar por la implementacion creada
        //pila = mi implementacion
        pila = new Pileta();
        parser = new NotationParser(pila);
    }



    @Test
    public void testNotationPosToInfix(){
        String posFix = parser.posFixToInfix("1 2 * 3 +");
        assert (posFix.equals("1 * 2 + 3"));
    }
}
