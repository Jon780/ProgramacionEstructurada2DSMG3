package programas;
import javax.swing.JOptionPane;

public class Expresiones {
    public static void main(String[] args) {

        int suma, resta, multi, div, mod;
        double potencia;
    

        String salida = "";

        // Expresiones aritméticas
        suma = 3 + 5;
        resta = 10 - 12;
        multi = 34 * 23;
        div = 10 / 2;
        mod = 10 % 2;
        potencia = Math.pow(4, 2);

        salida = "La suma es: " + suma +
                 "\nLa resta es: " + resta +
                 "\nLa multiplicacion es: " + multi +
                 "\nLa division es: " + div +
                 "\nEl modulo es: " + mod +
                 "\nLa potencia es: " + potencia;

        JOptionPane.showMessageDialog(null, salida);
    }
}
