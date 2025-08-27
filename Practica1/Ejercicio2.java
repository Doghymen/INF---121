import java.util.Scanner;

public class Ejercicio2 {

    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);


        System.out.print("Ingrese el valor de a:");
        double a = leer.nextDouble();

        System.out.print("Ingrese el valor de b:");
        double b = leer.nextDouble();

        System.out.print("Ingrese el valor de c:");
        double c = leer.nextDouble();


        EcuacionCuadratica cuadratica = new EcuacionCuadratica(a, b, c);


        if (cuadratica.getDiscriminante() > 0) {
            System.out.println("La raiz 1 es: " + cuadratica.getRaiz1());
            System.out.println("La raiz 2 es: " + cuadratica.getRaiz2());
        } else if (cuadratica.getDiscriminante() == 0) {
            System.out.println("La unica raiz es: " + cuadratica.getRaiz1());
        } else{
            System.out.println("La ecuación no tiene raíces reales");
        }
    }
}