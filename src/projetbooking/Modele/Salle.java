package projetbooking.Modele;
import java.util.*;

/**
 * Classe d'une salle de réunion
 */
public class Salle {
    
    //Déclaration de champs privés 
    private int idSa;
    private String nomSa;
    private int tailleSa;
    private ArrayList equipementSa;
    

    /**
     * Constructeur de la classe Salle
     * @param idSalle
     * @param nomSalle
     * @param tailleSalle
     * @param equipementSalle
     */
    public Salle(int idSalle, String nomSalle, int tailleSalle, ArrayList equipementSalle) {
        this.idSa = idSalle;
        this.nomSa = nomSalle;
        this.tailleSa = tailleSalle;
        this.equipementSa = equipementSalle;
    }

    //////////////////////////////////////////////////////
    ///////////////////// Get et set /////////////////////
    //////////////////////////////////////////////////////
    
    public int getId() {
        return idSa;
    }

    public void setId(int id) {
        this.idSa = id;
    }

    public String getNom() {
        return nomSa;
    }

    public void setNom(String nom) {
        this.nomSa = nom;
    }

    public int getTaille() {
        return tailleSa;
    }

    public void setTaille(int taille) {
        this.tailleSa = taille;
    }

    public ArrayList getEquipement() {
        return equipementSa;
    }

    public void setEquipement(ArrayList equipement) {
        this.equipementSa = equipement;
    }

    /*
    * Méthode toString() pour l'affichage de la salle
    */
    @Override
    public String toString() {
        return "La salle sélectionnée est la " + idSa + " se nommant " + nomSa + " pouvant contenir jusqu'à " + tailleSa + " contenant " + equipementSa + '.';
    }

}