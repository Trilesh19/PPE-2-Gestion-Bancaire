import java.awt.EventQueue;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.DropMode;
import java.awt.Component;
import java.awt.Dimension;

public class Créer {
  private JFrame frame;
  
  private JTextField textnom;
  
  private JTextField textprenom;
  
  private JTextField textdob;
  
  private JTextField textsexe;
  
  private JTextField textadresse;
  
  private JTextField texttype;
  
  private String[] array;
  
  private int i = 0;
  
  private JTextField textid2;
  
  private JTextField texttaux;
  
  private JTextField textid;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Créer window = new Créer();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Créer() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 815, 785);
    this.frame.setDefaultCloseOperation(2);
    JPanel panel = new JPanel();
    panel.setBackground(SystemColor.inactiveCaptionBorder);
    panel.setBorder(new LineBorder(new Color(0, 0, 0)));
    this.frame.getContentPane().add(panel, "Center");
    panel.setLayout(null);
    JLabel lblNewLabel = new JLabel("Créer un compte");
    lblNewLabel.setBounds(159, 41, 485, 27);
    panel.add(lblNewLabel);
    lblNewLabel.setVerticalAlignment(1);
    lblNewLabel.setForeground(Color.BLACK);
    lblNewLabel.setFont(new Font("Engravers MT", Font.BOLD, 25));
    lblNewLabel.setHorizontalAlignment(0);
    JLabel lblNewLabel_3 = new JLabel("Id :");
    lblNewLabel_3.setBounds(39, 139, 66, 17);
    panel.add(lblNewLabel_3);
    lblNewLabel_3.setForeground(new Color(0, 0, 0));
    lblNewLabel_3.setFont(new Font("Elephant", Font.PLAIN, 15));
    this.textid = new JTextField();
    textid.setBounds(399, 131, 326, 34);
    panel.add(textid);
    textid.setPreferredSize(new Dimension(50, 100));
    textid.setFont(new Font("Tahoma", Font.PLAIN, 15));
    this.textid.setHorizontalAlignment(2);
    this.textid.setColumns(25);
    this.textnom = new JTextField();
    textnom.setBounds(399, 185, 326, 33);
    panel.add(textnom);
    this.textnom.setHorizontalAlignment(2);
    this.textnom.setFont(new Font("Dialog", 0, 15));
    this.textnom.setColumns(10);
    JLabel lblNomUsuel = new JLabel("Nom usuel :");
    lblNomUsuel.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblNomUsuel.setBounds(39, 188, 119, 27);
    panel.add(lblNomUsuel);
    this.textprenom = new JTextField();
    textprenom.setBounds(399, 241, 326, 34);
    panel.add(textprenom);
    this.textprenom.setHorizontalAlignment(2);
    this.textprenom.setFont(new Font("Dialog", 0, 15));
    this.textprenom.setColumns(10);
    JLabel lblPrnomUsuel = new JLabel("Pr\u00E9nom usuel :");
    lblPrnomUsuel.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblPrnomUsuel.setBounds(39, 243, 132, 32);
    panel.add(lblPrnomUsuel);
    JLabel lblDateDeNaissance = new JLabel("Date de naissance (jj-mm-yyyy) :");
    lblDateDeNaissance.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblDateDeNaissance.setBounds(39, 299, 250, 33);
    panel.add(lblDateDeNaissance);
    this.textdob = new JTextField();
    textdob.setBounds(399, 297, 326, 34);
    panel.add(textdob);
    this.textdob.setFont(new Font("Dialog", 0, 15));
    this.textdob.setHorizontalAlignment(2);
    this.textdob.setColumns(10);
    JLabel lblSexe = new JLabel("Sexe :");
    lblSexe.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblSexe.setBounds(39, 351, 65, 34);
    panel.add(lblSexe);
    this.textsexe = new JTextField();
    textsexe.setBounds(399, 350, 326, 34);
    panel.add(textsexe);
    this.textsexe.setFont(new Font("Dialog", 0, 15));
    this.textsexe.setHorizontalAlignment(2);
    this.textsexe.setColumns(10);
    JLabel lblAdresse = new JLabel("Adresse :");
    lblAdresse.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblAdresse.setBounds(39, 404, 132, 38);
    panel.add(lblAdresse);
    this.textadresse = new JTextField();
    textadresse.setBounds(399, 406, 326, 34);
    panel.add(textadresse);
    this.textadresse.setFont(new Font("Dialog", 0, 15));
    this.textadresse.setHorizontalAlignment(2);
    this.textadresse.setColumns(10);
    JLabel lblTypeDeCompte = new JLabel("Type de compte  :");
    lblTypeDeCompte.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblTypeDeCompte.setBounds(39, 459, 182, 38);
    panel.add(lblTypeDeCompte);
    this.texttype = new JTextField();
    texttype.setBounds(399, 461, 326, 34);
    panel.add(texttype);
    this.texttype.setFont(new Font("Dialog", 0, 15));
    this.texttype.setHorizontalAlignment(2);
    this.texttype.setColumns(10);
    JLabel lblNewLabel_1 = new JLabel("Id de la deuxieme personne  (si compte joint) :");
    lblNewLabel_1.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblNewLabel_1.setBounds(39, 511, 377, 38);
    panel.add(lblNewLabel_1);
    this.textid2 = new JTextField();
    textid2.setBounds(399, 516, 326, 34);
    panel.add(textid2);
    this.textid2.setColumns(10);
    JLabel lblNewLabel_2 = new JLabel("Taux en % (si compte \u00E9pargne) : ");
    lblNewLabel_2.setFont(new Font("Elephant", Font.PLAIN, 15));
    lblNewLabel_2.setBounds(39, 574, 250, 29);
    panel.add(lblNewLabel_2);
    this.texttaux = new JTextField();
    texttaux.setBounds(399, 571, 326, 38);
    panel.add(texttaux);
    this.texttaux.setHorizontalAlignment(2);
    this.texttaux.setColumns(10);
    JButton btnannuler = new JButton("Annuler");
    btnannuler.setBounds(124, 663, 119, 34);
    panel.add(btnannuler);
    btnannuler.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
    JButton btnreset = new JButton("Reinitialiser");
    btnreset.setBounds(314, 663, 173, 34);
    panel.add(btnreset);
    btnreset.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
    JButton btncréer = new JButton("Créer");
    btncréer.setBounds(564, 663, 105, 34);
    panel.add(btncréer);
    btncréer.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String compte = Créer.this.texttype.getText().toUpperCase();
            try {
              Compte_Joint joint;
              FileWriter fileWritterjoint;
              BufferedWriter bwjoint;
              Compte_Courant courant;
              FileWriter fileWrittercourant;
              BufferedWriter bwcourant;
              Compte_Epargne epargne;
              FileWriter fileWritterepargne;
              BufferedWriter bwepargne;
              File banque = new File("banque.dat");
              if (!banque.exists())
                banque.createNewFile(); 
              String str;
              switch ((str = compte).hashCode()) {
                case -833880926:
                  if (!str.equals("EPARGNE"))
                    break; 
                  epargne = new Compte_Epargne();
                  Créer.this.array = epargne.creerCompte(Créer.this.textid.getText(), Créer.this.textnom.getText(), Créer.this.textprenom.getText(), 
                      Créer.this.textdob.getText(), Créer.this.textsexe.getText(), Créer.this.textadresse.getText(), Créer.this.texttype.getText(), Créer.this.texttaux.getText(), "0");
                  fileWritterepargne = new FileWriter(banque.getName(), true);
                  bwepargne = new BufferedWriter(fileWritterepargne);
                  Créer.this.i = 0;
                  for (; Créer.this.i < Créer.this.array.length; Créer.this.i = Créer.this.i + 1)
                    bwepargne.write(Créer.this.array[Créer.this.i]); 
                  bwepargne.close();
                  JOptionPane.showMessageDialog(Créer.this.frame, "Utilisateur crée");
                  Créer.this.frame.setVisible(false);
                  Gestion_Banque.main(null);
                  return;
                case 70766698:
                  if (!str.equals("JOINT"))
                    break; 
                  joint = new Compte_Joint();
                  Créer.this.array = joint.creerCompte(Créer.this.textid.getText(), Créer.this.textnom.getText(), Créer.this.textprenom.getText(), Créer.this.textdob.getText(), Créer.this.textsexe.getText(), Créer.this.textadresse.getText(), Créer.this.texttype.getText(), Créer.this.textid2.getText(), "0");
                  fileWritterjoint = new FileWriter(banque.getName(), true);
                  bwjoint = new BufferedWriter(fileWritterjoint);
                  Créer.this.i = 0;
                  for (; Créer.this.i < Créer.this.array.length; Créer.this.i = Créer.this.i + 1)
                    bwjoint.write(Créer.this.array[Créer.this.i]); 
                  bwjoint.close();
                  JOptionPane.showMessageDialog(Créer.this.frame, "Utilisateur crée");
                  Créer.this.frame.setVisible(false);
                  Gestion_Banque.main(null);
                  return;
                case 1675914526:
                  if (!str.equals("COURANT"))
                    break; 
                  courant = new Compte_Courant();
                  Créer.this.array = courant.creerCompte(Créer.this.textid.getText(), Créer.this.textnom.getText(), Créer.this.textprenom.getText(), Créer.this.textdob.getText(), Créer.this.textsexe.getText(), Créer.this.textadresse.getText(), Créer.this.texttype.getText(), "0");
                  fileWrittercourant = new FileWriter(banque.getName(), true);
                  bwcourant = new BufferedWriter(fileWrittercourant);
                  Créer.this.i = 0;
                  for (; Créer.this.i < Créer.this.array.length; Créer.this.i = Créer.this.i + 1)
                    bwcourant.write(Créer.this.array[Créer.this.i]); 
                  bwcourant.close();
                  JOptionPane.showMessageDialog(Créer.this.frame, "Utilisateur crée");
                  Créer.this.frame.setVisible(false);
                  Gestion_Banque.main(null);
                  return;
              } 
              JOptionPane.showMessageDialog(Créer.this.frame, "Erreur type de compte incorrect");
            } catch (IOException e1) {
              e1.printStackTrace();
            } 
          }
        });
    btncréer.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
    btnreset.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.textnom.setText("");
            Créer.this.textprenom.setText("");
            Créer.this.textdob.setText("");
            Créer.this.textsexe.setText("");
            Créer.this.texttype.setText("");
            Créer.this.textadresse.setText("");
          }
        });
    btnannuler.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
            Gestion_Banque.main(null);
          }
        });
    JMenuBar menuBar = new JMenuBar();
    menuBar.setFont(new Font("Segoe UI", 0, 15));
    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setJMenuBar(menuBar);
    JMenu mnNewMenu_1 = new JMenu("Menu");
    mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu_1.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_1);
    JMenuItem Accueil = new JMenuItem("Retour a l'accueil");
    Accueil.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    Accueil.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
            Gestion_Banque.main(null);
          }
        });
    mnNewMenu_1.add(Accueil);
    JSeparator separator = new JSeparator();
    mnNewMenu_1.add(separator);
    JMenuItem Quitter = new JMenuItem("Quitter");
    Quitter.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    Quitter.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Créer.this.frame, "Voulez-vous réelement quitter l'appli Banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AffichertToutCompte = new JMenuItem("Tous les comptes");
    AffichertToutCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
            Afficher_tout.main(null);
          }
        });
    AffichertToutCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_2.add(AffichertToutCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte spécifique");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
            Afficher_type.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Modifier");
    mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JMenuItem CrediterCompte = new JMenuItem("Débiter/Créditer un compte");
    CrediterCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_3.add(CrediterCompte);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Créer.this.frame.setVisible(false);
            Delete.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_3.add(SupprimerCompte);
  }
}
