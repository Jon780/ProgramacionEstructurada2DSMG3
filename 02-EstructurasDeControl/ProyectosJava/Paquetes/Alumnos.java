package Paquetes;
/*Solicita el número de alumnos de un grupo y registra si cada uno está Presente (P) o
Ausente (A). Muestra el porcentaje de asistencia. */

import javax.swing.JOptionPane;

public class Alumnos {
    public static void main(String[] args) {
        int alumnos,P=0,A=0;
        String asistencia;
        double porcentaje;
    
    alumnos = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de alumnos"));
    for (int i = 1; i <= alumnos; i++) {
        asistencia = JOptionPane.showInputDialog("alumno"+i+ "\n(P) presente o (A) ausente");
        if (asistencia.equalsIgnoreCase("p")) {
            P++;
        } else {
            A++;
            
        }
        
    }
      porcentaje = (P*100)/alumnos;
      JOptionPane.showMessageDialog(null,"total de alumnos: "+alumnos+ 
                                    "\npresentes: "+P+ 
                                    "\nausentes: "+ A + 
                                    "\nporcentaje de asistencia: "+ porcentaje);


    }
    
}
