package programas;
import javax.swing.JOptionPane;

public class Estereo {
    public static void main(String[] args) {
        double precio, precioConDescuento, total;
        double descuento = 0;
        String marca;

        precio = Double.parseDouble(JOptionPane.showInputDialog("ingresa el precio:"));
        marca = JOptionPane.showInputDialog("ingrese la marca:");

        if (precio>= 2000) {
            descuento += 0.10; 
        }
        if (marca.equalsIgnoreCase("NOSY")) {
            descuento += 0.05;    
        }
        precioConDescuento = precio - (precio*descuento);
        total = precioConDescuento + (precioConDescuento * 0.16);

        JOptionPane.showMessageDialog(null, " precio sin descuento: $" + precio +
                                      "\nPrecio con descuento: $" + precioConDescuento +
                                      "\nTotal a pagar con IVA: $"+ total);
    }
    
}
