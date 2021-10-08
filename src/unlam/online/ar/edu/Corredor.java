package unlam.online.ar.edu;

public class Corredor extends Deportista {
	
	private ZonasDeFrecuenciaCardiaca zonaDeFrecuenciaCardiaca;
	private double distanciaRecorridaEnKm;
	private double tiempoEnMin;
	private double ritmoXKm;
	
	public Corredor(String nombre, int edad, double peso, int altura, int pasosDiarios) {
		super(nombre, edad, peso, altura, pasosDiarios);
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
	
}
