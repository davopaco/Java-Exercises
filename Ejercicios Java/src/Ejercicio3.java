import java.util.*;

public class Ejercicio3 {

    // Función para verificar si un numero es primo.

    public static boolean esPrimo(int num1) {
        boolean result = true;
        for (int j = 2; j < num1; j++) {
            if (num1 % j == 0) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        // Declaracion e inicializacion de variables

        int i = 0, cantidad = 0, num = 2;
        List<Integer> numPrimos = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("===TERCER EJERCICIO===\n");

        /*
         * Try-catch con while indefinido para probar
         * las entradas del ususario al Scanner.
         */

        while (true) {
            try {
                System.out.println("Digita la cantidad de numeros primos que solicita: ");
                cantidad = entrada.nextInt();
                if (cantidad < 0) {
                    throw new InputMismatchException();
                }
                entrada.close();
                break;

            } catch (InputMismatchException e) {
                System.out.println("\nIngrese un número valido.\n");
                cantidad = 0;
            }
            entrada.nextLine();
        }

        /*
         * while que añade los numeros primos a una lista hasta que se cumpla
         * la condición de la cantidad de numeros solicitados.
         */

        while (i < cantidad) {
            if (esPrimo(num)) {
                numPrimos.add(num);
                i++;
            }
            num++;
        }

        // Salida de numeros separados por coma.

        String res = numPrimos.toString();
        res = res.substring(1, res.length() - 1);
        System.out.println("\nLos primeros " + cantidad + " numeros primos son: ");
        System.out.println(res);
    }
}
