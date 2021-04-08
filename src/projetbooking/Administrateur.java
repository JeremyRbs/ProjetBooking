package projetbooking;
import java.util.*;

/**
 * Classe d'un administrateur
 */
public class Administrateur extends UtilisateurStandard {

    /*
    * Constructeur de la classe Administrateur
    */
    public Administrateur(String mail, String leDroit) {
        super(mail, leDroit);
    }

    /**
     * Méthode permettant de confirmer les réservations
     * @param String salle 
     * @param Date uneDate
     */
    private void Confirmation(String salle, Date uneDate) {
        // TODO implement here
    }

    /**
     *  Méthode permettant de créer une salle
     */
    private void CreationSalle() {
        // TODO implement here
    }

    /**
     * Méthode permettant de modifier une salle
     * @param String uneSalle
     */
    private void ModificationSalle(int idSalle) {
        // TODO implement here
    }

    /**
     * Méthode permettant de supprimer une salle
     * @param String uneSalle
     */
    private void SuppressionSalle(int idSalle) {
        // TODO implement here
    }


}