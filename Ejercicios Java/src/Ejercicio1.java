import java.util.*;

public class Ejercicio1 {

    public static void main(String[] args) {

        double sumtot = 0, sumpos = 0, sumneg = 0, numero = 0;
        int i = 0, cantidad=0;
        Scanner entrada = new Scanner(System.in);
        boolean rep = false;

        System.out.println("===PRIMER EJERCICIO===");
        
        while (!rep) {
            try {
                if (cantidad == 0) {
                    System.out.println("Digite la cantidad de numeros a ingresar: ");
                    cantidad = entrada.nextInt();
                }
                if (cantidad < 0) {
                    throw new InputMismatchException();
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
                rep = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número valido. ");
            }
            if (!(cantidad < 0)) {
                entrada.next();
            }else if(cantidad<0){
                cantidad=0;
            }
        }
        entrada.close();
        System.out.println("-----SUMAS-----\nLa suma total es de: " + sumtot + "\nLa suma de positivos es de: " + sumpos
                + "\nLa suma de negativos es de: " + sumneg);
    }
}