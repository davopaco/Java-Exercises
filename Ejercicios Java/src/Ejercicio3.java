import java.util.*;

public class Ejercicio3 {

    public static boolean isPrime(int num1) {
        boolean result=true;
        for (int j = 2; j < num1; j++) {
            if (num1 % j == 0) {
                result=false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i=0, cantidad=0, num=2;
        List<Integer> numPrimos = new LinkedList<>() ;
        Scanner  entrada = new Scanner(System.in);

        System.out.println("===TERCER EJERCICIO===\n");

        System.out.println("Digita la cantidad de numeros primos que solicita: ");
        cantidad=entrada.nextInt();

        while(i<cantidad){
            if (isPrime(num)) {
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
