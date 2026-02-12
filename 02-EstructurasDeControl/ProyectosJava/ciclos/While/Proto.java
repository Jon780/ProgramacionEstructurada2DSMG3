package ciclos.While;

import javax.swing.JOptionPane;

public class Proto {
    public static void main(String[] args) {
        String opcion = "";
        boolean sentinel = true ;
    do {
        
    
        opcion = obtenerMenu();
        switch (opcion) {
            case "1":{
                String bolita ="";
                String resultado = "== Resultado de ventas ==\n\n";
                do {
                    bolita = elegirbolita();
                    
                } while (bolita.equals("-1"));

            
           
                
                break;
            }
            case "2":{

            }
            case "3":{

            }
            case "4":{

            }
            default:   
        }
                 JOptionPane.showMessageDialog(null, "opcion no valida");
    } while (sentinel);
   }
    

public static String obtenerMenu() {
    String menu = " ========= MENU ========\n" +
                "1)Bolitas de descuento\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)salir \n" +
                "elijir Opcion: ";
                
            String opcion = JOptionPane.showInputDialog(menu);
            return opcion;



}
public static String elegirbolita() {
        String menu = " ========= MENU ========\n" +
                "1)Opcion 1\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)salir \n" +
                "elijir Opcion: ";
                
            String opcion = JOptionPane.showInputDialog(menu);




    switch (opcion) {
        case "1":
            opcion = "1";
            break;
        case "2":
            
            break;
            case "3":
            
            break;
            case "4":
            
            break;
            
        default:
            opcion = "-1";
    }
    return opcion;
  }
   
public static String calcularResultados() {
  double descuento = 0.0, importe = 0.0;
  double total = 0.0;
  String salida = "", bolita = "";
  boolean sentinel = true;
  int i = 1;

    do {
      do {
           importe = Double.parseDouble (JOptionPane.showInputDialog ("Introduce el importe o -1 para salir"));
         } while (importe <= 0 && importe != -1);

        if (importe == -1) {
      JOptionPane.showMessageDialog(null,
                               "Has terminado");
                 sentinel = false;
              } else {
                       bolita = elegirbolita();
             if (bolita.equals("1")) {
descuento = importe * .40;
total = importe - descuento;
} else if (bolita.equals("2")) {
descuento = importe * .25;
total = importe - descuento;
} else {
descuento = 0.0;
total = importe;
}

                         salida += "Cliente " + i +
                                "\nImporte: $" + importe +
                                "\nDescuento: $" + descuento +
                                "\nTotal: $" + total + "\n\n";
}
}while (sentinel);

return salida;
}
}

