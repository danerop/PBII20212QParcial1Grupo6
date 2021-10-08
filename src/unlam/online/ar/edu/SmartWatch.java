package unlam.online.ar.edu;

public class SmartWatch {

    private String nickname;
    private Deportista[] deportistas;
    private Entrenamiento[] entrenamientos; 
    
    public SmartWatch(String nickname) {
        this.nickname = nickname;
        this.deportistas = new Deportista[10];
        this.entrenamientos = new Entrenamiento[50];
    }

    public Boolean agregarDeportista(Deportista deportista) {
        for (int i=0;i<deportistas.length; i++){
            if(deportistas[i]==null){
                deportistas[i]=deportista;
                return true;
            }
        }
        return false;
    }
    public Boolean eliminarDeportista(Deportista deportista) {
    	//[HACER] sería parecido a la de agregar Deportista solo que comparando con
    	//equals si son el mismo deportista, para despues borrarlo.
    	
    	//Este metodo se puede borrar, no es solicitado por el ejercicio.
    	return true;
    }
    
    //agrega el entrenamiento realizado a la lista de entrenamientos del reloj
    public void agregarEntrenamiento(Entrenamiento nuevoEntrenamiento) {
    	for (int i=0; i<entrenamientos.length; i++){
            if(entrenamientos[i] == null){
                entrenamientos[i] = nuevoEntrenamiento;
            }
        }
    }
    
    //calcula la cantidad de pasos hechos en el dia
    public void calcularPasosDiarios(Deportista deportistaAPromediarPasos, Integer dia, Integer mes, Integer anio) {
    	
    	Integer cantidadDePasosEnElDia = 0;
    	
    	for (int i=0; i<entrenamientos.length; i++) {
    		if(entrenamientos[i] != null){
    			
                if(entrenamientos[i].getDeportista().equals(deportistaAPromediarPasos)
                		&& entrenamientos[i].getDia() == dia 
                		&& entrenamientos[i].getMes() == mes 
                		&& entrenamientos[i].getAnio() == anio) {
                	
                	cantidadDePasosEnElDia += entrenamientos[i].getContadorPasos();
                	
                }
            }
    	}
    	
    	for (int i=0;i<deportistas.length; i++){
            if(deportistas[i]==null){
                if(deportistas[i].equals(deportistaAPromediarPasos)) {
                	deportistas[i].setPasosDiarios(cantidadDePasosEnElDia);
                }
            }
        }
    	
    }
    
    public Integer getPasosDiariosDeDeportista (Deportista deportistaBuscado) {
    	//[HACER] devolvería la cantidad de pasosDiarios de un deportista del array
    	return 1;
    }
}
