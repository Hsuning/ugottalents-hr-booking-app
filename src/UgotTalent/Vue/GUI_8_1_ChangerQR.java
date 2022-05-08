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


public class GUI_8_1_ChangerQR extends MyJPanel{
	private Image img;
	private MyJPanel2 p1 = new MyJPanel2();

	private MyTitre l1 = new MyTitre("Parametre-Reponse");
	
	private JLabel l2 = new JLabel(" Votre question secrète : ");
	private static Object[] elements = new Object[]{"Chosir votre question", "Le prénom de votre mere?", "Votre ecole elementaire?", "Le livre que vous aimez?", "Le prenom de votre premier copain/copine?", "Votre film prefere?"};
	public static JComboBox listeDeroulante = new JComboBox(elements);
	
	private JLabel l3 = new JLabel(" Votre réponse : ");
	public static JTextField reponse = new JTextField(35);
	
	private MyJButton retour = new MyJButton(new changePanel());
	private MyJButton validation = new MyJButton(new changePanel());
	

	public GUI_8_1_ChangerQR(Image img) {
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
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(listeDeroulante, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gbc.gridwidth = 3;
	    this.add(l3, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(reponse, gbc);
	    
	    retour.setText("Retour");
	    retour.setActionCommand("GUI_8");
	    validation.setText("Validation");
	    validation.setActionCommand("validChangeQR");
	    
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 1;
	    this.add(retour, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridwidth = 1;
	    this.add(validation, gbc);
	    
	    
	}
	
}