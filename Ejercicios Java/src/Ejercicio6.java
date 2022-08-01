import java.util.*;

public class Ejercicio6 {

    // Función para hacer arreglos con nums al azar de 200 a 1000, recibiendo un
    // arreglo tipo int[] y retornándolo.

    public static int[] hacerArreglos(int[] l) {
        int random = 0;
        for (int i = 0; i < 10; i++) {
            Random random1 = new Random();
            random = random1.nextInt((1001 - 200)) + 200;
            l[i] = random;
        }
        return l;
    }

    public static void main(String[] args) {

        // Declaración e inicialización de variables.

        int[] A = new int[10];
        int[] B = new int[10];
        int[] temp = new int[10];

        // Se piden hacer los arreglos A y B.

        hacerArreglos(A);
        hacerArreglos(B);

        System.out.println("===SEXTO EJERCICIO===");

        // Salida de los arreglos iniciales.

        System.out.println("El vector A es:\n" + Arrays.toString(A));
        System.out.println("\nEl vector B es:\n" + Arrays.toString(B));

        A = Arrays.stream(A).filter(x -> x % 2 != 0).toArray(); // .stream().filter() para filtrar los valores impares
                                                                // de A usando condición lambda.
        B = Arrays.stream(B).filter(x -> x % 2 == 0).toArray(); // .stream().filter() para filtrar los valores pares de
                                                                // B usando condición lambda.

        // Se usa temp para almacenar temporalmente los valores de A y poder
        // intercambiar valores de A y B

        temp = A;
        A = B;
        B = temp;

        // Salida de arreglos después del ordenamiento.

        System.out.println("\nEl nuevo vector A es:\n" + Arrays.toString(A));
        System.out.println("\nEl nuevo vector B es:\n" + Arrays.toString(B));
    }
}
