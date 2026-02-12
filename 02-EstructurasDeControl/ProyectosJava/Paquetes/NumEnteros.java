package Paquetes;

import javax.swing.JOptionPane;

/*Solicita números enteros hasta que el usuario ingrese un número negativo. Muestra la
suma total y cuántos números válidos se ingresaron. */
public class NumEnteros {
    public static void main(String[] args) {
        double numero;
        int validos = 0;
        int suma = 0;

    do {
        numero = Double.parseDouble(JOptionPane.showInputDialog("ingresa el numero"));
    if (numero >= 0) {
        suma += numero;
        validos++;
        
    } 
        
    } while (numero >= 0);
    JOptionPane.showMessageDialog(null, "suma total:"+ suma + 
                                         "\ntotal de numeros ingresados :"+ validos);

       
    }

    
}
