import java.util.*;

public class Ejercicio7 {

    public static int[] hacerArreglos(int[] l) {
        int random = 0;
        for (int i = 0; i < 20; i++) {
            Random random1 = new Random();
            random = random1.nextInt(11);
            l[i] = random;
        }
        return l;
    }

    public static void main(String[] args) {
        int ceros = 0, cont = 0;
        int[] vector = new int[20];

        System.out.println("===SEPTIMO EJERCICIO===");

        hacerArreglos(vector);
        System.out.println("El vector antes es: " + Arrays.toString(vector));

        for (int num : vector) {
            if (num == 0) {
                ceros++;
            }
        }

        while (cont < ceros) {
            for (int i = 0; i < 20; i++) {
                if (vector[i] == 0) {
                    for (int j = i; j < 20; j++) {
                        if ((j + 1) < 20) {
                            vector[j] = vector[j + 1];
                            vector[j + 1] = 0;
                        }
                    }
                }
            }
            cont++;
        }

        System.out.println("El nuevo vector es: " + Arrays.toString(vector));
    }
}
