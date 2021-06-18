/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel.ConnectionPanel;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jerem
 */
public class ConnectionPanel extends JPanel{
    
    /////// Panneau de connexion de compte ///////
    private JPanel fieldPanel, connectionPanel;
    private JLabel email, password, l_register;
    private JTextField emailField, passwordField;
    private JButton b_register,
            b_back = new JButton("Retour");
    
    public ConnectionPanel(){
        
        //fieldPanel_connectionPanel et ses composants
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        email = new JLabel("Mail : ");
        password = new JLabel("Mot de passe : ");
        emailField = new JTextField(15);
        passwordField = new JTextField(15);
        fieldPanel.add(email);
        fieldPanel.add(emailField);
        fieldPanel.add(password);
        fieldPanel.add(passwordField);

        //connectionPanel et ses composants
        connectionPanel = new JPanel();
        connectionPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        connectionPanel.setLayout(new BoxLayout(connectionPanel, BoxLayout.Y_AXIS));
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        l_register = new JLabel("Se connecter");
        l_register.setFont(font);
        l_register.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_register = new JButton("Connexion");
        b_register.setAlignmentX(Component.CENTER_ALIGNMENT);
        //b_register_connectionPanel.addActionListener(this);
        connectionPanel.add(l_register);
        connectionPanel.add(fieldPanel);
        connectionPanel.add(b_register);
        b_back.setAlignmentX(Component.CENTER_ALIGNMENT);
        connectionPanel.add(b_back);
        Component add = add(this.connectionPanel);
        this.add(add);
        
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getPasswordField() {
        return passwordField;
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
            case "Retour" ->
                bouton = this.b_back;
            case "Connexion" ->
                bouton = this.b_register;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
    
}