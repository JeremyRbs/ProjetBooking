package projetbooking.Vue.Panel.Room;

import java.awt.Component;
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
 * @author Jérémy RIBES
 */
public class AddRoomPanel extends JPanel {
    
    /////// Déclarations des variables privées ///////
    
    // JPanel
    private JPanel fieldPanel = new JPanel(),
            creationAccountPanel = new JPanel();
    
    // JLabel
    private JLabel nameLabel = new JLabel("Nom : "),
            tailleLabel = new JLabel("Taille (en m²) :"),
            equipementLabel = new JLabel("Équipement : ");
    
    // JTextField
    private JTextField nameField = new JTextField(15),
            tailleField = new JTextField(15),
            equipementField = new JTextField(15);
    
    //JButton
    private JButton b_add = new JButton("Ajouter la salle"),
            b_back = new JButton("Retour");
    
    /**
    * Constructeur de AddRoomPanel()
    */
    public AddRoomPanel(){
        
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);

        //fieldPanel_creationAccountPanel et ses composants
        this.fieldPanel = new JPanel();
        this.fieldPanel.setLayout(new GridLayout(3,2,3,3));
        this.fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        this.fieldPanel.add(this.nameLabel);
        this.fieldPanel.add(this.nameField);
        this.fieldPanel.add(this.tailleLabel);
        this.fieldPanel.add(this.tailleField);
        this.fieldPanel.add(this.equipementLabel);
        this.fieldPanel.add(this.equipementLabel);
        this.fieldPanel.add(this.equipementField);

        this.creationAccountPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        this.creationAccountPanel.setLayout(new BoxLayout(this.creationAccountPanel, BoxLayout.Y_AXIS));
        
        this.creationAccountPanel.add(this.fieldPanel);
        this.b_add.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.b_back.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.creationAccountPanel.add(this.b_add);
        this.creationAccountPanel.add(this.b_back);
        
        Component add = add(this.creationAccountPanel);
        this.add(add);
        
    }

    /**
    * Getter de nameField
    * @return 
    */
    public JTextField getNameField() {
        return nameField;
    }

    /**
    * Getter de tailleField
    * @return 
    */
    public JTextField getTailleField() {
        return tailleField;
    }

    /**
    * Getter de equipementField
    * @return 
    */
    public JTextField getEquipementField() {
        return equipementField;
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
            case "Ajouter la salle" ->
                bouton = this.b_add;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
   
}
