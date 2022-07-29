import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ejercicio10 {

    public static float calcValor(float pes){
        float a,b;
        if(pes>=0 && pes<=25){
            return 0;
        }
        if (pes>=26 && pes<=300){
            a=pes*1500;
            return a;
        }
        if(pes>=301 && pes<=500){
            b=pes*2500;
            return b;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        float pesoTot=0, pesoBulto=0, valor=0, ingresos=0, pesoMax=0, pesoMin=0;
        int cantBultos=0;
        String promedio, ingresosDol;
        List<Float>bultos=new ArrayList<>();
        Scanner entrada= new Scanner(System.in);
        DecimalFormat df= new DecimalFormat("#,###.00");
        DecimalFormat df1= new DecimalFormat("#,###");

        System.out.println("===DECIMO EJERCICIO===");

        System.out.println("Digite la cantidad de bultos a ingresar: ");
        cantBultos=entrada.nextInt();

        for(int i=0;i<cantBultos;i++){
            System.out.println("Digite el peso de bulto número "+(i+1)+": ");
            pesoBulto=entrada.nextInt();
            pesoTot+=pesoBulto;

            while(pesoTot>18000 || pesoBulto>500){
                System.out.println("El valor ingresado excede la capacidad maxima");
                pesoTot-=pesoBulto;
                System.out.println("Digite el peso de bulto número "+(i+1)+": ");
                pesoBulto=entrada.nextInt();
                pesoTot+=pesoBulto;
            }
            valor=calcValor(pesoBulto);
            ingresos+=valor;
            bultos.add(pesoBulto);
        }

        pesoMax= Collections.max(bultos);
        pesoMin= Collections.min(bultos);
        promedio=df.format(pesoTot/cantBultos);
        ingresosDol=df.format(ingresos/4467.80);

        System.out.println("El numero total de bultos ingresados para el vuelo es "+cantBultos+" con una carga total de "+pesoTot+" kg.");
        System.out.println("El peso del bulto más pesado es "+pesoMax+" kg.\nEl peso del bulto más liviano es "+pesoMin+" kg.");
        System.out.println("El peso promedio de los bultos es de "+promedio+" kg.");
        System.out.println("El ingreso en |COP| es de $"+df1.format(ingresos)+" y en |USD| de $"+ingresosDol+" por concepto de carga.");

    }
}
