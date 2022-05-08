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
import javax.swing.JTextField;

import UgotTalent.Controleur.changePanel;


public class GUI_5_HistoriquePerso extends MyJPanel{

	private MyTitre l1 = new MyTitre("Historique personnel");
	
	DefaultListModel model = new DefaultListModel();
	JList list = new JList(model);
    JScrollPane pane = new JScrollPane(list);
	

	private MyJButton cousulter = new MyJButton(new changePanel());
	private MyJButton precedent = new MyJButton(new changePanel());
	
	
	public GUI_5_HistoriquePerso() {
		
		//On définit le layout manager
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(l1, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gbc.gridwidth = 3;
	    gbc.weighty = 100;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(pane, gbc);
	    
	    gbc.weighty = 1;
	    gbc.weightx = 1;
	    
	    cousulter.setText("Cousulter");
	    cousulter.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    cousulter.setPreferredSize(new Dimension(100,30));
	    
	    precedent.setText("Precedent");
	    precedent.setActionCommand("GUI_3");
	    precedent.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    precedent.setPreferredSize(new Dimension(100,30));
	    
	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbc.gridx = 2;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    this.add(cousulter, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridwidth = 1;
	    this.add(precedent, gbc);
	    
	}
	
}