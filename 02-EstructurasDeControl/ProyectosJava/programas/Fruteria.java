package programas;
import javax.swing.JOptionPane;

public class Fruteria {
    public static void main(String[] args) {
        
        double numKilos,Precio,subTotal,descuento,total;
        String porcentaje,salida;
        
        
    numKilos = Double.parseDouble(JOptionPane.showInputDialog("introduce el num. kilos"));
    Precio = Double.parseDouble(JOptionPane.showInputDialog("introduce el precio"));
    subTotal= numKilos*Precio;

    if (numKilos>=0.0 && numKilos<=2.0) {
        total=subTotal;
        porcentaje="o%";
        descuento=0.0;       
    }else if(numKilos>=2.01 && numKilos<=5.0){
        descuento=subTotal*0.10;
        total=subTotal-descuento;
        porcentaje="10%";
    }else if (numKilos>=5.01 && numKilos<=10.0) {
        descuento=subTotal*0.15;
        total=subTotal-descuento;
        porcentaje="15.0";
        
    }else{
        descuento=subTotal*0.20;
        total=subTotal-descuento;
        porcentaje="20%";
    } 
    
    salida="subtotal:" + subTotal+
           "\nDescuento:" + descuento+
           "\nPorcentaje:" + porcentaje+
           "\nTotal:" + total;

    JOptionPane.showMessageDialog(null, salida);



    }
}
