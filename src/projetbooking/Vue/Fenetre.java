/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Fenetre extends JFrame {

    // Déclarations des champs privés
    private final JPanel fieldPanel, mainPanel;
    private JButton b_register;

    // Constructeur de la classe
    public Fenetre(String titre)
    {
        // Récupération du titre
        super(titre);

        // fieldPanel et ses composants
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));

        // mainPanel et ses composants
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(fieldPanel);

        // Paramétrages finaux
        setContentPane(mainPanel);
//        this.pack();
        centerFrame();
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,200);
    }

    // Méthode permettant de centrer la fenêtre
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
}