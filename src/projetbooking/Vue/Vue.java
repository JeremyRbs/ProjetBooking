/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
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

    /////// Panneau courant ///////
    private JPanel currentPanel = null;
    
    // Pour le démarrage
    private boolean set = false;
    
    // Panel //
    private StartPanel startPanel = new StartPanel();
    private ConnectionPanel connectionPanel = new ConnectionPanel();
    private CreationAccountPanel creationAccountPanel = new CreationAccountPanel();
    private PlanningPanel planningPanel = new PlanningPanel();
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
            case "planningPanel"->
                this.planningPanel;
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
                this.planningPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Réservation":
                this.planningPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Salle":
                this.planningPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Équipement":
                this.planningPanel.ajouterEcouteurBouton(nomBouton, listener);
        }
    }
} 