package UgotTalent.Vue;
import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import UgotTalent.Controleur.changePanel;


public class GUI_1_Bienvenue extends MyJPanel{
	//MyJPanel2 : afin de mettre un image
	private Image img;
	private MyJPanel2 p1 = new MyJPanel2();
	
	//MyTitre : pour le font de titre
	private MyTitre l1 = new MyTitre("Bienvenue");
	private JLabel l2 = new JLabel("Identifiant : ");
	private JLabel l3 = new JLabel("Mot de passe : ");
	public static JTextField id = new JTextField(15);
	public static JPasswordField code = new JPasswordField(15);
	// création de 4 objets boutons 
	private MyJButton motdepasse = new MyJButton(new changePanel());
	private MyJButton quitter = new MyJButton(new changePanel());
	private MyJButton inscription = new MyJButton(new changePanel());
	private MyJButton connexion = new MyJButton(new changePanel());
	
	public GUI_1_Bienvenue(Image img) {

		
		//On définit le layout manager
		//GridBagLayout : permettre de diviser le panel en plusieurs lignes et clonnes
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	
	    //Pour le titre "Bienvenue"
	    //x = 1, y = 0, width = 1
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gbc.gridwidth = 1;
	    //ajout de l1 à la fenêtre à la place GBC que l'on vient de définir
	    this.add(l1, gbc);
	    
	    //MyJpanel2 pour mettre l'image
	    p1.setSize(400, 460);
	    p1.img = img;
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    //width = 3 => A partir de 1 colonne (x=0), fusionner trois colonnes
	    gbc.gridwidth = 3;
	    //y a aussi gbc.gridheight pour fusionner les lignes
	    //weighty : le longeur de ligne
	    //weightx : le largeur de colonne
	    gbc.weighty = 80;
	    //pour remplir toute colonne
	    //VERTICAL, HORIZONTAL, BOTH
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(p1, gbc);
	   
	    
	    gbc.weighty = 1;
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    this.add(l2, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    gbc.gridwidth = 2;
	    id.setActionCommand("id");
	    this.add(id, gbc);
	    

	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 1;
	    this.add(l3, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 3;
	    gbc.gridwidth = 2;
	    this.add(code, gbc);
	    
	    //Set le contenu de button
	    //Le contenu = bText dans changePanel
	    connexion.setText("Connexion");
	    motdepasse.setText("Mot de passe oublié");
	    quitter.setText("Quitter");
	    inscription.setText("Inscription");
	    
	    gbc.gridx = 1;
	    gbc.gridy = 5;
	    gbc.gridwidth = 1;
	    this.add(motdepasse, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 1;
	    this.add(quitter, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 6;
	    gbc.gridwidth = 1;
	    this.add(inscription, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 6;
	    gbc.gridwidth = 1;
	    this.add(connexion, gbc);
	    
	    
	}
	
	
}