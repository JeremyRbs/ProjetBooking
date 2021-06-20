package projetbooking.Vue.Panel.Booking;

import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jérémy RIBES
 */
public class AddBookingPanel extends JPanel {
    
    /////// Déclarations des variables privées ///////
    
    // JPanel
    private JPanel fieldPanel = new JPanel(),
            creationAccountPanel = new JPanel();
    
    // JLabel
    private JLabel dateLabel = new JLabel("Date (dd/mm/yyyy) : ");
    private JLabel heureLabel = new JLabel("        Heure : ");
    private JLabel salleLabel = new JLabel("        N° Salle : ");
    
    // JTextField
    private JTextField dateField = new JTextField(15);
    private JTextField salleField = new JTextField(10);
    
    //JComboBox
    private JComboBox combobox;
    
    //JButton
    private JButton b_add = new JButton("Ajouter la réservation"),
            b_back = new JButton("Retour");
    
    /**
     * Constructeur de AddBookingPanel()
     * 
     * @param niveau
     */
    public AddBookingPanel(int niveau){
        
        if(niveau == 3){
            b_back = new JButton("A - Retour");
        }
        
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);

        //fieldPanel_creationAccountPanel et ses composants
        this.fieldPanel = new JPanel();
        this.fieldPanel.setLayout(new GridLayout(1,2,3,3));
        this.fieldPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        this.fieldPanel.add(this.dateLabel);
        this.fieldPanel.add(this.dateField);
        
        // tableau de chaînes contenant des langages
        String s1[] = { "08:00", "08:30", "09:00", "09:30", "10:00",
                      "10:30", "11:00", "11:30", "12:00", "12:30",
                      "13:00", "13:30", "14:00", "15:30", "16:00",
                      "16:30", "17:00", "17:30", "18:00", "18:30"}; 
        
        combobox = new JComboBox(s1); 
        
        this.fieldPanel.add(this.heureLabel);
        this.fieldPanel.add(this.combobox);
        
        this.fieldPanel.add(this.salleLabel);
        this.fieldPanel.add(this.salleField);

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
     * Getter de dateField
     * @return 
     */
    public JTextField getDateField() {
        return dateField;
    }

    /**
     * Getter de combobox
     * @return 
     */
    public JComboBox getCombobox() {    
        return combobox;
    }

    /**
     * Getter de salleField
     * @return 
     */
    public JTextField getSalleField() {
        return salleField;
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
            case "A - Retour" ->
                bouton = this.b_back;
            case "Ajouter la réservation" ->
                bouton = this.b_add;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
    
    
   
}
