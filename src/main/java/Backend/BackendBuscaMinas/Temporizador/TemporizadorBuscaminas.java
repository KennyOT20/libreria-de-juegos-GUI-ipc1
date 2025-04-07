/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.BackendBuscaMinas.Temporizador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.Consumer;
import javax.swing.Timer;

/**
 *
 * @author kenny
 */
public class TemporizadorBuscaminas {
    
    private int segundos;
    private  Timer timer;
    private boolean temporizadorEncendido;
    private Consumer<String> actualizadorDeTiempo;

    //Constructor para iniciarlizar el temporizador
    public TemporizadorBuscaminas() {
        segundos = 0;
        temporizadorEncendido = false;
        
    }
    
    public void setActualizadorDeTiempo(Consumer<String> actualizador){
        this.actualizadorDeTiempo = actualizador;
    }

    public void iniciarTemporizador(){
        
        if(temporizadorEncendido == false ){
            timer = new Timer(1000, new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    segundos++;
                    
                 int minutosContados = segundos/60;
                 int segundosContados = segundos % 60;
                 String tiempoObtenido = String.format("%02d:%02d", minutosContados, segundosContados);
                    
                 if (actualizadorDeTiempo != null) {
                        actualizadorDeTiempo.accept(tiempoObtenido);
                    }
                 
                }
            });
            
            timer.start();
            temporizadorEncendido = true;
            
        }
        
    }
    
    public void finalizarTemporizador(){
        if(temporizadorEncendido == true){
            timer.stop();
            temporizadorEncendido = false;
        }
    }
    
    public void reiniciarTemporizador(){
        finalizarTemporizador();
        segundos = 0;
    }
    
    public int obtenerSegundosTemporizador(){
        return segundos;
    }
}
