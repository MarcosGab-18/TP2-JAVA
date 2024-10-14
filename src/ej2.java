
import java.util.Scanner;
public class ej2 {
        final static int VALORES = 5;
         public static void main(String[] args) {

             int [] arreglo = new int [VALORES];

             Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < VALORES; i++){
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
             }
            System.out.println("Los numeros ingresados son: ");
             for (int i = 0; i < VALORES; i++){
            System.out.println("Número " + (i + 1) + ": " + arreglo[i]);
             }
        scanner.close();
        }
    }

