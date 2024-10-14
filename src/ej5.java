import java.util.Scanner;
import java.util.Random;
public class ej5 {
    final static int TAMANIO = 20 ;
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        // Tamanio de vector
        int [] Nums_Aleatorios = new int[TAMANIO];
        // Numeros Aleatorios
        Random ALEATORIOS = new Random();
        // Mostrar el Vector
        System.out.print("El vector de numeros aleatorios es:" + "\n");
        for(int i = 0; i < TAMANIO; i++){
            Nums_Aleatorios[i] = ALEATORIOS.nextInt(101)+1;
            System.out.print("["+ Nums_Aleatorios[i] + "]");
        }
        System.out.println();
        // EL PROMEDIO ARITMETICO
        int sumas = 0;
        int promedio = 0;
        for(int i = 0; i < TAMANIO; i++){
            sumas = sumas + Nums_Aleatorios[i];
            promedio = sumas/TAMANIO;
        }
        System.out.print("La suma de los numeros es:" + sumas + "\n");
        System.out.print("El Promedio es de:" + promedio + "\n");
        // CANTIDAD DE NUMEROS IGUALES AL PROMEDIO
        System.out.print("Los numeros iguales al promedio son:");
        int n_iguales = 0;
        for(int i = 0; i <TAMANIO; i++){
            if (Nums_Aleatorios[i] == promedio) {
                n_iguales = Nums_Aleatorios[i];
                System.out.print("["+ n_iguales + "]");
            }
        }
        System.out.println();
        // CANTIDAD DE NUMEROS MAYORES QUE EL PROMEDIO
        System.out.print("Los numeros mayores al promedio son:");
        int n_mayores = 0;
        for(int i = 0; i<TAMANIO; i++){
            if (Nums_Aleatorios[i] > promedio){
                n_mayores = Nums_Aleatorios[i];
                System.out.print("["+n_mayores+"]");
            }
        }
        System.out.println();
        // CANTIDAD DE NUMEROS MENORES AL PROMEDIO
        System.out.print("Los numeros menores al promedio son:");
        int n_menores = 0;
        for(int i = 0; i<TAMANIO; i++){
            if(Nums_Aleatorios[i] < promedio){
                n_menores = Nums_Aleatorios[i];
                System.out.print("["+n_menores+"]");
            }
        }
    }
}