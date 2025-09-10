/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Doghy
 */
public class VectorTridimensional {
    private double a;
    private double b;
    private double c;

    public VectorTridimensional() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public VectorTridimensional(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    // Suma de vectores
    public VectorTridimensional suma(VectorTridimensional v) {
        return new VectorTridimensional(this.a + v.a, this.b + v.b, this.c + v.c);
    }

    // Resta de vectores
    public VectorTridimensional resta(VectorTridimensional v) {
        return new VectorTridimensional(this.a - v.a, this.b - v.b, this.c - v.c);
    }

    // Multiplicación por escalar
    public VectorTridimensional escalar(double r) {
        return new VectorTridimensional(r * this.a, r * this.b, r * this.c);
    }

    // Longitud del vector
    public double longitud() {
        return Math.sqrt(a * a + b * b + c * c);
    }

    // Vector normal (unitario)
    public VectorTridimensional normal() {
        double len = this.longitud();
        if (len == 0) {
            return new VectorTridimensional(0, 0, 0);
        }
        return new VectorTridimensional(this.a / len, this.b / len, this.c / len);
    }

    // Producto escalar
    public double productoEscalar(VectorTridimensional v) {
        return this.a * v.a + this.b * v.b + this.c * v.c;
    }

    // Producto vectorial
    public VectorTridimensional productoVectorial(VectorTridimensional v) {
        double x = this.b * v.c - this.c * v.b;
        double y = this.c * v.a - this.a * v.c;
        double z = this.a * v.b - this.b * v.a;
        return new VectorTridimensional(x, y, z);
    }

    // Proyección de este vector sobre otro
    public VectorTridimensional proyeccionSobre(VectorTridimensional v) {
        double denom = v.longitud() * v.longitud();
        if (denom == 0) {
            return new VectorTridimensional(0, 0, 0);
        }
        double escalar = this.productoEscalar(v) / denom;
        return v.escalar(escalar);
    }

    // Componente paralela  vector sobre v
    public VectorTridimensional componenteParalela(VectorTridimensional v) {
        return this.proyeccionSobre(v);
    }

    // Componente perpendicular vector respecto a v
    public VectorTridimensional componentePerpendicular(VectorTridimensional v) {
        return this.resta(this.proyeccionSobre(v));
    }

    // Verifica ortogonalidad usando producto escalar
    public boolean esOrtogonal(VectorTridimensional v) {
        double dot = this.productoEscalar(v);
        return Math.abs(dot) < 1e-9;
    }

    // Verifica ortogonalidad usando diagonales: |a+b| == |a-b|
    public boolean esOrtogonalPorDiagonales(VectorTridimensional v) {
        double suma = this.suma(v).longitud();
        double resta = this.resta(v).longitud();
        return Math.abs(suma - resta) < 1e-9;
    }

    // Representación en cadena
    @Override
    public String toString() {
        return "(" + a + ", " + b + ", " + c + ")";
    }
}
