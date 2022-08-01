import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
        int random = 0, numMenor = 0, numMayor = 0, cantidad = 0;
        float promedio = 0;
        List<Integer> numeros = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        Random random1 = new Random();

        System.out.println("===CUARTO EJERCICIO===");

        while (true) {
            try {
                System.out.println("Digita la cantidad de numeros al azar: ");
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

        for (int i = 0; i < cantidad; i++) {
            random = random1.nextInt(100) + 1;
            numeros.add(random);
        }

        numMayor = Collections.max(numeros, null);
        numMenor = Collections.min(numeros, null);
        promedio = ((float) (numMayor + numMenor)) / 2;

        String res = numeros.toString();
        res = res.substring(1, res.length() - 1);
        System.out.println("\nLos numeros al azar son: ");
        System.out.println(res);
        System.out.println("\nEl mayor numero al azar fue: " + numMayor + "\nEl menor numero al azar fue: " + numMenor
                + "\nEl promedio de ambos numeros es: " + promedio);

    }
}
