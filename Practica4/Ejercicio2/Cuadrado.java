/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4.Ejercicio1.Ejercicio2;

/**
 *
 * @author Doghy
 */
class Cuadrado extends Figura implements Coloreado {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
        this.color = "Rojo";
    }

    @Override
    public double area() {
        return lado * lado;
    }

    @Override
    public double perimetro() {
        return 4 * lado;
    }

    @Override
    public String comoColorear() {
        return "Colorear los cuatro lados";
    }

    @Override
    public String toString() {
        return "Cuadrado de lado " + lado + ", " + super.toString();
    }
}
