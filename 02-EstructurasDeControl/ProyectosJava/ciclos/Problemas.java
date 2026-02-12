package ciclos;

import javax.swing.JOptionPane;

public class Problemas {
        public static void main(String[] args) {
        String menu = "" , opcion="";
        boolean sentinel = true;


        menu = " ========= MENU ========\n" +
                "1)calcomanias\n" +
                "2)Opcion 2\n" +
                "3)Opcion 3\n" +
                "4)salir \n" +
                "elijir Opcion: ";
        do{
        // Mostrar menu
        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion.toUpperCase()) {
            case "1":
            case "A":
                int digito, amarillo = 0, rosa = 0, roja = 0, verde = 0,azul = 0;
                int n, i = 1;
                
            n = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de autos"));

            while (i <= n) {
                digito = Integer.parseInt(JOptionPane.showInputDialog("ingresa el ultimo digito de la placa" + i));
                if (digito == 1 || digito == 2) {
                    amarillo++;
                    
                } else if (digito == 3 || digito == 4) {
                    rosa++;
                    
                }else if (digito == 5 || digito == 6) {
                    roja++;
                    
                }else if (digito == 7 || digito == 8) {
                    verde++;
                    
                }else if (digito == 9 || digito == 0) {
                    azul ++;
                    
                }else{
                    JOptionPane.showMessageDialog(null, "digito no valido");
                    
                }
                i++;
                
            }
                JOptionPane.showMessageDialog(null, "Amarilla:"+ amarillo + 
                                                            "\nRosa:"+ rosa+
                                                             "\nRoja:"+ roja+
                                                             "\n verde: "+ verde+
                                                              "\n azul:"+ azul);
                break;
            case "2":
            case "B":
                  JOptionPane.showMessageDialog(null, "opcion 2");
                 break;
            case "3":
            case "C":
                   JOptionPane.showMessageDialog(null, "opcion 3");
                 break;
            case "4":
            case "S":
                   JOptionPane.showMessageDialog(null, "El programa ha terminado");
                    sentinel = false;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");    
        }
    }while(sentinel);
    


    }
    
}
    
