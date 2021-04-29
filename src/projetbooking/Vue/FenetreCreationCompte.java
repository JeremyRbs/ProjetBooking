package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class FenetreCreationCompte {

    JFrame frame;
    JPanel fieldPanel, mainPanel;
    JLabel name, email, password, label_creer;
    JTextField nameField, emailField, passwordField, countryCode;
    JButton bouton_creer;

    public FenetreCreationCompte()
    {
        frame = new JFrame("Booking - Créer un compte");

        //fieldPanel and its components
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

        //mainPanel and its components
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

        //final frame settings
        frame.setContentPane(mainPanel);
        frame.pack();
        centerFrame();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - frame.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - frame.getHeight()) / 2);
        frame.setLocation(x, y);
    }
}