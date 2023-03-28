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
public class MinusMayus {

    /**
     * @param args the command line arguments
     *         Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     *      Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
         
         System.out.print("Ingrese una frase:");
         
         String frase = new Scanner (System.in).nextLine();
         String mayus = frase.toUpperCase();
         System.out.println(mayus);
         System.out.println(frase.toLowerCase());
              
         
         
    }
    
}
