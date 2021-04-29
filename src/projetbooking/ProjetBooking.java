/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking;

import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author jerem
 */
public class ProjetBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable() {
            
            @Override
            public void run(){
                
                Fenetre fenetre = new Fenetre();
                fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                fenetre.setVisible(true);
            }
        });
    }
    
}
