package unlam.online.ar.edu.test;

import org.junit.Test;
import unlam.online.ar.edu.Deportista;
import unlam.online.ar.edu.SmartWatch;

import static org.junit.Assert.assertTrue;

public class Testeo {
    @Test
    public void queSePuedaAgregarDeportista() {
        SmartWatch smartWatch=new SmartWatch("Nickname");
	    Deportista deportista=new Deportista("Nombre",22,65.3,170,900);

        Boolean valorObt1=smartWatch.agregarDeportista(deportista);

        assertTrue(valorObt1);
    }
}
