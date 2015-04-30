   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author dreylopez
 */
public class Velero extends Embarcacion {

    private int mastiles;

    public Velero() {
        super();
    }

    public Velero(int eslora, int mastiles) {
        super(eslora);
        this.mastiles = mastiles;
    }

    public int calculo(int year, int mes, int dia) throws PropiaExcepcion {

        Calendar ca1 = new GregorianCalendar();
        ca1.set(year, mes - 1, dia);
        GregorianCalendar ca2 = new GregorianCalendar();
        long dias = (ca2.getTimeInMillis() - ca1.getTimeInMillis()) / 1000 / 60 / 60 / 24;
        if (dias < 0) {
            throw new PropiaExcepcion("No se pueden introducir días posteriores a la fecha actual");
        }
        int precio = (int) dias * ((10 * getEslora()) + mastiles);
        return precio;

    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    

}