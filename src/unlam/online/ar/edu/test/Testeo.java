package unlam.online.ar.edu.test;

import org.junit.Test;
import unlam.online.ar.edu.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Testeo {
	
    @Test
    public void queSePuedaAgregarDeportista() {
        SmartWatch smartWatch=new SmartWatch("Nickname");
	    Deportista deportista=new Deportista("Nombre",22,65.3,170,900);

        Boolean valorObt1=smartWatch.agregarDeportista(deportista);

        assertTrue(valorObt1);
    }
    
    @Test
    public void queSeObtengaElTipoDeZonaDeFrecuenciaCardiaca() {
    	Corredor corredor = new Corredor("Martin", 21, 70.4, 173, 800);
    	
    	String valorObtenido = corredor.obtenerZonaDeFrecuenciaCardiaca(120);
    	
    	assertEquals("CALENTAMIENTO", valorObtenido);
    }
    
    @Test
    public void queNoSeObtengaElTipoDeZonaDeFrecuenciaCardiaca() {
    	Corredor corredor = new Corredor("Martin", 21, 70.4, 173, 800);
    	
    	String valorObtenido = corredor.obtenerZonaDeFrecuenciaCardiaca(40);
    	
    	assertEquals(null, valorObtenido);
    }
}
