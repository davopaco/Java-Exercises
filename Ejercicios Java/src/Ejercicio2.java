import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        int numMayor = 0, cantidadM = 0, cantidad = 0, entNum = 0, i = 0;
        List<Integer> numeros = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("===SEGUNDO EJERCICIO===");

        while (true) {
            try {
                if (cantidad == 0) {
                    System.out.println("Digita la cantidad de numeros a ingresar: ");
                    cantidad = entrada.nextInt();
                }

                if (cantidad < 0) {
                    throw new ArithmeticException();
                }

                for (; i < cantidad; i++) {
                    System.out.println("Ingresa el numero " + (i + 1) + ": ");
                    entNum = entrada.nextInt();
                    numeros.add(entNum);
                }
                entrada.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nIngrese un número valido.\n");
            } catch (ArithmeticException e) {
                System.out.println("\nLa cantidad no puede ser negativa.\n");
                cantidad=0;
            }
            entrada.nextLine();
        }

        numMayor = Collections.max(numeros, null);
        cantidadM = Collections.frequency(numeros, numMayor);
        System.out.println("El mayor numero leido fue: " + numMayor + "\nLa cantidad de veces que fue ingresado fue: "
                + cantidadM);
    }

}
