import java.util.Scanner;

public class EstadisticaEstructurada {
    
    public static double Promedio(double[] n){
        double acum = 0;
        for(int i=0; i < n.length; i++){
            acum = acum + n[i];
        }

        return acum / n.length;
    }

    public static double desviacion(double[] n){
        double acumulador = Promedio(n);
        double suma = 0;

        for(int i=0; i < n.length; i++){
            suma = suma + Math.pow(n[i] - acumulador, 2);
        }

        if (acumulador == 0) {
            return 0;
        }

        return Math.sqrt(suma / (n.length - 1));
    }







    public static void main(String[] args){
        Scanner estadistica = new Scanner(System.in);
        double[] valor = new double[10];


        System.out.println("Ingrese 10 nuúmeros:");
        for(int i=0; i < 10; i++){
            valor[i] = estadistica.nextDouble();
        }

        double prom = Promedio(valor);
        double desv = desviacion(valor);

        System.out.println("El promedio es: " + prom);
        System.out.println("La desviacion estandar es: " + desv);
    }
}
