/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jokenpo.Controller;

import javax.swing.JFrame;
import jokenpo.View.TelaPrincipal;

/**
 *
 * @author 291500474
 */
public class JoKenPo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TelaPrincipal j = new TelaPrincipal();

        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(1000, 1000);
        j.setVisible(true);
    }
    
}
