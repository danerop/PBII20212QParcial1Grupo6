package unlam.online.ar.edu;

public abstract class Entrenamiento {
	private Double contadorSegundos;
	private Double contadorMetros;
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

	
	public Double getContadorSegundos() {
		return contadorSegundos;
	}
	public Double getContadorMetros() {
		return contadorMetros;
	}
}
