package ejercicio1;

public class MainVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Automovil();
        vehiculos[1] = new Barco();
        vehiculos[2] = new Avion();

        for (Vehiculo v : vehiculos) {
            v.encender();
        }
    }
}
