package projetbooking;

/**
 * Classe d'un équipement
 */
public class Equipement {
    
    //Déclaration de champs privés
    private int idEqui;
    private String nomEqui;

    /**
     * Constructeur de la classe Équipement
     * @param idEquipement
     * @param nomEquipement
     */
    public Equipement(int idEquipement, String nomEquipement) {
        this.idEqui = idEquipement;
        this.nomEqui = nomEquipement;
    }
    
    //////////////////////////////////////////////////////
    ///////////////////// Get et set /////////////////////
    //////////////////////////////////////////////////////

    public int getIdEqui() {
        return idEqui;
    }

    public void setIdEqui(int idEqui) {
        this.idEqui = idEqui;
    }

    public String getNomEqui() {
        return nomEqui;
    }

    public void setNomEqui(String nomEqui) {
        this.nomEqui = nomEqui;
    }

    /*
    * Méthode toString() pour l'affichage de l'équipement
    */
    @Override
    public String toString() {
        return "L'équipement est le " + idEqui + " et se nomme " + nomEqui + '.';
    }

    
    


}