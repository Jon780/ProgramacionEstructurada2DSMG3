package Paquetes;
/*Muestra un menú con opciones para sumar, restar y multiplicar dos números. El menú
se repite hasta que el usuario decida salir. */

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
       int opcion;
        Double num1=0.0,num2=0.0;
        double suma,resta,multi;
        // Se solicita la opcion que va tomar
        
        do {
         opcion = Integer.parseInt(JOptionPane.showInputDialog("Que operacion deseas realizar \n1.suma, \n2.resta, \n3.multiplicacion, \n4.salir"));  
        
        switch (opcion) {
            // Suma
            case 1:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
            suma = num1 + num2;
            JOptionPane.showMessageDialog(null, "el resultado de la suma es:"+suma);
            break;
            // Resta
            case 2:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
                resta = num1 - num2;
                 JOptionPane.showMessageDialog(null, "el resultado de la resta es:"+resta);
            break;
            // Multiplicacion
            case 3:
                num1 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el primer numero"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("ingresa el segundo numero"));
                multi = num1*num2;
                 JOptionPane.showMessageDialog(null, "el resultado de la multiplicacion es:"+multi);
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "saliendo del programa");
                break;
        
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida elije otra");
                break;
        }
      } while (opcion != 4);
  }
    
}



