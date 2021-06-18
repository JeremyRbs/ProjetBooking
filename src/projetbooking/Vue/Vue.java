/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import projetbooking.Vue.Panel.Booking.BookingPanel;
import projetbooking.Vue.Panel.StartPanel;
import projetbooking.Vue.Panel.ConnectionPanel.ConnectionPanel;
import projetbooking.Vue.Panel.ConnectionPanel.CreationAccountPanel;
import projetbooking.Vue.Panel.Equipment.EquipmentPanel;
import projetbooking.Vue.Panel.Planning.PlanningPanel;
import projetbooking.Vue.Panel.Room.RoomPanel;

public class Vue extends JFrame {

    ////////////////////////////////////////////////////////////////////////
    ///////////// Déclarations et initialisations des panneaux /////////////
    ////////////////////////////////////////////////////////////////////////
    
    // ArrayList
    ArrayList listeTexte = new ArrayList();

    /////// Panneau courant ///////
    private JPanel currentPanel = null;
    
    // Pour le démarrage
    private boolean set = false;
    
    // Panel //
    private StartPanel startPanel = new StartPanel();
    private ConnectionPanel connectionPanel = new ConnectionPanel();
    private CreationAccountPanel creationAccountPanel = new CreationAccountPanel();
    private PlanningPanel planningPanel_1 = new PlanningPanel(1);
    private PlanningPanel planningPanel_2 = new PlanningPanel(2);
    private PlanningPanel planningPanel_3 = new PlanningPanel(3);
    private BookingPanel bookingPanel = new BookingPanel();
    private RoomPanel roomPanel = new RoomPanel();
    private EquipmentPanel equipmentPanel = new EquipmentPanel();

    ////////////////////////////////////////////////////////////////////////
    ////////////////// Constructeur de la classe Fenetre ///////////////////
    ////////////////////////////////////////////////////////////////////////

    public Vue()
    {

        //////////////////////////////////////////////////

        ////////////////////////////////////
        /////// Panneau de démarrage ///////
        ////////////////////////////////////

        if(set == false){
            set = true;
            this.setPane(this.startPanel);
        }

        ////////////////////////////////////////
        /////// Paramètres de la fenêtre ///////
        ////////////////////////////////////////

        this.setTitle("Booking");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.centerFrame();
    }

    ////////////////////////////////////////////////////////////////////////
    ///////////////////// Méthodes de la classe Fenetre ////////////////////
    ////////////////////////////////////////////////////////////////////////

    // Méthode permettant de centrer la fenêtre
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    public void setPane(JPanel pane){

        if(this.currentPanel != null){

            this.getContentPane().remove(this.currentPanel);
            this.repaint();

        }
        this.setContentPane(pane);
        this.validate();
        this.pack();
        this.currentPanel = pane;
        this.repaint();
    }
    
    public void activatePanel(String namePanel){
        this.setPane(
        switch(namePanel){
            case "startPanel"->
                this.startPanel;
            case "connectionPanel"->
                this.connectionPanel;
            case "creationAccountPanel"->
                this.creationAccountPanel;
            case "planningPanel_1"->
                this.planningPanel_1;
            case "planningPanel_2"->
                this.planningPanel_2;
            case "planningPanel_3"->
                this.planningPanel_3;
            case "bookingPanel"->
                this.bookingPanel;
            case "roomPanel"->
                this.roomPanel;
            case "equipmentPanel"->
                this.equipmentPanel;
            default->
                null;
        });
    }

    /**
     * Ajouter un écouteur à un bouton désigné par son nom
     *
     * @param nomBouton le nom du bouton sur lequel l'écouteur doit être ajouté
     * @param listener l'écouteur à ajouter
     */
    public void ajouterEcouteurBouton(String nomBouton, ActionListener listener) {
        JButton bouton = null;
        switch(nomBouton){
            
            // StartPanel
            case "Se créer un compte":
                this.startPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Se connecter":
                this.startPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Quitter":
                this.startPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            // ConnectionPanel
            case "Connexion":
                this.connectionPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            // CreationAccountPanel
            case "Créer un compte":
                this.creationAccountPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            // PlanningPanel
            case "Déconnexion":
                this.planningPanel_1.ajouterEcouteurBouton(nomBouton, listener);
                this.planningPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.planningPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "Réservation":
                this.planningPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.planningPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "Salle":
                this.planningPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "Équipement":
                this.planningPanel_3.ajouterEcouteurBouton(nomBouton, listener);
        }
    }
    
    /**
     * Retourne une ArrayList de chaînes contenant les textes saisient dans les champs textes du
     * panneau.
     *
     * @param nomPanel
     * @return un ArrayList de String contenant le texte
     */
    public ArrayList getText(String nomPanel) {
        
        // L'ArrayList se vide pour éviter des erreurs
        listeTexte.clear();
        
        // Suivant le nom du panneau, on ajoute certaines informations
        switch(nomPanel){
            case "ConnectionPanel":
                listeTexte.add(this.connectionPanel.getEmailField_connectionPanel().getText());
                listeTexte.add(this.connectionPanel.getPasswordField_connectionPanel().getText());
                break;
            case "CreationAccountPanel":
                listeTexte.add(this.creationAccountPanel.getNameField_creationAccountPanel().getText());
                listeTexte.add(this.creationAccountPanel.getFirstNameField_creationAccountPanel().getText());
                listeTexte.add(this.creationAccountPanel.getEmailField_creationAccountPanel().getText());
                listeTexte.add(this.creationAccountPanel.getPasswordField_creationAccountPanel().getText());
                listeTexte.add(this.creationAccountPanel.getMobileField_creationAccountPanel().getText());
                break;
                
        }
        
        // Renvoi de l'ArrayList
        return listeTexte;
    }
} 