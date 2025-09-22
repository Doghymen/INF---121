/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3;

/**
 *
 * @author Doghy
 */
public class Juego {
    protected int numeroDeVidas;
    private int record;
    
    public Juego(int numeroDeVidas){
        this.numeroDeVidas = numeroDeVidas;
        this.record = 0;
    }
    
    public void reiniciarPartida(int numeroDeVidas){
        this.numeroDeVidas = numeroDeVidas;
    }
    
    public void actualizaRecord(){
        if (this.numeroDeVidas > this.record) {
            this.record = this.numeroDeVidas;
            System.out.println("Nuevo record vidas restantes:" + this.record);
        }
    }
    
    public boolean  quitaVida(){
        this.numeroDeVidas--;
        if (this.numeroDeVidas > 0) {
            return true;
        } else {
            return false;
        }
    }
}
