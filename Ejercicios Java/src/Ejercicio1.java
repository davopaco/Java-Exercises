import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        double sumtot = 0, sumpos = 0, sumneg = 0, numero = 0;
        int i = 0, cantidad = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("===PRIMER EJERCICIO===");

        while (true) {
            try {
                if (cantidad == 0) {
                    System.out.println("Digite la cantidad de numeros a ingresar: ");
                    cantidad = entrada.nextInt();
                }
                if (cantidad < 0) {
                    throw new ArithmeticException();
                }
                while (i < cantidad) {
                    System.out.println("Ingresa el numero " + (i + 1) + ": ");
                    numero = entrada.nextDouble();
                    sumtot += numero;
                    if (numero >= 0) {
                        sumpos += numero;
                    } else {
                        sumneg += numero;
                    }
                    i++;
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
        System.out.println("-----SUMAS-----\nLa suma total es de: " + sumtot + "\nLa suma de positivos es de: " + sumpos + "\nLa suma de negativos es de: " + sumneg);
    }
}
                