package projetbooking.Controller;

/**
 * Cours NF0A19 - Chapitre 6 - JUNIT sur architecture MVC
 *
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import projetbooking.Modele.Modele;
import projetbooking.Vue.Panel.ConnectionPanel;
import projetbooking.Vue.Panel.CreationAccountPanel;
import projetbooking.Vue.Vue;
import projetbooking.Vue.Panel.ConnectionPanel;

/**
 * La classe Controleur represente le modèle de l'architecture MVC.
 *
 * @author Hervé Martinez
 */
public class Controleur extends KeyAdapter implements MouseListener, ActionListener {
    
    private final Vue laVue;
    private final Modele leModele;

    /**
     * Le constructeur du controleur, il reçoit une vue et un modèle. Il appelle
     * les méthodes de la classe Vue pour initialiser celle-ci Il joue le rôle
     * d'écouteur pour les composants de la classe Vue.
     *
     * @param uneVue La vue
     * @param unModele Le modèle
     */
    public Controleur(Vue uneVue, Modele unModele) {
        this.laVue = uneVue;
        this.leModele = unModele;
        uneVue.ajouterEcouteurBouton("Quitter", this);
        uneVue.ajouterEcouteurBouton("Se créer un compte", this);
        uneVue.ajouterEcouteurBouton("Se connecter", this);
        uneVue.ajouterEcouteurBouton("Connexion", this);
    }
    
    /**
     * Permet de récupérer la Vue
     *
     * @return
     */
    public Vue getVue() {
        return laVue;
    }

    /**
     * Permet de récupérer le modèle
     *
     * @return
     */
    public Modele getModele() {
        return leModele;
    }

    //Méthode de la classe abstraite KeyAdapter
    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();
        switch (source.getText()) {
            case "Se créer un compte" ->
                laVue.setPane(new CreationAccountPanel());
            case "Se connecter" ->
                laVue.setPane(new ConnectionPanel());
            case "Quitter" ->
                System.exit(0);
            case "Connexion" ->
                System.exit(0);
        }
    }

    //Méthode de l'interface KeyListener
    @Override
    public void keyReleased(KeyEvent e) {
    }

    //Méthodes de l'interface MouseListener
    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override

    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

}
