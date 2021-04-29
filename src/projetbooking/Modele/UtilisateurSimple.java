package projetbooking.Modele;

/**
 * Classe d'un utilisateur simple
 */
public class UtilisateurSimple {
    
    //Déclaration de champs privés 
    private String email;
    private String droit;

    /**
     * Constructeur de la classe UtilisateurSimple
     * @param mail
     * @param leDroit
     */
    public UtilisateurSimple(String mail, String leDroit) {
        this.email = mail;
        this.droit = leDroit;
    }

    //////////////////////////////////////////////////////
    ///////////////////// Get et set /////////////////////
    //////////////////////////////////////////////////////
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDroit() {
        return droit;
    }

    public void setDroit(String droit) {
        this.droit = droit;
    }

    /*
    * Méthode toString() pour l'affichage de la salle
    */
    @Override
    public String toString() {
        return "Votre mail d'utilisateur est " + email + " et votre rôle est " + droit + '.';
    }

    /**
     * Méthode consultation permettant de consulter le planning
     */
    private void Consultation() {
        // TODO implement here
    }

    /**
     * Méthode rejoindreReunion permettant de rejoindre une réunion
     * @param IdReservation
     */
    private void RejoindreReunion(int IdReservation) {
        // TODO implement here
    }

}