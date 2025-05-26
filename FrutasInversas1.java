import java.util.Scanner;

public class FrutasInversas1 {
    public static void main(String[] args) {
 
        String[] frutas = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 nombres de frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            frutas[i] = scanner.nextLine();
        }

        System.out.println("\nFrutas en orden inverso:");
        for (int i = frutas.length - 1; i >= 0; i--) {
            System.out.println(frutas[i]);
        }
       
        scanner.close();
    }
}