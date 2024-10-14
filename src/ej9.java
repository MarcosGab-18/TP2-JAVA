import java.util.Scanner;
public class ej9 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un cadena de numeros seprados por ' - '");
        String cadena = scanner.nextLine();
        String[] numerosyguines = cadena.split("-");
        System.out.println("La cadena de numeros sin guiones es:");
        int TAMANIO = numerosyguines.length;
        for (int i = 0; i<TAMANIO; i++){
          System.out.print("["+numerosyguines[i]+"]");
        }
        scanner.close();
    }
}