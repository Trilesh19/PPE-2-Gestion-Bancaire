import java.awt.EventQueue;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import javax.swing.JFrame;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class Afficher_tout {
  private JFrame frame;
  
  private JTable table;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Afficher_tout window = new Afficher_tout();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Afficher_tout() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 1200, 658);
    this.frame.setDefaultCloseOperation(2);
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
            Afficher_tout.this.frame.setVisible(false);
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
            Afficher_tout.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Afficher_tout.this.frame, "Voulez-vous r�element quitter l'appli Banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnCrer = new JMenu("Cr�er");
    mnCrer.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnCrer.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnCrer);
    JMenuItem mntmUnNouveauCompte = new JMenuItem("Un nouveau compte");
    mntmUnNouveauCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnCrer.add(mntmUnNouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte sp�cifique");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Afficher_tout.this.frame.setVisible(false);
            Afficher_type.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Modifier");
    mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JMenuItem CrediterCompte = new JMenuItem("D�biter/Cr�diter un compte");
    CrediterCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_3.add(CrediterCompte);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Afficher_tout.this.frame.setVisible(false);
            Delete.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_3.add(SupprimerCompte);
    this.frame.getContentPane().setLayout((LayoutManager)null);
    frame.getContentPane().setLayout(null);
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 69, 1158, 470);
    scrollPane.setBorder(new RoundedBorder(15));
    this.frame.getContentPane().add(scrollPane);
    this.table = new JTable();
    this.table.setModel(new DefaultTableModel(
          new Object[0][], 
          
          (Object[])new String[] { 
            "NoCompte", "Id", "Nom", "Prenom", "D.O.B", "Adresse", "Sexe", "Type de Compte", "Solde", "ID 2 (C.joint)", 
            "Taux(C.epargne)" }));
    scrollPane.setViewportView(this.table);
    JButton btnAfficher = new JButton("Afficher");
    btnAfficher.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
    btnAfficher.setBorder(new RoundedBorder(15));
    btnAfficher.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            String filePath = "banque.dat";
            File file = new File(filePath);
            try {
              FileReader fr = new FileReader(file);
              BufferedReader br = new BufferedReader(fr);
              DefaultTableModel model = (DefaultTableModel)Afficher_tout.this.table.getModel();
              Object[] lines = br.lines().toArray();
              for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(" ");
                model.addRow((Object[])row);
              } 
            } catch (FileNotFoundException fileNotFoundException) {}
          }
        });
    btnAfficher.setBounds(543, 549, 127, 25);
    this.frame.getContentPane().add(btnAfficher);
    JLabel lblNewLabel = new JLabel("Affichage de tous les comptes");
    lblNewLabel.setFont(new Font("Engravers MT", Font.BOLD, 31));
    lblNewLabel.setBounds(12, 12, 763, 45);
    this.frame.getContentPane().add(lblNewLabel);
    
    JButton button = new JButton("Afficher");
    button.setBounds(0, 0, 0, 0);
    frame.getContentPane().add(button);
  }
}
