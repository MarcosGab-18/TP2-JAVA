import java.util.Scanner;
public class ej8 {
    final static int TAMANIO = 5;
        public static void main(String[] args) {
        //INICIALIZAR LOS VECTORES
        int[] VECTOR1 = new int[TAMANIO];
        int[] VECTOR2 = new int[TAMANIO];
        int[] VECTOR3 = new int[TAMANIO];
        //CARGAR EL VECTOR1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los valores del VECTOR1" + "\n");
        for (int i = 0; i < TAMANIO; i++) {
            System.out.print("Ingresar el valor n°" + (i + 1) + " ");
            VECTOR1[i] = scanner.nextInt();

        }
        //CARGAR EL VECTOR1 DE MANERA ASCENDENTE;
        int n_temp1 = 0;
        for (int i = 0; i < TAMANIO-1; i++) {
             for (int j = 0; j < TAMANIO-1 -i ; j++){
                 if (VECTOR1[j] > VECTOR1[j+1]){
                     n_temp1 = VECTOR1[j];
                     VECTOR1[j] = VECTOR1[j+1];
                     VECTOR1[j+1] = n_temp1;
                 }
             }
        }
        //GUARDAR LA MANERA ASCENDENTE EN VECTOR2
        for (int i = 0; i<TAMANIO; i++){
            VECTOR2[i] = VECTOR1[i];
        }
        //CARGAR Y GUARDAR EL VECTOR DE MANERA DESCENDENTE
        int n_temp2 = 0;
        for (int i = 0; i < TAMANIO; i++){
            VECTOR3[i] = VECTOR1[TAMANIO -1 - i];
        }
        // MOSTRAR EL VECTOR ORDENADO DE MANERA ASCENDENTE
        System.out.print("Vector ordenado de manera ascendente: ");
        for (int i = 0; i < TAMANIO; i++){
            System.out.print("[" + VECTOR2[i] + "]");
        }
        System.out.println();
        // MOSTRARA EL VECTOR ORDENADO DE MANERA DESCENDENTE
        System.out.print("Vector ordenado de manera descendente: ");
        for (int i = 0; i < TAMANIO; i++){
            System.out.print("[" + VECTOR3[i] + "]");
        }
        scanner.close();
    }
}