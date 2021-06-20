/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import projetbooking.Controller.Controleur;
import projetbooking.Modele.Modele;

/**
 *
 * @author Jerem
 */
public class Main {
    
    /**
     * Méthode main() permettant de lancer l'application
     * 
     * @param args
     */
    public static void main(String[] args){
            
        //On soumet l'intialisation de l'interface graphique à la file d'attente de l'EDT (Event Dispatching Thread)
        SwingUtilities.invokeLater(() -> {
            
            //Création d'un contrôleur qui communique avec une vue et un modèle
            Controleur controleur;
            try {
                  controleur = new Controleur(new Vue(),new Modele());
                  controleur.getVue().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                  controleur.getVue().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
}
