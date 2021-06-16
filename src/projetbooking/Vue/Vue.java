/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projetbooking.Vue.Panel.ConnectionPanel;
import projetbooking.Vue.Panel.CreationAccountPanel;

public class Vue extends JFrame {

    ////////////////////////////////////////////////////////////////////////
    ///////////// Déclarations et initialisations des panneaux /////////////
    ////////////////////////////////////////////////////////////////////////
    
    /////// Bouton quitter pour fermer l'application ///////
    private JButton quitButton = new JButton("Quitter");
    
    /////// Panneau courant ///////
    private JPanel previousPanel = null;
    
    /////// Panneau de démarrage ///////
    private JPanel currentPanel;
    private JLabel labelBooking = new JLabel("BOOKING");
    private JButton b_creation_startPanel;
    private JButton b_register_startPanel;

    ////////////////////////////////////////////////////////////////////////
    ////////////////// Constructeur de la classe Fenetre ///////////////////
    ////////////////////////////////////////////////////////////////////////
    
    public Vue()
    {
        
        //////////////////////////////////////////////////
        
        ////////////////////////////////////
        /////// Panneau de démarrage ///////
        ////////////////////////////////////
        
        //creationAccountPanel et ses composants
        currentPanel = new JPanel();
        currentPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        b_creation_startPanel = new JButton("Se créer un compte");
        b_register_startPanel = new JButton("Se connecter");
        
        currentPanel.add(b_creation_startPanel);
        currentPanel.add(b_register_startPanel);
        currentPanel.add(quitButton);
        this.setPane(this.currentPanel);
   
        ////////////////////////////////////////
        /////// Paramètres de la fenêtre ///////
        ////////////////////////////////////////
        
        this.setTitle("Booking");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.centerFrame();
    }

    ////////////////////////////////////////////////////////////////////////
    ///////////////////// Méthodes de la classe Fenetre ////////////////////
    ////////////////////////////////////////////////////////////////////////
    
    // Méthode permettant de centrer la fenêtre
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
    
    public void setPane(JPanel pane){
        
        if(this.previousPanel != null){
            
            this.getContentPane().remove(this.previousPanel);
            this.repaint();
            
        }
        this.getContentPane().add(pane);
        this.setContentPane(pane);
        this.validate();
        this.pack();
        this.currentPanel = pane;
        this.repaint();
    }
    
    /**
     * Ajouter un écouteur à un bouton désigné par son nom
     *
     * @param nomBouton le nom du bouton sur lequel l'écouteur doit être ajouté
     * @param listener l'écouteur à ajouter
     */
    public void ajouterEcouteurBouton(String nomBouton, ActionListener listener) {
        JButton bouton;
        bouton = switch (nomBouton) {
            case "Se créer un compte" ->
                bouton = this.b_creation_startPanel;
            case "Se connecter" ->
                bouton = this.b_register_startPanel;
            case "Quitter" ->
                bouton = this.quitButton;
            case "Connexion" ->
                bouton = ConnectionPanel.getB_register_connectionPanel();
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
}