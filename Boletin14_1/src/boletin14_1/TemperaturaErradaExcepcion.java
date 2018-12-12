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
public class TemperaturaErradaExcepcion extends Exception {
    public TemperaturaErradaExcepcion() {
        super ("La temperatura tiene que ser mayor de 80ºC");
    }
    public TemperaturaErradaExcepcion(String message){
        super(message);
    }

}

