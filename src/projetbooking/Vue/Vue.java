/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import projetbooking.Vue.Panel.Booking.AddBookingPanel;
import projetbooking.Vue.Panel.Booking.AdminBookingPanel;
import projetbooking.Vue.Panel.Booking.BookingPanel;
import projetbooking.Vue.Panel.Booking.EditBookingPanel;
import projetbooking.Vue.Panel.Booking.RemoveBookingPanel;
import projetbooking.Vue.Panel.StartPanel;
import projetbooking.Vue.Panel.ConnectionPanel.ConnectionPanel;
import projetbooking.Vue.Panel.ConnectionPanel.CreationAccountPanel;
import projetbooking.Vue.Panel.Equipment.AddEquipmentPanel;
import projetbooking.Vue.Panel.Equipment.EditEquipmentPanel;
import projetbooking.Vue.Panel.Equipment.EquipmentPanel;
import projetbooking.Vue.Panel.Equipment.RemoveEquipmentPanel;
import projetbooking.Vue.Panel.Planning.PlanningPanel;
import projetbooking.Vue.Panel.Room.AddRoomPanel;
import projetbooking.Vue.Panel.Room.EditRoomPanel;
import projetbooking.Vue.Panel.Room.RemoveRoomPanel;
import projetbooking.Vue.Panel.Room.RoomPanel;

public class Vue extends JFrame {

    ////////////////////////////////////////////////////////////////////////
    ///////////// Déclarations et initialisations des panneaux /////////////
    ////////////////////////////////////////////////////////////////////////
    
    // ArrayList
    ArrayList listeTexte = new ArrayList();
    
    /////// Panneau précédent ///////
    private JPanel previousPanel = null;
    
    /////// Panneau courant ///////
    private JPanel currentPanel = null;
    
    // Pour le démarrage
    private boolean set = false;
    
    /////// Panel ///////
    
    // StartPanel
    private StartPanel startPanel = new StartPanel();
    
    // ConnectionPanel
    private ConnectionPanel connectionPanel = new ConnectionPanel();
    
    // CreationAccountPanel
    private CreationAccountPanel creationAccountPanel = new CreationAccountPanel();
    
    // Planning Panel
    private PlanningPanel planningPanel_1 = new PlanningPanel(1);
    private PlanningPanel planningPanel_2 = new PlanningPanel(2);
    private PlanningPanel planningPanel_3 = new PlanningPanel(3);
    
    // Booking Panel
    private BookingPanel bookingPanel = new BookingPanel();
    private AddBookingPanel addBookingPanel = new AddBookingPanel();
    private EditBookingPanel editBookingPanel = new EditBookingPanel();
    private RemoveBookingPanel removeBookingPanel = new RemoveBookingPanel();
    private AdminBookingPanel adminBookingPanel = new AdminBookingPanel();
    
    // Room Panel
    private RoomPanel roomPanel = new RoomPanel();
    private AddRoomPanel addRoomPanel = new AddRoomPanel();
    private EditRoomPanel editRoomPanel = new EditRoomPanel();
    private RemoveRoomPanel removeRoomPanel = new RemoveRoomPanel();
    
