package ejercicio3;

public class MainProfesion {
    public static void main(String[] args) {
        Profesion p1 = new Ingeniero(1500, 500);
        Profesion p2 = new Profesor(20, 40);

        System.out.println("Sueldo del Ingeniero: $" + p1.calcularSueldo());
        System.out.println("Sueldo del Profesor: $" + p2.calcularSueldo());
    }
}
