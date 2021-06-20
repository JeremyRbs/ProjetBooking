package projetbooking.error;

import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jérémy RIBES
 */
public class ErrorTextEntryPanel extends JPanel {
    
    // Déclarations et initialisations des champs privés
    private final JPanel errorPanel = new JPanel(new BorderLayout());
    private final JLabel errorDuplicata = new JLabel("Erreur dans la saisie : Duplicata");
    private final JLabel errorEmpty = new JLabel("Erreur dans la saisie : Duplicata");
    
    /**
     * Constructeur de ErrorTextEntryPanel()
     * @param typeErreur
     */
    public ErrorTextEntryPanel(String typeErreur){
        
        if(typeErreur.equals("Vide")){this.errorPanel.add(this.errorEmpty);}
        if(typeErreur.equals("Duplicata")){this.errorPanel.add(this.errorDuplicata);}
        
        Component add = add(this.errorPanel);
        this.add(add);
    }
}
