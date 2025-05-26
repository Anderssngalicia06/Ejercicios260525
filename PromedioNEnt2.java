import java.util.Scanner;

public class PromedioNEnt2 {

    public static void main(String[] args) {

        int suma = 0;
        double promedio;
        
        int[] numeros = new int[12];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 12 números enteros");

        for(int i = 0; i < numeros.length; i++ ) {
            System.out.println("Número entero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];

        }

        promedio = suma / numeros.length;

        System.out.println("El promedio de los numeros ingresados es: " + promedio);

     scanner.close();


    }


    
}
