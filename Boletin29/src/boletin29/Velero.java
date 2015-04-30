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
public  class   Velero extends Barcos {

    private  int mastiles;

    public Velero() {
        super();
    }

    public  Velero(int eslora, int mastiles) {
        super(eslora);
        this.mastiles = mastiles;
    }

    public  int calculo() {
        int dias ;
        dias=Integer.parseInt(JOptionPane.showInputDialog("Dias"));

        int precio = (int) dias * ((10 * getEslora()) + mastiles);
        return precio;

    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "mastiles=" + mastiles + "eslora "+super.getEslora();
    }
    

}
