
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author play_
 */
public class Eureka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra;
        Scanner leer = new Scanner(System.in);
                
        System.out.println("Ingrese una palabra");
        palabra = leer.nextLine();
        
        if(palabra.equalsIgnoreCase("eureka")){
            System.out.println("Correcto!!!!!");
            
        }else{
            System.out.println("Incorrecto");
        }
    }
}
