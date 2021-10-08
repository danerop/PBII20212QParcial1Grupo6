package unlam.online.ar.edu;

public class Caminata extends Entrenamiento {
    private Integer contadorPasos;

    public Caminata(Integer dia, Integer mes, Integer anio) {
        super(dia, mes, anio);
    }

    public void sumarPaso(){
        contadorPasos++;
    }
    public Double getDistanciaDelRecorrido() {
        //devuelve la distancia recorrida en metros
        return super.getContadorMetros();
    }

    public Double getTiempoEnMinutos() {
        //devuelve el tiempo recorrido en minutos
        return super.getContadorSegundos()/60;
    }

    public Integer getContadorPasos() {
        return contadorPasos;
    }
}
