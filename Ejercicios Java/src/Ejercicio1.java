import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        int sumtot=0; int sumpos=0; int sumneg=0; int numero=0; int cantidad=0;

        System.out.println("===PRIMER EJERCICIO===");
        Scanner entrada= new Scanner(System.in);
        System.out.println("Digita la cantidad de numeros a ingresar: ");
        cantidad=entrada.nextInt();

        for(int i=0;i<cantidad;i++){
            System.out.println("Ingresa el numero "+(i+1)+": ");
            numero=entrada.nextInt();
            sumtot+=numero;

            if(numero>=0){
                sumpos+=numero;
            } else{
                sumneg+=numero;
            }
        }
        System.out.println("-----SUMAS-----\nLa suma total es de: "+sumtot+"\nLa suma de positivos es de: "+sumpos+"\nLa suma de negativos es de: "+sumneg);
    }
}
