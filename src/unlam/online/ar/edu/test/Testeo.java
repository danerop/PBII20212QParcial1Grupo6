package unlam.online.ar.edu.test;

import org.junit.Test;
import unlam.online.ar.edu.*;

import static org.junit.Assert.assertTrue;

public class Testeo {
    @Test
    public void queSePuedaAgregarDeportista() {
        SmartWatch smartWatch=new SmartWatch("Nickname");
	    Deportista deportista=new Deportista("Nombre",22,65.3,170);

        Boolean valorObt1=smartWatch.agregarDeportista(deportista);

        assertTrue(valorObt1);
    }
    
    @Test
    public void queSePuedaCalcularLosPasosDiarios() {
    	SmartWatch smartWatch = new SmartWatch("Nickname");
	    Deportista deportista = new Deportista("Nombre",22,65.3,170);
	    smartWatch.agregarDeportista(deportista);
	    
	    //agrega entrenamientos
	    Entrenamiento entrenamiento1 = new Caminata(deportista, 02, 12, 2021);
	    Entrenamiento entrenamiento2 = new Caminata(deportista, 02, 12, 2021);
	    Entrenamiento entrenamiento3 = new Natacion(deportista, 03, 12, 2021);
	    
	    entrenamiento1.setContadorPasos(250);
	    entrenamiento2.setContadorPasos(750);
	    entrenamiento3.setContadorPasos(10);
	    
	    smartWatch.agregarEntrenamiento(entrenamiento1);
	    smartWatch.agregarEntrenamiento(entrenamiento2);
	    smartWatch.agregarEntrenamiento(entrenamiento3);
	    
	    smartWatch.calcularPasosDiarios(deportista, 02, 12, 2021);
	    
	    Integer valorEsperado = 100;
	    Integer valorObtenido = smartWatch.getPasosDiariosDeDeportista(deportista);
	    
	    assertEquals()
    }
    
}
