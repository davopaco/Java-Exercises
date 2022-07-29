import java.util.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        int random=0, acum=0, numMenor=0, numMayor=0, promedio=0, cantidad=0;
        List<Integer> numeros = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        Random random1=new Random();

        System.out.println("===CUARTO EJERCICIO===");

        System.out.println("Digita la cantidad de numeros al azar: ");
        cantidad=entrada.nextInt();

        for(int i=0;i<cantidad;i++){
            random=random1.nextInt(100)+1;
            numeros.add(random);
            acum+=random;
        }

        numMayor=Collections.max(numeros,null);
        numMenor=Collections.min(numeros,null);
        promedio=acum/numeros.size();

        Iterator<Integer> it=numeros.iterator();
        while(it.hasNext()){
            Integer r =it.next();
            if(it.hasNext()) {
                System.out.print(r + ", ");
            }else{
                System.out.print(r);
            }
        }
        System.out.println("\nEl mayor numero al azar fue: "+numMayor+"\nEl menor numero al azar fue: "+numMenor+"\nEl promedio de los numeros es: "+promedio);

    }
}
