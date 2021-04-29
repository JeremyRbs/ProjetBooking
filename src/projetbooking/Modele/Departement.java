package projetbooking.Modele;

/**
 * Classe d'un département
 */
public class Departement {
    
    //Déclaration de champs privés 
    private int idDep;
    private String nomDep;

    /**
     * Constructeur de la classe Département
     * @param idDepartement
     * @param nomDepartement
     */
    public Departement(int idDepartement, String nomDepartement) {
        this.idDep = idDepartement;
        this.nomDep = nomDepartement;
    }

    //////////////////////////////////////////////////////
    ///////////////////// Get et set /////////////////////
    //////////////////////////////////////////////////////
    
    public Integer getId() {
        return idDep;
    }

    public void setId(Integer id) {
        this.idDep = id;
    }

    public String getNom() {
        return nomDep;
    }

    public void setNom(String nom) {
        this.nomDep = nom;
    }

    /*
    * Méthode toString() pour l'affichage du département
    */
    @Override
    public String toString() {
        return "Le département sélectionné est le " + idDep + " se nommant " + nomDep + '.';
    }
    
}