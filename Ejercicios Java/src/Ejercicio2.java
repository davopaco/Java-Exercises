import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args){
        int numMayor=0, cantidadM=0, cantidad=0, entNum=0;
        List<Integer> numeros=new ArrayList<Integer>();

        System.out.println("===SEGUNDO EJERCICIO===");
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digita la cantidad de numeros a ingresar: ");
        cantidad=entrada.nextInt();

        for(int i=0;i<cantidad;i++){
            System.out.println("Ingresa el numero "+(i+1)+": ");
            entNum=entrada.nextInt();
            numeros.add(entNum);
        }
        numMayor=Collections.max(numeros,null);
        cantidadM=Collections.frequency(numeros,numMayor);
        System.out.println("El mayor numero leido fue: "+numMayor+"\nLa cantidad de veces que fue ingresado fue: "+cantidadM);
    }

}
