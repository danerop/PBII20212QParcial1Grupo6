package unlam.online.ar.edu;

public class Caminata extends Entrenamiento {

    public Caminata(Deportista deportista, Integer dia, Integer mes, Integer anio) {
        super(deportista, dia, mes, anio);
    }
    
    @Override
    public String getTipoEntrenamiento() {
    	return "Caminata";
    }
    
    @Override
    public Double getDistanciaRecorrida() {
        //devuelve la distancia recorrida en metros
        return (double)(super.getContadorMetros());
    }
}
