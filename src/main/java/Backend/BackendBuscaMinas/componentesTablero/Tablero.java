/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.BackendBuscaMinas.componentesTablero;

import java.util.Random;

/**
 *
 * @author kenny
 */
public class Tablero {
    
    private Casilla[][] casilla;
    private int cantidadFilasTablero;
    private int cantidadColumnasTablero;
    private int cantidadMinas;
    private int minasMax;
    private String[][] tableroMinas;

    
    //Metodo encargado de inicializar el tablero, sin minas
    public void mostrarTablero(){
        tableroMinas = new String[cantidadFilasTablero][cantidadColumnasTablero];
        
        for (int i = 0; i < cantidadFilasTablero; i++) {
            for (int j = 0; j < cantidadColumnasTablero; j++) {
                tableroMinas[i][j] = " ";
                
            }
            
        }
        
    }
    
    /**
     * 
     * @param filaSinMina
     * @param columnaSinMina 
     */
    public void generarCasillas(int filaSinMina, int columnaSinMina){
        Random random = new Random();
        
        int minasColocadas = 0;
        
        while(minasColocadas < minasMax){
            int fila = random.nextInt(cantidadFilasTablero);
            int columna = random.nextInt(cantidadColumnasTablero);
            
            if(tableroMinas[fila][columna].equals(" ") && !(fila == filaSinMina && columna == columnaSinMina)){
                 tableroMinas[fila][columna] = "*";
                 minasColocadas++;
        
            }
            
        }
    }
    
    public void generarEfectoDomino(){
        
    }
    
    public void calcularNumeroAdyacentes(){
        
    }
 
    
    public Casilla getCasilla(int fila, int columna){
        return casilla[fila][columna];
    }

    public int getCantidadFilasTablero() {
        return cantidadFilasTablero;
    }

    public void setCantidadFilasTablero(int cantidadFilasTablero) {
        this.cantidadFilasTablero = cantidadFilasTablero;
    }

    public int getCantidadColumnasTablero() {
        return cantidadColumnasTablero;
    }

    public void setCantidadColumnasTablero(int cantidadColumnasTablero) {
        this.cantidadColumnasTablero = cantidadColumnasTablero;
    }

    public int getCantidadMinas() {
        return cantidadMinas;
    }

    public void setCantidadMinas(int cantidadMinas) {
        this.cantidadMinas = cantidadMinas;
    }

    public int getMinasMax() {
        return minasMax;
    }

    public void setMinasMax(int minasMax) {
        this.minasMax = minasMax;
    }

    
    
}