    // Equipment Panel
    private EquipmentPanel equipmentPanel = new EquipmentPanel();
    private AddEquipmentPanel addEquipmentPanel = new AddEquipmentPanel();
    private EditEquipmentPanel editEquipmentPanel = new EditEquipmentPanel();
    private RemoveEquipmentPanel removeEquipmentPanel = new RemoveEquipmentPanel();

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
        this.centerFrame();
        this.repaint();
    }
    
    public void backPanel(){
        
        // Panneaux d'entrée au planning
        if(this.currentPanel.equals(this.connectionPanel) || this.currentPanel.equals(this.creationAccountPanel)){
            this.previousPanel = this.startPanel;
        }
        
        ////// Planning 2 ///////
        // Panneau de réservation
        if(this.currentPanel.equals(this.addBookingPanel) || this.currentPanel.equals(this.editBookingPanel) || this.currentPanel.equals(this.removeBookingPanel)){
            this.previousPanel = this.bookingPanel;
        }
        
        if(this.currentPanel.equals(this.bookingPanel)){
            this.previousPanel = this.planningPanel_2;
        }
        
        ////// Planning 3 ///////
        if(this.currentPanel.equals(this.roomPanel) && this.previousPanel.equals(this.planningPanel_3)){
            this.previousPanel = this.planningPanel_3;
        }
        
        // Panneau de la salle
        if(this.currentPanel.equals(this.addRoomPanel) || this.currentPanel.equals(this.editRoomPanel) || this.currentPanel.equals(this.removeRoomPanel)){
            this.previousPanel = this.roomPanel;
        }
        
        // Panneau de l'équipement
        if(this.currentPanel.equals(this.addEquipmentPanel) || this.currentPanel.equals(this.editEquipmentPanel) || this.currentPanel.equals(this.removeEquipmentPanel)){
            this.previousPanel = this.equipmentPanel;
        }
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
            case "addBookingPanel"->
                this.addBookingPanel;
            case "editBookingPanel"->
                this.editBookingPanel;
            case "removeBookingPanel"->
                this.removeBookingPanel;
            case "adminBookingPanel"->
                this.adminBookingPanel;
            case "roomPanel"->
                this.roomPanel;
            case "addRoomPanel"->
                this.addRoomPanel;
            case "editRoomPanel"->
                this.editRoomPanel;
            case "removeRoomPanel"->
                this.removeRoomPanel;
            case "equipmentPanel"->
                this.equipmentPanel;
            case "addEquipmentPanel"->
                this.addEquipmentPanel;
            case "editEquipmentPanel"->
                this.editEquipmentPanel;
            case "removeEquipmentPanel"->
                this.removeEquipmentPanel;
            case "Retour"->
                this.previousPanel;
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
            ////////////////////////////////////////////////////////////////////
                
            ////////////////////////// BookingPanel ////////////////////////////
            case "Créer une réservation":
                this.bookingPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Modifier une réservation":
                this.bookingPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Supprimer une réservation":
                this.bookingPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Réservations Administrateur":
                this.bookingPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// AddBookingPanel ///////

                
            /////// EditBookingPanel ///////

                
            /////// RemoveBookingPanel ///////
                
                
            /////// AdminBookingPanel ///////
            case "Valider":
                this.adminBookingPanel.ajouterEcouteurBouton(nomBouton, listener);
            ////////////////////////////////////////////////////////////////////
                
            ////////////////////////// RoomPanel ///////////////////////////////
            case "Créer une salle":
                this.roomPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Modifier une salle":
                this.roomPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Supprimer une salle":
                this.roomPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// AddRoomPanel ///////
            case "Ajouter la salle":
                this.addRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// EditRoomPanel ///////
            case "Modifier la salle":
                this.editRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// RemoveRoomPanel ///////
            case "Supprimer la salle":
                this.removeRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
            ////////////////////////////////////////////////////////////////////
                
            //////////////////////// EquipmentPanel ////////////////////////////
            case "Créer un équipement":
                this.equipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Modifier un équipement":
                this.equipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
            case "Supprimer un équipement":
                this.equipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
            ////////////////////////////////////////////////////////////////////
                
            // Retour
            case "Retour":
                
                this.connectionPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.creationAccountPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.roomPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.addRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.editRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.removeRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.bookingPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.addBookingPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.editBookingPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.removeBookingPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.adminBookingPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.equipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.addEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.editEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.removeEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                
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
                listeTexte.add(this.connectionPanel.getEmailField().getText());
                listeTexte.add(this.connectionPanel.getPasswordField().getText());
                break;
            case "CreationAccountPanel":
                listeTexte.add(this.creationAccountPanel.getNameField().getText());
                listeTexte.add(this.creationAccountPanel.getFirstNameField().getText());
                listeTexte.add(this.creationAccountPanel.getEmailField().getText());
                listeTexte.add(this.creationAccountPanel.getPasswordField().getText());
                listeTexte.add(this.creationAccountPanel.getMobileField().getText());
                break;
                
        }
        
        // Renvoi de l'ArrayList
        return listeTexte;
    }
} 