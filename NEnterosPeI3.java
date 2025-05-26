import java.util.Scanner;

public class NEnterosPeI3 {

    public static void main(String[] args) {

        int pares = 0;
        int impares = 0;

        int[] numeros = new int[12];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 12 números enteros");

        for (int i = 0; i < 12; i++) {
            System.out.print("Número entero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\nCantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        scanner.close();
    }
}
