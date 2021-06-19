package projetbooking.Modele;

/**
 * Classe d'une réservation
 */
public class Reservation {

    //Déclaration de champs privés
    private int idUtil;
    private String nomUtil;
    private String date;
    private int idSalle;
    
    /**
     * Constructeur de la classe Réservation
     * @param idUtilisateur
     * @param nomUtilisateur
     */
    public Reservation(int idUtilisateur, String nomUtilisateur, String dateReservation, int numSalle) {
        this.idUtil = idUtilisateur;
        this.nomUtil = nomUtilisateur;
        this.date = dateReservation;
        this.idSalle = numSalle;
    }

    //////////////////////////////////////////////////////
    ///////////////////// Get et set /////////////////////
    //////////////////////////////////////////////////////
    
    public int getIdUtil(){
        return idUtil;
    }

    public void setIdUtil(int idUtil) {
        this.idUtil = idUtil;
    }

    public String getNomUtil() {
        return nomUtil;
    }
    
    public void setNomUtil(String nomUtil) {    
        this.nomUtil = nomUtil;
    }

    public String getDate() {
        return date;
    }

    public int getIdSalle() {
        return idSalle;
    }
    
    

    /*
    * Méthode toString() pour l'affichage du réservation
    */
    @Override
    public String toString() {
        return "Reservation{" + "idUtil=" + idUtil + ", nomUtil=" + nomUtil + '}';
    }
    
    

}