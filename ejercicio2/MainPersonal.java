package ejercicio2;

public class MainPersonal {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Andrea", 45, 20);
        e1.registrar();
        System.out.println("Sueldo: $" + e1.calcularSueldo());
    }
}
