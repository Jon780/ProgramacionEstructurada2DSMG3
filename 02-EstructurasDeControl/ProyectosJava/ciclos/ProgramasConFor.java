package ciclos;
/*
n calificaciones
en la materia de programacion.
*
*
*

* */

import javax.swing.JOptionPane;

public class ProgramasConFor {
    public static void main(String[] args) {
        String menu = "" , opcion="";
        boolean sentinel = true;
        int n = 0;
        double promedio = 0.0, calif = 0.0;


        menu = " ========= MENU PROGRAMAS CON FOR ========\n" +
                "1)calcular promedio\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)salir \n" +
                "elijir Opcion: ";
        do{
        // Mostrar menu
        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion.toUpperCase()) {
            case "1":
            case "A":
                n = Integer.parseInt(JOptionPane.showInputDialog("introduce el  numero de calificaciones "));
                if (n>0) {
                    for (int i = 1; i <= n; i++) {
                        calif = 
                                Double.parseDouble
                                        (JOptionPane.showInputDialog("introduce la calificacion" + i));
                        if (calif>= 0.0 && calif<=10.0) {
                        promedio=calif; //promedio = promedio + calif;
                        }else{
                            JOptionPane.showMessageDialog(null, "la calificacion no es valida");
                            i--;
                            continue;
                        }
                        
                    }
                    promedio/=n;
                    JOptionPane.showMessageDialog(null, "el promedio es :" + promedio);
                    
                }else{
                JOptionPane.showMessageDialog(null, "el numero de calificaciones no puede ser 0 y negativo");
                }
                break;
            case "2":
            case "B":
                  JOptionPane.showMessageDialog(null, "opcion 2");
                 break;
            case "3":
            case "C":
                   JOptionPane.showMessageDialog(null, "opcion 3");
                 break;
            case "4":
            case "S":
                   JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");    
        }
    }while(sentinel);
    
    }
    
}
