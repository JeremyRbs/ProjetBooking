package projetbooking.Vue.Panel.Room;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Component;
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
public class RoomPanel extends JPanel{
    
    /////// Panneau de connexion de compte ///////
    private JPanel roomPanel;
    private final static JButton b_create_roomPanel = new JButton("Créer une salle");
    private final static JButton b_edit_roomPanel = new JButton("Modifier une salle");
    private final static JButton b_remove_roomPanel = new JButton("Supprimer une salle");
            
    public RoomPanel(){
        
        //fieldPanel_connectionPanel et ses composants
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);

        //connectionPanel et ses composants
        roomPanel = new JPanel();
        roomPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        roomPanel.setLayout(new BoxLayout(roomPanel, BoxLayout.Y_AXIS));
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        b_create_roomPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        roomPanel.add(b_create_roomPanel);
        b_edit_roomPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        roomPanel.add(b_edit_roomPanel);
        b_remove_roomPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        roomPanel.add(b_remove_roomPanel);
        Component add = add(this.roomPanel);
        this.add(add);
        
    }
    
}
