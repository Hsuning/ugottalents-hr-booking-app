package UgotTalent.Vue;
import java.awt.BorderLayout;
import java.awt.Dimension;
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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import UgotTalent.Controleur.changePanel;


public class GUI_1_1_mdpOublie extends MyJPanel{
	//MyJPanel2 : afin de mettre un image
	private Image img;
	private MyJPanel2 p1 = new MyJPanel2();
	
	//MyTitre : pour le font de titre
	private MyTitre l1 = new MyTitre("Mdp oublié");
	private JLabel l2 = new JLabel(" Votre identifiant : ");
	public static JTextField id = new JTextField(15);
	
	private JLabel l3 = new JLabel(" Votre question secretè : ");
	private static Object[] elements = new Object[]{"Chosir votre question", "Le prénom de votre mere?", "Votre ecole elementaire?", "Le livre que vous aimez?", "Le prenom de votre premier copain/copine?", "Votre film prefere?"};
	public static JComboBox listeDeroulante = new JComboBox(elements);
	
	private JLabel l4 = new JLabel(" Votre réponse : ");
	public static JTextField reponse = new JTextField(30);
	
	private MyJButton retour = new MyJButton(new changePanel());
	private MyJButton valider = new MyJButton(new changePanel());
	
	public GUI_1_1_mdpOublie(Image img) {

		//On définit le layout manager
		//GridBagLayout : permettre de divier le panel en plusieurs lignes et clonnes
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	
	    //Pour le titre "Bienvenu"
	    //x = 1, y = 0, width = 1
	    gbc.gridx = 1;
	    gbc.gridy = 0;
	    gbc.gridwidth = 1;
	    //gbc.fill = GridBagConstraints.BOTH;
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
	    gbc.gridwidth = 3;
	    this.add(l3, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(listeDeroulante, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    gbc.gridwidth = 3;
	    this.add(l4, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(reponse, gbc);
	    
	    //Set le contenu de button
	    //Le contenu = bText dans changePanel
	    retour.setText("Retour");
	    retour.setPreferredSize(new Dimension(100,30));
	    retour.setActionCommand("GUI_1");
	    valider.setText("Valider");
	    valider.setPreferredSize(new Dimension(100,30));
	    valider.setActionCommand("valideMdpOublie");
	    
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    
	    
	    gbc.gridx = 0;
	    gbc.gridy = 7;
	    gbc.gridwidth = 1;
	    this.add(retour, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 7;
	    gbc.gridwidth = 1;
	    this.add(valider, gbc);
	    
	    
	}
	
	
}