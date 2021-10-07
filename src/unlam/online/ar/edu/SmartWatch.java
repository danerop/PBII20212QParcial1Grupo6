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
    	//sentencias a resolver
    	return true;
    }
    
    //agrega el entrenamiento realizado a la lista de entrenamientos
    public void agregarEntrenamiento(Entrenamiento nuevoEntrenamiento) {
    	for (int i=0; i<entrenamientos.length; i++){
            if(entrenamientos[i] == null){
                entrenamientos[i] = nuevoEntrenamiento;
                
                calcularPasosDiarios();
            }
        }
    }
    
    //saca un promedio de los pasos diarios, buscando los entrenamientos de tipo "caminata" y usando sus mediciones de pasos
    public void calcularPasosDiarios() {
    	for (int i=0;i<entrenamientos.length; i++){
            if(entrenamientos[i] != null){
            	if(entrenamientos[i].getCode)
                entrenamientos[i]=;
            }
        }
    	
    }
}
