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
public class Numeros {

    /**
     * @param args the command line arguments
     * Escribir un programa que lea un número entero por teclado y muestre por 
     * pantalla el doble, el triple y la raíz cuadrada de ese número. 
     *   Nota: investigar la función Math.sqrt().
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese un número");
       float num = new Scanner(System.in).nextFloat();
       
       float doble = num * 2;
       float triple = num * 3;
       double raiz = Math.sqrt(num);
               
       System.out.println("El doble de " + num + " es:  " + doble + " triple: " + triple + " raiz: " + raiz );
    }
    
}
