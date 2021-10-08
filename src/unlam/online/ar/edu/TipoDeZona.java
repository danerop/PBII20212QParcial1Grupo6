package unlam.online.ar.edu;

public class TipoDeZona {
	
	private String nombre;
	private int frecuenciaCardiacaMin;
	private int frecuenciaCardiacaMax;
	
	public TipoDeZona(String nombre) {
		this.nombre = nombre;
	}
	
	public void asignarLimites(int frecuenciaCardiacaMinima, int frecuenciaCardiacaMaxima) {
		this.frecuenciaCardiacaMin = frecuenciaCardiacaMinima;
		this.frecuenciaCardiacaMax = frecuenciaCardiacaMaxima;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getFrecuenciaCardiacaMin() {
		return frecuenciaCardiacaMin;
	}

	public int getFrecuenciaCardiacaMax() {
		return frecuenciaCardiacaMax;
	}
}
