package unlam.online.ar.edu;

public abstract class Entrenamiento {
	
	private Integer contadorSegundos;
	private Integer contadorMetros;
	private Integer contadorPasos;
	private Integer dia;
	private Integer mes;
	private Integer anio;
	private Deportista deportista;
	
	public Entrenamiento(Deportista deportista, Integer dia, Integer mes, Integer anio) {
		this.deportista = deportista;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
		
		this.contadorSegundos = 0;
		this.contadorMetros = 0;
		this.contadorPasos = 0;
	}
	
	//estos metodos serian los "pulsos" de los sensores del reloj.
	public void sumarSegundo() {
		contadorSegundos++;
	}
	public void sumarMetro() {
		contadorMetros++;
	}
	public void sumarPaso(){
        contadorPasos++;
    }

	public abstract String getTipoEntrenamiento();
	
	public abstract Double getDistanciaRecorrida();
	
	public String getTiempoTranscurrido() {
		//devuelve el tiempo transcurrido en formato mm:ss
		
		String tiempoTranscurrido = "";
		
		Integer min = this.contadorSegundos / 60;
		Integer seg = this.contadorSegundos % 60;
		
		
		if(min>=0 && min<=9){
			tiempoTranscurrido = "0" + min;
		}else {
			tiempoTranscurrido = "" + min;
		}
		
		tiempoTranscurrido += ":";
		
		if(seg>=0 && seg<=9) {
			tiempoTranscurrido += "0" + seg;
		}else {
			tiempoTranscurrido += "" + seg;
		}
		
		return tiempoTranscurrido;
	}
	
	public Integer getContadorSegundos() {
		return contadorSegundos;
	}
	public Integer getContadorMetros() {
		return contadorMetros;
	}
	public Integer getContadorPasos() {
        return contadorPasos;
    }

	public Integer getDia() {
		return dia;
	}
	public Integer getMes() {
		return mes;
	}
	public Integer getAnio() {
		return anio;
	}
	public Deportista getDeportista() {
		return deportista;
	}
}
