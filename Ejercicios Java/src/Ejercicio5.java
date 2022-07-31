import java.util.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int random = 0; 
        Integer[] numeros = new Integer[20];
        Random random1 = new Random();

        System.out.println("===QUINTO EJERCICIO===");

        for (int k = 0; k < numeros.length; k++) {
            random = random1.nextInt(86) + 15;
            numeros[k] = random;
        }

        Integer[] sortedNumeros = numeros.clone();
        Arrays.sort(sortedNumeros, Collections.reverseOrder());

        System.out.println("\nEl vector antes del ordenamiento fue: " + Arrays.toString(numeros)
                + "\nEl vector despues del ordenamiento es: " + Arrays.toString(sortedNumeros));
    }
}
