package BDD;


import java.sql.*;

/**
 *
 * @author Jérémy RIBES
 */
public class JDBC_Connect {

    /**
     * Permet de se connecter à la base de données
     * @return 
     */
    public static Connection lot_Connect() {
        //L'Initialisation dynamique du driver n'est plus nécessaire il est automatiquement chargé en mémoire
        //Connection à la base de donnée
        
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/projetbooking", "root", "");
        } catch (SQLException ex) {
            System.out.println("Erreur de connection base de donnEes : " + ex);
        }
        return connection;
    }
}
