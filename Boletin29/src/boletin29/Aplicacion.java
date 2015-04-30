
package boletin29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;


public class Aplicacion {

   
    public static void main(String[] args) {
        ArrayList<Barcos> lista = new ArrayList<Barcos>();
        int opcion = 0;
        int aux1, aux2, aux3, aux4, aux5, aux6, aux7;// Variables auxiliares para los menus

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige tipo de embarcación\n1-Velero\n2-Deportiva\n3-Yate\n4-Diferencia de fechas\n0-Salir"));
            switch (opcion) {
                case 1:
                    aux1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la matrícula"));
                    aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dia de alquiler"));
                    aux3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el mes de alquiler"));
                    aux4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de alquiler"));
                    aux5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la eslora"));
                    aux6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce numero de mastiles"));
                    
                    Barcos Vel = new Velero(aux2,aux5);
                    lista.add(Vel);
                    JOptionPane.showMessageDialog(null, "El precio de alquiler será \n" + Vel.calculo());
                    JOptionPane.showMessageDialog(null, "El ticket es: " + Vel.toString());
 
                    
                    break;
                case 2:
                    
                    aux1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la matrícula"));
                    aux3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dia de alquiler"));
                    aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el mes de alquiler"));
                    aux6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de alquiler"));
                    aux4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la eslora de la embarcación"));
                    aux5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la potencia"));
                    Barcos depor = new Deportiva(aux4, aux5);
                    lista.add(depor);
                    JOptionPane.showMessageDialog(null, "El precio de alquiler será \n" + depor.calculo());
                    JOptionPane.showMessageDialog(null, "El ticket es: " + depor.toString());
                    break;
                case 3:
                    aux7 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la matrícula"));
                    aux1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de alquiler"));
                    aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el mes de alquiler"));
                    aux3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dia de alquiler"));
                    aux4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la eslora de la embarcación"));
                    aux5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la potencia de la embarcación"));
                    aux6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce numero de camarotes"));

                    Barcos yat = new Yate(aux4, aux5, aux6);
                    lista.add(yat);
                    JOptionPane.showMessageDialog(null, "El precio de alquiler será \n" + yat.calculo());
                    JOptionPane.showMessageDialog(null, "El ticket es: " + yat.toString());
                    break;

                case 0:
                default:
                    opcion = 0;
                    JOptionPane.showMessageDialog(null, "Hasta luego");

            }
        } while (opcion != 0);
    }

}
