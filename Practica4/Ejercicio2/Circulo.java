/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4.Ejercicio1.Ejercicio2;

/**
 *
 * @author Doghy
 */
class Circulo extends Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        this.color = "Azul";
    }

    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo de radio " + radio + ", " + super.toString();
    }
}
