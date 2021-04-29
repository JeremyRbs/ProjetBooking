/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Controller;

import projetbooking.Vue.FenetreMenu;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import projetbooking.Vue.Fenetre;
import projetbooking.Vue.FenetreCreationCompte;
import projetbooking.Vue.FenetreMenuConnexion;

/**
 *
 * @author jerem
 */
public class ProjetBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            FenetreMenu fenetre = new FenetreMenu("Booking");
            fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            fenetre.setVisible(true);
        });
    }
    
}
