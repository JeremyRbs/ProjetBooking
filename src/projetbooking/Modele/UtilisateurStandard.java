package projetbooking.Modele;
import java.util.*;

/**
 * Classe d'un utilisateur standard
 */
public class UtilisateurStandard extends UtilisateurSimple {

    /**
     * Constructeur de la classe UtilisateurStandard
     * @param mail
     * @param leDroit
     */
    public UtilisateurStandard(String mail, String leDroit) {
        super(mail, leDroit);
    }
    
    /**
     * Méthode reservation permettant de réserver une salle de réunion
     * @param String salle 
     * @param Date uneDate
     */
    private void Reservation(String salle, Date uneDate) {
        // TODO implement here
    }

    /**
     * Méthode modification permettant de modifier sa propre réservation
     * @param String salle 
     * @param Date uneDate
     */
    private void Modification(String salle, Date uneDate) {
        // TODO implement here
    }

    /**
     * Méthode suppression permettant de supprimer sa propre réservation
     * @param String salle 
     * @param Date uneDate
     */
    private void Suppression(String salle, Date uneDate) {
        // TODO implement here
    }

    /**
     * Méthode invitation permettant d'inviter des utilisateurs à sa propre réunion
     * @param ArrayList unTabDePersonnes
     */
    private void Invitation(ArrayList unTabDePersonnes) {
        // TODO implement here
    }

}