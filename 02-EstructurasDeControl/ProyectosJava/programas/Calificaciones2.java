package programas;
import javax.swing.JOptionPane;

public class Calificaciones2 {
    public static void main(String[] args) {
        double calif1, calif2,  calif3, promedio;
        final int NUM_CALIF = 3;


        calif1 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "introducela calificacion 1"));
        calif2 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "introducela calificacion 2"));
        calif3 = Double.parseDouble(
                JOptionPane.showInputDialog(
                        "introducela calificacion 3"));


        promedio = (calif1 + calif2 + calif3) / NUM_CALIF;

        if (promedio>=7.0){
            JOptionPane.showMessageDialog(null,
                    "aprobado");

        }else {
            JOptionPane.showMessageDialog(null,
                    "no aprobado");
        }

    }
}


