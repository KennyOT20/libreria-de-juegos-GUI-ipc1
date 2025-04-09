/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.BackendBuscaMinas.componentesTablero;

/**
 *
 * @author Kenny
 */
public class Casilla {

    private boolean casillaMinada;
    private boolean casillaRevelada;
    private boolean casillaMarcada;
    private int cantidadMinasAdyacentes;

    public Casilla() {
        this.casillaMinada = false;
        this.casillaRevelada = false;
        this.casillaMarcada = false;
        this.cantidadMinasAdyacentes = 0;
    }

    public void colocarMina() {
        this.casillaMinada = true;
    }

    // Devuelve true si la casilla tiene una mina
    public boolean esCasillaMinada() {
        return casillaMinada;
    }

    // Revela la casilla 
    public void revelarCasilla() {
        if (!casillaRevelada && !casillaMarcada) {
            this.casillaRevelada = true;
        }
    }

    // Devuelve true si la casilla ya fue revelada
    public boolean casillaEstaRevelada() {
        return casillaRevelada;
    }

    // Devuelve la cantidad de minas adyacentes
    public int getCantidadMinasAdyacentes() {
        return cantidadMinasAdyacentes;
    }

    // Establece cuántas minas hay alrededor de esta casilla
    public void setCantidadMinasAdyacentes(int cantidadMinasAdyacentes) {
        this.cantidadMinasAdyacentes = cantidadMinasAdyacentes;
    }

    // Devuelve true si la casilla está marcada con bandera
    public boolean estaMarcada() {
        return casillaMarcada;
    }

    // Alterna entre marcada y no marcada
    public void alternarMarcado() {
        if (!casillaRevelada) {
            this.casillaMarcada = !this.casillaMarcada;
        }
    }

    // Forzar revelado de las minas cuando se incia
    public void revelarForzado() {
        this.casillaRevelada = true;
    }
}

