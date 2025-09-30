/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica4.Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Doghy
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empleado[] empleados = new Empleado[5];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre del empleado " + (i + 1) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese salario anual: ");
            double salarioAnual = sc.nextDouble();
            sc.nextLine();
            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
        }
        
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("================================================");
        System.out.println("\n Empleados que trabajan por horas ");
        for (int i = 3; i < 5; i++) {
            System.out.print("Ingrese nombre del empleado " + (i - 2) + ": ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese horas trabajadas: ");
            double horas = sc.nextDouble();
            System.out.print("Ingrese tarifa por hora: ");
            double tarifa = sc.nextDouble();
            sc.nextLine(); // limpiar buffer
            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
        }

        System.out.println("Datos de empleados y salarios mensuales");
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleado: " + empleados[i].nombre
                    + " | Salario Mensual: " + empleados[i].CalcularSalarioMensual());
        }

        sc.close();
    }
}
