package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class ikleenRegister extends JFrame implements ActionListener {

    private JPanel fieldPanel_connectionPanel, connectionPanel;
    private JLabel name_connectionPanel, password_connectionPanel, l_register_connectionPanel;
    private JTextField nameField_connectionPanel, passwordField_connectionPanel;
    private JButton b_register_connectionPanel;

    public ikleenRegister(){

        //fieldPanel_connectionPanel et ses composants
        fieldPanel_connectionPanel = new JPanel();
        fieldPanel_connectionPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel_connectionPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        name_connectionPanel = new JLabel("Nom : ");
        password_connectionPanel = new JLabel("Mot de passe : ");
        nameField_connectionPanel = new JTextField(15);
        passwordField_connectionPanel = new JTextField(15);
        fieldPanel_connectionPanel.add(name_connectionPanel);
        fieldPanel_connectionPanel.add(nameField_connectionPanel);
        fieldPanel_connectionPanel.add(password_connectionPanel);
        fieldPanel_connectionPanel.add(passwordField_connectionPanel);

        //connectionPanel et ses composants
        connectionPanel = new JPanel();
        connectionPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        connectionPanel.setLayout(new BoxLayout(connectionPanel, BoxLayout.Y_AXIS));
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        l_register_connectionPanel = new JLabel("Créer un compte");
        l_register_connectionPanel.setFont(font);
        l_register_connectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_register_connectionPanel = new JButton("Créer son compte");
        b_register_connectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        connectionPanel.add(l_register_connectionPanel);
        connectionPanel.add(fieldPanel_connectionPanel);
        connectionPanel.add(b_register_connectionPanel);

        //final frame settings
        this.setContentPane(connectionPanel);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}