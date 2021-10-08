package unlam.online.ar.edu;

import unlam.online.ar.edu.Deportista;
import unlam.online.ar.edu.Entrenamiento;

public class Ciclismo extends Entrenamiento {
    private Double velocidadEnKmPorHora;
    private Double cadenciaEnRevolucionesPorMinuto;
    ZonasDeFrecuenciaCardiaca zonaDeFrecuenciaCardiaca;

    public Ciclismo(Integer dia, Integer mes, Integer anio) {
        super(dia, mes, anio);
    }

    public void calcularVelocidad() {
        //calculo la velocidad del ciclista en kilometros por hora
        Double kilometros = (double) (super.getContadorMetros()) / 1000;
        Double horas = (double) (super.getContadorSegundos()) / 3600;
        Double velocidad = (double) kilometros / horas;
        velocidadEnKmPorHora=velocidad;
    }

    public void calcularCadencia() {
        //calculo la cadencia en revoluciones por minuto
        Double cadencia = velocidadEnKmPorHora / (Deportista.getAltura()*0.415);
        cadenciaEnRevolucionesPorMinuto=cadencia;
    }

    public Double getDistanciaRecorrida() {
        //devuelve la distancia recorrida en kilometros

        return super.getContadorMetros()/1000;
    }

    public Double getTiempoTrascurrido() {
        //devuelve el tiempo transcurrido en horas

        return super.getContadorSegundos()/3600;
    }
    public Double getVelocidadEnKmPorHora() {
        return velocidadEnKmPorHora;
    }

    public Double getCadenciaEnRevolucionesPorMinuto() {
        return cadenciaEnRevolucionesPorMinuto;
    }

    public String obtenerZonaDeFrecuenciaCardiaca(int frecuenciaCardiaca) {
        return zonaDeFrecuenciaCardiaca.calcularZonaDeFrecuenciaCardiaca(frecuenciaCardiaca);
    }
    
}
