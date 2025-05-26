import java.util.Scanner;

public class MatrizTranspuesta6 {
    
    public static void main(String[] args) {

        int fila = 0;
        int columna = 0;

        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 9 números para llenar la matriz");

        // Llenar la matriz
        for ( fila = 0; fila < 3; fila++) {
            for ( columna = 0; columna < 3; columna++) {
                System.out.print("Elemento [" + fila + "," + columna + "]: ");
                matriz[fila][columna] = scanner.nextInt();
            }
        }

        // Calcular la transpuesta
        for ( fila = 0; fila < 3; fila++) {
            for ( columna = 0; columna < 3; columna++) {
                transpuesta[columna][fila] = matriz[fila][columna];
            }
        }

        // Mostrar la matriz original
        System.out.println("\nMatriz original:");
        for ( fila = 0; fila < 3; fila++) {
            for ( columna = 0; columna < 3; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }
            System.out.println();
        }

        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        for ( fila = 0; fila < 3; fila++) {
            for ( columna = 0; columna < 3; columna++) {
                System.out.print(transpuesta[fila][columna] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}