/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3_1;

/**
 *
 * @author Doghy
 */
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    
    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    

    public boolean validaNumero(int numero) {
        if (numero < 0 || numero > 10) {
            return false; // fuera del rango
        }
        if (numero % 2 == 0) {
            System.out.println("Error: solo se permiten números impares.");
            return false;
        }
        return true;
    }
}
