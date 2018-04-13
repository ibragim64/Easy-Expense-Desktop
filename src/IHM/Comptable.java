/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IHM;

<<<<<<< HEAD:src/IHM/Comptable.java
import DAO.UserDAO;
import Metier.User;
import java.awt.Color;
import static java.lang.String.valueOf;
=======
import DAO.NoteFraisDAO;
import DAO.UserDAO;
import Metier.NoteFrais;
import Metier.User;
import java.awt.Color;
import java.awt.Component;
>>>>>>> ibragim:src/graphic/Comptable.java
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
<<<<<<< HEAD:src/IHM/Comptable.java
=======
import javax.swing.DefaultListModel;
import javax.swing.JList;
>>>>>>> ibragim:src/graphic/Comptable.java

/**
 *
 * @author ibragim.abubakarov
 */
public class Comptable extends javax.swing.JFrame {

    private User currentComptable;
<<<<<<< HEAD:src/IHM/Comptable.java
    UserDAO userDAO = new UserDAO();

    public Comptable() {
        initComponents();
        this.setTitle("Comptable");
        this.setVisible(true);
        this.setResizable(false);

    }
=======
    
    private NoteFraisDAO conn;
    private UserDAO userConn;
    
    private ArrayList<User> selectedUsers;
    private ArrayList<NoteFrais> notesFraisSelectedUser;
    
    
    private DefaultListModel dm = new DefaultListModel();
>>>>>>> ibragim:src/graphic/Comptable.java

