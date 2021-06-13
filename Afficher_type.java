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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Afficher_type {
  private JFrame frame;
  
  private JTable table;
  
  private JTextField Type;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Afficher_type window = new Afficher_type();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Afficher_type() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 1200, 660);
    this.frame.setDefaultCloseOperation(2);
    JMenuBar menuBar = new JMenuBar();
    menuBar.setFont(new Font("Segoe UI", 0, 15));
    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setJMenuBar(menuBar);
    JMenu mnNewMenu_1 = new JMenu("Menu");
    mnNewMenu_1.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_1.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_1);
    JMenuItem Accueil = new JMenuItem("Retour a l'accueil");
    Accueil.setFont(new Font("Segoe UI", 0, 15));
    Accueil.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Afficher_type.this.frame.setVisible(false);
            Gestion_Banque.main(null);
          }
        });
    mnNewMenu_1.add(Accueil);
    JSeparator separator = new JSeparator();
    mnNewMenu_1.add(separator);
    JMenuItem Quitter = new JMenuItem("Quitter");
    Quitter.setFont(new Font("Segoe UI", 0, 15));
    Quitter.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Afficher_type.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Afficher_type.this.frame, "Voulez-vous réelement quitter l'appli Banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnCrer = new JMenu("Créer");
    mnCrer.setFont(new Font("Segoe UI", 0, 15));
    mnCrer.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnCrer);
    JMenuItem mntmUnNouveauCompte = new JMenuItem("Un nouveau compte");
    mntmUnNouveauCompte.setFont(new Font("Segoe UI", 0, 15));
    mnCrer.add(mntmUnNouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AfficherUnCompte = new JMenuItem("Un compte spécifique");
    AfficherUnCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AfficherUnCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Tout les comptes");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Afficher_type.this.frame.setVisible(false);
            Afficher_tout.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Modifier");
    mnNewMenu_3.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JMenuItem CrediterCompte = new JMenuItem("Débiter/Créditer un compte");
    CrediterCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(CrediterCompte);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Afficher_type.this.frame.setVisible(false);
            Delete.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_3.add(SupprimerCompte);
    JMenu mnNewMenu_4 = new JMenu("Aide");
    mnNewMenu_4.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_4.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_4);
    JMenuItem AideCreer = new JMenuItem("Créer un compte?");
    AideCreer.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_4.add(AideCreer);
    JMenuItem AideAfficher = new JMenuItem("Afficher un compte?");
    AideAfficher.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_4.add(AideAfficher);
    JMenuItem AideCrediter = new JMenuItem("Créditer un compte?");
    AideCrediter.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_4.add(AideCrediter);
    JMenuItem AideSupprimer = new JMenuItem("Supprimer un compte?");
    AideSupprimer.setFont(new Font("Segoe UI", 0, 15));
    mnNewMenu_4.add(AideSupprimer);
    this.frame.getContentPane().setLayout((LayoutManager)null);
    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(12, 69, 1158, 475);
    this.frame.getContentPane().add(scrollPane);
    this.table = new JTable();
    this.table.setModel(new DefaultTableModel(new Object[0][], (Object[])new String[] { 
            "NoCompte", "Id", "Nom", "Prenom", 
            "D.O.B", "Adresse", "Sexe", "Type de Compte", "Solde", "ID 2 (C.joint)", 
            "Taux(C.epargne)" }));
    scrollPane.setViewportView(this.table);
    JButton btnAfficher = new JButton("Afficher");
    btnAfficher.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            File writter = new File("search.dat");
            try {
              if (writter.exists()) {
                writter.delete();
                writter.createNewFile();
              } 
              if (!writter.exists())
                writter.createNewFile(); 
              FileWriter fileWritter = new FileWriter(writter.getName(), false);
              BufferedWriter bw = new BufferedWriter(fileWritter);
              File verificator = new File("banque.dat");
              Scanner in = null;
              in = new Scanner(verificator);
              while (in.hasNext()) {
                String line = in.nextLine();
                if (line.contains(Afficher_type.this.Type.getText().toUpperCase())) {
                  fileWritter.write(line);
                  fileWritter.write("\n");
                } 
              } 
              fileWritter.close();
            } catch (Exception f) {
              f.printStackTrace();
            } 
            String filePath = "search.dat";
            File file = new File(filePath);
            try {
              FileReader fr = new FileReader(file);
              BufferedReader br = new BufferedReader(fr);
              DefaultTableModel model = (DefaultTableModel)Afficher_type.this.table.getModel();
              Object[] lines = br.lines().toArray();
              int i;
              for (i = 0; i < lines.length; i++);
              for (i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(" ");
                model.addRow((Object[])row);
              } 
            } catch (FileNotFoundException fileNotFoundException) {}
            Afficher_type.this.Type.setText("");
          }
        });
    btnAfficher.setBounds(1054, 30, 98, 23);
    this.frame.getContentPane().add(btnAfficher);
    JLabel lblNewLabel = new JLabel("Affichage un type de compte");
    lblNewLabel.setFont(new Font("Dialog", 1, 30));
    lblNewLabel.setBounds(12, 12, 447, 45);
    this.frame.getContentPane().add(lblNewLabel);
    this.Type = new JTextField();
    this.Type.setBounds(853, 30, 189, 22);
    this.frame.getContentPane().add(this.Type);
    this.Type.setColumns(10);
    JButton recommencer = new JButton("recommencer la recherche ?");
    recommencer.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Afficher_type.this.frame.setVisible(false);
            Afficher_type.main(null);
          }
        });
    recommencer.setBounds(838, 557, 332, 25);
    this.frame.getContentPane().add(recommencer);
  }
}
