/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author dreylopez
 */
public abstract class Barcos {

    private int eslora;
    private  int dias;
    private String matricula;
    private String alquiler;

    public Barcos() {
    }

    public Barcos(int eslora) {
        this.eslora = eslora;
    }

    public int calculo() {
        int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias"));
        int precio = dias * (10 * getEslora());
        return precio;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }
}
