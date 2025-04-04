/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.BuscaMinas.ControladorPartida;

import Backend.BuscaMinas.Tablero.Tablero;
import Backend.Jugador.Jugador;

/**
 *
 * @author kenny
 */
public class ControladorPartida {
    
    private Jugador jugador;
    private Tablero tablero;
    private int cantidadFilas;
    private int cantidadColumnas;
    private int cantidadMinas;
    private String nombreJugador;

    public ControladorPartida(int cantidadFilas, int cantidadColumnas, int cantidadMinas, String nombreJugador) {
        this.cantidadFilas = cantidadFilas;
        this.cantidadColumnas = cantidadColumnas;
        this.cantidadMinas = cantidadMinas;
        this.nombreJugador = nombreJugador;
        this.jugador = new Jugador();
        this.tablero = new Tablero();
    }
    
    //Metodo encargado de colocarDatos obtenidos.
    public void colocarDatos(){
        jugador.setNombreJugador(nombreJugador);
        tablero.setCantidadColumnasTablero(cantidadColumnas);
        tablero.setCantidadFilasTablero(cantidadFilas);
        tablero.setCantidadMinas(cantidadMinas);
    }
    
}
