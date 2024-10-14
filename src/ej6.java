import java.util.Scanner;
import java.util.Random;
public class ej6 {
    final static int TAMANIO = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] VECTOR = new int[TAMANIO];
        // CREAMOS UNS CLASE RANDOM
        Random n_aleatorios = new Random();
        // MOSTAMOS EL VECTOR
        for (int i = 0; i < TAMANIO; i++) {
            VECTOR[i] = n_aleatorios.nextInt(100) + 1;
            System.out.print("[" + VECTOR[i] + "]");
        }
        // AGREGAMOS UN VALOR NULO
        System.out.println();
        // PREGUNTAR EL NUMERO QUE SEA BUSCAR
        System.out.print("Ingresa el numero que desea buscar: ");
        int n_buscar = scanner.nextInt();
        // BUSCAR EL NUMERO QUE DESEA
        int posicion = 0;
        boolean encontrado = false;
        for (int i = 0; i < TAMANIO; i++) {
            if (VECTOR[i] == n_buscar) {
                posicion = i;
                encontrado = true;
            }

        }
        if (encontrado == true) {
            System.out.print("El valor se encuentra en la posicion" + posicion);
        } else {
            System.out.print("El valor no se encuentra en ninguna posicion");
        }
    }
}