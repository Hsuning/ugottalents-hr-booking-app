package UgotTalent.Vue;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import UgotTalent.Controleur.changePanel;


public class GUI_3_Accueil extends MyJPanel{
	private Image img;
	private MyJPanel2 p1 = new MyJPanel2();

	private MyTitre l1 = new MyTitre("UgotTalents");
	
	private MyJButton gestionProjet = new MyJButton(new changePanel());
	private MyJButton calendrier = new MyJButton(new changePanel());
	private MyJButton hisPerso = new MyJButton(new changePanel());
	private MyJButton hisEntre = new MyJButton(new changePanel());
	private MyJButton parametres = new MyJButton(new changePanel());
	private MyJButton deconnexion = new MyJButton(new changePanel());
	
	public GUI_3_Accueil(Image img) {

		//On définit le layout manager
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridwidth = 4;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(l1, gbc);
	    
	    p1.setSize(600, 360);
	    p1.img = img;
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gbc.gridwidth = 4;
	    gbc.weighty = 300;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(p1, gbc);
	    
	    
	    gbc.weighty = 30;
		gestionProjet.setText("Gestion de projet");
		gestionProjet.setPreferredSize(new Dimension(400,60)); 
		gestionProjet.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
		calendrier.setText("Calendrier de disponibilité");
		calendrier.setPreferredSize(new Dimension(400,60));  
		calendrier.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
		hisPerso.setText("Historique personnel");
		hisPerso.setPreferredSize(new Dimension(400,60)); 
		hisPerso.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
		hisEntre.setText("Historique entreprise");
		hisEntre.setPreferredSize(new Dimension(400,60)); 
		hisEntre.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
		parametres.setText("Paramètres Compte");
		parametres.setFont(new java.awt.Font("Cambria", Font.PLAIN, 20));
		deconnexion.setText("   Déconnexion   ");
		deconnexion.setFont(new java.awt.Font("Cambria", Font.PLAIN, 20));

	    
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 4;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(gestionProjet, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gbc.gridwidth = 4;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(calendrier, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5; 
	    gbc.gridwidth = 4;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(hisPerso, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 4;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(hisEntre, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 7;
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(parametres, gbc);
	    
	    gbc.gridx = 3;
	    gbc.gridy = 7;
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(deconnexion, gbc);
	    
	}
	
}