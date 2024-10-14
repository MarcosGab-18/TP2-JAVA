import java.util.Scanner;
public class ej3 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        // tamanio del vector
        System.out.print("Introduce el tamanio del vector: ");
        int TAMANIO = scanner.nextInt();
        int vector []  = new int[TAMANIO];
        // numero para sacar sus multiplos
        System.out.print("Introduce un numero: ");
        int VALOR = scanner.nextInt();
        int VALORES = 0;
        // llena el vector con los multiplos
        for (int i = 0; i<TAMANIO ; i++){

            VALORES = VALOR + VALORES;
            vector[i] = VALORES ;
        }
        // muestra el vector con sus mutliplos
        for (int i = 0; i<TAMANIO ; i++){
           System.out.print("[" + vector[i] + "]");
        }
        scanner.close();
    }
}
