package ciclos;

import javax.swing.JOptionPane;

public class Obreros {
    
      public static void main(String[] args) {
        String menu = "" , opcion="";
        boolean sentinel = true;


        menu = " ========= MENU ========\n" +
                "1)salario \n" +
                "2)contar hombres y mujeres\n" +
                "3)Opcion 3\n" +
                "4)salir \n" +
                "elijir Opcion: ";
        do{
        // Mostrar menu
        opcion = JOptionPane.showInputDialog(menu);

        switch (opcion.toUpperCase()) {
            case "1":
            case "A":
                int obreros, i = 1;
                double salario, horas;
                obreros = Integer.parseInt(JOptionPane.showInputDialog("ingresa la cantidad de obreros"));

            while (i <= obreros) {
                horas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese horas trabajadas del obrero " + i)); 
                if (horas <= 40) {
                    salario = horas * 20;
                    
                } else {
                    salario = (40 * 20) + ((horas - 40) * 25);
                    
                }
                JOptionPane.showMessageDialog(null, "el salario seria :" + salario);
                i++;
                
            }
                JOptionPane.showMessageDialog(null, "opcion 1");
                break;
            case "2":
            case "B":
                int n, e =1;
                int hombres = 0, mujeres = 0;
                String sexo;
                n = Integer.parseInt(JOptionPane.showInputDialog("Cuantas personas hay en el grupo"));

                while (e <= n) {
                    sexo = JOptionPane.showInputDialog("cual es el sexo de el alumno"+ e +
                                                      "\n(H = hombres, M = mujeres)");
                 if (sexo.equalsIgnoreCase("H")) { 
                    hombres ++;
                    
                 } else if (sexo.equalsIgnoreCase("M")) {
                    mujeres++;
                 } else {
                    JOptionPane.showMessageDialog(null, "dato no valido ingresa otro dato");
                    continue;
                    
                 }
                 e++;
                    
                }

                  JOptionPane.showMessageDialog(null, "total de hombres:"+ hombres + 
                                                                 "\ntotal de mujeres:"+ mujeres );
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

