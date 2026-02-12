package programas;
import javax.swing.JOptionPane;

public class OperacionesBasicas {

    public static void main(String[] args) {
        double valor1, valor2;
        String menu, opcion;

        menu = "===== MENU DE OPERACIONES =====\n" +
               "1) Suma\n" +
               "2) Resta\n" +
               "3) Multiplicacion\n" +
               "4) Division\n" +
               "5) Modulo\n" +
               "6) Potencia\n" +
               "7) Raiz cuadrada\n" +
               "Elegir opcion:";

        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion) {
            case "1":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
                JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 + valor2));
                break;

            case "2":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
                JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 - valor2));
                break;

            case "3":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
                JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 * valor2));
                break;

            case "4":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
                if (valor2 != 0) {
                    JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 / valor2));
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                }
                break;

            case "5":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
                if (valor2 != 0) {
                    JOptionPane.showMessageDialog(null, "Resultado: " + (valor1 % valor2));
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede sacar modulo con cero");
                }
                break;

            case "6":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 1"));
                valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor 2"));
                JOptionPane.showMessageDialog(null, "Resultado: " + Math.pow(valor1, valor2));
                break;

            case "7":
                valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor"));
                if (valor1 >= 0) {
                    JOptionPane.showMessageDialog(null, "Resultado: " + Math.sqrt(valor1));
                } else {
                    JOptionPane.showMessageDialog(null, "No se puede sacar raiz de un numero negativo");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
    }
}
