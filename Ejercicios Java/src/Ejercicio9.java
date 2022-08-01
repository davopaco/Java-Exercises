import java.util.*;

public class Ejercicio9 {
    public static void verificarValor(int val, int[] arr) {
        boolean ex = Arrays.stream(arr).anyMatch(x -> x == val);
        if (ex) {
            System.out.println("El valor " + val + " esta en el arreglo.");
        } else {
            System.out.println("El valor " + val + " no esta en el arreglo.");
        }
    }

    public static int[] hacerArreglos(int num) {
        int random = 0;
        int[] arregloRan = new int[num];
        for (int i = 0; i < num; i++) {
            Random random1 = new Random();
            random = random1.nextInt(50) + 1;
            arregloRan[i] = random;
        }
        return arregloRan;
    }

    public static void main(String[] args) {

        int tam = 0, valor = 0;
        int[] arr1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("===NOVENO EJERCICIO===");

        while (true) {
            try {
                System.out.println("Digite el tamaño del arreglo: ");
                tam = entrada.nextInt();
                if (tam < 0) {
                    throw new InputMismatchException();
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nIngrese un numero valido.\n");
                tam = 0;
            }
            entrada.nextLine();
        }

        arr1 = hacerArreglos(tam);

        System.out.println("\nLos valores del arreglo son:");
        System.out.println(Arrays.toString(arr1));

        while (true) {
            try {
                System.out.println("\nDigita el valor a buscar en el arreglo (1 a 50): ");
                valor = entrada.nextInt();
                if (!(valor >= 1 && valor <= 50)) {
                    throw new ArithmeticException();
                }
                verificarValor(valor, arr1);
                entrada.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nIngrese un numero valido.\n");
                tam = 0;
            } catch (ArithmeticException e) {
                System.out.println("\nLos valores van del 1 al 50.\n");
            }
            entrada.nextLine();
        }
    }
}
