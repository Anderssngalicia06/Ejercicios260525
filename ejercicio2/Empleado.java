package ejercicio2;

public class Empleado extends Personal {
    private int horasTrabajadas;
    private double pagoPorHora;

    public Empleado(String nombre, int horasTrabajadas, double pagoPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    @Override
    public void registrar() {
        System.out.println("Empleado registrado: " + nombre);
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * pagoPorHora;
    }
}
