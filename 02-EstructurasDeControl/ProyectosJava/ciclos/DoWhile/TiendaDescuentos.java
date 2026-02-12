package ciclos.DoWhile;
/*En una tienda de descuento las personas que van a pagar el importe de su compra llegan a
la caja y sacan una bolita de color, que les dirá que descuento tendrán sobre el total de su
compra. Determinar la cantidad que pagara cada cliente desde que la tienda abre hasta que
cierra. Se sabe que si el color de la bolita es roja el cliente obtendrá un 40% de descuento;
si es amarilla un 25% y si es blanca no obtendrá descuento. */
import javax.swing.JOptionPane;
public class TiendaDescuentos {
    public static void main(String[] args) {
        double compra,total,descuento;
        String color;
        int cliente;

        do {
            compra = Double.parseDouble(JOptionPane.showInputDialog("ingresa el total de la compra"));
           
            color = JOptionPane.showInputDialog(
                    "Ingresa el color de la bolita (roja, amarilla, blanca):"
            ).toLowerCase();

        if (color.equalsIgnoreCase("roja")) {
            descuento = 0.40;
            
        } else if (color.equalsIgnoreCase("amarilla")) {
            descuento = 0.25;
            
        } else if (color.equalsIgnoreCase("blanca")) {
            descuento = 0;
            
        }else {
            JOptionPane.showMessageDialog(null, "color no valido");
            descuento = 0 ;
            
        }

        total = compra - (compra * descuento);

        JOptionPane.showMessageDialog(null, "compra sin descuento: $"+ compra + 
                                                                 "\ncompra con descuento: $"+ total + 
                                                                 "\n el descuento es: $"+ descuento );
        cliente = Integer.parseInt(JOptionPane.showInputDialog("hay mas clientes? \n1 si \n0 no"));
            
        } while (cliente == 1);
        JOptionPane.showMessageDialog(null, "adios");

        
    }

    
}
