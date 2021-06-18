/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel.ConnectionPanel;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
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
public class CreationAccountPanel extends JPanel {
    
    /////// Panneau de création de compte ///////
    private JPanel phonePanel, fieldPanel, creationAccountPanel;
    private JLabel name, firstName, email, password, mobile, l_register;
    private JTextField nameField, firstNameField, emailField, passwordField, mobileField, countryCode;
    private JButton b_register,
            b_back = new JButton("Retour");
    
    public CreationAccountPanel(){
        
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        //phonePanelcreationAccountPanel et ses composants
        phonePanel = new JPanel();
        phonePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        mobileField = new JTextField(15);
        countryCode = new JTextField(2);
        countryCode.setText("+33");
        countryCode.setEnabled(false);
        phonePanel.add(countryCode);
        phonePanel.add(mobileField);

        //fieldPanel_creationAccountPanel et ses composants
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        name = new JLabel("Nom : ");
        firstName = new JLabel("Prénom :");
        email = new JLabel("Email : ");
        password = new JLabel("Mot de passe : ");
        mobile = new JLabel("Téléphone : ");
        nameField = new JTextField(15);
        firstNameField = new JTextField(15);
        emailField = new JTextField(15);
        passwordField = new JTextField(15);
        fieldPanel.add(name);
        fieldPanel.add(nameField);
        fieldPanel.add(firstName);
        fieldPanel.add(firstNameField);
        fieldPanel.add(email);
        fieldPanel.add(emailField);
        fieldPanel.add(password);
        fieldPanel.add(passwordField);
        fieldPanel.add(mobile);
        fieldPanel.add(phonePanel);

        //creationAccountPanel et ses composants
        creationAccountPanel = new JPanel();
        creationAccountPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        creationAccountPanel.setLayout(new BoxLayout(creationAccountPanel, BoxLayout.Y_AXIS));
        
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        l_register = new JLabel("Créer un compte");
        l_register.setFont(font);
        l_register.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        b_register = new JButton("Créer un compte");
        b_register.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        creationAccountPanel.add(l_register);
        creationAccountPanel.add(fieldPanel);
        creationAccountPanel.add(b_register);
        b_back.setAlignmentX(Component.CENTER_ALIGNMENT);
        creationAccountPanel.add(b_back);
        
        Component add = add(this.creationAccountPanel);
        this.add(add);
        
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getFirstNameField() {
        return firstNameField;
    }

    public JTextField getEmailField() {
        return emailField;
    }

    public JTextField getPasswordField() {
        return passwordField;
    }

    public JTextField getMobileField() {
        return mobileField;
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
            case "Créer un compte" ->
                bouton = this.b_register;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
    
}
