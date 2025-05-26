import java.util.Scanner;

public class PuntoDeSilla7 {
    public static void main(String[] args) {
        // Crear una matriz de 3 filas y 4 columnas
        int[][] matriz = new int[3][4];
        Scanner scanner = new Scanner(System.in);

        // Llenar la matriz con valores numéricos
        System.out.println("Ingrese 12 valores numéricos:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Mostrar la matriz
        System.out.println("\nMatriz ingresada:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Buscar puntos de silla
        boolean puntoDeSillaEncontrado = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int elemento = matriz[i][j];

                // Verificar si es el mínimo en su fila
                boolean esMinimoEnFila = true;
                for (int k = 0; k < matriz[i].length; k++) {
                    if (matriz[i][k] < elemento) {
                        esMinimoEnFila = false;
                        break;
                    }
                }

                // Verificar si es el máximo en su columna
                boolean esMaximoEnColumna = true;
                for (int k = 0; k < matriz.length; k++) {
                    if (matriz[k][j] > elemento) {
                        esMaximoEnColumna = false;
                        break;
                    }
                }

                // Si es mínimo en su fila y máximo en su columna, es un punto de silla
                if (esMinimoEnFila && esMaximoEnColumna) {
                    System.out.println("Punto de silla encontrado: " + elemento + " en la posición [" + i + "][" + j + "]");
                    puntoDeSillaEncontrado = true;
                }
            }
        }

        if (!puntoDeSillaEncontrado) {
            System.out.println("No se encontraron puntos de silla en la matriz.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}
