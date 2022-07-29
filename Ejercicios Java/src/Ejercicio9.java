import java.util.*;

public class Ejercicio9 {
    public static void verificarValor(Integer val, List<Integer>arr){
        if(arr.contains(val)){
            System.out.println("El valor "+val+" esta en el arreglo.");
        }else {
            System.out.println("El valor "+val+" no esta en el arreglo.");
        }
    }

    public static List generarRandom(int tam1){
        Random random1=new Random();
        List<Integer>arrRan=new ArrayList<>();
        for(int i=0;i<tam1;i++){
            int random=random1.nextInt(1,50);
            arrRan.add(random);
        }
        return arrRan;
    }

    public static void main(String[] args) {

        int tam, valor;
        List<Integer> arr1;
        Scanner entrada=new Scanner(System.in);

        System.out.println("===NOVENO EJERCICIO===");

        System.out.println("Digite el tamaño del arreglo: ");
        tam=entrada.nextInt();
        arr1=generarRandom(tam);

        System.out.println("\nLos valores del arreglo son:");
        System.out.println(arr1);

        System.out.println("\nDigita el valor a buscar en el arreglo (1 a 50): ");
        valor=entrada.nextInt();

        verificarValor(valor,arr1);
    }
}
