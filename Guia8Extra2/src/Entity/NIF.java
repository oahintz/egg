/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author play_
 */
public class NIF {
    
    //Atributos
    private long dni;
    private String letra;
    
    //Constructores
    public NIF() {
    }

    public NIF(long dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }
    
    
    //Setters & Getters
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    //Para mostrar datos
    @Override
    public String toString() {
        return "NIF{" + "dni=" + dni + ", letra=" + letra + '}';
    }
    
    
}
