package projetbooking.Modele;

/**
 * Classe d'une réservation
 */
public class Reservation {

    //Déclaration de champs privés
    private int idUtil;
    private String nomUtil;
    
    /**
     * Constructeur de la classe Réservation
     * @param idUtilisateur
     * @param nomUtilisateur
     */
    public Reservation(int idUtilisateur, String nomUtilisateur) {
        this.idUtil = idUtilisateur;
        this.nomUtil = nomUtilisateur;
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

    /*
    * Méthode toString() pour l'affichage du réservation
    */
    @Override
    public String toString() {
        return "Reservation{" + "idUtil=" + idUtil + ", nomUtil=" + nomUtil + '}';
    }
    
    

}