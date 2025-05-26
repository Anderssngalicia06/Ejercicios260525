import java.util.Scanner;

public class NMayoryMenor4 {

    public static void main(String[] args) {

        double numeroMayor;
        double numeroMenor;

        double[] numeros = new double[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 números:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        numeroMayor = numeros[0];
        numeroMenor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > numeroMayor) {
                numeroMayor = numeros[i];
            }
            if (numeros[i] < numeroMenor) {
                numeroMenor = numeros[i];
            }
        }

        System.out.println("\nEl número mayor es: " + numeroMayor);
        System.out.println("El número menor es: " + numeroMenor);

        scanner.close();
    }
}

