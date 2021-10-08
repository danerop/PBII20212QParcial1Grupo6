package unlam.online.ar.edu;

import java.util.Objects;

public class Deportista {
    private String nombre;
    private int edad;
    private double peso;
    private static double altura;
    private int pasosDiarios;

    public Deportista(String nombre, int edad, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        Deportista.altura = altura;
        this.pasosDiarios = 0;
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

    public static double getAltura() {
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

    //editado de equals para los objetos de tipo Deportista
    //dos Deportistas son iguales si tienen el mismo nombre y edad.
    @Override
    public int hashCode() {
        return Objects.hash(edad, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Deportista other = (Deportista) obj;
        return edad == other.edad && Objects.equals(nombre, other.nombre);
    }


}
