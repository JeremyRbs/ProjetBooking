package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class FenetreMenu extends Fenetre implements ActionListener {

    // Déclarations des champs privés
    JPanel fieldPanel, mainPanel;
    JButton bouton_creer, bouton_connecter, bouton_quitter;

    // Constructeur de la classe
    public FenetreMenu(String titre)
    {
        // Récupération de titre
        super(titre);
        
        // fieldPanel et ses composants
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(250,250,50,250));

        // mainPanel et ses composants
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        mainPanel.setBackground(Color.red);
        mainPanel.add(fieldPanel);
        fieldPanel.setBackground(Color.BLUE);
        
        /////// Différents boutons ///////
        
        // Bouton "Se créer un compte"
        bouton_creer = new JButton("Se créer un compte");
        fieldPanel.add(bouton_creer);
        bouton_creer.addActionListener(this);
        
        // Bouton "Se connecter"
        bouton_connecter = new JButton("Se connecter");
        fieldPanel.add(bouton_connecter);
        bouton_connecter.addActionListener(this);
        
        // Bouton "Quitter"
        bouton_quitter = new JButton("Quitter");
        bouton_quitter.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(bouton_quitter);
        bouton_quitter.addActionListener(this);

        // Rendre final les paramètres ajoutés
        this.setContentPane(mainPanel);
        this.pack();
        centerFrame();
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Méthode permettant de centrer la fenêtre
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    // Méthode permettant d'effectuer des actions suite à des évènements
    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Si le bouton créer est cliqué
        if(e.getSource() == this.bouton_creer){
               
            SwingUtilities.invokeLater(() -> {
                
                FenetreCreationCompte fenetre = new FenetreCreationCompte("Booking");
                fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                fenetre.setVisible(true);
                
            });
            
        // Si le bouton connecter est cliqué
        }else if(e.getSource() == this.bouton_connecter){
            
            SwingUtilities.invokeLater(() -> {
                
                FenetreMenuConnexion fenetre = new FenetreMenuConnexion("Booking");
                fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                fenetre.setVisible(true);
            
            });
            
        // Si le bouton quitter est cliqué
        }else if(e.getSource() == this.bouton_quitter){
            
            System.exit(0);
            
        }
    }
}