import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        int con=0;
        List<Integer>vector=new LinkedList<>();
        List<Integer>vectorantes=new LinkedList<>();
        List<Integer>temporal=new LinkedList<>();

        System.out.println("===SEPTIMO EJERCICIO===");

        while (vector.size()<20){
            Random random1 = new Random();
            int random=random1.nextInt(10);
            vector.add(random);
        }

        vectorantes.addAll(vector);
        System.out.println("El vector antes es: "+vector);

        Iterator<Integer> it=vector.iterator();

        while (it.hasNext()){
            Integer num= it.next();
            if(num!=0){
                temporal.add(num);
            }else {
                con++;
            }
        }
        vector.clear();
        vector.addAll(temporal);
        for (int i=0;i<con;i++){
            vector.add(0);
        }

        System.out.println("El nuevo vector es: "+vector);
    }
}
