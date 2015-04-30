/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import boletin29.PropiaExcepcion;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author dreylopez
 */
public class Embarcacion {

    private int eslora;

    public Embarcacion() {
    }

    public Embarcacion(int eslora) {
        this.eslora = eslora;
    }

    public int calculo(int year, int mes, int dia)throws PropiaExcepcion {
        Calendar ca1 = new GregorianCalendar();
        
        ca1.set(year, mes - 1, dia);
        GregorianCalendar ca2 = new GregorianCalendar();
        long dias = (ca2.getTimeInMillis() - ca1.getTimeInMillis()) / 1000 / 60 / 60 / 24;
        if (dias < 0) {
            throw new PropiaExcepcion("No se pueden introducir días posteriores a la fecha actual");
        }
        int precio = (int) dias * ((10 * getEslora()));
        return precio;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
}