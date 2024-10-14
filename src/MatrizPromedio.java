import java.util.InputMismatchException;
import java.util.Scanner;
public class MatrizPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cantidad de filas y columnas
        int X = 0;
        int Y = 0;

        while (X < 2 || Y < 2) {
            System.out.print("Ingrese la cantidad de filas (mayor o igual a 2): ");
            X = scanner.nextInt();
            System.out.print("Ingrese la cantidad de columnas (mayor o igual a 2): ");
            Y = scanner.nextInt();

            if (X < 2 || Y < 2) {
                System.out.println("Los valores deben ser mayores o iguales a 2. Intente nuevamente.");
            }
        }

        // Crear la matriz
        int[][] matriz = new int[X][Y];

        // Solicitar al usuario que ingrese números enteros para cargar cada una de las celdas de la matriz
        System.out.println("Ingrese los valores para la matriz:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                while (true) {
                    try {
                        System.out.print("Ingrese el valor para la posición [" + i + "][" + j + "]: ");
                        matriz[i][j] = scanner.nextInt();
                        break; // Salir del bucle si la entrada es válida
                    } catch (InputMismatchException e) {
                        System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                        scanner.next(); // Limpiar el buffer
                    }
                }
            }
        }

        // Calcular el promedio de los elementos asignados y cargados en la matriz
        int suma = 0;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                suma += matriz[i][j];
            }
        }
        double promedio = (double) suma / (X * Y); // Promedio como double

        // Determinar si el promedio calculado se encuentra asignado en alguna de las celdas
        boolean encontrado = false;
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                if (matriz[i][j] == (int) promedio) { // Comparar como entero
                    System.out.println("El promedio " + (int) promedio + " se encuentra en la posición [" + i + "][" + j + "]");
                    encontrado = true;
                }
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró ninguna coincidencia");
        }

        scanner.close();
    }
}