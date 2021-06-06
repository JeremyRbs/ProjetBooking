package projetbooking.Controller;

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
        String chaineSQL = "INSERT INTO `utilisateurs` (`NOM`, `PRENOM`, `MAIL`, `mdp`, `niveau`) VALUES ('MUTH', 'Kévin', 'kevin.muth.auditeur@lecnam.net', '0000', '2') ";
        ResultSet resultatRequete = null;
        if (statement != null) {
            try {
                resultatRequete = statement.executeQuery(chaineSQL);
                System.out.println(resultatRequete);
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
    
    public static boolean creerCompte(Statement statement, String name, String firstName, String mail, String password, int level) {
        
        String createTable = "INSERT INTO `utilisateurs` (`NOM`, `PRENOM`, `MAIL`, `mdp`, `niveau`) VALUES ('" + name + "', '" + firstName + "', '" + mail + "', '" + password + "', '" + level + "')";

        if (statement != null) {
            try {
                return statement.execute(createTable);
            } catch (SQLException ex) {
                System.out.println("Erreur de création de la base de donnée " + ex);
            }
        }
        return true;
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        Statement statement = connexion(); //Opération d'initialisation du driver, de la base de données et du Statement
        if (statement != null) {
            System.out.println("Etat initial");
            //lot0_1(statement); //Execution de requête de lecture sur l'objet Statement
        }
        Connection connection = statement.getConnection();
        statement.close();
        connection.close();

    }

}
