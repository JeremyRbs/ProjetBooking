package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

public class Fenetre extends JFrame {

    private final JPanel fieldPanel, mainPanel;
    private JButton b_register;

    public Fenetre(String titre)
    {
        super(titre);

        //fieldPanel and its components
        fieldPanel = new JPanel();
        fieldPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));

        //mainPanel and its components
        mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(fieldPanel);

        //final this settings
        setContentPane(mainPanel);
//        this.pack();
        centerFrame();
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200,200);
    }

    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
}