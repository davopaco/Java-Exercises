import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {

        // Declaracion e inicializacion de variables.

        int random = 0;
        Integer[] numeros = new Integer[20];
        Random random1 = new Random();

        System.out.println("===QUINTO EJERCICIO===");

        // For loop para añadir numeros al azar al arreglo.

        for (int k = 0; k < numeros.length; k++) {
            random = random1.nextInt((87 - 15)) + 15;
            numeros[k] = random;
        }

        // Salida de los arreglos.

        System.out.println("\nEl vector antes del ordenamiento fue: " + Arrays.toString(numeros));

        Arrays.sort(numeros, Collections.reverseOrder()); // Sortear numeros con la funcion .sort() y usar el comparador
                                                          // Collections.reverseOrder() en un arreglo tipo Integer[].

        System.out.println("\nEl vector despues del ordenamiento es: " + Arrays.toString(numeros));
    }
}
