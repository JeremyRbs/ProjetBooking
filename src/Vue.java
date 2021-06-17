/*
 * Cette page Fenetre permet de créer une fenêtre simple.
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import static BDD.Requetes.*;

public class Vue extends JFrame implements ActionListener {

    ////////////////////////////////////////////////////////////////////////
    ///////////// Déclarations et initialisations des panneaux /////////////
    ////////////////////////////////////////////////////////////////////////
    
    /////// Connexion BDD ///////
    private Statement statement = connexion();
    
    /////// Bouton quitter pour fermer l'application ///////
    private JButton quitButton = new JButton("Quitter");
    
    /////// Panneau courant ///////
    private JPanel currentPanel = null;
    
    /////// Image de panneau ///////
    Image imageDeFond = Toolkit.getDefaultToolkit().getImage("background.PNG"); // récupère l'image
    
    /////// Panneau de démarrage ///////
    private JPanel startPanel;
    private JLabel labelBooking = new JLabel("BOOKING");
    private JButton b_creation_startPanel;
    private JButton b_register_startPanel;
    
    /////// Panneau de connexion de compte ///////
    private JPanel fieldPanel_connectionPanel, connectionPanel;
    private JLabel email_connectionPanel, password_connectionPanel, l_register_connectionPanel;
    private JTextField emailField_connectionPanel, passwordField_connectionPanel;
    private JButton b_register_connectionPanel;
    
    /////// Panneau de création de compte ///////
    private JPanel phonePanel_creationAccountPanel, fieldPanel_creationAccountPanel, creationAccountPanel;
    private JLabel name_creationAccountPanel, firstName_creationAccountPanel, email_creationAccountPanel, password_creationAccountPanel, mobile_creationAccountPanel, l_register_creationAccountPanel;
    private JTextField nameField_creationAccountPanel, firstNameField_creationAccountPanel, emailField_creationAccountPanel, passwordField_creationAccountPanel, mobileField_creationAccountPanel, countryCode_creationAccountPanel;
    private JButton b_register_creationAccountPanel;
    
    /////// Panneau du menu ///////
    private JPanel planningPanel = new JPanel(new BorderLayout());

    ////////////////////////////////////////////////////////////////////////
    ////////////////// Constructeur de la classe Fenetre ///////////////////
    ////////////////////////////////////////////////////////////////////////
    
    public Vue()
    {
        
        //////////////////////////////////////////////////
        
        ////////////////////////////////////
        /////// Panneau de démarrage ///////
        ////////////////////////////////////
        
        //creationAccountPanel et ses composants
        startPanel = new JPanel();
        startPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        
        Font font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        b_creation_startPanel = new JButton("Se créer un compte");
        b_register_startPanel = new JButton("Se connecter");
        
        b_creation_startPanel.addActionListener(this);
        b_register_startPanel.addActionListener(this);
        quitButton.addActionListener(this);
        
        startPanel.add(b_creation_startPanel);
        startPanel.add(b_register_startPanel);
        startPanel.add(quitButton);
        this.setPane(this.startPanel);
        
        /////////////////////////////////////////////
        /////// Panneau de création de compte ///////
        /////////////////////////////////////////////
        
        //phonePanelcreationAccountPanel et ses composants
        phonePanel_creationAccountPanel = new JPanel();
        phonePanel_creationAccountPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        mobileField_creationAccountPanel = new JTextField(15);
        countryCode_creationAccountPanel = new JTextField(2);
        countryCode_creationAccountPanel.setText("+33");
        countryCode_creationAccountPanel.setEnabled(false);
        phonePanel_creationAccountPanel.add(countryCode_creationAccountPanel);
        phonePanel_creationAccountPanel.add(mobileField_creationAccountPanel);

        //fieldPanel_creationAccountPanel et ses composants
        fieldPanel_creationAccountPanel = new JPanel();
        fieldPanel_creationAccountPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel_creationAccountPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        name_creationAccountPanel = new JLabel("Nom : ");
        firstName_creationAccountPanel = new JLabel("Prénom :");
        email_creationAccountPanel = new JLabel("Email : ");
        password_creationAccountPanel = new JLabel("Mot de passe : ");
        mobile_creationAccountPanel = new JLabel("Téléphone : ");
        nameField_creationAccountPanel = new JTextField(15);
        firstNameField_creationAccountPanel = new JTextField(15);
        emailField_creationAccountPanel = new JTextField(15);
        passwordField_creationAccountPanel = new JTextField(15);
        fieldPanel_creationAccountPanel.add(name_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(nameField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(firstName_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(firstNameField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(email_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(emailField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(password_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(passwordField_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(mobile_creationAccountPanel);
        fieldPanel_creationAccountPanel.add(phonePanel_creationAccountPanel);

        //creationAccountPanel et ses composants
        creationAccountPanel = new JPanel();
        creationAccountPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        creationAccountPanel.setLayout(new BoxLayout(creationAccountPanel, BoxLayout.Y_AXIS));
        
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        
        l_register_creationAccountPanel = new JLabel("Créer un compte");
        l_register_creationAccountPanel.setFont(font);
        l_register_creationAccountPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        b_register_creationAccountPanel = new JButton("Créer un compte");
        b_register_creationAccountPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_register_creationAccountPanel.addActionListener(this);
        
        creationAccountPanel.add(l_register_creationAccountPanel);
        creationAccountPanel.add(fieldPanel_creationAccountPanel);
        creationAccountPanel.add(b_register_creationAccountPanel);
        
        //////////////////////////////////////////////
        /////// Panneau de connexion de compte ///////
        //////////////////////////////////////////////
        
        //fieldPanel_connectionPanel et ses composants
        fieldPanel_connectionPanel = new JPanel();
        fieldPanel_connectionPanel.setLayout(new GridLayout(5,2,3,3));
        fieldPanel_connectionPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        email_connectionPanel = new JLabel("Mail : ");
        password_connectionPanel = new JLabel("Mot de passe : ");
        emailField_connectionPanel = new JTextField(15);
        passwordField_connectionPanel = new JTextField(15);
        fieldPanel_connectionPanel.add(email_connectionPanel);
        fieldPanel_connectionPanel.add(emailField_connectionPanel);
        fieldPanel_connectionPanel.add(password_connectionPanel);
        fieldPanel_connectionPanel.add(passwordField_connectionPanel);

        //connectionPanel et ses composants
        connectionPanel = new JPanel();
        connectionPanel.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
        connectionPanel.setLayout(new BoxLayout(connectionPanel, BoxLayout.Y_AXIS));
        font = new Font("MS Sans Serif", Font.BOLD, 18);
        l_register_connectionPanel = new JLabel("Se connecter");
        l_register_connectionPanel.setFont(font);
        l_register_connectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_register_connectionPanel = new JButton("Connexion");
        b_register_connectionPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        b_register_connectionPanel.addActionListener(this);
        connectionPanel.add(l_register_connectionPanel);
        connectionPanel.add(fieldPanel_connectionPanel);
        connectionPanel.add(b_register_connectionPanel);
        
        ///////////////////////////////////
        /////// Panneau du planning ///////
        ///////////////////////////////////
        
        ////////////////////////////////////////
        /////// Paramètres de la fenêtre ///////
        ////////////////////////////////////////
        
        this.setTitle("Booking");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.centerFrame();
    }

    ////////////////////////////////////////////////////////////////////////
    ///////////////////// Méthodes de la classe Fenetre ////////////////////
    ////////////////////////////////////////////////////////////////////////
    
    // Méthode permettant de centrer la fenêtre
    public void centerFrame() {
        Dimension currentScreen = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((currentScreen.getWidth() - this.getWidth()) / 2);
        int y = (int) ((currentScreen.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
    }
    
    public void setPane(JPanel pane){
        
        if(this.currentPanel != null){
            
            this.getContentPane().remove(this.currentPanel);
            this.repaint();
            
        }
        this.getContentPane().add(pane);
        this.setContentPane(pane);
        this.validate();
        this.pack();
        this.currentPanel = pane;
        this.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch (e.getActionCommand()){
            case "Se créer un compte":
                setPane(this.creationAccountPanel);
                break;
            case "Se connecter":
                setPane(this.connectionPanel);
                break;
            case "Créer un compte":
                this.statement = connexion(); //Opération d'initialisation du driver, de la base de données et du Statement
                if (statement != null) {
                    //Execution de requête de lecture sur l'objet Statement
                    if (createAccount(statement, this.nameField_creationAccountPanel.getText(), this.firstNameField_creationAccountPanel.getText(), this.emailField_creationAccountPanel.getText(), this.passwordField_creationAccountPanel.getText()) == false ){
                        setPane(this.planningPanel);
                    }
                }
                break;
            case "Connexion":
                this.statement = connexion(); //Opération d'initialisation du driver, de la base de données et du Statement
                if (this.statement != null) {
                    //Execution de requête de lecture sur l'objet Statement
                    if (connectAccount(statement, this.emailField_connectionPanel.getText(), this.passwordField_connectionPanel.getText()) == 1 ){
                        setPane(this.planningPanel);
                    }else if(connectAccount(statement, this.emailField_connectionPanel.getText(), this.passwordField_connectionPanel.getText()) == 2 ){
                        setPane(this.planningPanel);
                    }else{
                        setPane(this.planningPanel);
                    }
                }
                break;
            case "Quitter":
                System.exit(0);
                break;
        }
    }
    
//    /**
//     * Ajouter un écouteur à un bouton désigné par son nom
//     *
//     * @param nomBouton le nom du bouton sur lequel l'écouteur doit être ajouté
//     * @param listener l'écouteur à ajouter
//     */
//    public void ajouterEcouteurBouton(String nomBouton, ActionListener listener) {
//        JButton bouton;
//        bouton = switch (nomBouton) {
//            case "Se créer un compte" ->
//                bouton = this.b_creation_startPanel;
//            case "Se connecter" ->
//                bouton = this.b_register_startPanel;
//            case "Créer un compte" ->
//                bouton = this.b_register_creationAccountPanel;
//            case "Connexion" ->
//                bouton = this.b_register_creationAccountPanel;
//            case "Quitter" ->
//                bouton = this.quitButton;
//            default ->
//                null;
//        };
//        if (bouton != null) {
//            bouton.addActionListener(listener);
//        }
//    }
}