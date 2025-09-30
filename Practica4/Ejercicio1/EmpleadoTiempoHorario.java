/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4.Ejercicio1;

/**
 *
 * @author Doghy
 */
public class EmpleadoTiempoHorario extends Empleado {

    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoTiempoHorario(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double CalcularSalarioMensual() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public String toString() {
        return super.toString() + ", Horas trabajadas: " + horasTrabajadas + ", Tarifa por hora: " + tarifaPorHora;
    }
}
