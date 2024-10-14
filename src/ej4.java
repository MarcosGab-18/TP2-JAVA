import java.util.Scanner;
public class ej4 {
    final static int TAMANIO = 10;
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            /*VECTOR ON TAMNIO = 20 */
            double[] VECTOR = new double[TAMANIO];

            /* a) entrada de 20 numeros decimales */

            for(int i = 0; i<TAMANIO; i++){
                System.out.print("Ingrese el numero " + (i+1) + ":");
                VECTOR [i] = scanner.nextDouble();
            }
            /* b) determina mayor numero en el vector */

            double mayor = VECTOR[0];
            double menor = VECTOR[0];

            for(int i = 0; i<TAMANIO; i++) {
                if ( VECTOR [i] > mayor  ) {
                    mayor = VECTOR [i];
                }
                if (VECTOR [i] < menor) {
                    menor = VECTOR [i];
                }
            }
            System.out.print("El numero con mayor valor en el vector es:"+ mayor +"\n");
            System.out.print("El numero con menor valor en el vector es:"+ menor +"\n");
            System.out.print("La diferencia de el mayor y el menor es de:"+ (mayor - menor));
        }
}


