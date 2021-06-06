/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import projetbooking.Vue.ikleenRegister;
import projetbooking.Vue.Cal;

/**
 *
 * @author Jerem
 */
public class IKleen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            Cal fenetre;
            fenetre = new Cal();
            fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetre.setVisible(true);
        });
        
    }
    
}