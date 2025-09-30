/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4.Ejercicio1;

/**
 *
 * @author Doghy
 */
public class EmpleadoTiempoCompleto extends Empleado {

    private double salarioAnual;

    public EmpleadoTiempoCompleto(String nombre, double salarioAnual) {
        super(nombre);
        this.salarioAnual = salarioAnual;
    }

    @Override
    public double CalcularSalarioMensual() {
        return salarioAnual / 12.0;
    }

    @Override
    public String toString() {
        return super.toString() + ", Salario Anual: " + salarioAnual;
    }
}
