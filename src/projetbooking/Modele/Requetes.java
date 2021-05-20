package projetbooking.Modele;

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

    public static void lectureBDD(Statement statement) { //Requetes de lecture
        //Execution d'une requête SQL simple et récupération du resultat dans un objet ResultSet
        String chaineSQL = "SELECT * FROM utilisateurs";
        ResultSet resultatRequete = null;
        if (statement != null) {
            try {
                resultatRequete = statement.executeQuery(chaineSQL);
            } catch (SQLException ex) {
                System.out.println("Erreur d'exécution de la requête : " + ex);
            }
        }
        if (resultatRequete != null){
            try{
                resultatRequete.next();
            }
            catch (SQLException ex){
                
            }
        }
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Statement statement = connexion(); //Opération d'initialisation du driver, de la base de données et du Statement
        if (statement != null) {
            System.out.println("Etat initial");
            lectureBDD(statement); //Execution de requête de lecture sur l'objet Statement
        }
        Connection connection = statement.getConnection();
        statement.close();
        connection.close();

    }

}
