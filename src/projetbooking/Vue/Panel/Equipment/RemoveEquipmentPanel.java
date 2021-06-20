package projetbooking.Vue.Panel.Equipment;

import static BDD.Requetes.connexion;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Jérémy RIBES
 */
public class RemoveEquipmentPanel extends JPanel{
    
    private boolean DEBUG = false;
    private JPanel panel = new JPanel(new BorderLayout()),
            northPanel = new JPanel(new BorderLayout()),
            centerPanel = new JPanel(new BorderLayout()),
            southPanel = new JPanel(new BorderLayout());
    
    private JLabel titre = new JLabel("Supprimer l'équipement");
    private JButton b_remove = new JButton("Supprimer l'équipement");
    private JButton b_back = new JButton("Retour");
    
    /////// Connexion BDD ///////
    private Statement statement = connexion();
    
    /**
     * Constructeur de RemoveEquipmentPanel()
     * 
     * @throws java.sql.SQLException
     */
    public RemoveEquipmentPanel() throws SQLException {

        ResultSet res;
                
        String[] columnNames = {"Id",
                                "Nom",
                                "Actions"};

        Object[][] data = new Object[50][3];

        this.statement = connexion(); //Opération d'initialisation du driver, de la base de données et du Statement
        String query = "SELECT * FROM equipement";
        if(this.statement != null){
            res = statement.executeQuery(query);
            int i = 0;
            while (res.next()) {
              int id = res.getInt("IdEquipement");
              String nom = res.getString("NomEquipement");
              data[i][0] = id + "";
              data[i][1] = nom;
              data[i][2] = false;
              i++;
            }
        }

        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 70));
        table.setFillsViewportHeight(true);

        if (DEBUG) {
            table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    printDebugData(table);
                }
            });
        }

        // Création du scroll pane et ajout de la table
        JScrollPane scrollPane = new JScrollPane(table);

        // Ajout du scroll pane au panneau principal
        this.northPanel.add(this.titre, BorderLayout.CENTER);
        this.panel.add(this.northPanel, BorderLayout.NORTH);
        this.centerPanel.add(scrollPane, BorderLayout.CENTER);
        this.panel.add(this.centerPanel, BorderLayout.CENTER);
        this.southPanel.add(this.b_back, BorderLayout.WEST);
        this.southPanel.add(this.b_remove, BorderLayout.CENTER);
        this.panel.add(this.southPanel, BorderLayout.SOUTH);
        add(this.panel);
    }

    /**
     * Permet d'afficher la valeur des dates
     */
    private void printDebugData(JTable table) {
        int numRows = table.getRowCount();
        int numCols = table.getColumnCount();
        javax.swing.table.TableModel model = table.getModel();

        System.out.println("Value of data: ");
        for (int i=0; i < numRows; i++) {
            System.out.print("    row " + i + ":");
            for (int j=0; j < numCols; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
        
    }
    
    /**
     * Ajouter un écouteur à un bouton désigné par son nom
     *
     * @param nomBouton le nom du bouton sur lequel l'écouteur doit être ajouté
     * @param listener l'écouteur à ajouter
     */
    public void ajouterEcouteurBouton(String nomBouton, ActionListener listener) {
        JButton bouton;
        bouton = switch (nomBouton) {
            case "Retour" ->
                bouton = this.b_back;
            case "Supprimer l'équipement" ->
                bouton = this.b_remove;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }
}
