/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3_1;

/**
 *
 * @author Doghy
 */
public class Juego {
    protected int numeroDeVidas;
    private int record;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        // Reinicia las vidas al número inicial
        // Aquí se puede usar numeroDeVidas directamente
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("¡Nuevo récord! Vidas restantes: " + record);
        }
    }

    public boolean quitaVida() {
        numeroDeVidas--;
        return numeroDeVidas > 0;
    }
}