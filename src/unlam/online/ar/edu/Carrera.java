package unlam.online.ar.edu;

public class Carrera extends Entrenamiento {

    private ZonasDeFrecuenciaCardiaca zonaDeFrecuenciaCardiaca;
    private double ritmoXKm;

    public Carrera(Deportista deportista, Integer dia, Integer mes, Integer anio) {
        super(deportista, dia, mes, anio);
        this.zonaDeFrecuenciaCardiaca = new ZonasDeFrecuenciaCardiaca("Corredor");
        this.ritmoXKm = 0;
    }

    public void calcularRitmoXKm() {
        this.ritmoXKm = ( (double)(super.getContadorSegundos()/60) ) / getDistanciaRecorrida();
    }

    public String obtenerZonaDeFrecuenciaCardiaca(int frecuenciaCardiaca) {
        return zonaDeFrecuenciaCardiaca.calcularZonaDeFrecuenciaCardiaca(frecuenciaCardiaca);
    }

    public double getRitmoXKm() {
        return ritmoXKm;
    }

    @Override
    public String getTipoEntrenamiento() {
        return "Carrera";
    }

    @Override
    public Double getDistanciaRecorrida() {
        return (double) (super.getContadorMetros()/1000);
    }
}