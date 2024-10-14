import java.util.Scanner;
public class ej10 {
    public static void main (String[] args){
        // Pedir al usuario DNI
        System.out.print("Ingrese (sin letras) su DNI: ");
        Scanner scanner = new Scanner(System.in);
        int DNI = scanner.nextInt();
        // Generar el calculo
        int resto = 0;
        resto = DNI % 23;
        System.out.println("La letra tiene un valor numerico de: "+resto);
        // Generar un vector con letras
        char[] letras  = { 'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        // Mostrar el vector con sus respectivas letras y posiciones
        int TAMANIO = letras.length;
        for (int i = 0; i < TAMANIO;  i++){
            System.out.println("En posicion "+(i)+":"+letras[i]);
        }
        // Generar la buscqueda de la letra
        for (int i = 0; i < TAMANIO;i++){
            if ( resto == i ) {
                System.out.print("DNI: "+DNI+letras[i]);
            }
        }
    }
}
