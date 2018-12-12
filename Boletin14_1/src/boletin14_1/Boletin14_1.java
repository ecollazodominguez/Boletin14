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
public class Boletin14_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        ConversorTemperaturas c1 = new ConversorTemperaturas();
        
        try{
            c1.centigradosAFharenheit();
            c1.centrigradosAReamur();
        } catch (TemperaturaErradaExcepcion e1){
            JOptionPane.showMessageDialog(null, e1.getMessage());
        }
        
    }
    
}
