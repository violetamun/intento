/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intentobarajas;

import java.util.ArrayList;

/**
 *
 * @author estefania
 */
public class IntentoBarajas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//Creaa una baraja

        Baraja bar1 = new Baraja();

        bar1.setLista(bar1.crearBaraja());
//Muestra la Baraja 
        System.out.println("");
        System.out.println("Se creo la baraja");
        bar1.mostrarBaraja();

//Se crea una baraja nueva donde poner la mezclada
        Baraja barajaMezclada = new Baraja();
//Se mezcla la baraja
        barajaMezclada = bar1.mezclarBaraja(bar1);
//Se muestra la baraja mezclada
        System.out.println("");
        System.out.println("Se mezclo la baraja");
        barajaMezclada.mostrarBaraja();;

//Se crea una nueva baraja para colocar la cortada
        Baraja barCortada = new Baraja();
//Se corta la baraja 
        barCortada.setLista(barajaMezclada.cortarMazo(barajaMezclada.getLista()));
//Se muestra la baraja cortada
        System.out.println("");
        System.out.println("Se cortó la baraja");
        barCortada.mostrarBaraja();
//Crea dos jugadores

        //Crea un jugador
        Jugador jug1 = new Jugador();

        //reparte cartas al jugador
        jug1.getCartas().setLista(barCortada.repartir1(barCortada));
        System.out.println("----------------------------------------------------");
        System.out.println("Cartas jugador 1");
        System.out.println("");

        //Muestra las cartas del jugador
        jug1.getCartas().mostrarBaraja();

        Jugador jug2 = new Jugador();

        jug2.getCartas().setLista(barCortada.repartir2(barCortada));
        System.out.println("----------------------------------------------------");
        System.out.println("Cartas jugador 2");
        System.out.println("");
        jug2.getCartas().mostrarBaraja();

        Mesa mesa = new Mesa();

        mesa.getMesa().setLista(barCortada.repartirMesa(barCortada));
        System.out.println("----------------------------------------------------");
        System.out.println("Catas de la Mesa");
        System.out.println("");
        mesa.getMesa().mostrarBaraja();

        //vamos a intentar calcular el puntaje
        //Primero lleno el array "Cartas Levantadas" de cualquier cosa, por ejemplo de las cartas repartidas.
        jug1.setCartasLevantadas(jug1.getCartas());
        jug2.setCartasLevantadas(jug2.getCartas());
        //probamos si funciona mostrando el array de artasLevantadas
        System.out.println(" ");
        System.out.println("Cartas del array de levantdas jugador1");
        jug1.getCartasLevantadas().mostrarBaraja();
        System.out.println(" ");
        System.out.println("Cartas del array de levantdas jugador2");
        jug2.getCartasLevantadas().mostrarBaraja();

        //Contamos la cantidad de cartas de ese array
        jug1.getPuntaje().contarCartas(jug1);
        jug2.getPuntaje().contarCartas(jug2);

        //mostramos la cantidad de cartas
        System.out.println("");
        System.out.println("cantidad de cartas : " + jug1.getPuntaje().getCantidadCartas());
        System.out.println("");
        System.out.println("cantidad de cartas : " + jug2.getPuntaje().getCantidadCartas());

        //contamos los oros
        jug1.getPuntaje().contarOros(jug1);
        jug2.getPuntaje().contarOros(jug2);

        //mostramos la cantidad de oros
        System.out.println("");
        System.out.println("Cantidad de oros: " + jug1.getPuntaje().getCantidadOros());
        System.out.println("");
        System.out.println("Cantidad de oros: " + jug2.getPuntaje().getCantidadOros());

        //llenamos el array de sietes
        jug1.getPuntaje().armarArrayDeSietes(jug1);
        jug2.getPuntaje().armarArrayDeSietes(jug2);

        //mostramos el array de sietes
        System.out.println("");
        System.out.println("Sietes obtenidos: ");
        jug1.getPuntaje().getArraySietes().mostrarBaraja();
        System.out.println("");
        System.out.println("Sietes obtenidos: ");
        jug2.getPuntaje().getArraySietes().mostrarBaraja();

        //contamos los sietes
        jug1.getPuntaje().contarSietes(jug1);
        jug2.getPuntaje().contarSietes(jug2);

        //mostramos la cantidad de sietes
        System.out.println("");
        System.out.println("Cantidad de sietes: " + jug1.getPuntaje().getCantidadSietes());
        System.out.println("");
        System.out.println("Cantidad de sietes: " + jug2.getPuntaje().getCantidadSietes());

        //Puntaje final 
        jug1.getPuntaje().calcularPuntajeFinal(jug1, jug2);

        System.out.println("    "
                + "");
        System.out.println("Puntajes finales");
        System.out.println("Jugador 1: " + jug1.getPuntaje().getCantidadDePuntosObtenidos());
        System.out.println("");
        System.out.println("Jugador 2: " + jug2.getPuntaje().getCantidadDePuntosObtenidos());

    }

}
