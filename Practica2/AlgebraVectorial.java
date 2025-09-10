/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Doghy
 */
public class AlgebraVectorial {
    private double a;
    private double b;

    public AlgebraVectorial(double a) {
        this.a = a;
        this.b = 0;
    }
    
    public AlgebraVectorial() {
        this.a = 0;
        this.b = 0;
    }

    public AlgebraVectorial(double a, double b) {
        this.a = a;
        this.b = b;
    }

    //Métodos de Perpendicularidad
    public boolean perpendicular(double a, double b) {
        return Math.abs(Math.abs(a + b) - Math.abs(a - b)) < 1e-9;
    }

    public boolean perpendicular(double a, double b, int opcion1) {
        return Math.abs(Math.abs(a - b) - Math.abs(b - a)) < 1e-9;
    }

    public boolean perpendicular(int opcion2, double a, double b) {
        return Math.abs(a * b) < 1e-9;
    }

    public boolean perpendicular(double a, double b, double opcion3) {
        double izq = Math.pow(Math.abs(a + b), 2);
        double der = Math.pow(Math.abs(a), 2) + Math.pow(Math.abs(b), 2);
        return Math.abs(izq - der) < 1e-9;
    }

    //Métodos de Paralelismo
    public boolean paralelo(double a, double b) {
        if (b == 0) {
            return false;
        }
        double r = a / b;
        return Math.abs(a - r * b) < 1e-9;
    }

    public boolean paralelo(double a, double b, boolean opcion) {
        return (a * b) == 0;
    }

    //Proyección
    public double proyeccion(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return (a * b) / (b * b) * b;
    }

    //Componente
    public double componente(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return (a * b) / Math.abs(b);
    }
}
