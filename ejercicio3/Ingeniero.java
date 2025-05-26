package ejercicio3;

public class Ingeniero implements Profesion {
    private double salarioBase;
    private double bono;

    public Ingeniero(double salarioBase, double bono) {
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return salarioBase + bono;
    }
}
