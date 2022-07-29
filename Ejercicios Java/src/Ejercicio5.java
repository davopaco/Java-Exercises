import java.util.*;
import java.lang.*;

public class Ejercicio5 {
    public static void main(String[] args) {
        int random=0, temporal=0;
        int[] numeros= new int[20];
        Random random1=new Random();

        System.out.println("===QUINTO EJERCICIO===");

        for (int r=0;r<numeros.length;r++){
            if(r<numeros.length){
                random = random1.nextInt(15, 86);
                numeros[r] = random;
            }
        }

        int[] sortedNumeros=numeros.clone();

        for(int i=0;i<numeros.length;i++){
            for(int j=i+1;j<numeros.length;j++){
                if(sortedNumeros[i]<sortedNumeros[j]){
                    temporal=sortedNumeros[i];
                    sortedNumeros[i]=sortedNumeros[j];
                    sortedNumeros[j]=temporal;
                }
            }
        }

        System.out.println("\nEl vector antes del ordenamiento fue: "+Arrays.toString(numeros)+"\nEl vector despues del ordenamiento es: "+Arrays.toString(sortedNumeros));
    }
}
