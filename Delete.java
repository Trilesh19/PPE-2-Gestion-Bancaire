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
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import java.awt.Insets;
import java.awt.Dimension;
import javax.swing.ImageIcon;

public class Delete {
	  private JFrame frame;
	  
	  private JTextField Idclient;
	  
	  public static void main(String[] args) {
	    EventQueue.invokeLater(new Runnable() {
	          public void run() {
	            try {
	              Delete window = new Delete();
	              window.frame.setVisible(true);
	            } catch (Exception e) {
	              e.printStackTrace();
	            } 
	          }
	        });
	  }
	  
	  public Delete() {
	    initialize();
	  }
	  
	  private void initialize() {
	    this.frame = new JFrame();
	    this.frame.setBackground(SystemColor.inactiveCaptionBorder);
	    this.frame.setBounds(100, 100, 395, 462);
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
	    Accueil.setFont(new Font("Segoe UI", 0, 15));
	    Accueil.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	            Delete.this.frame.setVisible(false);
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
	            Delete.this.frame = new JFrame("quitter");
	            if (JOptionPane.showConfirmDialog(Delete.this.frame, "Voulez-vous rquitter l'appli Banque?", "IE Bank", 
	                0) == 0)
	              System.exit(1); 
	          }
	        });
	    mnNewMenu_1.add(Quitter);
	    JMenu mnCrer = new JMenu("Cr\u00E9er");
	    mnCrer.setFont(new Font("Segoe UI", Font.BOLD, 15));
	    mnCrer.setBackground(SystemColor.inactiveCaptionBorder);
	    menuBar.add(mnCrer);
	    JMenuItem mntmUnNouveauCompte = new JMenuItem("Un nouveau compte");
	    mntmUnNouveauCompte.setFont(new Font("Segoe UI", 0, 15));
	    mnCrer.add(mntmUnNouveauCompte);
	    JMenu mnNewMenu_2 = new JMenu("Afficher");
	    mnNewMenu_2.setFont(new Font("Segoe UI", Font.BOLD, 15));
	    mnNewMenu_2.setBackground(SystemColor.inactiveCaptionBorder);
	    menuBar.add(mnNewMenu_2);
	    JMenuItem AfficherUnCompte = new JMenuItem("Un type de compte / un compte specifique");
	    AfficherUnCompte.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	            Delete.this.frame.setVisible(false);
	            Afficher_type.main(null);
	          }
	        });
	    AfficherUnCompte.setFont(new Font("Segoe UI", 0, 15));
	    mnNewMenu_2.add(AfficherUnCompte);
	    JSeparator separator_2 = new JSeparator();
	    mnNewMenu_2.add(separator_2);
	    JMenuItem AfficherTypeCompte = new JMenuItem("Tout les comptes");
	    AfficherTypeCompte.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	            Delete.this.frame.setVisible(false);
	            Afficher_tout.main(null);
	          }
	        });
	    AfficherTypeCompte.setFont(new Font("Segoe UI", 0, 15));
	    mnNewMenu_2.add(AfficherTypeCompte);
	    JMenu mnNewMenu_3 = new JMenu("Modifier");
	    mnNewMenu_3.setFont(new Font("Segoe UI", Font.BOLD, 15));
	    mnNewMenu_3.setBackground(SystemColor.inactiveCaptionBorder);
	    menuBar.add(mnNewMenu_3);
	    JMenuItem CrediterCompte = new JMenuItem("Dun compte");
	    CrediterCompte.setFont(new Font("Segoe UI", 0, 15));
	    mnNewMenu_3.add(CrediterCompte);
	    this.frame.getContentPane().setLayout((LayoutManager)null);
	    frame.getContentPane().setLayout(null);
	    frame.getContentPane().setLayout(null);
	    JLabel lblNewLabel = new JLabel("Supprimer");
	    lblNewLabel.setBounds(31, 124, 338, 45);
	    lblNewLabel.setHorizontalAlignment(0);
	    lblNewLabel.setFont(new Font("Engravers MT", Font.BOLD, 25));
	    this.frame.getContentPane().add(lblNewLabel);
	    this.Idclient = new JTextField();
	    Idclient.setBounds(91, 205, 189, 30);
	    this.Idclient.setBorder(new RoundedBorder(15));
	    this.frame.getContentPane().add(this.Idclient);
	    this.Idclient.setColumns(10);
	    JButton delete = new JButton("Supprimer");
	    delete.setBounds(79, 278, 215, 45);
	    delete.setBorder(new RoundedBorder(15));
	    delete.setFont(new Font("Copperplate Gothic Light", Font.PLAIN, 15));
	    delete.setPreferredSize(new Dimension(100, 21));
	    delete.setMargin(new Insets(2, 5, 2, 5));
	    delete.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
	    delete.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    delete.addActionListener(new ActionListener() {
	          public void actionPerformed(ActionEvent e) {
	            Delete.this.frame = new JFrame("Supprimer");
	            File writter = new File("temp.dat");
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
	                if (!line.contains(Delete.this.Idclient.getText().toUpperCase())) {
	                  fileWritter.write(line);
	                  fileWritter.write("\n");
	                } 
	              } 
	              fileWritter.close();
	            } catch (Exception f) {
	              f.printStackTrace();
	            } 
	            JOptionPane.showMessageDialog(Delete.this.frame, "Suppression termin");
	            Delete.this.frame.setVisible(false);
	            Gestion_Banque.main(null);
	          }
	        });
	    this.frame.getContentPane().add(delete);
	    JLabel lblNewLabel_1 = new JLabel("Veuillez inserez le numero du client");
	    lblNewLabel_1.setBounds(20, 165, 349, 30);
	    lblNewLabel_1.setFont(new Font("Engravers MT", Font.PLAIN, 10));
	    lblNewLabel_1.setHorizontalAlignment(0);
	    this.frame.getContentPane().add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_2 = new JLabel("");
	    lblNewLabel_2.setBounds(156, 10, 67, 115);
	    lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Trilesh\\eclipse-workspace\\Bank\\oie_5142821CZJBTPjt.png"));
	    frame.getContentPane().add(lblNewLabel_2);
	  }
	}

