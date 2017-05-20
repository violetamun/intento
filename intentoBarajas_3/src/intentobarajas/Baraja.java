/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentobarajas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * Esta clase pretende contener a todo conjunto de cartas, dentro de un array.
 * Ya sea la baraja completa, las cartas sobre la mesa, las cartas reepartidas a
 * los jugadores las cartas levntadas por los jugadores, etc. Cada vez que se
 * hable de un objeto baraja, es un conjunto de cartas.
 */
public class Baraja {

    public ArrayList<Cartas> Lista;

//constructor
    public Baraja() {
        ArrayList<Cartas> Lista=new ArrayList<>();
    }

    public Baraja(ArrayList<Cartas> Lista) {
        this.Lista = Lista;
    }

    public ArrayList<Cartas> getLista() {
        return Lista;
    }
//set y get

    public void setLista(ArrayList<Cartas> Lista) {
        this.Lista = Lista;
    }
    

 

    //método para crear una baraja completa y ordenaada
    public ArrayList<Cartas>  crearBaraja() {
        ArrayList<Cartas> baraja=new ArrayList<>();
        
        Cartas o1 = new Cartas("Oro", 1);
        Cartas e1 = new Cartas("Espada", 1);
        Cartas b1 = new Cartas("Basto", 1);
        Cartas c1 = new Cartas("Copa", 1);
        Cartas o2 = new Cartas("Oro", 2);
        Cartas e2 = new Cartas("Espada", 2);
        Cartas b2 = new Cartas("Basto", 2);
        Cartas c2 = new Cartas("Copa", 2);
        Cartas o3 = new Cartas("Oro", 3);
        Cartas e3 = new Cartas("Espada", 3);
        Cartas b3 = new Cartas("Basto", 3);
        Cartas c3 = new Cartas("Copa", 3);
        Cartas o4 = new Cartas("Oro", 4);
        Cartas e4 = new Cartas("Espada", 4);
        Cartas b4 = new Cartas("Basto", 4);
        Cartas c4 = new Cartas("Copa", 4);
        Cartas o5 = new Cartas("Oro", 5);
        Cartas e5 = new Cartas("Espada", 5);
        Cartas b5 = new Cartas("Basto", 5);
        Cartas c5 = new Cartas("Copa", 5);
        Cartas o6 = new Cartas("Oro", 6);
        Cartas e6 = new Cartas("Espada", 6);
        Cartas b6 = new Cartas("Basto", 6);
        Cartas c6 = new Cartas("Copa", 6);
        Cartas o7 = new Cartas("Oro", 7);
        Cartas e7 = new Cartas("Espada", 7);
        Cartas b7 = new Cartas("Basto", 7);
        Cartas c7 = new Cartas("Copa", 7);
        Cartas o10 = new Cartas("Oro", 10);
        Cartas e10 = new Cartas("Espada", 10);
        Cartas b10 = new Cartas("Basto", 10);
        Cartas c10 = new Cartas("Copa", 10);
        Cartas o11 = new Cartas("Oro", 11);
        Cartas e11 = new Cartas("Espada", 11);
        Cartas b11 = new Cartas("Basto", 11);
        Cartas c11 = new Cartas("Copa", 11);
        Cartas o12 = new Cartas("Oro", 12);
        Cartas e12 = new Cartas("Espada", 12);
        Cartas b12 = new Cartas("Basto", 12);
        Cartas c12 = new Cartas("Copa", 12);

        baraja.add(o1);
        baraja.add(e1);
        baraja.add(b1);
        baraja.add(c1);
        baraja.add(o2);
        baraja.add(e2);
        baraja.add(b2);
        baraja.add(c2);
        baraja.add(o3);
        baraja.add(e3);
        baraja.add(b3);
        baraja.add(c3);
        baraja.add(o4);
        baraja.add(e4);
        baraja.add(b4);
        baraja.add(c4);
        baraja.add(o5);
        baraja.add(e5);
        baraja.add(b5);
        baraja.add(c5);
        baraja.add(o6);
        baraja.add(e6);
        baraja.add(b6);
        baraja.add(c6);
        baraja.add(o7);
        baraja.add(e7);
        baraja.add(b7);
        baraja.add(c7);
        baraja.add(o10);
        baraja.add(e10);
        baraja.add(b10);
        baraja.add(c10);
        baraja.add(o11);
        baraja.add(e11);
        baraja.add(b11);
        baraja.add(c11);
        baraja.add(o12);
        baraja.add(e12);
        baraja.add(b12);
        baraja.add(c12);
return baraja; 
    }

//método para mostrar cualquier conjunto dde cartas. 

