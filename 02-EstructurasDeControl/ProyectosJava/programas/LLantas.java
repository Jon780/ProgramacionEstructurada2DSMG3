package programas;
import javax.swing.JOptionPane;

public class LLantas {
    public static void main(String[] args) {
        int cantidad;
        double precio = 0,total;

    cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de llantas:"));

    if (cantidad < 5) {
        precio = 300;
        
    } else if (cantidad >=5 && cantidad<10) {
        precio = 250;
        
    }else{
        precio = 200;
    }

    total = precio *cantidad;

    JOptionPane.showMessageDialog(null, "precion por llanta: $"+ precio +
                                   "\nTotal a pagar: $" + total);
}
    
}
