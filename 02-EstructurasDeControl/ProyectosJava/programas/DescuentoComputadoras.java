package programas;
import javax.swing.JOptionPane;

public class DescuentoComputadoras {
    public static void main(String[] args) {
        int cantidad;
        double total, pago, descuento=0;
        double precio = 11000;


    cantidad = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de computadoras"));
    
    total = cantidad*precio;
    if (cantidad<5) {
        descuento= 0.10;
    } else if (cantidad>=5 && cantidad<10) {
        descuento=0.20;       
    }else{
        descuento=0.40;
    }
     pago = total - (total*descuento);
     JOptionPane.showMessageDialog(null, 
                                   "Total sin Descuento" + total +
                                   "\nDescuento aplicado"+ (descuento*100)+ "%"+
                                   "\nTotal a pagar: $"+ pago);
                                   
     }
    
}
