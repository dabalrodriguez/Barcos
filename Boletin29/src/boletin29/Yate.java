
package boletin29;

import javax.swing.JOptionPane;



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
        return "Matrícula: " + super.getMatricula() + "\n Eslora: " + super.getEslora() + "Alquiler: " + super.getAlquiler() + "Días" + super.getDias() + "Potencia: " + potencia + "Potencia: " + camarotes;
    }

 
    

    
}
