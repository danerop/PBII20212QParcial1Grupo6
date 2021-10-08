package unlam.online.ar.edu;

public class Carrera extends Entrenamiento {

    private ZonasDeFrecuenciaCardiaca zonaDeFrecuenciaCardiaca;
    private double distanciaRecorridaEnKm;
    private double tiempoEnMin;
    private double ritmoXKm;

    public Carrera(Deportista deportista, Integer dia, Integer mes, Integer anio) {
        super(deportista, dia, mes, anio);
        this.zonaDeFrecuenciaCardiaca = new ZonasDeFrecuenciaCardiaca("Corredor");
        this.distanciaRecorridaEnKm = 0.;
        this.tiempoEnMin = 0;
        this.ritmoXKm = 0;
    }

    public void calcularRitmoXKm() {
        this.ritmoXKm = this.tiempoEnMin / this.distanciaRecorridaEnKm;
    }

    public String obtenerZonaDeFrecuenciaCardiaca(int frecuenciaCardiaca) {
        return zonaDeFrecuenciaCardiaca.calcularZonaDeFrecuenciaCardiaca(frecuenciaCardiaca);
    }

    public double getDistanciaRecorridaEnKm() {
        return distanciaRecorridaEnKm;
    }

    public double getTiempoEnMin() {
        return tiempoEnMin;
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