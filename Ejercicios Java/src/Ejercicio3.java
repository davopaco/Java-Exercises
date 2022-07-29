import java.util.*;

public class Ejercicio3 {
    public static boolean isCousin(int num1) {
        for (int j = 2; j <= num1; j++) {
            if (num1 % j == 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        int i=0, cantidad=0;
        int num=2;
        List<Integer> numPrimos = new LinkedList<>() ;
        Scanner  entrada = new Scanner(System.in);
        numPrimos.add(2);

        System.out.println("===TERCER EJERCICIO===\n");

        System.out.println("Digita la cantidad de numeros primos que solicita: ");
        cantidad=entrada.nextInt();

        while(i<cantidad-1){
            if (isCousin(num)) {
                numPrimos.add(num);
                i++;
            }
            num++;
        }
        StringBuilder res=new StringBuilder(numPrimos.toString());
        res.deleteCharAt(0);
        res.deleteCharAt(res.length()-1);
        System.out.println(res);
    }
}
