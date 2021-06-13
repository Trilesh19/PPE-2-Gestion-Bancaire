import java.awt.EventQueue;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Label;

public class Gestion_Banque {
  private JFrame frame;
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
          public void run() {
            try {
              Gestion_Banque window = new Gestion_Banque();
              window.frame.setVisible(true);
            } catch (Exception e) {
              e.printStackTrace();
            } 
          }
        });
  }
  
  public Gestion_Banque() {
    initialize();
  }
  
  private void initialize() {
    this.frame = new JFrame();
    this.frame.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setBounds(100, 100, 636, 518);
    this.frame.setDefaultCloseOperation(2);
    JPanel panel = new JPanel();
    panel.setBackground(SystemColor.inactiveCaptionBorder);
    panel.setBorder(new LineBorder(new Color(0, 0, 0)));
    this.frame.getContentPane().add(panel, "Center");
    panel.setLayout(null);
    JButton btnNewButton = new JButton("Quitter");
    btnNewButton.setBorder(new RoundedBorder(15));
    btnNewButton.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 20));
    btnNewButton.setBounds(182, 382, 246, 39);
    panel.add(btnNewButton);
    
    JLabel lblNewLabel_1 = new JLabel("");
    lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Trilesh\\eclipse-workspace\\Bank\\oie_7MBEhkpMbRAf.png"));
    lblNewLabel_1.setBounds(120, 10, 384, 177);
    panel.add(lblNewLabel_1);
    
    JLabel lblNewLabel = new JLabel("Bienvenue dans votre banque pr\u00E9f\u00E9r\u00E9e");
    lblNewLabel.setFont(new Font("Engravers MT", Font.PLAIN, 18));
    lblNewLabel.setBounds(38, 183, 574, 59);
    panel.add(lblNewLabel);
    
    JLabel lblNewLabel_2 = new JLabel("Veuillez naviguer dans le ");
    lblNewLabel_2.setFont(new Font("Engravers MT", Font.PLAIN, 15));
    lblNewLabel_2.setBounds(155, 252, 322, 34);
    panel.add(lblNewLabel_2);
    
    JLabel lblNewLabel_3 = new JLabel("menu sup\u00E9rieur pour continuer");
    lblNewLabel_3.setFont(new Font("Engravers MT", Font.PLAIN, 15));
    lblNewLabel_3.setBounds(120, 296, 384, 25);
    panel.add(lblNewLabel_3);
    btnNewButton.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            if (JOptionPane.showConfirmDialog(Gestion_Banque.this.frame, "Voulez-vous rquitter l'appli banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    JMenuBar menuBar = new JMenuBar();
    menuBar.setBackground(SystemColor.inactiveCaptionBorder);
    this.frame.setJMenuBar(menuBar);
    JMenu mnNewMenu_1 = new JMenu("Menu");
    mnNewMenu_1.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu_1.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_1);
    JMenuItem Quitter = new JMenuItem("Quitter");
    Quitter.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    Quitter.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Gestion_Banque.this.frame = new JFrame("quitter");
            if (JOptionPane.showConfirmDialog(Gestion_Banque.this.frame, "Voulez-vous rquitter l'appli banque?", "IE Bank", 
                0) == 0)
              System.exit(1); 
          }
        });
    mnNewMenu_1.add(Quitter);
    JMenu mnNewMenu = new JMenu("Créer");
    mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu);
    JMenuItem NouveauCompte = new JMenuItem("Nouveau Compte");
    NouveauCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Gestion_Banque.this.frame.setVisible(false);
            Créer.main(null);
          }
        });
    NouveauCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu.add(NouveauCompte);
    JMenu mnNewMenu_2 = new JMenu("Afficher");
    mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_2);
    JMenuItem AffichertToutCompte = new JMenuItem("Tous les comptes");
    AffichertToutCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Gestion_Banque.this.frame.setVisible(false);
            Afficher_tout.main(null);
          }
        });
    AffichertToutCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_2.add(AffichertToutCompte);
    JSeparator separator_2 = new JSeparator();
    mnNewMenu_2.add(separator_2);
    JMenuItem AfficherTypeCompte = new JMenuItem("Un type de compte / un compte sp");
    AfficherTypeCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Gestion_Banque.this.frame.setVisible(false);
            Afficher_type.main(null);
          }
        });
    AfficherTypeCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_2.add(AfficherTypeCompte);
    JMenu mnNewMenu_3 = new JMenu("Modifier");
    mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
    menuBar.add(mnNewMenu_3);
    JMenuItem CrediterCompte = new JMenuItem("Dun compte");
    CrediterCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_3.add(CrediterCompte);
    JSeparator separator_3 = new JSeparator();
    mnNewMenu_3.add(separator_3);
    JMenuItem SupprimerCompte = new JMenuItem("Supprimer un compte");
    SupprimerCompte.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
            Gestion_Banque.this.frame.setVisible(false);
            Delete.main(null);
          }
        });
    SupprimerCompte.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 15));
    mnNewMenu_3.add(SupprimerCompte);
  }
}
