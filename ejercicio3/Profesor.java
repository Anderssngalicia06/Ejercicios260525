package ejercicio3;

public class Profesor implements Profesion {
    private int clases;
    private double pagoPorClase;

    public Profesor(int clases, double pagoPorClase) {
        this.clases = clases;
        this.pagoPorClase = pagoPorClase;
    }

    @Override
    public double calcularSueldo() {
        return clases * pagoPorClase;
    }
}
