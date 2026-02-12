package programas;
 import javax.swing.JOptionPane;
public class calificaciones {
    
    public static void main(String[] args) {
        //declaracion de variables
        double calif1 = 0.0, calif2 = 0.0, calif3 = 0.0;
        double promedio = 0.0;
        //Entrada de los datos
        calif1 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion 1"));
        calif2 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion 2"));
        calif3 = Double.parseDouble(JOptionPane.showInputDialog("introduce la calificacion 3"));

        //operacion calcular promedio
        promedio = (calif1 + calif2 + calif3) / 3.0;

        if(promedio>=7.0) {
            JOptionPane.showMessageDialog(null,"Aprobado");



        }
    }
}

