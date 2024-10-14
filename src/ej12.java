import java.util.Scanner;
public class ej12 {
    public static void main (String[] args){
        Scanner ja= new Scanner(System.in);
        int[] vector12= new int[10];
        System.out.println("rellene el vector 1");
        for(int i=0; i<vector12.length; i++){
            int prime = (int) (Math.random() * 10) + 1;
            vector12[i]=prime;
            System.out.print("["+vector12[i]+"]");
        }
        System.out.println("\ningrese el numero a eliminar\n");
        int eliminar= ja.nextInt();
        int cont=0;
        for(int i=0; i<vector12.length; i++){
            if(vector12[i]==eliminar){
                cont++;
            }
        }
        if(cont==0){
            System.out.println("no hay numeros iguales");
        }else{
            int[] nuevoArray = new int[vector12.length - cont];
            int j = 0;
            for (int i=0; i<vector12.length; i++){
                if (vector12[i] != eliminar) {
                    nuevoArray[j] = vector12[i];
                    j++;
                }
            }
            System.out.println("El nuevo array sin el número " + eliminar + " es:");
            for(int a = 0; a <nuevoArray.length; a++) {
                System.out.print("[" + nuevoArray[a] + "]");
            }
        }
    }
}