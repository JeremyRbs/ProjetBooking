/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenetre extends JFrame implements ActionListener {

    ////////////////////////////////////////////////////////////////////////
    ///////////// Déclarations et initialisations des panneaux /////////////
    ////////////////////////////////////////////////////////////////////////
    
    /////// Bouton quitter pour fermer l'application ///////
    private JButton bouton_quitter = new JButton("Quitter");
    
    /////// Panneau courant ///////
    private JPanel panneauCourant = null;
    
    /////// Panneau de démarrage ///////
    private JPanel panneau = new JPanel(new BorderLayout());
    private JPanel mainPanelPanneau = new JPanel();
    private JButton bouton_creer_panneau = new JButton("Créer un compte");
    private JButton bouton_connecter_panneau = new JButton("Connexion");
    
    /////// Panneau de connexion de compte ///////
    private JPanel panneauConnexion = new JPanel(new BorderLayout());
    private JButton bouton_connexion_panneauConnexion = new JButton("Connection");
    
    /////// Panneau de création de compte ///////
    private JPanel panneauCreationCompte = new JPanel(new BorderLayout());
    private JButton bouton_creer_panneauCreationCompte = new JButton("Créer son compte");
    
    /////// Panneau du menu ///////
    private JPanel panneauPlanning = new JPanel(new BorderLayout());

    ////////////////////////////////////////////////////////////////////////
    ////////////////// Constructeur de la classe Fenetre ///////////////////
    ////////////////////////////////////////////////////////////////////////
    
    public Fenetre()
    {
        
        /////// Paramètres de la fenêtre ///////
        this.setTitle("Booking");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);
        this.centerFrame();
        ////////////////////////////////////////
        
        /////// Panneau de démarrage ///////
//        this.panneauCourant = this.panneau;
//        this.setContentPane(this.panneau);
        this.setPane(this.panneau);

        this.panneau.setLayout(new GridLayout(5,2,3,3));
        this.panneau.setBorder(BorderFactory.createEmptyBorder(250,250,50,250));

        // this.panneau et ses composants
        this.panneau.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        this.panneau.setLayout(new BoxLayout(this.panneau, BoxLayout.PAGE_AXIS));
        this.panneau.setBackground(Color.red);
        this.panneau.add(this.mainPanelPanneau);
        this.mainPanelPanneau.setBackground(Color.BLUE);
        
        /////// Différents boutons ///////
        
        // Bouton "Créer un compte"
        this.mainPanelPanneau.add(this.bouton_creer_panneau);
        this.bouton_creer_panneau.addActionListener(this);
        
        // Bouton "Se connecter"
        this.mainPanelPanneau.add(this.bouton_connecter_panneau);
        this.bouton_connecter_panneau.addActionListener(this);
        
        // Bouton "Quitter"
        this.bouton_quitter.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.panneau.add(this.bouton_quitter);
        this.bouton_quitter.addActionListener(this);
        
        this.panneauCreationCompte.add(this.bouton_creer_panneauCreationCompte);
        
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
        
        if(this.panneauCourant != null){
            
            this.getContentPane().remove(this.panneauCourant);
            this.repaint();
            System.out.println("ok");
            
        }
        
        this.getContentPane().add(pane);
        pane.validate();
        this.panneauCourant = pane;
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println(e.getActionCommand());
        switch (e.getActionCommand()){
            
        }
        // Si le bouton créer est cliqué
        if(e.getSource() == this.bouton_creer_panneau){
            setPane(this.panneauCreationCompte);
        }
        
        // Si le bouton créer est cliqué
        if(e.getSource() == this.bouton_quitter){
            System.exit(0);
        }
    }
}