/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4.Ejercicio1;

/**
 *
 * @author Doghy
 */
abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double CalcularSalarioMensual();

    public String toString() {
        return "Nombre: " + nombre;
    }
}
