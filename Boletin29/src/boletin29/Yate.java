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
public class Yate extends Barcos {

    private int potencia;
    private int camarotes;

    public Yate() {
        super();
    }

    public Yate(int eslora, int potencia, int camarotes) {
        super(eslora);
        this.potencia = potencia;
        this.camarotes = camarotes;

    }

    public int calculo(){
      int dias;
      dias=Integer.parseInt(JOptionPane.showInputDialog("Dias"));
        int precio = (int) dias * ((10 * getEslora()) + potencia + camarotes);
        return precio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "Yate{" + "potencia=" + potencia + ", camarotes=" + camarotes + '}';
    }

 
    

    
}
