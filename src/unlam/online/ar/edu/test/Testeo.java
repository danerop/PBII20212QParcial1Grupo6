package unlam.online.ar.edu.test;

import org.junit.Test;
import unlam.online.ar.edu.*;

import static org.junit.Assert.*;

public class Testeo {
    @Test
    public void queSePuedaAgregarDeportista() {
    	//datos de entrada
    	String nombre="Nombre";
    	Integer edad=22,altura=170;
    	Double peso=65.3;
    	
    	//Ejecucion
        SmartWatch smartWatch=new SmartWatch("Nickname");
        Deportista deportista=new Deportista(nombre,edad,peso,altura);
        Boolean valorObt1=smartWatch.agregarDeportista(deportista);

        //Validacion
        assertTrue(valorObt1);
    }

    
    
    
    @Test
    public void queNoSePuedaAgregarUnDeportista() {
    	//datos de entrada
    	 String nombre="Nombre", nombre1="Nombre",nombre2="Nombre",nombre3="Nombre";
    	 Integer edad=22,edad1=25,edad2=35,edad3=29,altura=170,altura1=165,altura2=154,altura3=180;
    	 double peso=65.3,peso1=70.0,peso2=50.5,peso3=49.2;
    	 
    	 //ejecucion
    	 SmartWatch smartWatch=new SmartWatch("Nickname");
         Deportista deportista=new Deportista(nombre,edad,peso,altura);
         Deportista deportista1=new Deportista(nombre1,edad1,peso1,altura1);
         Deportista deportista2=new Deportista(nombre2,edad2,peso2,altura2);
         Deportista deportista3=new Deportista(nombre3,edad3,peso3,altura3);
         smartWatch.agregarDeportista(deportista);
         smartWatch.agregarDeportista(deportista1);
         smartWatch.agregarDeportista(deportista2);
         boolean valorObtenido=smartWatch.agregarDeportista(deportista3);

         //validacion
         assertFalse(valorObtenido);
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
    public void quNOSePuedaCalcularLosPasosDiarios() {
        SmartWatch smartWatch = new SmartWatch("Nickname");
        Deportista deportista = new Deportista("Nombre",22,65.3,170);
        Deportista deportista1 = new Deportista("Nombre2",22,65.3,170);

        smartWatch.agregarDeportista(deportista);
        smartWatch.agregarDeportista(deportista1);

        //agrega entrenamientos
        Entrenamiento entrenamiento1 = new Caminata(deportista, 2, 12, 2021);
        Entrenamiento entrenamiento2 = new Caminata(deportista, 2, 12, 2021);


        entrenamiento1.setContadorPasos(250);
        entrenamiento2.setContadorPasos(750);
        smartWatch.agregarEntrenamiento(entrenamiento1);
        smartWatch.agregarEntrenamiento(entrenamiento2);
        boolean valorObtenido2=smartWatch.calcularPasosDiarios(deportista1, 2, 12, 2021); 
        
        //validacion
        assertFalse(valorObtenido2);
    }
    
     
    
    @Test 
    public void queSePuedaCalcularRitmoCadaCienM() {
    	//Datos de entrada
    	String nombre="Nombre";
    	Integer edad=22,altura=170;
    	Double peso=65.3;
    	Integer dia=10,mes=1,anio=2022;
    	
    	//Ejecucion
    	Deportista deportista=new Deportista(nombre,edad,peso,altura);
    	Natacion natacion=new Natacion(deportista,dia,mes,anio);
    	natacion.setContadorMetros(15);
    	natacion.setContadorSegundos(50);
    	int valorObtenido=natacion.getContadorMetros();
    	int valorObtenido1=natacion.getContadorSegundos();
    	String valorObtenido2=natacion.calcularRitmoCadaCienM();
    	
    	
    	
    	//Validacion
    	assertEquals(15,valorObtenido);
    	assertEquals(50,valorObtenido1);
    	assertEquals(natacion.getRitmoCadaCienM(),valorObtenido2);
    	
    	
    }
    
    

    
    @Test
    public void queSePuedaCalcularZonaDeFrecuenciaCardiaca() {
    	//Datos de entrada
    	String nombre="Nombre";
    	Integer edad=22,altura=170;
    	Double peso=65.3;
    	Integer dia=10,mes=1,anio=2022;
    	
    	//Ejecucion
    	Deportista deportista=new Deportista(nombre,edad,peso,altura);
    	ZonasDeFrecuenciaCardiaca frecuencia=new ZonasDeFrecuenciaCardiaca ("DESCANSO");
    	Ciclismo ciclismo=new Ciclismo(deportista,dia,mes,anio);
    	String valorObtenido=ciclismo.obtenerZonaDeFrecuenciaCardiaca(60);
    	
    	
    	//validacion
    	assertEquals(frecuencia.getTipoEntrenamiento(),valorObtenido);
    	
    	
    }
    
    
    @Test
    public void queNOSePuedaCalcularZonaDeFrecuenciaCardiaca() {
    	//Datos de entrada
    	String nombre="Nombre";
    	Integer edad=22,altura=170;
    	Double peso=65.3;
    	Integer dia=10,mes=1,anio=2022;
    	
    	//Ejecucion
    	Deportista deportista=new Deportista(nombre,edad,peso,altura);
    	ZonasDeFrecuenciaCardiaca frecuencia=new ZonasDeFrecuenciaCardiaca ("DESCANSO");
    	Ciclismo ciclismo=new Ciclismo(deportista,dia,mes,anio);
    	String valorObtenido=ciclismo.obtenerZonaDeFrecuenciaCardiaca(0);
    	
    	
    	//validacion
    	assertNull(frecuencia.getTipoEntrenamiento(),valorObtenido);
    	
    	
    }
    
    
    
    
    
    
    
    

}