  public void mostrarBaraja() {
        for (Cartas p : Lista) {
            System.out.println(p.getNumero() + " de " + p.getPalo());

        }
    }

//metodo que recibe una baraja y la mezcla. Devuelve otra baraja

    public Baraja mezclarBaraja(Baraja baraja) {
        Baraja barajaMez = baraja;
        //   Baraja barajaMez = new Baraja();
        //   barajaMez = baraja;
        final long seed = System.nanoTime();
        Collections.shuffle(barajaMez.getLista(), new Random(seed));

        return barajaMez;

    }
    //método que recibe una baraja y la corta

     public ArrayList<Cartas> mezclarBaraja(ArrayList<Cartas> baraja) {

        ArrayList<Cartas> barajaMez = new ArrayList<Cartas>();
        barajaMez = baraja;
        final long seed = System.nanoTime();
        Collections.shuffle(barajaMez, new Random(seed));

        return barajaMez;

    }
    public ArrayList<Cartas> cortarMazo(ArrayList<Cartas> baraja) {

        ArrayList<Cartas> barajaCort = new ArrayList<Cartas>();

        //Genera aleatoriamente un número de corte entre 1 y 39
        int corte = (int) (Math.random() * 39 + 1);
        System.out.println("------------------");
        System.out.println(corte);
//desde donde se va a recorrer el array original
        int j = corte;
        //recorre desde el 0 hasta el corte, y va a signando al nuevo array los valores desde donde se recorre el segundo
        for (int i = 0; i < (40 - corte); i++) {
            barajaCort.add(baraja.get(j));
            j++;
        }

        System.out.println("Corte----------------------");

        //sigue asignando al nuevo array, pero como el original llego a cero empieza desdde el primero del original       
        for (int i = 0; i < (corte); i++) {
            barajaCort.add(baraja.get(i));

        }

        return barajaCort;

    }

    //método que recibe una baraja y reparte las cartas del jugador1
   
      
    public  ArrayList<Cartas>  repartir1 (Baraja barajaCortada){
     ArrayList<Cartas> mano= new ArrayList<>();
     
         
        for (int i = 1; i < 7; i++) {
            if (i%2==1) {
                
mano.add(barajaCortada.getLista().get(i-1));
            }
        }
        
        for (int i = 11; i < 41; i++) {
            if (i%2==1) {
                
            mano.add(barajaCortada.getLista().get(i-1));

            }
        }
        
        
     
     return mano;
    
    
}
    
      public  ArrayList<Cartas>  repartir2 (Baraja barajaCortada){
     ArrayList<Cartas> mano= new ArrayList<>();
     
        for (int i = 1; i < 7; i++) {
            if (i%2==0) {
                
            mano.add(barajaCortada.getLista().get(i-1));
            }
        }
                for (int i = 11; i < 41; i++) {
            if (i%2==0) {
                
            mano.add(barajaCortada.getLista().get(i-1));
            }
        }
   return mano;
   }
    
      
       public  ArrayList<Cartas>  repartirMesa (Baraja barajaCortada){
     ArrayList<Cartas> mano= new ArrayList<>();
     
        for (int i = 6; i < 10; i++) {
           mano.add(barajaCortada.getLista().get(i));
        }
   return mano;
   }
       
}
