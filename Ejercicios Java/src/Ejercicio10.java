import java.text.DecimalFormat;
import java.util.*;
public class Ejercicio10 {

    public static float calcValor(float pes) {
        float a, b;
        if (pes >= 0 && pes <= 25) {
            return 0;
        }
        if (pes >= 26 && pes <= 300) {
            a = pes * 1500;
            return a;
        }
        if (pes >= 301 && pes <= 500) {
            b = pes * 2500;
            return b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        float pesoTot = 0, pesoBulto = 0, valor = 0, ingresos = 0, pesoMax = 0, pesoMin = 0;
        int cantBultos = 0;
        String promedio, ingresosDol;
        List<Float> bultos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        DecimalFormat df1 = new DecimalFormat("#,###");
        int i = 0;

        System.out.println("===DECIMO EJERCICIO===");
        while (true) {
            try {
                if (cantBultos == 0) {
                    System.out.println("Digite la cantidad de bultos a ingresar: ");
                    cantBultos = entrada.nextInt();
                }
                if (cantBultos < 0) {
                    throw new IllegalStateException();
                }

                for (; i < cantBultos; i++) {
                    System.out.println("Digite el peso de bulto número " + (i + 1) + ": ");
                    pesoBulto = entrada.nextInt();

                    if (pesoTot > 18000 || pesoBulto > 500) {
                        throw new ArithmeticException();
                    }
                    pesoTot += pesoBulto;
                    valor = calcValor(pesoBulto);
                    ingresos += valor;
                    bultos.add(pesoBulto);
                }
                entrada.close();
                break;
            } catch (InputMismatchException e) {
                System.out.println("\nIngrese un numero valido.\n");
            } catch (ArithmeticException e) {
                System.out.println("El valor ingresado excede la capacidad maxima o no es valido.");
            } catch (IllegalStateException e) {
                System.out.println("\nIngrese un numero positivo.\n");
                cantBultos = 0;
            }
            entrada.nextLine();
        }

        pesoMax = Collections.max(bultos);
        pesoMin = Collections.min(bultos);
        promedio = df.format(pesoTot / cantBultos);
        ingresosDol = df.format(ingresos / 4467.80);

        System.out.println("El numero total de bultos ingresados para el vuelo es " + cantBultos
                + " con una carga total de " + pesoTot + " kg.");
        System.out.println("El peso del bulto más pesado es " + pesoMax + " kg.\nEl peso del bulto más liviano es "
                + pesoMin + " kg.");
        System.out.println("El peso promedio de los bultos es de " + promedio + " kg.");
        System.out.println("El ingreso en |COP| es de $" + df1.format(ingresos) + " y en |USD| de $" + ingresosDol
                + " por concepto de carga.");

    }
}