/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue.Panel.Room;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jerem
 */
public class AddRoomPanel extends JPanel {
    
    /////// Panneau de création de compte ///////
    private JPanel phonePanel_creationAccountPanel, fieldPanel_creationAccountPanel, creationAccountPanel;
    private JLabel name_creationAccountPanel, firstName_creationAccountPanel, email_creationAccountPanel, password_creationAccountPanel, mobile_creationAccountPanel, l_register_creationAccountPanel;
    private JTextField nameField_creationAccountPanel, firstNameField_creationAccountPanel, emailField_creationAccountPanel, passwordField_creationAccountPanel, mobileField_creationAccountPanel, countryCode_creationAccountPanel;
    private JButton b_register_creationAccountPanel;
    
    public AddRoomPanel(){
        
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        //phonePanelcreationAccountPanel et ses composants
        phonePanel_creationAccountPanel = new JPanel();
        phonePanel_creationAccountPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        mobileField_creationAccountPanel = new JTextField(15);
        countryCode_creationAccountPanel = new JTextField(2);
        countryCode_creationAccountPanel.setText("+33");
        countryCode_creationAccountPanel.setEnabled(false);
        phonePanel_creationAccountPanel.add(countryCode_creationAccountPanel);
        phonePanel_creationAccountPanel.add(mobileField_creationAccountPanel);

        //fieldPanel_creationAccountPanel et ses composants
        fieldPanel_creationAccountPanel = new JPanel();
        fieldPanel_creationAccountPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel_creationAccountPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        name_creationAccountPanel = new JLabel("Nom : ");
        firstName_creationAccountPanel = new JLabel("Prénom :");
        email_creationAccountPanel = new JLabel("Email : ");
        password_creationAccountPanel = new JLabel("Mot de passe : ");
        mobile_creationAccountPanel = new JLabel("Téléphone : ");
        nameField_creationAccountPanel = new JTextField(15);
        firstNameField_creationAccountPanel = new JTextField(15);
        emailField_creationAccountPanel = new JTextField(15);
        passwordField_creationAccountPanel = new JTextField(15);
        fieldPanel_creationAccountPanel.add(name_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(nameField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(firstName_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(firstNameField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(email_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(emailField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(password_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(passwordField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(mobile_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(phonePanel_creationAccountPanel);

        //creationAccountPanel et ses composants
        creationAccountPanel = new JPanel();
        creationAccountPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        creationAccountPanel.setLayout(new BoxLayout(creationAccountPanel, BoxLayout.Y_AXIS));
        
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        l_register_creationAccountPanel = new JLabel("Créer un compte");
        l_register_creationAccountPanel.setFont(font);
        l_register_creationAccountPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        b_register_creationAccountPanel = new JButton("Créer un compte");
        b_register_creationAccountPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        creationAccountPanel.add(l_register_creationAccountPanel);
        creationAccountPanel.add(fieldPanel_creationAccountPanel);
        creationAccountPanel.add(b_register_creationAccountPanel);
        
        Component add = add(this.creationAccountPanel);
        this.add(add);
        
    }
   
}
