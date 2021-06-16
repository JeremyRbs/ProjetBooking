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

        if (statement != null) {
            try {
                statement.execute(connectTable);
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
            }
        }
        return 1;
    }

}
