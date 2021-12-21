/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peso;

import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Luna <lunapatrick29@gmail.com>
 */
public class Persona {

    //atributos
    // private hace que otros elementos de otras clases no puedan acceder  a esta 
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
// metodos

    public String getNombre() {// el metodo get establece valores 
        return nombre;
    }

    public void setNombre(String nombre) {//SET recibe u obtiene valores
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
// creamos un costructor 
    // inicialisamos la instancia de una clase 
    // para nombrar al constructor nesesito ponerle el mismo nombre de la clase 

    public Persona() {
        // puedo establecer funciones 
        JOptionPane.showInternalMessageDialog(null, "Hola soy un costructor");
    }
    // sobre carcarga de metodos 

    public Persona(String nombre) {
        this.nombre = nombre;
        JOptionPane.showInternalMessageDialog(null, "Hola " + getNombre());
    }
    // un metodo viene a ser un costructor o metodo de constructor 
    // calculo donde me permita establecer el valor de masa corporal 
    // determinar a traves de mensajes si es mayor o menor de edad 
    //tipo de acceso public esto quiere decir que todos tienen acceso 

    public String calcularMasa() {
        // siempre la priemra letra siempre debe de ir en minisculas y la otra en mayusculas por estandares
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual > 20 && pesoActual <= 25) {
            return "Este en el peso ideal ";

        } else if (pesoActual < 20) {
            return "Debajo del peso actual";
        } else {
            return "Encima de su peso ideal ";
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }

    public String datos() {
        String informacion = "Informacion de la persona \n" // contatenar
                + "Nombre: " + nombre + "\n"
                + "Edad: " + edad + "\n"
                + "Peso: " + peso + "\n"
                + "Altura: " + altura + "\n";
        // con el mas se concatena 
        return informacion;

    }

}
