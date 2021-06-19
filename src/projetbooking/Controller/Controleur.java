package projetbooking.Controller;

/**
 * Cours NF0A19 - Chapitre 6 - JUNIT sur architecture MVC
 *
 */
import static BDD.Requetes.connectAccount;
import static BDD.Requetes.connexion;
import static BDD.Requetes.createAccount;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JButton;
import projetbooking.Modele.Modele;
import projetbooking.Vue.Vue;

/**
 * La classe Controleur represente le modèle de l'architecture MVC.
 *
 * @author Hervé Martinez
 */
public class Controleur extends KeyAdapter implements MouseListener, ActionListener {

    /////// Connexion BDD ///////
    private Statement statement = connexion();
    
    // ArrayList
    ArrayList listeTexte = new ArrayList();
    
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
        
        // StartPanel
        uneVue.ajouterEcouteurBouton("Quitter", this);
        uneVue.ajouterEcouteurBouton("Se créer un compte", this);
        uneVue.ajouterEcouteurBouton("Se connecter", this);
        
        // ConnectionPanel
        uneVue.ajouterEcouteurBouton("Connexion", this);
        
        // CreationAccountPanel
        uneVue.ajouterEcouteurBouton("Créer un compte", this);
        
        // PlanningPanel
        uneVue.ajouterEcouteurBouton("Déconnexion", this);
        uneVue.ajouterEcouteurBouton("Réservation", this);
        uneVue.ajouterEcouteurBouton("Salle", this);
        uneVue.ajouterEcouteurBouton("Équipement", this);
        
        // BookingPanel
        uneVue.ajouterEcouteurBouton("Créer une réservation", this);
        uneVue.ajouterEcouteurBouton("Modifier une réservation", this);
        uneVue.ajouterEcouteurBouton("Supprimer une réservation", this);
                
        // RoomPanel
        uneVue.ajouterEcouteurBouton("Créer une salle", this);
        uneVue.ajouterEcouteurBouton("Modifier une salle", this);
        uneVue.ajouterEcouteurBouton("Supprimer une salle", this);
        
        // AddRoomPanel
        uneVue.ajouterEcouteurBouton("Ajouter la salle", this);
        
        // EditRoomPanel
        uneVue.ajouterEcouteurBouton("Modifier la salle", this);
        
        // RemoveRoomPanel
        uneVue.ajouterEcouteurBouton("Supprimer la salle", this);

        // EquipmentPanel
        uneVue.ajouterEcouteurBouton("Créer un équipement", this);
        uneVue.ajouterEcouteurBouton("Modifier un équipement", this);
        uneVue.ajouterEcouteurBouton("Supprimer un équipement", this);
        uneVue.ajouterEcouteurBouton("Réservations Administrateur", this);
        
        // Retour
        uneVue.ajouterEcouteurBouton("Retour", this);
        
        // Écouteurs champs texte
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
            
            // StartPanel
            case "Se créer un compte" :
                laVue.activatePanel("creationAccountPanel");
                break;
            case "Se connecter" :
                laVue.activatePanel("connectionPanel");
                break;
            case "Quitter" :
                System.exit(0);
                break;
            
            // ConnectionPanel
            case "Connexion" :
                this.statement = connexion(); //Opération d'initialisation du driver, de la base de données et du Statement
                listeTexte.clear();
                listeTexte = this.laVue.getText("ConnectionPanel");
                //System.out.println(listeTexte.size());
                //System.out.println(this.listeTexte.get(1).toString());
                
                if (this.statement != null) {
                    //Execution de requête de lecture sur l'objet Statement
                    switch (connectAccount(statement, this.listeTexte.get(0).toString(), this.listeTexte.get(1).toString())) {
                        case 0 -> System.out.println("Erreur");
                        case 1 -> laVue.activatePanel("planningPanel_1");
                        case 2 -> laVue.activatePanel("planningPanel_2");
                        default -> laVue.activatePanel("planningPanel_3");
                    }
                }
                break;
                
            // CreationAccountPanel
            case "Créer un compte" :
                this.statement = connexion(); //Opération d'initialisation du driver, de la base de données et du Statement
                listeTexte.clear();
                listeTexte = this.laVue.getText("CreationAccountPanel");
                System.out.println(listeTexte.size());
                System.out.println(this.listeTexte.get(1).toString());
                
                if (statement != null) {
                    //Execution de requête de lecture sur l'objet Statement
                    if (createAccount(statement, this.listeTexte.get(0).toString(), this.listeTexte.get(1).toString(), this.listeTexte.get(2).toString(), this.listeTexte.get(3).toString()) == false ){
                        laVue.activatePanel("planningPanel_1");
                    }
                }
                break;
                
            // PlanningPanel
            case "Déconnexion" :
                laVue.activatePanel("startPanel");
                break;
            case "Réservation" :
                laVue.activatePanel("bookingPanel");
                break;
            case "Salle" :
                laVue.activatePanel("roomPanel");
                break;
            case "Équipement" :
                laVue.activatePanel("equipmentPanel");
                break;
                
            // BookingPanel
            case "Créer une réservation" :
                laVue.activatePanel("addBookingPanel");
                break;
            case "Modifier une réservation" :
                laVue.activatePanel("editBookingPanel");
                break;
            case "Supprimer une réservation" :
                laVue.activatePanel("removeBookingPanel");
                break;
            case "Réservations Administrateur" :
                laVue.activatePanel("adminBookingPanel");
                break;
                
            // RoomPanel
            case "Créer une salle" :
                laVue.activatePanel("addRoomPanel");
                break;
            case "Modifier une salle" :
                laVue.activatePanel("editRoomPanel");
                break;
            case "Supprimer une salle" :
                laVue.activatePanel("removeRoomPanel");
                break;
                
            // AddRoomPanel
            case "Ajouter la salle" :
                //laVue.activatePanel("addRoomPanel");
                break;
            // EditRoomPanel
            case "Modifier la salle" :
                //laVue.activatePanel("editRoomPanel");
                break;
            // RemoveRoomPanel
            case "Supprimer la salle" :
                //laVue.activatePanel("removeRoomPanel");
                break;
                
            // EquipmentPanel
            case "Créer un équipement" :
                laVue.activatePanel("addEquipmentPanel");
                break;
            case "Modifier un équipement" :
                laVue.activatePanel("editEquipmentPanel");
                break;
            case "Supprimer un équipement" :
                laVue.activatePanel("removeEquipmentPanel");
                break;
                
            // Retour
            case "Retour" :
                laVue.backPanel();
                laVue.activatePanel("Retour");
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    //Méthode de l'interface KeyListener
//    @Override
//    public void keyReleased(KeyEvent e) {
//        laVue.setEtatBoutonOk(!laVue.getText().isEmpty() && !laVue.getInformation().isEmpty());
//    }

}