    /**
     * Creates new form Comptable
     */
<<<<<<< HEAD:src/IHM/Comptable.java
    public Comptable(User currentComptable) throws SQLException {
=======
    public Comptable(User currentCom) throws ClassNotFoundException {
>>>>>>> ibragim:src/graphic/Comptable.java
        initComponents();
        this.currentComptable = currentComptable;
        this.setSize(870, 550);
        this.setTitle("Comptable - " + currentComptable.getFirstName());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.prepareWelcome();
<<<<<<< HEAD:src/IHM/Comptable.java
        AccountActivity.setVisible(true);
        GestionCommercialActivity.setVisible(false);
        ListeNoteFraisActivity.setVisible(false);
        listeCommercialActivity.setVisible(false);
        getAccountInfo();
        gestionCommerciaux();
=======
        initAccountActivity();
        try {
            this.getCurrentNotesFrais();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        }
>>>>>>> ibragim:src/graphic/Comptable.java
    }

    public void gestionCommerciaux() throws SQLException {
        ArrayList<User> listeUser = userDAO.chargerCommerciaux();
        for (User user : listeUser) {
            listeCommerciaux.addItem(user);
        }
    }
<<<<<<< HEAD:src/IHM/Comptable.java

    public void getAccountInfo() {
        String id = valueOf(this.currentComptable.getId());
        this.IDField.setText(id);
        this.nomField.setText(this.currentComptable.getLastName());
        this.prenomField.setText(this.currentComptable.getFirstName());
        this.telField.setText(this.currentComptable.getTelephone());
        this.emailField.setText(this.currentComptable.getEmail());
        this.villeField.setText(this.currentComptable.getVille());
        this.cpField.setText(this.currentComptable.getCode_postal());
        this.typeField.setText(this.currentComptable.getAccountType());
    }

    public void initCurrentUser() {
        String currentUID = String.valueOf(this.currentComptable.getId());
        IDField.setText(currentUID);

=======
    
    
    public void initAccountActivity(){
        this.AccountActivity.setVisible(true);
        this.GestionCommercialActivity.setVisible(false);
        this.ListeNoteFraisActivity.setVisible(false);
        this.listeCommercialActivity.setVisible(false);
    }
    
    
    
    public void initCurrentUser(){
        String currentUID = String.valueOf(this.currentComptable.getId());
        IDField.setText(currentUID);
    }
    
    
    
    public void getCurrentNotesFrais() throws ClassNotFoundException, SQLException{
        this.userConn = new UserDAO();
        
        this.selectedUsers = userConn.getUsersFromEnterprise(this.currentComptable);
        
        for (User selectedUser : selectedUsers) {
            this.currentCommercialBox.addItem(selectedUser);
        }
>>>>>>> ibragim:src/graphic/Comptable.java
    }

    public void initCurrentComptable() {
        String currentID = String.valueOf(this.currentComptable.getId());
        IDField.setText(currentID);
        nomField.setText(this.currentComptable.getLastName());
        prenomField.setText(this.currentComptable.getFirstName());
        telField.setText(this.currentComptable.getTelephone());
        emailField.setText(this.currentComptable.getEmail());
        villeField.setText(this.currentComptable.getVille());
        cpField.setText(this.currentComptable.getCode_postal());
        typeField.setText(this.currentComptable.getAccountType());
    }

    public void prepareWelcome() {
        this.welcomeTXT.setText("Bienvenue " + currentComptable.getFirstName());
    }
    
    
    public void addItemToList(ArrayList<NoteFrais> items){
        this.notesFraisContainer.setModel(dm);
        dm.clear();
        for(int i = 0; i < items.size(); i++){
            dm.addElement(items.get(i));
        }
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        welcomeTXT = new javax.swing.JLabel();
        myaccBTN = new javax.swing.JPanel();
        myAccountBTN = new javax.swing.JLabel();
        GestionCommercialBTN = new javax.swing.JPanel();
        GestionCommercialLabel = new javax.swing.JLabel();
        listeNoteFraisBTN = new javax.swing.JPanel();
        listeNoteFraisLabel = new javax.swing.JLabel();
        signoutBTN = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        listeCommercial = new javax.swing.JPanel();
        listeCommercialLabel = new javax.swing.JLabel();
        mainContent = new javax.swing.JPanel();
        GestionCommercialActivity = new javax.swing.JPanel();
<<<<<<< HEAD:src/IHM/Comptable.java
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        typeField1 = new javax.swing.JLabel();
        cpField1 = new javax.swing.JLabel();
        villeField1 = new javax.swing.JLabel();
        emailField1 = new javax.swing.JLabel();
        telField1 = new javax.swing.JLabel();
        prenomField1 = new javax.swing.JLabel();
        nomField1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        listeCommerciaux = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        ListeNoteFraisActivity = new javax.swing.JPanel();
=======
>>>>>>> ibragim:src/graphic/Comptable.java
        listeCommercialActivity = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        currentCommercialBox = new javax.swing.JComboBox<>();
        printBTN = new javax.swing.JPanel();
        printLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        notesFraisContainer = new javax.swing.JList<>();
        ValidateBTN = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        getDetailsBTN = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ListeNoteFraisActivity = new javax.swing.JPanel();
        AccountActivity = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IDField = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nomField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        prenomField = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        emailField = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        villeField = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cpField = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        telField = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        typeField = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sidepanel.setBackground(new java.awt.Color(57, 55, 76));

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 190, 190));
        jLabel1.setText("Easy Expense");

        jSeparator1.setBackground(new java.awt.Color(222, 222, 222));
        jSeparator1.setForeground(new java.awt.Color(222, 222, 222));

        welcomeTXT.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        welcomeTXT.setForeground(new java.awt.Color(190, 190, 190));
        welcomeTXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeTXT.setText("Bienvenue");

        myaccBTN.setBackground(new java.awt.Color(57, 55, 76));
        myaccBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myaccBTNMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                myaccBTNMouseReleased(evt);
            }
        });

        myAccountBTN.setBackground(new java.awt.Color(0, 0, 0));
        myAccountBTN.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        myAccountBTN.setForeground(new java.awt.Color(190, 190, 190));
        myAccountBTN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        myAccountBTN.setText("Mon compte");
        myAccountBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myAccountBTNMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myAccountBTNMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                myAccountBTNMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout myaccBTNLayout = new javax.swing.GroupLayout(myaccBTN);
        myaccBTN.setLayout(myaccBTNLayout);
        myaccBTNLayout.setHorizontalGroup(
            myaccBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myAccountBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        myaccBTNLayout.setVerticalGroup(
            myaccBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myAccountBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        GestionCommercialBTN.setBackground(new java.awt.Color(57, 55, 76));

        GestionCommercialLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        GestionCommercialLabel.setForeground(new java.awt.Color(190, 190, 190));
        GestionCommercialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GestionCommercialLabel.setText("Gestion des commerciaux");
        GestionCommercialLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                GestionCommercialLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                GestionCommercialLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout GestionCommercialBTNLayout = new javax.swing.GroupLayout(GestionCommercialBTN);
        GestionCommercialBTN.setLayout(GestionCommercialBTNLayout);
        GestionCommercialBTNLayout.setHorizontalGroup(
            GestionCommercialBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GestionCommercialLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GestionCommercialBTNLayout.setVerticalGroup(
            GestionCommercialBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionCommercialBTNLayout.createSequentialGroup()
                .addComponent(GestionCommercialLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        listeNoteFraisBTN.setBackground(new java.awt.Color(57, 55, 76));

        listeNoteFraisLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        listeNoteFraisLabel.setForeground(new java.awt.Color(190, 190, 190));
        listeNoteFraisLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listeNoteFraisLabel.setText("Liste des notes de frais");
        listeNoteFraisLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listeNoteFraisLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listeNoteFraisLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout listeNoteFraisBTNLayout = new javax.swing.GroupLayout(listeNoteFraisBTN);
        listeNoteFraisBTN.setLayout(listeNoteFraisBTNLayout);
        listeNoteFraisBTNLayout.setHorizontalGroup(
            listeNoteFraisBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listeNoteFraisLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        listeNoteFraisBTNLayout.setVerticalGroup(
            listeNoteFraisBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listeNoteFraisBTNLayout.createSequentialGroup()
                .addComponent(listeNoteFraisLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        signoutBTN.setBackground(new java.awt.Color(57, 55, 76));

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(190, 190, 190));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Deconnexion");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout signoutBTNLayout = new javax.swing.GroupLayout(signoutBTN);
        signoutBTN.setLayout(signoutBTNLayout);
        signoutBTNLayout.setHorizontalGroup(
            signoutBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        signoutBTNLayout.setVerticalGroup(
            signoutBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signoutBTNLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        listeCommercial.setBackground(new java.awt.Color(57, 55, 76));

        listeCommercialLabel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        listeCommercialLabel.setForeground(new java.awt.Color(190, 190, 190));
        listeCommercialLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listeCommercialLabel.setText("Liste des commerciaux");
        listeCommercialLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                listeCommercialLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                listeCommercialLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout listeCommercialLayout = new javax.swing.GroupLayout(listeCommercial);
        listeCommercial.setLayout(listeCommercialLayout);
        listeCommercialLayout.setHorizontalGroup(
            listeCommercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listeCommercialLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        listeCommercialLayout.setVerticalGroup(
            listeCommercialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listeCommercialLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(myaccBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(GestionCommercialBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(welcomeTXT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(listeNoteFraisBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(signoutBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGroup(sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(sidepanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addComponent(listeCommercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidepanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(welcomeTXT)
                .addGap(27, 27, 27)
                .addComponent(myaccBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GestionCommercialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listeCommercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listeNoteFraisBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signoutBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        mainContent.setBackground(new java.awt.Color(35, 38, 53));

        GestionCommercialActivity.setBackground(new java.awt.Color(35, 38, 53));
        GestionCommercialActivity.setForeground(new java.awt.Color(190, 190, 190));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 190, 190));
        jLabel6.setText("Nom  :");

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(190, 190, 190));
        jLabel8.setText("Prenom :");

        jLabel16.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(190, 190, 190));
        jLabel16.setText("Telephone");

        jLabel10.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(190, 190, 190));
        jLabel10.setText("Email :");

        jLabel12.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(190, 190, 190));
        jLabel12.setText("Ville :");

        jLabel14.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(190, 190, 190));
        jLabel14.setText("Code postal");

        jLabel18.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(190, 190, 190));
        jLabel18.setText("Type Compte :");

        typeField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        typeField1.setForeground(new java.awt.Color(190, 190, 190));
        typeField1.setText("TYPE");

        cpField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cpField1.setForeground(new java.awt.Color(190, 190, 190));
        cpField1.setText("CODEPOSTAL");

        villeField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        villeField1.setForeground(new java.awt.Color(190, 190, 190));
        villeField1.setText("VILLE");

        emailField1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        emailField1.setForeground(new java.awt.Color(190, 190, 190));
        emailField1.setText("EMAIL");

        telField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        telField1.setForeground(new java.awt.Color(190, 190, 190));
        telField1.setText("TELEPHONE");

        prenomField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        prenomField1.setForeground(new java.awt.Color(190, 190, 190));
        prenomField1.setText("PRENOM");

        nomField1.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        nomField1.setForeground(new java.awt.Color(190, 190, 190));
        nomField1.setText("NOM");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(190, 190, 190));
        jLabel19.setText("Gestion des commerciaux");

        listeCommerciaux.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        listeCommerciaux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listeCommerciauxActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Modifier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GestionCommercialActivityLayout = new javax.swing.GroupLayout(GestionCommercialActivity);
        GestionCommercialActivity.setLayout(GestionCommercialActivityLayout);
        GestionCommercialActivityLayout.setHorizontalGroup(
            GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD:src/IHM/Comptable.java
            .addGroup(GestionCommercialActivityLayout.createSequentialGroup()
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GestionCommercialActivityLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel19))
                    .addGroup(GestionCommercialActivityLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GestionCommercialActivityLayout.createSequentialGroup()
                                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18))
                                .addGap(50, 50, 50)
                                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(prenomField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(telField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(villeField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cpField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                    .addComponent(nomField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(listeCommerciaux, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(236, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionCommercialActivityLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(300, 300, 300))
        );
        GestionCommercialActivityLayout.setVerticalGroup(
            GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionCommercialActivityLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel19)
                .addGap(34, 34, 34)
                .addComponent(listeCommerciaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nomField1))
                .addGap(18, 18, 18)
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(prenomField1))
                .addGap(18, 18, 18)
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(telField1))
                .addGap(18, 18, 18)
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailField1))
                .addGap(18, 18, 18)
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(villeField1))
                .addGap(18, 18, 18)
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cpField1))
                .addGap(18, 18, 18)
                .addGroup(GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(typeField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(36, 36, 36))
        );

        ListeNoteFraisActivity.setBackground(new java.awt.Color(35, 38, 53));
        ListeNoteFraisActivity.setForeground(new java.awt.Color(190, 190, 190));

        javax.swing.GroupLayout ListeNoteFraisActivityLayout = new javax.swing.GroupLayout(ListeNoteFraisActivity);
        ListeNoteFraisActivity.setLayout(ListeNoteFraisActivityLayout);
        ListeNoteFraisActivityLayout.setHorizontalGroup(
            ListeNoteFraisActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        ListeNoteFraisActivityLayout.setVerticalGroup(
            ListeNoteFraisActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
=======
            .addGap(0, 688, Short.MAX_VALUE)
        );
        GestionCommercialActivityLayout.setVerticalGroup(
            GestionCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
>>>>>>> ibragim:src/graphic/Comptable.java
        );

        listeCommercialActivity.setBackground(new java.awt.Color(35, 38, 53));
        listeCommercialActivity.setForeground(new java.awt.Color(190, 190, 190));
        listeCommercialActivity.setMaximumSize(new java.awt.Dimension(700, 550));
        listeCommercialActivity.setMinimumSize(new java.awt.Dimension(700, 550));
        listeCommercialActivity.setPreferredSize(new java.awt.Dimension(582, 400));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Liste des commerciaux");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        currentCommercialBox.setBackground(new java.awt.Color(35, 38, 53));
        currentCommercialBox.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        currentCommercialBox.setForeground(new java.awt.Color(255, 255, 255));
        currentCommercialBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentCommercialBoxActionPerformed(evt);
            }
        });

        printBTN.setBackground(new java.awt.Color(35, 38, 53));
        printBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(92, 235, 181), 1, true));

        printLabel.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        printLabel.setForeground(new java.awt.Color(255, 255, 255));
        printLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printLabel.setText("Imprimer");
        printLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                printLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                printLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout printBTNLayout = new javax.swing.GroupLayout(printBTN);
        printBTN.setLayout(printBTNLayout);
        printBTNLayout.setHorizontalGroup(
            printBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, printBTNLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(printLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        printBTNLayout.setVerticalGroup(
            printBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(printLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        notesFraisContainer.setBackground(new java.awt.Color(35, 38, 53));
        notesFraisContainer.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        notesFraisContainer.setForeground(new java.awt.Color(255, 255, 255));
        notesFraisContainer.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        notesFraisContainer.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                notesFraisContainerValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(notesFraisContainer);

        ValidateBTN.setBackground(new java.awt.Color(35, 38, 53));
        ValidateBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(92, 235, 181), 1, true));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Valider");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout ValidateBTNLayout = new javax.swing.GroupLayout(ValidateBTN);
        ValidateBTN.setLayout(ValidateBTNLayout);
        ValidateBTNLayout.setHorizontalGroup(
            ValidateBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );
        ValidateBTNLayout.setVerticalGroup(
            ValidateBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        getDetailsBTN.setBackground(new java.awt.Color(35, 38, 53));
        getDetailsBTN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(92, 235, 181), 1, true));

        jLabel8.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Voir en details");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout getDetailsBTNLayout = new javax.swing.GroupLayout(getDetailsBTN);
        getDetailsBTN.setLayout(getDetailsBTNLayout);
        getDetailsBTNLayout.setHorizontalGroup(
            getDetailsBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
        );
        getDetailsBTNLayout.setVerticalGroup(
            getDetailsBTNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout listeCommercialActivityLayout = new javax.swing.GroupLayout(listeCommercialActivity);
        listeCommercialActivity.setLayout(listeCommercialActivityLayout);
        listeCommercialActivityLayout.setHorizontalGroup(
            listeCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                .addGroup(listeCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(listeCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(currentCommercialBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                                .addGroup(listeCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                                        .addComponent(ValidateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(getDetailsBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(printBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        listeCommercialActivityLayout.setVerticalGroup(
            listeCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(currentCommercialBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(listeCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(listeCommercialActivityLayout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(printBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(76, 76, 76)
                .addGroup(listeCommercialActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ValidateBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getDetailsBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        ListeNoteFraisActivity.setBackground(new java.awt.Color(35, 38, 53));
        ListeNoteFraisActivity.setForeground(new java.awt.Color(190, 190, 190));

        javax.swing.GroupLayout ListeNoteFraisActivityLayout = new javax.swing.GroupLayout(ListeNoteFraisActivity);
        ListeNoteFraisActivity.setLayout(ListeNoteFraisActivityLayout);
        ListeNoteFraisActivityLayout.setHorizontalGroup(
            ListeNoteFraisActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        ListeNoteFraisActivityLayout.setVerticalGroup(
            ListeNoteFraisActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 535, Short.MAX_VALUE)
        );

        AccountActivity.setBackground(new java.awt.Color(35, 38, 53));

        jLabel3.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(190, 190, 190));
        jLabel3.setText("ID :");

        IDField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        IDField.setForeground(new java.awt.Color(190, 190, 190));
        IDField.setText("ID");

        jLabel4.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 190, 190));
        jLabel4.setText("Nom  :");

        nomField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        nomField.setForeground(new java.awt.Color(190, 190, 190));
        nomField.setText("NOM");

        jLabel7.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 190, 190));
        jLabel7.setText("Prenom :");

        prenomField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        prenomField.setForeground(new java.awt.Color(190, 190, 190));
        prenomField.setText("PRENOM");

        jLabel9.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(190, 190, 190));
        jLabel9.setText("Email :");

        emailField.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        emailField.setForeground(new java.awt.Color(190, 190, 190));
        emailField.setText("EMAIL");

        jLabel11.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(190, 190, 190));
        jLabel11.setText("Ville :");

        villeField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        villeField.setForeground(new java.awt.Color(190, 190, 190));
        villeField.setText("VILLE");

        jLabel13.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(190, 190, 190));
        jLabel13.setText("Code postal");

        cpField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        cpField.setForeground(new java.awt.Color(190, 190, 190));
        cpField.setText("CODEPOSTAL");

        jLabel15.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(190, 190, 190));
        jLabel15.setText("Telephone");

        telField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        telField.setForeground(new java.awt.Color(190, 190, 190));
        telField.setText("TELEPHONE");

        jLabel17.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(190, 190, 190));
        jLabel17.setText("Type Compte :");

        typeField.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        typeField.setForeground(new java.awt.Color(190, 190, 190));
        typeField.setText("TYPE");

        javax.swing.GroupLayout AccountActivityLayout = new javax.swing.GroupLayout(AccountActivity);
        AccountActivity.setLayout(AccountActivityLayout);
        AccountActivityLayout.setHorizontalGroup(
            AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountActivityLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telField, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(prenomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nomField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(villeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cpField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                        .addComponent(typeField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(IDField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(193, 193, 193))
        );
        AccountActivityLayout.setVerticalGroup(
            AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountActivityLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(IDField))
                .addGap(18, 18, 18)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nomField))
                .addGap(18, 18, 18)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(prenomField))
                .addGap(18, 18, 18)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(telField))
                .addGap(18, 18, 18)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(emailField))
                .addGap(18, 18, 18)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(villeField))
                .addGap(18, 18, 18)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cpField))
                .addGap(18, 18, 18)
                .addGroup(AccountActivityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(typeField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainContentLayout = new javax.swing.GroupLayout(mainContent);
        mainContent.setLayout(mainContentLayout);
        mainContentLayout.setHorizontalGroup(
            mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccountActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(listeCommercialActivity, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
            .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainContentLayout.createSequentialGroup()
                    .addComponent(ListeNoteFraisActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(GestionCommercialActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainContentLayout.setVerticalGroup(
            mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContentLayout.createSequentialGroup()
                .addComponent(AccountActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
            .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentLayout.createSequentialGroup()
                    .addComponent(listeCommercialActivity, javax.swing.GroupLayout.PREFERRED_SIZE, 541, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainContentLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(ListeNoteFraisActivity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(mainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainContentLayout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(GestionCommercialActivity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mainContent, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myAccountBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccountBTNMouseClicked

    }//GEN-LAST:event_myAccountBTNMouseClicked

    private void myAccountBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccountBTNMousePressed
        myaccBTN.setBackground(new Color(43, 42, 58));
    }//GEN-LAST:event_myAccountBTNMousePressed

    private void myAccountBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAccountBTNMouseReleased
        myaccBTN.setBackground(new Color(57, 55, 76));
        this.AccountActivity.setVisible(true);
        this.listeCommercialActivity.setVisible(false);
        this.ListeNoteFraisActivity.setVisible(false);
        this.GestionCommercialActivity.setVisible(false);
    }//GEN-LAST:event_myAccountBTNMouseReleased

    private void myaccBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccBTNMousePressed
        myaccBTN.setBackground(new Color(43, 42, 58));
    }//GEN-LAST:event_myaccBTNMousePressed

    private void myaccBTNMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myaccBTNMouseReleased
        myaccBTN.setBackground(new Color(57, 55, 76));
    }//GEN-LAST:event_myaccBTNMouseReleased

    private void GestionCommercialLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionCommercialLabelMousePressed
        GestionCommercialBTN.setBackground(new Color(43, 42, 58));
    }//GEN-LAST:event_GestionCommercialLabelMousePressed

    private void GestionCommercialLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionCommercialLabelMouseReleased
        GestionCommercialBTN.setBackground(new Color(57, 55, 76));
        this.GestionCommercialActivity.setVisible(true);
        this.AccountActivity.setVisible(false);
        this.ListeNoteFraisActivity.setVisible(false);
        this.listeCommercialActivity.setVisible(false);
    }//GEN-LAST:event_GestionCommercialLabelMouseReleased

    private void listeCommercialLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeCommercialLabelMousePressed
        listeCommercial.setBackground(new Color(43, 42, 58));
    }//GEN-LAST:event_listeCommercialLabelMousePressed

    private void listeCommercialLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeCommercialLabelMouseReleased
        listeCommercial.setBackground(new Color(57,55,76));
        this.GestionCommercialActivity.setVisible(false);
        this.AccountActivity.setVisible(false);
        this.ListeNoteFraisActivity.setVisible(false);
        this.listeCommercialActivity.setVisible(true);
    }//GEN-LAST:event_listeCommercialLabelMouseReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        signoutBTN.setBackground(new Color(43, 42, 58));
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        signoutBTN.setBackground(new Color(57, 55, 76));

        LoginActivity f = new LoginActivity();
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseReleased

    private void listeNoteFraisLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeNoteFraisLabelMousePressed
        listeNoteFraisBTN.setBackground(new Color(43, 42, 58));
    }//GEN-LAST:event_listeNoteFraisLabelMousePressed

    private void listeNoteFraisLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeNoteFraisLabelMouseReleased
        listeNoteFraisBTN.setBackground(new Color(57, 55, 76));
        this.GestionCommercialActivity.setVisible(false);
        this.AccountActivity.setVisible(false);
        this.ListeNoteFraisActivity.setVisible(true);
        this.listeCommercialActivity.setVisible(false);
    }//GEN-LAST:event_listeNoteFraisLabelMouseReleased

<<<<<<< HEAD:src/IHM/Comptable.java
    private void listeCommerciauxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listeCommerciauxActionPerformed
        User user = (User) listeCommerciaux.getSelectedItem();
            System.out.println(user);
        try {
            user = userDAO.rechercherUser(user);
            nomField1.setText(user.getLastName());
            prenomField1.setText(user.getFirstName());
            telField1.setText(user.getTelephone());
        } catch (SQLException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listeCommerciauxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

=======
    private void printLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printLabelMousePressed
        printBTN.setBackground(new Color(92,235,181));
    }//GEN-LAST:event_printLabelMousePressed
>>>>>>> ibragim:src/graphic/Comptable.java

    private void printLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printLabelMouseReleased
        printBTN.setBackground(new Color(35,38,53));
    }//GEN-LAST:event_printLabelMouseReleased

    private void currentCommercialBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentCommercialBoxActionPerformed
        try {
            getSelectedUsersNotes();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_currentCommercialBoxActionPerformed

    private void notesFraisContainerValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_notesFraisContainerValueChanged
        
    }//GEN-LAST:event_notesFraisContainerValueChanged

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        getDetailsBTN.setBackground(new Color(92,235,181));
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        try {
            getDetailsBTN.setBackground(new Color(35,38,53));
            
            NoteFrais note = (NoteFrais) notesFraisContainer.getSelectedValue();
            DepenseActivity depenseF = new DepenseActivity(note);
            depenseF.setTitle("Note de frais "+notesFraisContainer.getSelectedValue().toString());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jLabel8MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        ValidateBTN.setBackground(new Color(35,38,53));
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        ValidateBTN.setBackground(new Color(92,235,181));
    }//GEN-LAST:event_jLabel6MousePressed

    
    public void getSelectedUsersNotes() throws ClassNotFoundException{
        this.conn = new NoteFraisDAO();
        try {
            User selectedUser = (User) this.currentCommercialBox.getSelectedItem();
            this.notesFraisSelectedUser = conn.getNotesFraisByUserID(selectedUser.getId());
            
            this.addItemToList(this.notesFraisSelectedUser);
        } catch (SQLException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    public void showDetailsOfSelectedNoteFrais() throws ClassNotFoundException{
        try {
            NoteFrais currentNote = (NoteFrais) notesFraisContainer.getSelectedValue();
            
            DepenseActivity depenseF = new DepenseActivity(currentNote);
            depenseF.setTitle("Note de frais " + currentNote.getLibelle());
        } catch (SQLException ex) {
            Logger.getLogger(Comptable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountActivity;
    private javax.swing.JPanel GestionCommercialActivity;
    private javax.swing.JPanel GestionCommercialBTN;
    private javax.swing.JLabel GestionCommercialLabel;
    private javax.swing.JLabel IDField;
    private javax.swing.JPanel ListeNoteFraisActivity;
    private javax.swing.JPanel ValidateBTN;
    private javax.swing.JLabel cpField;
<<<<<<< HEAD:src/IHM/Comptable.java
    private javax.swing.JLabel cpField1;
    private javax.swing.JLabel emailField;
    private javax.swing.JLabel emailField1;
    private javax.swing.JButton jButton1;
=======
    private javax.swing.JComboBox<Object> currentCommercialBox;
    private javax.swing.JLabel emailField;
    private javax.swing.JPanel getDetailsBTN;
>>>>>>> ibragim:src/graphic/Comptable.java
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
<<<<<<< HEAD:src/IHM/Comptable.java
=======
    private javax.swing.JLabel jLabel5;
>>>>>>> ibragim:src/graphic/Comptable.java
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel listeCommercial;
    private javax.swing.JPanel listeCommercialActivity;
    private javax.swing.JLabel listeCommercialLabel;
    private javax.swing.JComboBox<Object> listeCommerciaux;
    private javax.swing.JPanel listeNoteFraisBTN;
    private javax.swing.JLabel listeNoteFraisLabel;
    private javax.swing.JPanel mainContent;
    private javax.swing.JLabel myAccountBTN;
    private javax.swing.JPanel myaccBTN;
    private javax.swing.JLabel nomField;
<<<<<<< HEAD:src/IHM/Comptable.java
    private javax.swing.JLabel nomField1;
    private javax.swing.JLabel prenomField;
    private javax.swing.JLabel prenomField1;
=======
    private javax.swing.JList<Object> notesFraisContainer;
    private javax.swing.JLabel prenomField;
    private javax.swing.JPanel printBTN;
    private javax.swing.JLabel printLabel;
>>>>>>> ibragim:src/graphic/Comptable.java
    private javax.swing.JPanel sidepanel;
    private javax.swing.JPanel signoutBTN;
    private javax.swing.JLabel telField;
    private javax.swing.JLabel telField1;
    private javax.swing.JLabel typeField;
    private javax.swing.JLabel typeField1;
    private javax.swing.JLabel villeField;
    private javax.swing.JLabel villeField1;
    private javax.swing.JLabel welcomeTXT;
    // End of variables declaration//GEN-END:variables
}
