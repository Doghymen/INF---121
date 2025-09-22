/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica3_1;

/**
 *
 * @author Doghy
 */
public class JuegoAdivinaPar extends JuegoAdivinaNumero{
    
    public JuegoAdivinaPar(int numeroDeVidas){
        super(numeroDeVidas);
    }
    
    @Override
    public boolean  validaNumero(int numero){
        if (numero < 0 || numero > 10) {
            return false;
        }
        
        if (numero % 2 == 0) {
            return true;
        } else{
            System.out.println("Error");
            return false;
        }
    }
}
