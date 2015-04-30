/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author dreylopez
 */
public class DifFechas extends JFrame {

    JFrame marco;
    JPanel pan;
    JLabel eti1;
    JLabel eti2;
    JLabel eti3;
    JLabel eti4;
    JTextField camp1;
    JTextField camp2;

    public DifFechas() {
        difFechas();
        setSize(800,600);
        add(pan);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void difFechas() {
        marco = new JFrame();
        
        pan = new JPanel();
        eti1 = new JLabel();
        eti2 = new JLabel();
        eti3 = new JLabel();
       
        camp1 = new JTextField();
        camp2 = new JTextField();
            pan.setLayout(null);
       

        eti1.setText("Fecha antigua");
        eti1.setBounds(20, 60, 100, 60);

        eti2.setText("Fecha actual");
        eti2.setBounds(20,100, 100, 60);
        
        eti3.setText("Diferencia");
        eti3.setBounds(20,250,100,60);
       
        camp1.setBounds(120,80,100,20);
        camp2.setBounds(120,120,100,20);
        pan.add(eti1);
        pan.add(eti2);
        pan.add(eti3);
        
        pan.add(camp1);
        pan.add(camp2);

       
        
        

    }

}