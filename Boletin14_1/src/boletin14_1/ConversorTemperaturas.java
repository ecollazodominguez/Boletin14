/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14_1;

import javax.swing.JOptionPane;

/**
 *
 * @author ecollazodominguez
 */
public class ConversorTemperaturas {
    private final float temp = 80f;
    private float tempF;
    private float tempR;
    private float centigrados;
    
    public void centigradosAFharenheit() throws TemperaturaErradaExcepcion{
        centigrados = Float.parseFloat(JOptionPane.showInputDialog(null, "ºC"));
        
        if (centigrados < temp){
            throw new TemperaturaErradaExcepcion();
        } else {
        tempF = 9.0f/5.0f*centigrados+32.4f;
        JOptionPane.showMessageDialog(null, tempF + " F");
        }
    }
    public void centrigradosAReamur() throws TemperaturaErradaExcepcion{
        centigrados = Float.parseFloat(JOptionPane.showInputDialog(null, "ºC"));
                if (centigrados < temp){
            throw new TemperaturaErradaExcepcion();
        } else {
        tempR = 4.0f/5.0f*centigrados;
        JOptionPane.showMessageDialog(null, tempR + " Reamur");
                }
    }
}
