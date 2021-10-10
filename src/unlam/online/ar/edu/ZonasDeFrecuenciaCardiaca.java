package unlam.online.ar.edu;

public class ZonasDeFrecuenciaCardiaca {

    private TipoDeZona descanso;
    private TipoDeZona calentamiento;
    private TipoDeZona aerobico;
    private TipoDeZona umbral;
    private TipoDeZona maximo;

    public ZonasDeFrecuenciaCardiaca(String tipoDeEntrenamiento) {
        this.descanso = new TipoDeZona("DESCANSO");
        this.calentamiento = new TipoDeZona("CALENTAMIENTO");
        this.aerobico = new TipoDeZona("AEOROBICO");
        this.umbral = new TipoDeZona("UMBRAL");
        this.maximo = new TipoDeZona("MAXIMO");
        verificarTipoDeEntrenamiento(tipoDeEntrenamiento);
    }

    // Define los limites de frecuencia cardiaca para cada deportista, ya si sea "corredor" o "ciclista"
    private void verificarTipoDeEntrenamiento(String tipoDeEntrenamiento) {

        switch(tipoDeEntrenamiento) {
            case "Carrera":
                descanso.asignarLimites(50, 100);
                calentamiento.asignarLimites(110, 130);
                aerobico.asignarLimites(140, 155);
                umbral.asignarLimites(156, 175);
                maximo.asignarLimites(180, 200);
                break;

            case "Ciclismo": // Falta asignar limites del ciclista
                descanso.asignarLimites(50, 100);
                calentamiento.asignarLimites(125, 140);
                aerobico.asignarLimites(145, 160);
                umbral.asignarLimites(165, 180);
                maximo.asignarLimites(185, 200);
                break;
        }
    }

    public String calcularZonaDeFrecuenciaCardiaca(int frecuenciaCardiaca) {

        if(frecuenciaCardiaca >= descanso.getFrecuenciaCardiacaMin() &&
                frecuenciaCardiaca <= descanso.getFrecuenciaCardiacaMax()) {
            return descanso.getNombre();
        }
        if(frecuenciaCardiaca >= calentamiento.getFrecuenciaCardiacaMin() &&
                frecuenciaCardiaca <= calentamiento.getFrecuenciaCardiacaMax()) {
            return calentamiento.getNombre();
        }
        if(frecuenciaCardiaca >= aerobico.getFrecuenciaCardiacaMin() &&
                frecuenciaCardiaca <= aerobico.getFrecuenciaCardiacaMax()) {
            return aerobico.getNombre();
        }
        if(frecuenciaCardiaca >= umbral.getFrecuenciaCardiacaMin() &&
                frecuenciaCardiaca <= umbral.getFrecuenciaCardiacaMax()) {
            return umbral.getNombre();
        }
        if(frecuenciaCardiaca >= maximo.getFrecuenciaCardiacaMin() &&
                frecuenciaCardiaca <= maximo.getFrecuenciaCardiacaMax()) {
            return maximo.getNombre();
        }
        return null;
    }
}
