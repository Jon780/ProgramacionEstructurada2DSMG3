package programas;
import javax.swing.JOptionPane;

public class PlaneacionFinanciera {
    public static void main(String[] args) {
        double capital, nuevoSaldo,resto,insumos,incentivos;
        double prestamo = 0;
        double equipoComputo = 5000;
        double mobiliario = 2000;

    capital = Double.parseDouble(JOptionPane.showInputDialog("ingresa tu capital"));
     if (capital<0) {
        prestamo = 10000 - capital;
        
     } else if (capital>0 && capital<20000) {
        prestamo = 20000 - capital;
        
     }else{
        prestamo = 0;
     }
     nuevoSaldo = capital + prestamo;
     resto = nuevoSaldo - equipoComputo - mobiliario;
     incentivos = resto/ 2;
     insumos = resto/ 2;

    JOptionPane.showMessageDialog(null, "Capital actual: $" + capital +
                                 "\nPrestamo solicitado: $" + prestamo +      
                                  "\nSaldo actual: $" + nuevoSaldo +
                                  "\nDinero destinado a insumos: $" + insumos +
                                  "\nDinero destinado a incentivos: $" + incentivos );

    }
    
}
