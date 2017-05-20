/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentobarajas;

/**
 *
 * @author estefania
 */
public class Cartas {
    private String palo;
    private int numero; 

    public Cartas(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    
    
    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
