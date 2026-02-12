package Paquetes;
/*Muestra un menú para convertir temperaturas de Celsius a Fahrenheit y de Fahrenheit a
Celsius. */

import javax.swing.JOptionPane;

public class Temperaturas {
    public static void main(String[] args) {
        int opcion;
        double temperatura, resultado;
        do {
            opcion= Integer.parseInt(JOptionPane.showInputDialog("1.celcuis a fahrenheit"+ "\n2.fahrenheit a celsuis"+ "\n3.salir"));
            switch (opcion) {
                case 1:
                    temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingresa la temperatura en celsuis"));
                    resultado = (temperatura* 9/5)+32;
                    JOptionPane.showMessageDialog(null, "temperatura en fahrenheit: "+ resultado);
                    break;
                case 2:
                       temperatura = Double.parseDouble(JOptionPane.showInputDialog("ingresa la temperatura en fahrenheit"));
                    resultado = (temperatura-32)*5 / 9;
                    JOptionPane.showMessageDialog(null, "temperatura en celsuis: "+ resultado);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "saliendo del programa");
                    
                    break;
                default:
                    break;
            }
        } while (opcion !=3);
    }

    
}
