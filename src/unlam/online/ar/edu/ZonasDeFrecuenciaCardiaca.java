package unlam.online.ar.edu;

public class ZonasDeFrecuenciaCardiaca {

	private TipoDeZona descanso;
	private TipoDeZona calentamiento;
	private TipoDeZona aerobico;
	private TipoDeZona umbral;
	private TipoDeZona maximo;
	
	public ZonasDeFrecuenciaCardiaca(String tipoDeDeportista) {
		this.descanso = new TipoDeZona("DESCANSO");
		this.calentamiento = new TipoDeZona("CALENTAMIENTO");
		this.aerobico = new TipoDeZona("AEOROBICO");
		this.umbral = new TipoDeZona("UMBRAL");
		this.maximo = new TipoDeZona("MAXIMO");
		verificarTipoDeDeportista(tipoDeDeportista);
	}
	
	// Define los limites de frecuencia cardiaca para cada deportista, ya si sea "corredor" o "ciclista"
	private void verificarTipoDeDeportista(String tipoDeDeportista) {
		
		switch(tipoDeDeportista) {
		case "Corredor":
			descanso.asignarLimites(50, 100);
			calentamiento.asignarLimites(101, 130);
			aerobico.asignarLimites(131, 150);
			umbral.asignarLimites(151, 174);
			maximo.asignarLimites(175, 200);
			break;
			
		case "Ciclista": // Falta asignar limites del ciclista
			descanso.asignarLimites(0, 0);
			calentamiento.asignarLimites(0, 0);
			aerobico.asignarLimites(0, 0);
			umbral.asignarLimites(0, 0);
			maximo.asignarLimites(0, 0);
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
