package Paquetes;

import javax.swing.JOptionPane;

public class NumEnteroPrimo {
    public static void main(String[] args) {
        int numero;
        boolean esPrimo = true;

        numero = Integer.parseInt(
            JOptionPane.showInputDialog("Ingresa un número entero positivo:")
        );

        if (numero <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es primo.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " NO es primo.");
        }
    
}

    }
    

