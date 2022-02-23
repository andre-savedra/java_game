import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;    
    
public class AppTest {

    Personagens elfo, mago;
    CampoBatalha campo;

    @Before
    public void setup(){
        elfo = new Personagens(
            "Elfo", 800, 600, 500, true
        );
        mago = new Personagens(
            "Mago", 900, 500, 600, true
        );
        campo = new CampoBatalha();
    }
        
    @Test
    public void testeElfoVivo() {
        boolean resultado = campo.combate(mago, elfo);
        assertFalse(resultado);
    }

    @Test
    public void testeElfoMorto() {        
        assertFalse(campo.combate(mago, elfo));
        assertFalse(campo.combate(mago, elfo));        
        assertTrue(campo.combate(mago, elfo));
    }
}
    