
package boletin29;

import javax.swing.JOptionPane;


public abstract class Barcos {

    private int eslora;
    private  int dias;
    private String matricula;
    private String alquiler;

    public Barcos() {
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(String alquiler) {
        this.alquiler = alquiler;
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
