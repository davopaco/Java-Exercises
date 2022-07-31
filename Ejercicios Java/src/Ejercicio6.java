import java.util.*;

public class Ejercicio6 {
    public static int[] hacerArreglos(int[] l) {
        int random = 0;
        for (int i = 0; i < 10; i++) {
            Random random1 = new Random();
            random = random1.nextInt(1000) + 200;
            l[i] = random;
        }
        return l;
    }

    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        int[] temp = new int[10];

        hacerArreglos(A);
        hacerArreglos(B);

        System.out.println("===SEXTO EJERCICIO===");
        System.out.println("El vector A es:\n" + Arrays.toString(A));
        System.out.println("\nEl vector B es:\n" + Arrays.toString(B));

        A = Arrays.stream(A).filter(x -> x % 2 != 0).toArray();
        B = Arrays.stream(B).filter(x -> x % 2 == 0).toArray();
        temp = A;
        A = B;
        B = temp;

        System.out.println("\nEl nuevo vector A es:\n" + Arrays.toString(A));
        System.out.println("\nEl nuevo vector B es:\n" + Arrays.toString(B));
    }
}
