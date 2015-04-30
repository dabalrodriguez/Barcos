
package boletin29;

import javax.swing.JOptionPane;




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
        return "Matrícula: " + super.getMatricula() + "\n Eslora: " + super.getEslora() + "Alquiler: " + super.getAlquiler() + "Días" + super.getDias() + "Mástiles: " + mastiles;
    }
    

}
