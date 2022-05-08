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


public class GUI_8_ParametreCompte extends MyJPanel{
	private Image img;
	private MyJPanel2 p1 = new MyJPanel2();
	

	private MyTitre l1 = new MyTitre("Paramètre du compte");
	
	private MyJButton changemdp = new MyJButton(new changePanel());
	private MyJButton changeQuestion = new MyJButton(new changePanel());
	private MyJButton désinscription = new MyJButton(new changePanel());
	private MyJButton precedent = new MyJButton(new changePanel());

	public GUI_8_ParametreCompte(Image img) {

		//On définit le layout manager
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    changemdp.setText("Changer le mot de passe");
	    changemdp.setPreferredSize(new Dimension(400,60)); 
	    changemdp.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
	    changeQuestion.setText("Changer la question secrète/reponse");
	    changeQuestion.setPreferredSize(new Dimension(400,60));  
	    changeQuestion.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
	    désinscription.setText("Desinscription (definitivement)");
	    désinscription.setPreferredSize(new Dimension(400,60)); 
	    désinscription.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
	    precedent.setText("Precedent");
	    precedent.setActionCommand("GUI_3");
	    precedent.setFont(new java.awt.Font("Cambria", Font.PLAIN, 24));
	    
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
	    
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 4;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(changemdp, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gbc.gridwidth = 4;
	    this.add(changeQuestion, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5; 
	    gbc.gridwidth = 4;
	    this.add(désinscription, gbc);
	    
	    gbc.weighty = 1;
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 1;
	    this.add(precedent, gbc);
	    
	    
	}
	
}