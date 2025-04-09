/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.BackendBuscaMinas.ControladorPartida;

import Backend.BackendBuscaMinas.Temporizador.TemporizadorBuscaminas;
import Backend.BackendBuscaMinas.componentesTablero.Casilla;
import Backend.BackendBuscaMinas.componentesTablero.Tablero;
import Backend.Jugador.Jugador;

/**
 *
 * @author kenny
 */
public class ControladorPartida {
    
    private Jugador jugador;
    private Tablero tablero;
    private Casilla casilla;
    private TemporizadorBuscaminas temporizador;

    public ControladorPartida(Jugador jugador, Tablero tablero, Casilla casilla, TemporizadorBuscaminas temporizador) {
        this.jugador = jugador;
        this.tablero = tablero;
        this.casilla = casilla;
        this.temporizador = temporizador;
    }
    
    public void comprobarEstadoPartida(boolean partidaGanada){
        if(partidaGanada){
            
            temporizador.finalizarTemporizador();
        } else if(!partidaGanada){
            temporizador.finalizarTemporizador();
            
        }
    }
    
}
