    import java.util.Scanner;

public class ArticulosInvert5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] articulos = new String[3][3];

        
        System.out.println("Ingrese 9 nombres de dieferentes artículos:");
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                System.out.print("Artículo [" + fila + "][" + columna + "]: ");
                articulos[fila][columna] = scanner.nextLine();
            }
        }

        System.out.println("\nContenido de la matriz con filas invertidas:");
        for (int fila = 2; fila >= 0; fila--) { 
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(articulos[fila][columna] + "\t");
            }
            System.out.println(); 
        }

        scanner.close();
    }
}

