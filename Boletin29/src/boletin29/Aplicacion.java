/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author dreylopez
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        ArrayList<Barcos> lista = new ArrayList<Barcos>();
        int opcion = 0;
        int aux1, aux2, aux3, aux4, aux5, aux6;// Variables auxiliares para los menus

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elige tipo de embarcación\n1-Velero\n2-Deportiva\n3-Yate\n4-Diferencia de fechas\n0-Salir"));
            switch (opcion) {
                case 1:
                    aux1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de alquiler"));
                    aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el mes de alquiler"));
                    aux3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dia de alquiler"));
                    aux4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la eslora de la embarcación"));
                    aux5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce numero de mastiles"));

                    Barcos Vel = new Velero(aux3,aux4);
                    lista.add(Vel);
                    JOptionPane.showMessageDialog(null, "El precio de alquiler será \n" + Vel.calculo());
                    for (int i = 0; i < lista.size(); i++) {
                     JOptionPane.showMessageDialog(null, "El tikect es\n" + lista.toString());
                    }
 
                    
                    break;
                case 2:
                    aux1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de alquiler"));
                    aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el mes de alquiler"));
                    aux3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dia de alquiler"));
                    aux4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la eslora de la embarcación"));
                    aux5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la potencia"));
                    Barcos depor = new Deportiva(aux4, aux5);
                    lista.add(depor);
                    JOptionPane.showMessageDialog(null, "El precio de alquiler será \n" + depor.calculo());

                    break;
                case 3:
                    aux1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de alquiler"));
                    aux2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el mes de alquiler"));
                    aux3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el dia de alquiler"));
                    aux4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la eslora de la embarcación"));
                    aux5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la potencia de la embarcación"));
                    aux6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce numero de camarotes"));

                    Barcos yat = new Yate(aux4, aux5, aux6);
                    lista.add(yat);
                    JOptionPane.showMessageDialog(null, "El precio de alquiler será \n" + yat.calculo());

                    break;

                case 0:
                default:
                    opcion = 0;
                    JOptionPane.showMessageDialog(null, "Adios");

            }
        } while (opcion != 0);
    }

}
