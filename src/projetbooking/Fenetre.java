package projetbooking;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Hervé Martinez
 */
public class Fenetre extends JFrame {

    private final JButton boutonCouper = new JButton("Couper");
    private final JButton boutonQuitter = new JButton("Quitter");
    private final JPanel panneau = new JPanel(new BorderLayout());
    private final JMenuBar menuBar = new JMenuBar();
    private final JMenu menu = new JMenu("Menu");

    
    //Create the menu bar.
//menuBar = new JMenuBar();
//
////Build the first menu.
//menu = new JMenu("A Menu");
//menu.setMnemonic(KeyEvent.VK_A);
//menu.getAccessibleContext().setAccessibleDescription(
//        "The only menu in this program that has menu items");
//menuBar.add(menu);
    public Fenetre() {
        
        /////// Titre + taille ///////
        super("Booking");
        this.setBounds(500, 400, 750, 600);
        
        /////// Positionnement ///////
        //récuperer la taille de l'écran
        Dimension tailleEcran = Toolkit.getDefaultToolkit().getScreenSize();
        int height = tailleEcran.height;
        int width = tailleEcran.width;
        //taille est un demi la longueur et l'hauteur
        this.setSize(width/2, height/2);

        //ici on centre notre fenetre 
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setBackground(Color.gray);

        this.getContentPane().add(this.panneau);
        
//        etiquette.requestFocus();
        
    }

}
