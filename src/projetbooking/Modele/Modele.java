package projetbooking.Modele;

import projetbooking.Controller.EmptyModelException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 * La classe Modele represente le modèle de l'architecture MVC. Elle contient
 * les données l'application Elle n'agit pas directement sur la vue
 *
 * @author Jérémy RIBES
 */
public class Modele {

    private final ArrayList<JButton> lesBoutons;

    /**
     * Constructeur du modèle
     */
    public Modele() {
        this.lesBoutons = new ArrayList<>();
    }

    /**
     * Vérifie si le modèle contient des données
     *
     * @return true si le modèle ne contient pas de données, false dans le cas
     * contraire
     */
    public boolean estVide() {
        return lesBoutons.isEmpty();
    }

    /**
     * Ajoute un bouton dans la pile du modèle
     *
     * @param bouton le bouton à ajouter
     */
    public void push(JButton bouton) {
        lesBoutons.add(bouton);
    }

    /**
     * Retire et retourne le dernier bouton ajouté à la pile du modèle
     *
     * @return le bouton retiré ou null si aucun bouton
     * @throws projetbooking.Controller.EmptyModelException
     */
    public JButton pop() throws EmptyModelException {
        if (lesBoutons.isEmpty()) {
            throw new EmptyModelException("Le modèle est vide - Impossible de retirer un bouton");
        }
        return lesBoutons.remove(lesBoutons.size() - 1);
    }

    /**
     * Retire tous les boutons du modèle
     */
    public void clear() {
        lesBoutons.clear();
    }

    /**
     * Vérifie si un bouton portant le même nom est déjà présent dans le modèle
     *
     * @param nom Le nom du bouton à vérifer
     * @return true si un bouton avec le même nom est présent, false dans le cas
     * contraire
     */
    public boolean contient(String nom) {

        return lesBoutons.stream().anyMatch(bouton -> (bouton.getText().toUpperCase().equals(nom.toUpperCase())));
    }

    /**
     * Afficher un information sur le modèle retourne le nombre de boutons
     * contenus dans le modèle
     */
    public void afficher() {
        String message = "Le modèle contient " + lesBoutons.size() + " bouton" + (lesBoutons.size() > 1 ? "s" : "");
        JOptionPane.showMessageDialog(null, message, "Information sur le  modèle", JOptionPane.INFORMATION_MESSAGE);
    }

}
