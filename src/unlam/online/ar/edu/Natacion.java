package unlam.online.ar.edu;

public class Natacion extends Entrenamiento {

    private String ritmoCadaCienM;

    public Natacion(Deportista deportista, Integer dia, Integer mes, Integer anio) {
        super(deportista, dia, mes, anio);
        ritmoCadaCienM = "";
    }

    public String calcularRitmoCadaCienM() {
        //vacia ritmoCadaCienM
        ritmoCadaCienM = "";

        //calculo de la cantidad de segundos que toma en recorrer 100m
        int segundosCadaCienM = (int)(super.getContadorSegundos() / ( (double)(super.getContadorMetros()) / 100) );

        Integer minutos = segundosCadaCienM / 60;
        Integer segundos = segundosCadaCienM % 60;

        //Creacion del String de tiempo en formato mm:ss, dentro de ritmoCadaCienM
        if(minutos>=0 && minutos<=9){
            this.ritmoCadaCienM = "0" + minutos;
        }else {
            this.ritmoCadaCienM = "" + minutos;
        }

        this.ritmoCadaCienM += ":";

        if(segundos>=0 && segundos<=9) {
            this.ritmoCadaCienM += "0" + segundos;
        }else {
            this.ritmoCadaCienM += "" + segundos;
        }
		return ritmoCadaCienM;
    }

    @Override
    public String getTipoEntrenamiento() {
        return "Natacion";
    }

    @Override
    public Double getDistanciaRecorrida() {
        //devuelve la distancia recorrida en metros
        return (double) (super.getContadorMetros());
    }

    public String getRitmoCadaCienM() {
        //devuelve el ritmo (mm:ss que tarda en recorrer 100 metros)
        return ritmoCadaCienM;
        
    }
    
    
    
}