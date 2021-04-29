/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author jerem
 */
public class FenetreMenuConnexion extends FenetreMenu {

    private final JButton boutonConnexion = new JButton("Connexion");
    private final JButton boutonQuitter = new JButton("Quitter");
    private final JLabel etiquette = new JLabel("Page de connexion");
    private final JLabel etiquetteMail = new JLabel("Adresse mail :");
    private final JLabel etiquettePassword = new JLabel("Mot de passe : ");
    private final JTextField champMail = new JTextField("", 10);
    private final JTextField champPassword = new JTextField("", 10);
    private final JPanel panneau = new JPanel();
    private final JPanel panneauCentral = new JPanel(new GridBagLayout());

    /**
     * Constructeur de la vue
     */
    public FenetreMenuConnexion(String titre) {
       super(titre);
    }

    /**
     * Retourne une chaine contenant le texte saisi dans le champ texte de la
     * vue Ce champ est destiné à indiquer le nom du prochain bouton à créer
     *
     * @return un chaine (String) contenant le texte
     */
    public String getTextMail() {
        return champMail.getText();
    }
    
    public String getTextPassword() {
        return champPassword.getText();
    }

    /**
     * Ajouter un écouteur à un bouton désigné par son nom
     *
     * @param nomBouton le nom du bouton sur lequel l'écouteur doit être ajouté
     * @param listener l'écouteur à ajouter
     */
    public void ajouterEcouteurBouton(String nomBouton, ActionListener listener) {
        JButton bouton;
        bouton = switch (nomBouton.toUpperCase()) {
            case "CONNEXION" ->
                bouton = boutonConnexion;
            case "QUITTER" ->
                bouton = boutonQuitter;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }

    /**
     * Ajoute les écouteurs du champ texte. Un écouteur pour le clavier et un
     * écouteur pour la souris
     *
     * @param keyListener L'écouteur des évènements du clavier
     * @param Mouselistener L'écouteur des évènements de la souris
     */
    public void ajouterEcouteurChampMail(KeyListener keyListener, MouseListener Mouselistener) {
        champMail.addKeyListener(keyListener);
        champMail.addMouseListener(Mouselistener);
    }

    /**
     * Ajoute l'écouteur du champ information.Un écouteur pour le clavier
     *
     * @param keyListener L'écouteur des évènements du clavier
     * @param Mouselistener
     */
    public void ajouterEcouteurChampPassword(KeyListener keyListener, MouseListener Mouselistener) {
        champPassword.addKeyListener(keyListener);
        champPassword.addMouseListener(Mouselistener);
    }

    /**
     * Ferme la vue et quitte l'application
     */
    public void quitter() {
        System.exit(0);
    }

    /**
     * Fixe l'état du bouton Ok.
     * @param etat Si vaut true, le bouton Ok est actif, sinon il est inactif
     */
    public void setEtatBoutonConnexion(boolean etat) {
        this.boutonConnexion.setEnabled(etat);
    }

    /**
     * Fixe la couleur du champ texte
     * @param couleur Un objet Color fixant la couleur du texte
     */
    public void setCouleurChampMail(Color couleur) {
        this.champMail.setBackground(couleur);
    }
    
    /**
     * Fixe la couleur du champ texte
     * @param couleur Un objet Color fixant la couleur du texte
     */
    public void setCouleurChampPassword(Color couleur) {
        this.champPassword.setBackground(couleur);
    }
}
