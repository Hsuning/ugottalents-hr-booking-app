package UgotTalent.Vue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import UgotTalent.Controleur.changePanel;


public class GUI_2_Inscription extends MyJPanel{
	private MyJPanel2 p1 = new MyJPanel2();

	private MyTitre l1 = new MyTitre("Inscription");
	
	private JLabel l2 = new JLabel(" Identifiant : ");
	public static  JTextField id = new JTextField(20);
	
	private JLabel l3 = new JLabel(" Mot de passe : ");
	public static  JPasswordField code = new JPasswordField(20);
	
	private JLabel l4 = new JLabel(" Saisir à nouveau : ");
	public static JPasswordField code2 = new JPasswordField(20);
	
	private JLabel l5 = new JLabel(" Votre question secretè : ");
	private static Object[] elements = new Object[]{"Chosir votre question", "Le prénom de votre mere?", "Votre ecole elementaire?", "Le livre que vous aimez?", "Le prenom de votre premier copain/copine?", "Votre film prefere?"};
	public static JComboBox listeDeroulante = new JComboBox(elements);
	
	private JLabel l6 = new JLabel(" Votre réponse : ");
	public static JTextField reponse = new JTextField(35);

	
	private MyJButton retour = new MyJButton(new changePanel());
	private MyJButton finalisation = new MyJButton(new changePanel());
	
	public GUI_2_Inscription(Image img) {
		//On définit le layout manager
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(l1, gbc);
	    
	    p1.setSize(400, 360);
	    p1.img = img;
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gbc.gridwidth = 3;
	    gbc.weighty = 80;
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
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    id.setActionCommand("id");
	    this.add(id, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 1;
	    this.add(l3, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 3;
	    gbc.gridwidth = 2;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    code.setActionCommand("code");
	    this.add(code, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gbc.gridwidth = 1;
	    this.add(l4, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 4;
	    gbc.gridwidth = 2;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    code2.setActionCommand("code2");
	    this.add(code2, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    gbc.gridwidth = 3;
	    this.add(l5, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(listeDeroulante, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 7;
	    gbc.gridwidth = 3;
	    this.add(l6, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 8;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(reponse, gbc);
	    
	    retour.setText("Retour");
	    retour.setActionCommand("GUI_1");
	    finalisation.setText("Finaliser l'inscription");
	    
	    gbc.gridx = 0;
	    gbc.gridy = 9;
	    gbc.gridwidth = 1;
	    this.add(retour, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 9;
	    gbc.gridwidth = 1;
	    this.add(finalisation, gbc);
	   
	}

}