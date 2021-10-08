package unlam.online.ar.edu;

public class Natacion extends Entrenamiento {
	
	private String ritmoCadaCienM;

	public Natacion(Integer dia, Integer mes, Integer anio) {
		super(dia, mes, anio);
		ritmoCadaCienM = "";
	}
	
	public void calcularRitmoCadaCienM() {
		//calculo de la cantidad de segundos que toma en recorrer 100m
		Double centenasDeMetros = (double) (super.getContadorMetros()) / 100 ;
		int segundosCadaCienM =(int) (super.getContadorSegundos() / centenasDeMetros);
		
		Integer minutos = segundosCadaCienM / 60;
		Integer segundos = segundosCadaCienM % 60;
		
		//Creacion del String de tiempo en formato mm:ss
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
	}

	
	public String getRitmoCadaCienM() {
		//devuelve el ritmo (mm:ss que tarda en recorrer 100 metros)
		return ritmoCadaCienM;
	}
	public Double getDistanciaRecorrida() {
		//devuelve la distancia recorrida en metros
		return super.getContadorMetros();
	}
	public String getTiempo() {
		
	}
}
