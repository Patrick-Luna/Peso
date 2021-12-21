package com.mycompany.peso;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import javax.swing.JOptionPane;

/**
 *
 * @author Patrick Luna <lunapatrick29@gmail.com>
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    // Crear un metodo main para que mande llamar al costructor 
    public static void main(String[] args) {
        //instancia mi clase

        Persona objeto = new Persona();
        //Nombre clase +objeto(variable)     

        // el showInputDialog retorna o regresa un string pero tenemos valores INT
        // la solucion es parcear PARSEINT  para que se cambie el valor de string por numero
        // aqui hay dos metdos el corto y el largo 
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre ");

        String edadS = JOptionPane.showInputDialog("Introduce tu edad ");
        int edad = Integer.parseInt(edadS);
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu peso "));

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Introduce tu altura "));

        objeto.setNombre(nombre);
        objeto.setEdad(edad);
        objeto.setPeso(peso);
        objeto.setAltura(altura);

        JOptionPane.showMessageDialog(null, objeto.datos() + "\n"
                + objeto.calcularMasa() + "\n" + objeto.esMayorDeEdad());
// click derecho = format ( restroctura el codigo)
    
    }
}
