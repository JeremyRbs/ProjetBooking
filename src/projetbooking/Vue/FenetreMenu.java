package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class FenetreMenu extends Fenetre {

    JPanel fieldPanel, mainPanel;
    JButton bouton_creer, bouton_connecter;

    public FenetreMenu(String titre)
    {
        
        super(titre);
        //fieldPanel and its components
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(250,250,50,250));

        //mainPanel and its components
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        bouton_creer = new JButton("Créer");
        bouton_creer.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(fieldPanel);
        mainPanel.add(bouton_creer);
        bouton_connecter = new JButton("Se connecter");
        bouton_connecter.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(bouton_connecter);

        //final this settings
        this.setContentPane(mainPanel);
        this.pack();
        centerFrame();
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
}