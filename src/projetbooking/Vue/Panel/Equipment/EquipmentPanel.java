package projetbooking.Vue.Panel.Equipment;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jérémy RIBES
 */
public class EquipmentPanel extends JPanel{
    
    /////// Panneau de connexion de compte ///////
    private JPanel roomPanel;
    private final JButton b_create = new JButton("Créer un équipement");
    private final JButton b_edit = new JButton("Modifier un équipement");
    private final JButton b_remove = new JButton("Supprimer un équipement");
    private final JButton b_back = new JButton("Retour");
            
    /**
     * Constructeur de EquipmentPanel()
     * 
     */
    public EquipmentPanel(){
        
        //fieldPanel_connectionPanel et ses composants
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);

        //connectionPanel et ses composants
        roomPanel = new JPanel();
        this.roomPanel.setLayout(new GridLayout(8,1,3,3));
        roomPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        roomPanel.setLayout(new BoxLayout(roomPanel, BoxLayout.Y_AXIS));
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        JLabel space = new JLabel("-");
        JLabel space_2 = new JLabel("-");
        JLabel space_3 = new JLabel("-");
        b_create.setAlignmentX(Component.CENTER_ALIGNMENT);
        roomPanel.add(b_create);
        roomPanel.add(space);
        b_edit.setAlignmentX(Component.CENTER_ALIGNMENT);
        roomPanel.add(b_edit);
        roomPanel.add(space_2);
        b_remove.setAlignmentX(Component.CENTER_ALIGNMENT);
        roomPanel.add(b_remove);
        roomPanel.add(space_3);
        b_back.setAlignmentX(Component.CENTER_ALIGNMENT);
        roomPanel.add(b_back);
        Component add = add(this.roomPanel);
        this.add(add);
        
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
            case "Créer un équipement" ->
                bouton = this.b_create;
            case "Modifier un équipement" ->
                bouton = this.b_edit;
            case "Supprimer un équipement" ->
                bouton = this.b_remove;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
    
}
