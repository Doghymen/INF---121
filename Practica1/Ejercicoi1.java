import java.util.Scanner;










public class Ejercicoi1 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor de a:");
        double a = leer.nextDouble();
        System.out.print("Ingrese el valor de b:");
        double b = leer.nextDouble();
        System.out.print("Ingrese el valor de c:");
        double c = leer.nextDouble();
        System.out.print("Ingrese el valor de d:");
        double d = leer.nextDouble();
        System.out.print("Ingrese el valor de e:");
        double e = leer.nextDouble();
        System.out.print("Ingrese el valor de f:");
        double f = leer.nextDouble();


        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);

        if (ecuacion.TieneSolucion()) {
            System.out.println("En X:" + ecuacion.getX());
            System.out.println("En Y:" + ecuacion.getY());
        } else{
            System.out.println("La ecuación no tiene solución");
        }

    }
}
