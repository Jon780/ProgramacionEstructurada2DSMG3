package programas;
import javax.swing.JOptionPane;

public class Juego {
    public static void main(String[] args) {
        String respuesta;


    respuesta = JOptionPane.showInputDialog(null, "¿Java es un lenguaje de programacion");

    if (!respuesta.equalsIgnoreCase("si")) {
        JOptionPane.showMessageDialog(null, "Incorrecto. perdiste.");
        return;
        
    }

    respuesta = JOptionPane.showInputDialog(null, "La independencia de Mexico fue en 1810?");
    if (!respuesta.equalsIgnoreCase("si")) {
        JOptionPane.showMessageDialog(null, "Incorrecto. perdiste." );
        return;
        
    }
    
    respuesta = JOptionPane.showInputDialog(null, "Colon descubrio America?");
    if (!respuesta.equalsIgnoreCase("si")) {
        JOptionPane.showMessageDialog(null, "Incorrecto. perdiste.");
        
    } else {
        JOptionPane.showMessageDialog(null, "¡Felicidades! Ganaste");
        
       }      
    }
    
}
