package unlam.online.ar.edu;

public class Deportista {
	
    private String nombre;
    private int edad;
    private double peso;
    private int altura;
    private int pasosDiarios;

    public Deportista(String nombre, int edad, double peso, int altura, int pasosDiarios) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.pasosDiarios = pasosDiarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPasosDiarios() {
        return pasosDiarios;
    }

    public void setPasosDiarios(int pasosDiarios) {
        this.pasosDiarios = pasosDiarios;
    }
}
