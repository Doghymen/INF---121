import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String[] args){


        Scanner leerTam = new Scanner(System.in);

        double[] tamVec = new double[10];


        System.out.println("Ingrese 10 números:");


        for(int i=0; i < 10; i++){
            tamVec[i] = leerTam.nextDouble(); 
        }


        Estadistica calcular = new Estadistica(tamVec);


        System.out.println("El promedio es: " + calcular.Promedio());
        System.out.println("La desviación estandar es: " + calcular.Desviacion());
    }    
}
