package projetbooking.Vue.Panel.Planning;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import static java.awt.FlowLayout.*;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PlanningPanel extends JPanel {
    
    /// Panneau principal de planning ///
    JPanel beginPanel_planning = new JPanel(new BorderLayout(10, 20));    // Begin Panel : panneau contenant tous les panneaux
    JPanel northPanel_planning = new JPanel(new BorderLayout());    // North Panel
    JPanel northPanel_east_planning = new JPanel(new FlowLayout(FlowLayout.RIGHT, 22, 25)); // North Panel East
    JPanel westPanel_planning = new JPanel(new GridLayout(3,1)); // West Panel
    JPanel westPanel_title_planning = new JPanel();  // West Panel Title
    JPanel westPanel_planning_planning = new JPanel();   // West Panel Planning
    JPanel centerPanel_planning = new JPanel();   // Center Panel
    JPanel eastPanel_planning = new JPanel(new BorderLayout());   // East Panel
    JPanel southPanel_planning = new JPanel(new BorderLayout());   // South Panel
    
    /// Partie titre ///
    private JLabel title_planning = new JLabel("CONSULTATION");
    
    // Partie utilisateur
    private JLabel username_planning = new JLabel("Hubert");
    private JButton deconnection_planning = new JButton("Déconnexion");
    private JButton reservation_planning = new JButton("Réservation");
    private JButton salle_planning = new JButton("Salle");
    private JButton equipement_planning = new JButton("Équipement");

    /// Partie calendrier ///
    protected int yy_planning; // année courante
    protected int mm_planning, dd_planning; // mois et jours courants
    protected JButton labs_planning[][];   // boutons du planning
    protected int leadGap_planning = 0;    // nombre de jours à laisser en carrés vides
    Calendar calendar_planning = new GregorianCalendar();  // objet Calendrier
    protected final int thisYear_planning = calendar_planning.get(Calendar.YEAR);   // année actuelle
    protected final int thisMonth_planning = calendar_planning.get(Calendar.MONTH); // mois actuel
    private JButton b0_planning;   // un des boutons pour garder la référence du getBackground();
    private JComboBox monthChoice_planning;    // le mois sémectionné
    private JComboBox yearChoice_planning; // l'année sélectionnée
 
  /**
   * Constructeur de PlanningPanel()
   * @param niveau
   */
  public PlanningPanel(int niveau) {
      
    super();
    this.setYYMMDD(calendar_planning.get(Calendar.YEAR), calendar_planning.get(Calendar.MONTH),calendar_planning.get(Calendar.DAY_OF_MONTH));
    this.getAccessibleContext().setAccessibleDescription("Le calendrier n'est pas accessible maintenant. Désolé !");
    
    // North Panel
    
    this.beginPanel_planning.add(this.northPanel_planning, BorderLayout.NORTH);

    this.title_planning.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
    this.username_planning.setForeground(new Color(100,149,237));
    
    this.northPanel_planning.add(this.title_planning, BorderLayout.WEST);
    this.northPanel_east_planning.add(this.username_planning);
    this.northPanel_east_planning.add(this.deconnection_planning);
    this.northPanel_planning.add(this.northPanel_east_planning);
 
    // West Panel
    
    this.beginPanel_planning.add(this.westPanel_planning, BorderLayout.WEST);
    
    // Panneau pour sélectionner le mois et l'année
    this.westPanel_title_planning.add(monthChoice_planning = new JComboBox());
    
        for (String month : months) {
            monthChoice_planning.addItem(month);
        }
    
    monthChoice_planning.setSelectedItem(months[mm_planning]);
    monthChoice_planning.addActionListener((ActionEvent ae) -> {
        int i = monthChoice_planning.getSelectedIndex();
        if (i >= 0) {
            mm_planning = i;
            recompute();
        }
    });
    
    monthChoice_planning.getAccessibleContext().setAccessibleName("Mois");
    monthChoice_planning.getAccessibleContext().setAccessibleDescription("Choisissez un mois dans l'année");
 
    this.westPanel_title_planning.add(yearChoice_planning = new JComboBox());
    yearChoice_planning.setEditable(true);
    
    for (int i = yy_planning - 5; i < yy_planning + 5; i++){
      yearChoice_planning.addItem(Integer.toString(i));
    }
    
    yearChoice_planning.setSelectedItem(Integer.toString(yy_planning));
    yearChoice_planning.addActionListener((ActionEvent ae) -> {
        int i = yearChoice_planning.getSelectedIndex();
        if (i >= 0){
            yy_planning = Integer.parseInt(yearChoice_planning.getSelectedItem().toString());
            recompute();
        }
    });
    
    add(BorderLayout.CENTER, this.westPanel_title_planning);
    this.westPanel_planning.add(this.westPanel_title_planning);
 
    // Panneau pour sélectionner les jours
    this.westPanel_planning.setAlignmentX(LEFT);
    this.westPanel_planning.setLayout(new GridLayout(7, 7));
    labs_planning = new JButton[6][7]; // La première ligne représente les jours
 
    this.westPanel_planning.add(b0_planning = new JButton("D"));
    this.westPanel_planning.add(new JButton("L"));
    this.westPanel_planning.add(new JButton("M"));
    this.westPanel_planning.add(new JButton("MC"));
    this.westPanel_planning.add(new JButton("J"));
    this.westPanel_planning.add(new JButton("V"));
    this.westPanel_planning.add(new JButton("S"));
 
    ActionListener dateSetter = (ActionEvent e) -> {
        String num = e.getActionCommand();
        if (!num.equals("")) {
            // Envoi du jour sélectionné
            setDayActive(Integer.parseInt(num));
        }
    };
 
    // Création et ajout des bouttons
    for (int i = 0; i < 6; i++){
      for (int j = 0; j < 7; j++) {
        this.westPanel_planning.add(labs_planning[i][j] = new JButton(""));
        labs_planning[i][j].addActionListener(dateSetter);
      }
    }
    
    this.beginPanel_planning.add(this.westPanel_planning);
    
    // Center Panel
    this.beginPanel_planning.add(this.centerPanel_planning, BorderLayout.CENTER);
    
    // East Panel
    
    // Data to be displayed in the JTable
    String[][] data = {
        { "8h", "-------" },
        { "9h", "-------" },
        { "10h", "-------" },
        { "11h", "-------" },
        { "12h", "-------" },
        { "13h", "-------" },
        { "14h", "-------" },
        { "15h", "-------" },
        { "16h", "-------" },
        { "17h", "-------" },
        { "18h", "-------" },
        { "19h", "-------" },
    };

    // Column Names
    String[] columnNames = { "Heures", "Rendez-vous" };

    // Initializing the JTable
    JTable agenda = new JTable(data, columnNames);

    // adding it to JScrollPane
    JScrollPane sp = new JScrollPane(agenda);
    this.beginPanel_planning.add(sp, BorderLayout.EAST);
    
    // South Panel
    if(niveau == 2){
        this.southPanel_planning.add(this.reservation_planning, BorderLayout.NORTH);
    }else if(niveau == 3){
        this.reservation_planning = new JButton("A - Réservation");
        this.southPanel_planning.add(this.reservation_planning, BorderLayout.NORTH);
        this.southPanel_planning.add(this.salle_planning, BorderLayout.CENTER);
        this.southPanel_planning.add(this.equipement_planning, BorderLayout.SOUTH);
    }
    this.beginPanel_planning.add(this.southPanel_planning, BorderLayout.SOUTH);
    Component add = add(this.beginPanel_planning);
    this.add(add);
    
  }
  
    // Méthode permettant de centrer la fenêtre
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
 
    // Méthode permettant de récupérer la date
    private void setYYMMDD(int year, int month, int today) {
      yy_planning = year;
      mm_planning = month;
      dd_planning = today;
    }
 
    String[] months = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin",
        "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre" };
 
    
    public final static int dom[] = { 31, 28, 31, 30, /* jan fev mar avr */
    31, 30, 31, 31, /* mai jui juil aou */
    30, 31, 30, 31 /* sep oct nov dec */
    };
 
    // Méthode permettant de calculer quels jours mettre où dans le panneau du calendrier
    protected void recompute() {

      // System.out.println("Cal::recompute: " + yy + ":" + mm + ":" + dd);
      if (mm_planning < 0 || mm_planning > 11){
        throw new IllegalArgumentException("Month " + mm_planning + " bad, must be 0-11");
      }

      clearDayActive();
      calendar_planning = new GregorianCalendar(yy_planning, mm_planning, dd_planning);

      // Compute how much to leave before the first.
      // getDay() returns 0 for Sunday, which is just right.
      leadGap_planning = new GregorianCalendar(yy_planning, mm_planning, 1).get(Calendar.DAY_OF_WEEK) - 1;
      // System.out.println("leadGap = " + leadGap);

      int daysInMonth = dom[mm_planning];
      if (isLeap(calendar_planning.get(Calendar.YEAR)) && mm_planning > 1){
        ++daysInMonth;
      }

      // Vide les étiquettes avant le 1er jour du mois
      for (int i = 0; i < leadGap_planning; i++) {
        labs_planning[0][i].setText("");
      }

      // Remplissage des chiffres pour le jour du mois
      for (int i = 1; i <= daysInMonth; i++) {
        JButton b = labs_planning[(leadGap_planning + i - 1) / 7][(leadGap_planning + i - 1) % 7];
        b.setText(Integer.toString(i));
      }

      // 7 jours/semaine sur 6 lignes
      for (int i = leadGap_planning + 1 + daysInMonth; i < 6 * 7; i++) {
        labs_planning[(i) / 7][(i) % 7].setText("");
      }

      // Colories le jour seulement si c'est dans le mois affiché
      if (thisYear_planning == yy_planning && mm_planning == thisMonth_planning){
        setDayActive(dd_planning); // Colories la case pour le jour
      }

      // La case doit être redessinée sur l'écran
      repaint();
      
    }
 
    /**
     * isLeap() returns true si l'année sélectionnée est bissextile."une année est bissextile si elle est divisible par 4 mais pas par 100, sauf
 si elle est divisible par 400"
     *
     * @param year
     * @return 
     */
    public boolean isLeap(int year) {
      return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
 
    // Envoi du jour, du mois et de l'année
    public void setDate(int yy, int mm, int dd) {

      this.yy_planning = yy;
      this.mm_planning = mm; // Début à 0, comme Date
      this.dd_planning = dd;
      recompute();
    }
 
    // Désactiver tout jour précédemment mis en surbrillance
    private void clearDayActive() {
      JButton b;

      // First un-shade the previously-selected square, if any
      if (activeDay > 0) {
        b = labs_planning[(leadGap_planning + activeDay - 1) / 7][(leadGap_planning + activeDay - 1) % 7];
        b.setBackground(b0_planning.getBackground());
        b.repaint();
        activeDay = -1;
      }
    }
 
    private int activeDay = -1;
 
    // Envoi du jour dans le mois courant
    public void setDayActive(int newDay) {

      clearDayActive();

      // Envoi du nouveau jour
      if (newDay <= 0){
        dd_planning = new GregorianCalendar().get(Calendar.DAY_OF_MONTH);
      }else{
        dd_planning = newDay;
      }

      // Met en couleur le carré sélectionné
      Component square = labs_planning[(leadGap_planning + newDay - 1) / 7][(leadGap_planning + newDay - 1) % 7];
      square.setBackground(Color.red);
      square.repaint();
      activeDay = newDay;

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
            case "Déconnexion" ->
                bouton = this.deconnection_planning;
            case "Réservation" ->
                bouton = this.reservation_planning;
            case "A - Réservation" ->
                bouton = this.reservation_planning;
            case "Salle" ->
                bouton = this.salle_planning;
            case "Équipement" ->
                bouton = this.equipement_planning;
            default ->
                null;
        };
        if (bouton != null) {
            bouton.addActionListener(listener);
        }
    }

}