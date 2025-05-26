package ejercicio2;

public abstract class Personal {
    protected String nombre;

    public Personal(String nombre) {
        this.nombre = nombre;
    }

    public abstract void registrar();
    public abstract double calcularSueldo();
}
