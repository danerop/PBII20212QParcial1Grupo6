package unlam.online.ar.edu.test;

import org.junit.Test;
import unlam.online.ar.edu.*;

import static org.junit.Assert.*;

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
        Deportista deportista1 = new Deportista("Nombre2",22,65.3,170);

        assertTrue(smartWatch.agregarDeportista(deportista));
        assertTrue(smartWatch.agregarDeportista(deportista1));

        //agrega entrenamientos
        Entrenamiento entrenamiento1 = new Caminata(deportista, 2, 12, 2021);
        Entrenamiento entrenamiento2 = new Caminata(deportista, 2, 12, 2021);
        Entrenamiento entrenamiento3 = new Natacion(deportista1, 1, 1, 21);

        entrenamiento1.setContadorPasos(250);
        entrenamiento2.setContadorPasos(750);
        entrenamiento3.setContadorPasos(10);

        assertTrue(smartWatch.agregarEntrenamiento(entrenamiento1));
        assertTrue(smartWatch.agregarEntrenamiento(entrenamiento2));
        assertTrue(smartWatch.agregarEntrenamiento(entrenamiento3));

        smartWatch.calcularPasosDiarios(deportista, 2, 12, 2021);

        Integer valorEsperado = 1000;
        Integer valorObtenido = smartWatch.getPasosDiariosDeDeportista(deportista);

        assertEquals(valorEsperado, valorObtenido);
    }
    
    @Test
    public void queSePuedaObtenerZonaDeFrecuenciaCardiaca() {
    	Deportista deportista = new Deportista("Nombre",22,65.3,170);
    	//CLASE CARRERA
    	Carrera carrera = new Carrera(deportista, 10, 10, 2021);
    	
    	String valorObtenido1= carrera.obtenerZonaDeFrecuenciaCardiaca(90);
    	
    	assertEquals("DESCANSO", valorObtenido1);
    	
    	//CLASE CICLISMO
    	Ciclismo ciclismo = new Ciclismo(deportista, 02, 12, 2041);
    	
    	String valorObtenido2 = ciclismo.obtenerZonaDeFrecuenciaCardiaca(130);
    	
    	assertEquals("CALENTAMIENTO", valorObtenido2);
    }

}
