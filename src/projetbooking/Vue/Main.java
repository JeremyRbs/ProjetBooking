/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetbooking.Vue;

import projetbooking.Vue.Vue;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import projetbooking.Controller.Controleur;
import projetbooking.Modele.Modele;

/**
 *
 * @author Jerem
 */
public class Main {
    
    public static void main(String[] args){
            
    //On soumet l'intialisation de l'interface graphique à la file d'attente de l'EDT (Event Dispatching Thread)
          SwingUtilities.invokeLater(new Runnable() {
              @Override
              public void run() {
                  //Création d'une contrôleur qui communique avec une vue et un modèle
                  Controleur controleur = new Controleur(new Vue(),new Modele());                
                  controleur.getVue().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                  controleur.getVue().setVisible(true);
              }
          });
    }
}
