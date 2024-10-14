import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class ej7 {
    final static int TAMANIO = 20;
        public static void main (String[] args){
        int [] VECTOR = new int[TAMANIO];
        Random n_aleatorios = new Random();
        for (int i = 0; i<TAMANIO; i++){
         VECTOR[i] = n_aleatorios.nextInt(100)+1;
        }
        int suma1 = 0;
        int modulo1 = 0;
        for (int i = 0; i<TAMANIO; i++){
            modulo1 = VECTOR[i] % 2;
            if (modulo1 == 0){
                suma1 = suma1 + VECTOR[i];
            }
        }
        int suma2 = 0;
        int modulo2 = 0;
        for (int i = 0; i<TAMANIO; i++){
            modulo2 = VECTOR[i] % 2;
            if (modulo2 != 0){
                suma2 = suma2 + VECTOR[i];
            }
        }
        System.out.print("La suma de los numero pares es: " + suma1 + "\n");
        System.out.print("La suma de los numero impares es: " + suma2);
    }
}
