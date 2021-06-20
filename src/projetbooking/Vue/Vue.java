/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/
package projetbooking.Vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.SQLException;
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
import projetbooking.error.ErrorTextEntryPanel;

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
    
    // Enregistrement du mail de l'organisateur
    private String mail;
    
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
    private BookingPanel bookingPanel_2 = new BookingPanel(2);
    private BookingPanel bookingPanel_3 = new BookingPanel(3);
    private AddBookingPanel addBookingPanel_2 = new AddBookingPanel(2);
    private EditBookingPanel editBookingPanel_2 = new EditBookingPanel(2);
    private RemoveBookingPanel removeBookingPanel_2 = new RemoveBookingPanel(2);
    private AddBookingPanel addBookingPanel_3 = new AddBookingPanel(3);
    private EditBookingPanel editBookingPanel_3 = new EditBookingPanel(3);
    private RemoveBookingPanel removeBookingPanel_3 = new RemoveBookingPanel(3);
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
    
    // ErrorPanel
    private ErrorTextEntryPanel errorTextEntryPanelVide = new ErrorTextEntryPanel("Vide");
    private ErrorTextEntryPanel errorTextEntryPanelDuplicata = new ErrorTextEntryPanel("Duplicata");

    ////////////////////////////////////////////////////////////////////////
    ////////////////// Constructeur de la classe Fenetre ///////////////////
    ////////////////////////////////////////////////////////////////////////

    /**
     * Constructeur de Vue()
     * 
     * @throws java.sql.SQLException
     */
    public Vue() throws SQLException
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

    /**
     * Permet de recentrer la fenêtre
     */
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }

    /**
     * Permet de changer de panneau
     * 
     * @param pane
     */
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
    
    /**
     * Permet de revenir au panneau précédent
     */
    public void backPanel(){
        
        // Panneaux d'entrée au planning
        if(this.currentPanel.equals(this.connectionPanel) || this.currentPanel.equals(this.creationAccountPanel)){
            this.previousPanel = this.startPanel;
        }
        
        ////// Planning 2 ///////
        
        // Panneau de réservation
        if(this.currentPanel.equals(this.addBookingPanel_2) || this.currentPanel.equals(this.editBookingPanel_2) || this.currentPanel.equals(this.removeBookingPanel_2)){
            this.previousPanel = this.bookingPanel_2;
        }
        
        if(this.currentPanel.equals(this.bookingPanel_2)){
            this.previousPanel = this.planningPanel_2;
        }
        
        ////// Planning 3 ///////
        if(this.currentPanel.equals(this.roomPanel) || this.currentPanel.equals(this.equipmentPanel) || this.currentPanel.equals(this.bookingPanel_3)){
            this.previousPanel = this.planningPanel_3;
        }
        
        // Panneau de réservation
        if(this.currentPanel.equals(this.addBookingPanel_3) || this.currentPanel.equals(this.editBookingPanel_3) || this.currentPanel.equals(this.removeBookingPanel_3) || this.currentPanel.equals(this.adminBookingPanel)){
            this.previousPanel = this.bookingPanel_3;
        }
        
        // Panneau de la salle
        if(this.currentPanel.equals(this.addRoomPanel) || this.currentPanel.equals(this.editRoomPanel) || this.currentPanel.equals(this.removeRoomPanel)){
            this.previousPanel = this.roomPanel;
        }
        
        // Panneau de l'équipement
        if(this.currentPanel.equals(this.addEquipmentPanel) || this.currentPanel.equals(this.editEquipmentPanel) || this.currentPanel.equals(this.removeEquipmentPanel)){
            this.previousPanel = this.equipmentPanel;
        }
        
        // Panneau des erreurs
        if(this.currentPanel.equals(this.errorTextEntryPanelVide) || this.currentPanel.equals(this.errorTextEntryPanelDuplicata)){
            this.previousPanel = this.creationAccountPanel;
        }
    }
    
    /**
     * Permet d'activer les panneaux
     * 
     * @param namePanel
     */
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
            case "bookingPanel_2"->
                this.bookingPanel_2;
            case "bookingPanel_3"->
                this.bookingPanel_3;
            case "addBookingPanel_2"->
                this.addBookingPanel_2;
            case "addBookingPanel_3"->
                this.addBookingPanel_3;
            case "editBookingPanel_2"->
                this.editBookingPanel_2;
            case "editBookingPanel_3"->
                this.editBookingPanel_3;
            case "removeBookingPanel_2"->
                this.removeBookingPanel_2;
            case "removeBookingPanel_3"->
                this.removeBookingPanel_3;
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
            case "ErrorTextEntryPanelVide"->
                this.connectionPanel;
            case "ErrorTextEntryPanelDuplicata"->
                this.connectionPanel;
            case "Retour"->
                this.previousPanel;
            case "A - Retour"->
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
            case "A - Réservation":
                this.planningPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "Salle":
                this.planningPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "Équipement":
                this.planningPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            ////////////////////////////////////////////////////////////////////
                
            ////////////////////////// BookingPanel ////////////////////////////
            case "Créer une réservation":
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
            case "Modifier une réservation":
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
            case "Supprimer une réservation":
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
            case "Réservations Administrateur":
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
            case "A - Créer une réservation":
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "A - Modifier une réservation":
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "A - Supprimer une réservation":
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
            case "A - Réservations Administrateur":
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// AddBookingPanel ///////
            case "Ajouter la réservation":
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// EditBookingPanel ///////
            case "Modifier la réservation":
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// RemoveBookingPanel ///////
            case "Supprimer la réservation":
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
                
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
                
            /////// AddRoomPanel ///////
            case "Ajouter l'équipement":
                this.addEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// EditRoomPanel ///////
            case "Modifier l'équipement":
                this.editEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            /////// RemoveRoomPanel ///////
            case "Supprimer l'équipement":
                this.removeEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            ////////////////////////////////////////////////////////////////////
                
            // Retour
            case "Retour":
                
                this.connectionPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.creationAccountPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.roomPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.addRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.editRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.removeRoomPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.bookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.addBookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.editBookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.removeBookingPanel_2.ajouterEcouteurBouton(nomBouton, listener);
                this.adminBookingPanel.ajouterEcouteurBouton(nomBouton, listener);
                
                this.equipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.addEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.editEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                this.removeEquipmentPanel.ajouterEcouteurBouton(nomBouton, listener);
                
            case "A - Retour":
                this.bookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
                this.addBookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
                this.editBookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
                this.removeBookingPanel_3.ajouterEcouteurBouton(nomBouton, listener);
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
                this.mail = this.connectionPanel.getEmailField().getText();
                break;
            case "CreationAccountPanel":
                listeTexte.add(this.creationAccountPanel.getNameField().getText());
                listeTexte.add(this.creationAccountPanel.getFirstNameField().getText());
                listeTexte.add(this.creationAccountPanel.getEmailField().getText());
                listeTexte.add(this.creationAccountPanel.getPasswordField().getText());
                listeTexte.add(this.creationAccountPanel.getMobileField().getText());
                this.mail = this.creationAccountPanel.getEmailField().getText();
                break;
            case "AdminBookingPanel":
                break;
            case "AddBookingPanel_2":
                listeTexte.add(this.addBookingPanel_2.getDateField().getText());
                listeTexte.add(this.addBookingPanel_2.getCombobox().getSelectedItem().toString());
                listeTexte.add(this.addBookingPanel_2.getSalleField().getText());
                break;
            case "AddBookingPanel_3":
                listeTexte.add(this.addBookingPanel_3.getDateField().getText());
                listeTexte.add(this.addBookingPanel_3.getCombobox().getSelectedItem().toString());
                listeTexte.add(this.addBookingPanel_3.getSalleField().getText());
                break;
            case "EditBookingPanel_2":
                break;
            case "EditBookingPanel_3":
                break;
            case "RemoveBookingPanel_2":
                break;
            case "RemoveBookingPanel_3":
                break;
            case "AddEquipmentPanel":
                listeTexte.add(this.addEquipmentPanel.getNameField().getText());
                break;
            case "EditEquipmentPanel":
                break;
            case "RemoveEquipmentPanel":
                break;
            case "AddRoomPanel":
                listeTexte.add(this.addRoomPanel.getNameField().getText());
                listeTexte.add(this.addRoomPanel.getTailleField().getText());
                listeTexte.add(this.addRoomPanel.getEquipementField().getText());
                break;
            case "EditRoomPanel":
                break;
            case "RemoveRoomPanel":
                break;
        }
        
        // Renvoi de l'ArrayList
        return listeTexte;
    }

    public String getMail() {
        return mail;
    }
    
    
} 