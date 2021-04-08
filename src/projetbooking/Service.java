package projetbooking;

/**
 * Classe d'un service
 */
public class Service extends Departement {

    //Déclaration de champs privés 
    private int idSer;
    private String nomSer;

    /**
    * Constructeur de la classe Service
     * @param idDepartement
     * @param nomDepartement
     * @param idService
     * @param nomService
    */
    public Service(int idDepartement, String nomDepartement, int idService, String nomService) {
        super(idDepartement, nomDepartement);
        this.idSer = idService;
        this.nomSer = nomService;
    }

    //////////////////////////////////////////////////////
    ///////////////////// Get et set /////////////////////
    //////////////////////////////////////////////////////

    public int getIdSer() {
        return idSer;
    }

    public void setIdSer(int idSer) {
        this.idSer = idSer;
    }

    public String getNomSer() {
        return nomSer;
    }

    public void setNomSer(String nomSer) {
        this.nomSer = nomSer;
    }

    /*
    * Méthode toString() pour l'affichage du service
    */
    @Override
    public String toString() {
        return "Le service sélectionné est le " + idSer + " se nommant " + nomSer + '.';
    }

}