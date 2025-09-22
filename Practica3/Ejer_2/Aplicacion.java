/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3_1;

/**
 *
 * @author Doghy
 */
public class Aplicacion {
    public static void main(String[] args) {

        System.out.println("--- Juego Normal ---");
        JuegoAdivinaNumero juegoNormal = new JuegoAdivinaNumero(3);
        juegoNormal.Juega();

        System.out.println("--- Juego Numeros Pares ---");
        JuegoAdivinaPar juegoPar = new JuegoAdivinaPar(3);
        juegoPar.Juega();

        System.out.println("--- Juego Numeros Impares ---");
        JuegoAdivinaImpar juegoImpar = new JuegoAdivinaImpar(3);
        juegoImpar.Juega();
    }
}
