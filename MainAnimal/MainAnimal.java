package MainAnimal;

public class MainAnimal {

    public static void main(String[] args) {

        Animal animal1 = new Animal("Perro", "Carnívoro", 4);
        Animal animal2 = new Animal("Vaca", "Vegetariana", 4);
        Animal animal3 = new Animal("Pez", "Omnívoro", 0);

        animal1.mostrarInformacion();
        animal2.mostrarInformacion();
        animal3.mostrarInformacion();
    }
}

class Animal {

    private String nombre;
    private String orden;
    private int extremidades;

    public Animal() {
    }

    public Animal(String nombre, String orden, int extremidades) {
        this.nombre = nombre;
        this.orden = orden;
        this.extremidades = extremidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrden() {
        return orden;
    }

    public void setOrden(String orden) {
        this.orden = orden;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    // Método para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Orden: " + orden + ", Extremidades: " + extremidades);
    }

}
