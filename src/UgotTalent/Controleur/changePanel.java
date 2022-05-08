package UgotTalent.Controleur;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import UgotTalent.Modele.Validation_GUI;
import UgotTalent.Modele.BDDUsers;
import UgotTalent.Vue.GUI_1_1_mdpOublie;
import UgotTalent.Vue.GUI_1_Bienvenue;
import UgotTalent.Vue.GUI_2_Inscription;
import UgotTalent.Vue.GUI_3_Accueil;
import UgotTalent.Vue.GUI_4_GestionProjet;
import UgotTalent.Vue.GUI_5_HistoriquePerso;
import UgotTalent.Vue.GUI_6_HistoriqueEntre;
import UgotTalent.Vue.GUI_7_1_CreerProjet;
import UgotTalent.Vue.GUI_7_2_RechercheTalent;
import UgotTalent.Vue.GUI_7_3_Panier;
import UgotTalent.Vue.GUI_8_1_ChangerMdp;
import UgotTalent.Vue.GUI_8_1_ChangerQR;
import UgotTalent.Vue.GUI_8_ParametreCompte;


public class changePanel extends AbstractAction{
	
	public void actionPerformed(ActionEvent e) {
		
		//Configuration et contrôler des buttons avec ActionEvent
		String action = e.getActionCommand();
		JButton buttonSource = (JButton) e.getSource();
		//Création de nouvelle frame avec l'action de button
		JFrame fenetre = (JFrame) buttonSource.getTopLevelAncestor();
		String bText = buttonSource.getText();
		buttonSource.setText("");
		fenetre.setTitle("UgotTalents");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	fenetre.setVisible(true);

    	
    	//Tous les GUIS
    	GUI_1_Bienvenue Bienvenue = new GUI_1_Bienvenue(new ImageIcon("Images/accueil2.png").getImage());
    	GUI_1_1_mdpOublie mdpOublie = new GUI_1_1_mdpOublie(new ImageIcon("Images/accueil2.png").getImage());
    	GUI_2_Inscription Inscription = new GUI_2_Inscription(new ImageIcon("Images/accueil2.png").getImage());
    	GUI_3_Accueil Accueil = new GUI_3_Accueil(new ImageIcon("Images/image2.png").getImage());
    	GUI_4_GestionProjet GestionProjet = new GUI_4_GestionProjet();
    	GUI_5_HistoriquePerso HistoriquePerso = new GUI_5_HistoriquePerso();
    	GUI_6_HistoriqueEntre HistoriqueEntre = new GUI_6_HistoriqueEntre();
    	GUI_7_1_CreerProjet CreerProjet = new GUI_7_1_CreerProjet();
    	GUI_7_2_RechercheTalent RechercheTalent = new GUI_7_2_RechercheTalent();
    	GUI_7_3_Panier Panier = new GUI_7_3_Panier();
    	GUI_8_ParametreCompte ParametreCompte = new GUI_8_ParametreCompte(new ImageIcon("Images/image2.png").getImage());
    	GUI_8_1_ChangerMdp ChangerMdp = new GUI_8_1_ChangerMdp(new ImageIcon("Images/image2.png").getImage());
    	GUI_8_1_ChangerQR ChangerQR = new GUI_8_1_ChangerQR(new ImageIcon("Images/image2.png").getImage());
    	
    	
    	//Retour au page précédent
    	if(action.equals("GUI_1")){
    		fenetre.setSize(400, 660);
    		fenetre.setContentPane(Bienvenue);
    	}
    	else if(action.equals("GUI_3")){
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(Accueil);
    	}
    	else if(action.equals("GUI_4")){
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(GestionProjet);
    	}
    	else if(action.equals("GUI_7_1")){
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(CreerProjet);
    	}
    	else if(action.equals("GUI_7_2")){
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(RechercheTalent);
    	}
    	else if(action.equals("GUI_8")){
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(ParametreCompte);
    	}
    	
    	//BUTTON GUI_1_Bienvenue
    	else if (bText.contains("Inscription")) {
    		fenetre.setSize(400, 660); 
    		fenetre.setContentPane(Inscription);
    	}
    	else if (bText.contains("Mot de passe oublié")) {
    		fenetre.setSize(400, 660); 
    		fenetre.setContentPane(mdpOublie);
    		
    	}
    	else if (bText.contains("Connexion")) {
    		String id = GUI_1_Bienvenue.id.getText();
    		char[] code = GUI_1_Bienvenue.code.getPassword();
    		String codeString = new String(code);
    		Validation_GUI validation = new Validation_GUI(id, codeString);
    		try {
				if(validation.autentif()){
					fenetre.setSize(400, 600);
		    		fenetre.setContentPane(Accueil);
				}else{
					GUI_1_Bienvenue.code.setText("");
					fenetre.setSize(400, 660);
		    		fenetre.setContentPane(Bienvenue);
					JOptionPane.showMessageDialog(new JFrame(),
						    "Identifiant ou mot de passe invalide",
						    "Message d'erreur",
						    JOptionPane.ERROR_MESSAGE);
		    	
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		
    		
    	}
    	else if (bText.contains("Quitter")) {
    		fenetre.setSize(400, 660);
    		fenetre.dispose();
    	}
    	
    	
    	//----BUTTON GUI_1_1mdpOublie----//
    	else if (action.equals("valideMdpOublie")) {
    		String id = GUI_1_1_mdpOublie.id.getText();
    		String question = GUI_1_1_mdpOublie.listeDeroulante.getSelectedItem().toString();
    		String reponse = GUI_1_1_mdpOublie.reponse.getText();
    		
    		
    		GUI_1_1_mdpOublie.id.setText("");
    		GUI_1_1_mdpOublie.reponse.setText("");
    		fenetre.setContentPane(Bienvenue);
    		
    		Validation_GUI validation = new Validation_GUI(id, question, reponse);
    		try {
				String s = validation.mdpOublie();
				JOptionPane.showMessageDialog(new JFrame(),
					    s, "Inscription",
					    JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		
    	}
    	
    	
    	//----BUTTON GUI_2_Inscription----//
    	else if (bText.contains("   Déconnexion   ")) {
    		fenetre.setSize(400, 660);
    		fenetre.setContentPane(Bienvenue);
    	}
    	else if (bText.contains("Finaliser l'inscription")) {
    		String id = GUI_2_Inscription.id.getText();
    		char[] code = GUI_2_Inscription.code.getPassword();
    		String codeString = new String(code);
    		char[] code2 = GUI_2_Inscription.code2.getPassword();
    		String code2String = new String(code2);
    		String question = GUI_2_Inscription.listeDeroulante.getSelectedItem().toString();
    		String reponse = GUI_2_Inscription.reponse.getText();
    		
    		Validation_GUI validation = new Validation_GUI(id, codeString, code2String, question, reponse);
    		
    		try {
				if(validation.verifID() && validation.verifCode() 
						&& validation.verifQuestion() && validation.verifReponse()){
					try {
						String[] row = new String[]{id,codeString,question,reponse};
						BDDUsers myusers = new BDDUsers(row, true);
						GUI_2_Inscription.id.setText("");
						GUI_2_Inscription.code2.setText("");
						GUI_2_Inscription.code.setText("");
						GUI_2_Inscription.reponse.setText("");
						fenetre.setSize(400, 660);
			    		fenetre.setContentPane(Bienvenue);
			    		JOptionPane.showMessageDialog(new JFrame(),
							    "Votre inscription est validée.",
							    "Inscription",
							    JOptionPane.INFORMATION_MESSAGE);

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else{
					fenetre.setSize(450, 760);
		    		fenetre.setContentPane(Inscription);
					GUI_2_Inscription.code2.setText("");
					GUI_2_Inscription.code.setText("");
					JOptionPane.showMessageDialog(new JFrame(),
						    "Erreur de saisie.",
						    "Message d'erreur",
						    JOptionPane.ERROR_MESSAGE);
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    	
    	
    	//----BUTTON GUI_3_Accueil ----
    	else if (bText.contains("Gestion de projet")) {
    		fenetre.setSize(400, 600); 
    		fenetre.setContentPane(GestionProjet);
    	}
    	else if (bText.contains("Calendrier de disponibilité")) {
    		
    	}
    	else if (bText.contains("Historique personnel")) {
    		fenetre.setSize(400, 600); 
    		fenetre.setContentPane(HistoriquePerso);
    	}
    	else if (bText.contains("Historique entreprise")) {
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(HistoriqueEntre);
    	}
    	else if (bText.contains("Paramètres Compte")) {
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(ParametreCompte);
    		
    	}

    	//----BUTTON GUI_4_Gestion de projet ----
    	else if (bText.contains("Créer Projet")) {
    		fenetre.setSize(400, 600);
    		fenetre.setContentPane(CreerProjet);
    	}
    	
    	
    	
    	//----BUTTON GUI_7_CreerProjet ----
    	else if (bText.contains("Poursuivre")) {
    		fenetre.setSize(400, 600); 
    		fenetre.setContentPane(RechercheTalent);
    	}
    	
    	//----BUTTON GUI_7_CreerProjet ----
    	else if (bText.contains("Panier")) {
    		fenetre.setSize(400, 600); 
    		fenetre.setContentPane(Panier);
    	}
    	
    	
    	
    	//----BUTTON GUI_8_ParametreCompte ----
    	else if (bText.contains("Changer le mot de passe")) {
    		fenetre.setSize(400, 600); 
    		fenetre.setContentPane(ChangerMdp);
    	}
    	else if (bText.contains("Changer la question secrète/reponse")) {
    		fenetre.setSize(400, 600); 
    		fenetre.setContentPane(ChangerQR);
    	}
    	else if (bText.contains("Desinscription (definitivement)")) {
    		fenetre.setSize(400, 600);
    		//fenetre.setContentPane();
    	}
    	
    	
    	//----BUTTON GUI_8_1_ChangerQR ----
    	else if (action.equals("validChangeQR")) {
    		String id = GUI_2_Inscription.id.getText();
    		String question = GUI_8_1_ChangerQR.listeDeroulante.getSelectedItem().toString();
    		String reponse = GUI_8_1_ChangerQR.reponse.getText();
    		
    		Validation_GUI validation = new Validation_GUI(id, question, reponse);
    		try {
				validation.changerQR();
				fenetre.setSize(400, 600);
	    		fenetre.setContentPane(ParametreCompte);
				JOptionPane.showMessageDialog(new JFrame(),
					    "Votre question secrète est modifiée", "Modification validée",
					    JOptionPane.INFORMATION_MESSAGE);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    	}
    	else if(action.equals("validChangeMdp")){
    		char[] code = GUI_2_Inscription.code.getPassword();
    		String codeString = new String(code);
    		char[] code2 = GUI_2_Inscription.code2.getPassword();
    		String codeString2 = new String(code2);
    		
    	}
    	
	}
}

