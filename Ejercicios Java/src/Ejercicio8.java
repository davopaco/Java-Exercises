public class Ejercicio8 {
    public static void main(String[] args) {
        String[][] arr1 = new String[9][9];
        String[] figuras = { "-", "o" };

        System.out.println("===OCTAVO EJERCICIO===");

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 4 || j == 4) {
                    arr1[i][j] = figuras[1];
                } else {
                    arr1[i][j] = figuras[0];
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
