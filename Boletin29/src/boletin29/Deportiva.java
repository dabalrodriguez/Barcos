
package boletin29;

import javax.swing.JOptionPane;




public class Deportiva extends Barcos {

    private int potencia;

    public Deportiva() {
        super();
    }

    public Deportiva(int eslora, int potencia) {
        super(eslora);
        this.potencia = potencia;

    }

    public int calculo() {
      int dias;
      dias=Integer.parseInt(JOptionPane.showInputDialog("Dias"));
        
        int precio = (int) dias * (10 * getEslora() + potencia);
        return precio;

    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Matrícula: " + super.getMatricula() + "\n Eslora: " + super.getEslora() + "Alquiler: " + super.getAlquiler() + "Días" + super.getDias() + "Potencia: " + potencia;
    }
    

    
}