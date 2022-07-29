import java.util.*;

public class Ejercicio6 {
    public static List doLists(List<Integer> l){
        while (l.size()<10){
            Integer random=0;
            Random random1=new Random();
            random=random1.nextInt(1000)+200;
            l.add(random);
        }
        return l;
    }

    public static void main(String[] args) {
        List<Integer> A = new LinkedList<>();
        List<Integer> B = new LinkedList<>();
        List<Integer> C =new LinkedList<>();
        List<Integer> D =new LinkedList<>();

        doLists(A);
        doLists(B);

        System.out.println("===SEXTO EJERCICIO===");
        System.out.println("El vector A es:\n" + A.toString());
        System.out.println("\nEl vector B es:\n" + B.toString());

        Iterator<Integer> it1 = A.iterator();
        Iterator<Integer> it2 = B.iterator();

        while(it1.hasNext()){
            Integer num1=it1.next();
            if(num1%2!=0){
                C.add(num1);
            }
        }
        while(it2.hasNext()){
            Integer num2=it2.next();
            if(num2%2==0){
                D.add(num2);
            }
        }
        A.clear();
        B.clear();
        A.addAll(D);
        B.addAll(C);

        System.out.println("\nEl nuevo vector A es:\n" + A.toString());
        System.out.println("\nEl nuevo vector B es:\n" + B.toString());
    }
}

