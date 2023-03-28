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
public class Centigrados {

    /**
     * @param args the command line arguments
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente 
     * en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Ingrese temperatura en centigrados y le devolveremos Fahrenheit:");
       float centigrados = new Scanner(System.in).nextFloat();
       
       float f = 32 + (9 * centigrados / 5);
       
       System.out.println("La ° en centigrados es: " + centigrados + " y en Farenheit es: " + f );
       
       
    }
    
}
