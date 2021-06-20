package BDD;

import static java.lang.Integer.parseInt;
import java.sql.*;

/**
 *
 * @author Jérémy RIBES
 */
public class Requetes {

    /**
     * Permet de se connecter à la base de données
     *
     * @return 
     */
    public static Statement connexion() {
        Connection connection = JDBC_Connect.lot_Connect();
        Statement statement = null;

        if (connection != null) {
            try {
                statement = connection.createStatement();
            } catch (SQLException ex) {
                System.out.println("Erreur d'initialisation des requêtes : " + ex);
            }
        }
        return statement;
    }
    
    /**
     * Permet de créer un compte utilisateur simple
     *
     * @param statement
     * @param name
     * @param firstName
     * @param mail
     * @param password
     * @param telephone
     * @return 
     */
    public static boolean createAccount(Statement statement, String name, String firstName, String mail, String password, String telephone) {
        
        String createTable = "INSERT INTO `utilisateurs` (`NOM`, `PRENOM`, `MAIL`, `mdp`, `niveau`, `tel`) VALUES ('" + name + "', '" + firstName + "', '" + mail + "', '" + password + "', '1', '" + parseInt(telephone) + "')";
        boolean valide = true;
        
        if (statement != null) {
            try {
                return statement.execute(createTable);
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
                valide = false;
            }
        }
        return valide;
    }
    
    /**
     * Permet de se connecter au planning
     *
     * @param statement
     * @param mail
     * @param password
     * @return 
     */
    public static int connectAccount(Statement statement, String mail, String password) {
        
        String connectTable = "SELECT `niveau` FROM `utilisateurs` WHERE utilisateurs.MAIL = '" + mail + "' AND utilisateurs.mdp = '" + password + "'";
        
        // Définit à 0 pour éviter des erreurs
        int niveau = 0;
        
        if (statement != null) {
            try {
                ResultSet res = statement.executeQuery(connectTable);
                if(res.next()){
                    niveau = res.getInt("niveau");
                }
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
            }
        }
        return 3;//niveau;
    }
    
//    /**
//     * Permet de supprimer un compte utilisateur
//     *
//     * @param statement
//     * @param mail
//     * @return 
//     */
//    public static boolean deleteAccount(Statement statement, String mail){
//        
//        String delete="DELETE FROM utilisateurs WHERE mail='"+mail+"'";
//        
//        if(statement!=null){
//            try{
//                return statement.execute(delete);
//            }
//            catch (SQLException ex) {
//                System.out.println("Erreur de création de la base de donnée " + ex);
//            }
//        }return false; //A VERIFIER
//    };

    // Requêtes pour les réservations
    
    /**
     * Permet d'ajouter une réservation
     * 
     * @param statement
     * @param mail
     * @param date
     * @param heure
     * @param numSalle
     * @return 
     */
    public static boolean addReservation(Statement statement, String mail, String date, String heure, String numSalle) {
        
        //System.out.println(date);
        String createTable = "INSERT INTO `reunions` (`id_reunion`, `mail_organisateur`, `date_reunion`, `num_salle`) VALUES (NULL, '" + mail + "', " + date + ", " + parseInt(numSalle) + ")";
        boolean valide = true;
        
        if (statement != null) {
            try {
                return statement.execute(createTable);
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
                valide = false;
            }
        }
        return valide;
    }
    
    /**
     * Permet de modifier une réservation
     * 
     * @param statement
     * @param data
     */
    public static void editReservation(Statement statement, Object[][] data) {
        
    }
    
    /**
     * Permet de supprimer une réservation
     * 
     * @param statement
     * @param data
     */
    public static void removeReservation(Statement statement, Object[][] data) {
        
    }
    
    /**
     * Permet pour un administrateur de valider une réservation
     * 
     * @param statement
     * @param data
     */
    public static void validateReservation(Statement statement, Object[][] data) {
        
    }
    
    // Requête sur les utilisateurs
    
    /**
     * Permet pour un administrateur de promouvoir un utilisateur
     * 
     * @param statement
     * @param data
     */
    public static void promoteUser(Statement statement, Object[][] data) {
        
    }
    
    // Requêtes pour les équipements
    
    /**
     * Permet d'ajouter un équipement
     * 
     * @param statement
     * @param nom
     * @return 
     */
    public static boolean addEquipment(Statement statement, String nom) {
        
        String createTable = "INSERT INTO `equipement` (`IdEquipement`, `NomEquipement`) VALUES (NULL, '" + nom + "') ";
        boolean valide = true;
        
        if (statement != null) {
            try {
                return statement.execute(createTable);
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
                valide = false;
            }
        }
        return valide;
    }
    
    /**
     * Permet de modifier un équipement
     * 
     * @param statement
     * @param data
     */
    public static void editEquipment(Statement statement, Object[][] data) {
        
    }
    
    /**
     * Permet de supprimer un équipement
     * 
     * @param statement
     * @param data
     */
    public static void removeEquipment(Statement statement, Object[][] data) {
        
    }
    
    // Requêtes pour les salles
    
    /**
     * Permet d'ajouter une salle
     * 
     * @param statement
     * @param nom
     * @param taille
     * @param equipement
     * @return 
     */
    public static boolean addRoom(Statement statement, String nom, String taille, String equipement) {
        
        String createTable = "INSERT INTO `salles` (`IdSalle`, `NomSalle`, `TailleSalle`, `Equipement`) VALUES (NULL, '"+ nom + "', '" + parseInt(taille) + "', '" + equipement + "') ";
        boolean valide = true;
        
        if (statement != null) {
            try {
                return statement.execute(createTable);
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
                valide = false;
            }
        }
        return valide;
    }
    
    /**
     * Permet de modifier une salle
     * 
     * @param statement
     * @param data
     */
    public static void editRoom(Statement statement, Object[][] data) {
        
    }
    
    /**
     * Permet de supprimer une salle
     * 
     * @param statement
     * @param data
     */
    public static void removeRoom(Statement statement, Object[][] data) {
        
    }

}
