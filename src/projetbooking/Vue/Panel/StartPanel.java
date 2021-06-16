/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel;

import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jerem
 */
public class StartPanel {
    
    private JPanel currentPanel;
    private JLabel labelBooking = new JLabel("BOOKING");
    private JButton b_creation_startPanel;
    private JButton b_register_startPanel;
    
    /////// Bouton quitter pour fermer l'application ///////
    private JButton quitButton = new JButton("Quitter");
    
    public StartPanel(){
    
        //creationAccountPanel et ses composants
        currentPanel = new JPanel();
        currentPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        b_creation_startPanel = new JButton("Se créer un compte");
        b_register_startPanel = new JButton("Se connecter");
        
        currentPanel.add(b_creation_startPanel);
        currentPanel.add(b_register_startPanel);
        currentPanel.add(quitButton);
    }
    
}
