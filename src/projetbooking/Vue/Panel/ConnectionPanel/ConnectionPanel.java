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
    private JPanel fieldPanel_connectionPanel, connectionPanel;
    private JLabel email_connectionPanel, password_connectionPanel, l_register_connectionPanel;
    private JTextField emailField_connectionPanel, passwordField_connectionPanel;
    private JButton b_register_connectionPanel;
    
    public ConnectionPanel(){
        
        //fieldPanel_connectionPanel et ses composants
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        fieldPanel_connectionPanel = new JPanel();
        fieldPanel_connectionPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel_connectionPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        email_connectionPanel = new JLabel("Mail : ");
        password_connectionPanel = new JLabel("Mot de passe : ");
        emailField_connectionPanel = new JTextField(15);
        passwordField_connectionPanel = new JTextField(15);
        fieldPanel_connectionPanel.add(email_connectionPanel);
        fieldPanel_connectionPanel.add(emailField_connectionPanel);
        fieldPanel_connectionPanel.add(password_connectionPanel);
        fieldPanel_connectionPanel.add(passwordField_connectionPanel);

        //connectionPanel et ses composants
        connectionPanel = new JPanel();
        connectionPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        connectionPanel.setLayout(new BoxLayout(connectionPanel, BoxLayout.Y_AXIS));
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        l_register_connectionPanel = new JLabel("Se connecter");
        l_register_connectionPanel.setFont(font);
        l_register_connectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_register_connectionPanel = new JButton("Connexion");
        b_register_connectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        //b_register_connectionPanel.addActionListener(this);
        connectionPanel.add(l_register_connectionPanel);
        connectionPanel.add(fieldPanel_connectionPanel);
        connectionPanel.add(b_register_connectionPanel);
        Component add = add(this.connectionPanel);
        this.add(add);
        
    }

    public JTextField getEmailField_connectionPanel() {
        return emailField_connectionPanel;
    }

    public JTextField getPasswordField_connectionPanel() {
        return passwordField_connectionPanel;
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
            case "Connexion" ->
                bouton = this.b_register_connectionPanel;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
    
}