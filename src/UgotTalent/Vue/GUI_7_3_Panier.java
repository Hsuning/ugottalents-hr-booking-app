package UgotTalent.Vue;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import UgotTalent.Controleur.changePanel;


public class GUI_7_3_Panier extends MyJPanel{

	private MyTitre l1 = new MyTitre("Panier");
	
	DefaultListModel model = new DefaultListModel();
	JList list = new JList(model);
    JScrollPane pane = new JScrollPane(list);
	
	private MyJButton supprimer = new MyJButton(new changePanel());
	private MyJButton retour = new MyJButton(new changePanel());
	private MyJButton finaliser = new MyJButton(new changePanel());
	
	
	public GUI_7_3_Panier() {
		
		//On définit le layout manager
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    supprimer.setText("Supprimer");
	    supprimer.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    supprimer.setPreferredSize(new Dimension(100,30));
	    
	    retour.setText("Retour");
	    retour.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    retour.setActionCommand("GUI_7_2");
	    retour.setPreferredSize(new Dimension(100,30));
	    
	    finaliser.setText("Finaliser la création");
	    finaliser.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    finaliser.setPreferredSize(new Dimension(100,30));
	    
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(l1, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gbc.gridwidth = 3;
	    gbc.weighty = 200;
	    gbc.weightx = 150;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(pane, gbc);
	    
	    gbc.weighty = 1;
	    gbc.weightx = 1;
	    
	    gbc.gridx = 2;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(supprimer, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 1;
	    this.add(retour, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridwidth = 2;
	    this.add(finaliser, gbc);
	   
	    
	}
	
}