/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.BackendBuscaMinas.partidaBuscaminas;

import Backend.BackendBuscaMinas.componentesTablero.Tablero;
import Backend.Jugador.Jugador;

/**
 *
 * @author kenny
 */
public class Partida {
    
    private Jugador jugador;
    private Tablero tablero;

    public Partida(Jugador jugador, Tablero tablero) {
        this.jugador = jugador;
        this.tablero = tablero;
    }
    
    
    public void iniciarPartida(){
        
    }
}
