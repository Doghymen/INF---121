/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3_1;

import java.util.Scanner;

/**
 *
 * @author Doghy
 */
public class JuegoAdivinaNumero extends Juego {

    private int numeroAAdivinar;

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }

    public void Juega() {
        this.numeroAAdivinar = (int) (Math.random() * 11);

        while (true) {
            Scanner partida = new Scanner(System.in);
            System.out.print("Ingrese un numero entre 0 y 10: ");
            int num = partida.nextInt();

            if (num == this.numeroAAdivinar) {
                System.out.println("Ganaste...");
                actualizaRecord();
                break;
            } else {
                if (quitaVida()) {
                    if (num < numeroAAdivinar) {
                        System.out.println("El numero es mayor. Te queda " + numeroDeVidas + " vidas.");
                    } else {
                        System.out.println("El numero es menor. Te queda " + numeroDeVidas + " vidas.");
                    }
                } else {
                    System.out.println("Perdiste. El numero era: " + numeroAAdivinar);
                    break;
                }
            }
        }
    }
}
