package BDD;

import java.sql.*;

/**
 *
 * @author muthk
 */
public class Requetes {

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
    
    public static boolean createAccount(Statement statement, String name, String firstName, String mail, String password) {
        
        String createTable = "INSERT INTO `utilisateurs` (`NOM`, `PRENOM`, `MAIL`, `mdp`, `niveau`) VALUES ('" + name + "', '" + firstName + "', '" + mail + "', '" + password + "', '1')";

        if (statement != null) {
            try {
                return statement.execute(createTable);
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
            }
        }
        return true;
    }
    
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
    
    public static void afficherEquipement(Statement statement, Object[][] data) {
        
        String connectTable = "SELECT * FROM equipement";
        
        if (statement != null) {
            try {
                ResultSet res = statement.executeQuery(connectTable);
                int i = 0;
                while (res.next()) {
                    int id = res.getInt("IdEquipement");
                    String nom = res.getString("NomEquipement");
                    boolean actions = res.getBoolean("Actions");
                    data[i][0] = id + "";
                    data[i][1] = nom;
                    data[i][2] = actions;
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
            }
        }
    }

}
