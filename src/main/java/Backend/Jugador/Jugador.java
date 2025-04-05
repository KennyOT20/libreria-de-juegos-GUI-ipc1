/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Jugador;

/**
 *
 * @author kenny
 */
public class Jugador {
    
    private String nombreJugador;
    private int casillasDescubiertas;
    private int minasDescubiertas;
    private int disparosAcertados;
    private int disparosFallados;
    private int tiempoBuscaminas;

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getCasillasDescubiertas() {
        return casillasDescubiertas;
    }

    public void setCasillasDescubiertas(int casillasDescubiertas) {
        this.casillasDescubiertas = casillasDescubiertas;
    }

    public int getMinasDescubiertas() {
        return minasDescubiertas;
    }

    public void setMinasDescubiertas(int minasDescubiertas) {
        this.minasDescubiertas = minasDescubiertas;
    }

    public int getDisparosAcertados() {
        return disparosAcertados;
    }

    public void setDisparosAcertados(int disparosAcertados) {
        this.disparosAcertados = disparosAcertados;
    }

    public int getDisparosFallados() {
        return disparosFallados;
    }

    public void setDisparosFallados(int disparosFallados) {
        this.disparosFallados = disparosFallados;
    }

    public int getTiempoBuscaminas() {
        return tiempoBuscaminas;
    }

    public void setTiempoBuscaminas(int tiempoBuscaminas) {
        this.tiempoBuscaminas = tiempoBuscaminas;
    }
    
    
    
    
}
