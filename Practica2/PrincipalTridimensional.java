/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Doghy
 */
public class PrincipalTridimensional {
    public static void main(String[] args) {
        VectorTridimensional v1 = new VectorTridimensional(3, 4, 0);
        VectorTridimensional v2 = new VectorTridimensional(4, -3, 0);

        System.out.println("Vector v1 = " + v1);
        System.out.println("Vector v2 = " + v2);

        System.out.println("Suma v1 + v2 = " + v1.suma(v2));
        System.out.println("Resta v1 - v2 = " + v1.resta(v2));
        System.out.println("Escalar 2 * v1 = " + v1.escalar(2));

        System.out.println("Longitud de v1 = " + v1.longitud());
        System.out.println("Normal de v1 = " + v1.normal());

        System.out.println("Producto escalar v1 a v2 = " + v1.productoEscalar(v2));
        System.out.println("Producto vectorial v1 a v2 = " + v1.productoVectorial(v2));

        System.out.println("Proyeccion de v1 sobre v2 = " + v1.proyeccionSobre(v2));
        System.out.println("Componente paralela de v1 sobre v2 = " + v1.componenteParalela(v2));
        System.out.println("Componente perpendicular de v1 sobre v2 = " + v1.componentePerpendicular(v2));

        System.out.println("v1 ortogonal a v2 " + v1.esOrtogonal(v2));
        System.out.println("v1 ortogonal a v2 " + v1.esOrtogonalPorDiagonales(v2));
    }
}
