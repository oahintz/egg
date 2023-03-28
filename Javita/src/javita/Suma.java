/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javita;

import java.util.Scanner;

/**
 *
 * @author play_
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
            
            System.out.println("Ingrese dos números");
            
            int num1 = leer.nextInt();
            int num2 = leer.nextInt();
            int suma = num1 + num2;
            
            System.out.println("Esta es la suma de los 2 numeros " + suma);
    }
}

//Escribir un programa que pida dos números enteros por teclado y calcule la sum
//a de los dos. El programa deberá después mostrar el resultado de la suma


