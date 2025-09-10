/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica_2;

/**
 *
 * @author Doghy
 */
public class PrincipalVector {
    public static void main (String[] args){
        AlgebraVectorial av = new AlgebraVectorial(3, 4);

        System.out.println("Perpendicularidad " + av.perpendicular(3, 4));
        System.out.println("Perpendicularidad " + av.perpendicular(3.0, 4, 1));

        System.out.println("Paralelo a = rb " + av.paralelo(3, 4));
        System.out.println("Paralelo a*b=0 " + av.paralelo(3, 4, true));

        System.out.println("Proyeccion de a sobre b: " + av.proyeccion(3, 4));
        System.out.println("Componente de a en direccion de b: " + av.componente(3, 4));
    }
}
