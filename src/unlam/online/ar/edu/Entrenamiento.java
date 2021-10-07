package unlam.online.ar.edu;

public abstract class Entrenamiento {
	private Integer contadorSegundos;
	private Integer contadorMetros;
	private Integer dia;
	private Integer mes;
	private Integer anio;
	
	public Entrenamiento(Integer dia, Integer mes, Integer anio) {
		contadorSegundos = 0;
		contadorMetros = 0;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	//estos metodos serian los "pulsos" de los sensores del reloj.
	public void sumarSegundo() {
		contadorSegundos++;
	}
	public void sumarMetro() {
		contadorMetros++;
	}

	
	public Integer getContadorSegundos() {
		return contadorSegundos;
	}
	public Integer getContadorMetros() {
		return contadorMetros;
	}
}
