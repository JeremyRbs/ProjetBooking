/*
 * Cette page permet de créer un compte utilisateur de l'application. Elle utilise comme base la classe FenetreMenu.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class FenetreCreationCompte extends Fenetre {

    // Déclarations des champs privés
    private JFrame frame;
    private JPanel fieldPanel, mainPanel;
    private JLabel name, email, password, label_creer;
    private JTextField nameField, emailField, passwordField, countryCode;
    private JButton bouton_creer;

    // Constructeur de la classe
    public FenetreCreationCompte(String titre)
    {
        
        // Récupération du titre
        super(titre);
        frame = new JFrame("Booking - Créer un compte");

        // fieldPanel et ses composants
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        name = new JLabel("Nom: ");
        email = new JLabel("Mail: ");
        password = new JLabel("Mot de passe: ");
        nameField = new JTextField(15);
        emailField = new JTextField(15);
        passwordField = new JTextField(15);
        fieldPanel.add(name);
        fieldPanel.add(nameField);
        fieldPanel.add(email);
        fieldPanel.add(emailField);
        fieldPanel.add(password);
        fieldPanel.add(passwordField);

        // mainPanel et ses composants
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        label_creer = new JLabel("Créer un nouveau compte");
        label_creer.setFont(font);
        label_creer.setAlignmentX(Component.CENTER_ALIGNMENT);
        bouton_creer = new JButton("Créer");
        bouton_creer.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(label_creer);
        mainPanel.add(fieldPanel);
        mainPanel.add(bouton_creer);

        // Paramétrages finaux
        frame.setContentPane(mainPanel);
        frame.pack();
        centerFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    // Méthode permettant d'effectuer des actions suite à des évènements
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.bouton_creer){
               
            SwingUtilities.invokeLater(() -> {
                
                FenetrePlanning fenetre = new FenetrePlanning("Booking");
                fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                fenetre.setVisible(true);
                
            });
        }
    }
}