/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.BackendBuscaMinas.componentesTablero;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author kenny
 */
public class Casilla {
    
    private boolean casillaMinada;
    private boolean casillaRevelada;
    private int cantidadMinasAdyacentes;

    public void colocarMina(){
        this.casillaMinada = true;
    }

    public boolean esCasillaMinada(){
        return casillaMinada;
    }
    
    /**
     * Metodo encargado de que cuando el usuario da click derecho revele lo que tenga
     * la casilla
     */
    public void revelarCasilla(){
        this.casillaRevelada = true;
    }
    
    /**
     * Metodo encargado de ir colocanbdo una imagen de una bandera para que el usuario pueda bmarcar las casillas
     * que concidera si tiene mina
     * @param boton desde el frontend recibe el boton de las casillas
     */
   public void marcarCasilla(JButton boton) {
       
    if (boton.getIcon() != null) {
        boton.setIcon(null);
    } else {
        ImageIcon banderaImagen = new ImageIcon(getClass().getResource("/recursos/buscaminasBanderaBoton.png"));
        Image imagenEscalada = banderaImagen.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon banderaEscalada = new ImageIcon(imagenEscalada);
        boton.setIcon(banderaEscalada);
    }
    
    }


    
}
