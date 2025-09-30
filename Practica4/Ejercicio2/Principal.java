/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4.Ejercicio1.Ejercicio2;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];

        for (int i = 0; i < figuras.length; i++) {
            int tipo = (int) (Math.random() * 2) + 1;

            if (tipo == 1) { // Cuadrado
                double lado = (Math.random() * 10) + 1;
                figuras[i] = new Cuadrado(lado);
            } else {
                double radio = (Math.random() * 10) + 1;
                figuras[i] = new Circulo(radio);
            }
        }

        // Mostrar datos de cada figura
        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + (i + 1) + ": " + figuras[i].toString());
            System.out.println("Area: " + figuras[i].area());
            System.out.println("Perimetro: " + figuras[i].perimetro());

            // Verificamos si implementa Coloreado
            if (figuras[i] instanceof Coloreado) {
                Coloreado c = (Coloreado) figuras[i];
                System.out.println("Coloeando los: " + c.comoColorear());
            }
        }
    }
}
