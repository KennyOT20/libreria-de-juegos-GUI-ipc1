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

    
    //Metodo encargado de inicializar el tablero, sin minas
    public void mostrarTablero(){
        casilla = new Casilla[cantidadFilasTablero][cantidadColumnasTablero];
        
        for (int i = 0; i < cantidadFilasTablero; i++) {
            for (int j = 0; j < cantidadColumnasTablero; j++) {
               casilla[i][j] = new Casilla();
            }
        }
    }
    
    /**
     * metodo encargado de ir generando las casillas despues de que el usuario les de click, para
     * asi evitar que se pierda la partida rapido.
     * @param filaSinMina
     * @param columnaSinMina 
     */
    public void generarCasillas(int filaSinMina, int columnaSinMina){
        Random random = new Random();
        
        int minasColocadas = 0;
        
        while(minasColocadas < minasMax){
            int fila = random.nextInt(cantidadFilasTablero);
            int columna = random.nextInt(cantidadColumnasTablero);
            
            if(!casilla[fila][columna].esCasillaMinada() && !(fila == filaSinMina && columna == columnaSinMina )){
                casilla[fila ][columna].colocarMina();
                minasColocadas ++;
                
            }
            
        }
        
        calcularNumerosAdyacentes();
    }
    
    /**
     * Metodo encargado de iniciar el efecto domino
     * @param fila recibe desde el frontend la cantidad de filas
     * @param columna recibe desde el frontend la cantidad de columnas
     */
    public void generarEfectoDomino(int fila, int columna){
        boolean[][] casillaVisitada = new boolean[cantidadFilasTablero][cantidadColumnasTablero];
        revelarCasillas(fila, columna, casillaVisitada);
    }

    /**
     * Metodo encargado de ir revelando las casillas 
     * @param fila recibe la cantidad de filas desde el metodo generarEfectoDomino
     * @param columna recibe la cantidad de columnas desde el metodo generarEfectoDomino
     * @param casillaVisitada recibe un arreglo de booleams desder el metodo generarEfectoDomino
     */
    public void revelarCasillas(int fila, int columna, boolean[][] casillaVisitada){
        
        if(fila < 0 || fila >= cantidadFilasTablero || columna < 0 || columna >= cantidadColumnasTablero){
            return; 
        }
        
        Casilla casillaActual = casilla[fila][columna];
        casillaVisitada[fila][columna] = true;
        
        if(!casillaActual.casillaEstaRevelada() && !casillaActual.esCasillaMinada()){
            casillaActual.revelarCasilla();
            
        }
        
        if(casillaActual.getCantidadMinasAdyacentes() > 0){
            return;
        }
        
        for (int deltaX = 0; deltaX <= 1; deltaX++) {
            for (int deltaY = 0; deltaY <= 1; deltaY++) {
                if(deltaX != 0 || deltaY != 0){
                    int filaNueva = fila + deltaX;
                    int columnaNueva = columna + deltaY;
                    
                    if (filaNueva >= 0 && filaNueva < cantidadFilasTablero && columnaNueva >= 0 && columnaNueva < cantidadColumnasTablero &&
                !casillaVisitada[filaNueva][columnaNueva]) {
                revelarCasillas(filaNueva, columnaNueva, casillaVisitada);
                       }
                }
            }
        }
        
        
    }
    
    /**
     * Metodo encargado de ir calculando los numeros adyacentes de una casilla que contiene minas
     * al rededor 
     */
    public void calcularNumerosAdyacentes(){
        for (int i = 0; i < cantidadFilasTablero; i++) {
            for (int j = 0; j < cantidadColumnasTablero; j++) {
                
                if(casilla[i][j].esCasillaMinada()){
                    continue;
                }
                
                int contadorDeMinas = 0;
                
                for (int filaDiagonal = -1; filaDiagonal <= 1; filaDiagonal++) {
                    for (int columnaDiagonal = -1; columnaDiagonal <= 1 ; columnaDiagonal++) {
                        int filaAdyacente;
                        int columnaAdyacente;
                        
                        filaAdyacente = i + filaDiagonal;
                        columnaAdyacente = j + columnaDiagonal;
                        
                        if(filaAdyacente >= 0 && filaAdyacente < cantidadFilasTablero && columnaAdyacente >= 0 && columnaAdyacente < cantidadColumnasTablero){
                            if(casilla[filaAdyacente][columnaAdyacente].esCasillaMinada()){
                                contadorDeMinas ++;
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
                casilla[i][j].setCantidadMinasAdyacentes(contadorDeMinas);
            }
        }
        
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
