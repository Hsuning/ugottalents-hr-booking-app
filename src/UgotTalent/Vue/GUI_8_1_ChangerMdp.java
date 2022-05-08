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


public class GUI_8_1_ChangerMdp extends MyJPanel{
	private MyJPanel2 p1 = new MyJPanel2();

	private MyTitre l1 = new MyTitre("Parametre - Mdp");
	
	private JLabel l2 = new JLabel(" Ancien mot de passe: ");
	public static JPasswordField code = new JPasswordField(20);
	
	private JLabel l3 = new JLabel(" Nouveau mot de passe: ");
	public static  JPasswordField code2 = new JPasswordField(20);
	
	private JLabel l4 = new JLabel(" Saisir à nouveau : ");
	public static JPasswordField code3 = new JPasswordField(20);
	
	private MyJButton retour = new MyJButton(new changePanel());
	private MyJButton validation = new MyJButton(new changePanel());

	public GUI_8_1_ChangerMdp(Image img) {
		//On définit le layout manager
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(l1, gbc);
	    
	    p1.setSize(400, 460);
	    p1.img = img;
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gbc.gridwidth = 3;
	    gbc.weighty = 80;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(p1, gbc);
	    
	    gbc.weighty = 1;
	    
	    gbc.fill = GridBagConstraints.VERTICAL;
	    
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    this.add(l2, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridwidth = 2;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(code, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 1;
	    this.add(l3, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridwidth = 2;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(code2, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gbc.gridwidth = 1;
	    this.add(l4, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 4;
	    gbc.gridwidth = 2;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(code3, gbc);
	    
	    retour.setText("Retour");
	    retour.setActionCommand("GUI_8");
	    validation.setText("Validation");
	    validation.setActionCommand("validChangeMdp");
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    gbc.gridwidth = 1;
	    this.add(retour, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridwidth = 1;
	    this.add(validation, gbc);
	    
	    
	}
	
}