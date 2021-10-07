package unlam.online.ar.edu;

public class Corredor extends Deportista {
	
	private double distanciaRecorridaEnKm;
	private double tiempoTranscurrido;
	private double ritmoEnMin;
	private ZonasDeFrecuenciaCardiaca zonaDeFrecuenciaCardiaca;
	
	public Corredor(String nombre, int edad, double peso, int altura, int pasosDiarios) {
		super(nombre, edad, peso, altura, pasosDiarios);
		this.distanciaRecorridaEnKm = 0.;
		this.tiempoTranscurrido = 0;
		this.ritmoEnMin = 0;
		this.zonaDeFrecuenciaCardiaca = new ZonasDeFrecuenciaCardiaca("Corredor");
	}

	public String obtenerZonaDeFrecuenciaCardiaca(int frecuenciaCardiaca) {
		return zonaDeFrecuenciaCardiaca.calcularZonaDeFrecuenciaCardiaca(frecuenciaCardiaca);
	}

	public double getDistanciaRecorridaEnKm() {
		return distanciaRecorridaEnKm;
	}

	public double getTiempoTranscurrido() {
		return tiempoTranscurrido;
	}

	public double getRitmoEnMin() {
		return ritmoEnMin;
	}
	
}
