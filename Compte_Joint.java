import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Compte_Joint extends Compte_Courant {
  private JFrame frame;
  
  private long idJoint;
  
  public long getIdJoint() {
    return this.idJoint;
  }
  
  public void setIdJoint(long idJoint) {
    this.idJoint = idJoint;
  }
  
  public String[] creerCompte(String id, String Nom, String Prenom, String dob, String sexe, String adresse, String TypeCompte, String id2, String solde) {
    long nocompte = 0L;
    solde = "0";
    TypeCompte = "JOINT";
    this.frame = new JFrame();
    Compte_Joint client = new Compte_Joint();
    String idconvert = id;
    String nocompteconvert = "000" + idconvert;
    nocompte = Long.valueOf(nocompteconvert).longValue();
    try {
      client.id = Long.parseLong(id);
      client.setIdJoint(Long.parseLong(id2));
      client.setNoCompte(nocompte);
      client.nom = Nom;
      client.prenom = Prenom;
      client.adresse = adresse;
      client.sexe = sexe;
      client.setTypeCompte(TypeCompte);
      client.setSolde(Double.parseDouble(solde));
      String[] Split = dob.split("-");
      int jj = Integer.parseInt(Split[0]);
      int mm = Integer.parseInt(Split[1]);
      int aaaa = Integer.parseInt(Split[2]);
      if (jj < 0 || mm < 0 || aaaa < 1900)
        JOptionPane.showMessageDialog(this.frame, "date invalide...veuillez r"); 
      if (jj > 31 || mm > 12 || aaaa > 2100)
        JOptionPane.showMessageDialog(this.frame, "date invalide...veuillez r"); 
      client.dob = dob;
    } catch (Exception e) {
      JOptionPane.showMessageDialog(this.frame, "Erreur caractinvalides dr");
    } 
    String[] TabJoint = { 
        String.valueOf(client.getNoCompte()), " ", String.valueOf(client.id), " ", client.nom, 
        " ", client.prenom, " ", client.dob, " ", 
        client.adresse, " ", client.sexe, " ", 
        client.getTypeCompte(), " ", String.valueOf(client.getSolde()), " ", String.valueOf(client.getIdJoint()), " ", 
        "-", "\n" };
    return TabJoint;
  }
}
