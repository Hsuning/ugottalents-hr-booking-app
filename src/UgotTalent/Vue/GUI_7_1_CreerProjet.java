package UgotTalent.Vue;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Properties;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import UgotTalent.Controleur.changePanel;
import UgotTalent.Modele.DateLabelFormatter;


public class GUI_7_1_CreerProjet extends MyJPanel{

	private MyTitre l1 = new MyTitre("Creation de projet");
	
	private JLabel l2 = new JLabel(" Nom du projet : ");
	public static  JTextField nomProjet = new JTextField(50);
	
	private JLabel l3 = new JLabel(" Date de début : ");

	
	UtilDateModel model1 = new UtilDateModel();
	UtilDateModel model2 = new UtilDateModel();
	Properties p = new Properties();
	public static JDatePickerImpl dateDebut;
	public static JDatePickerImpl dateFin;
	
	private JLabel l4 = new JLabel(" Date de fin : ");
	
	private JLabel l5 = new JLabel(" Description : ");
	public static JTextArea desc = new JTextArea();
	
	private MyJButton precedent = new MyJButton(new changePanel());
	private MyJButton poursuivre = new MyJButton(new changePanel());
	
	public GUI_7_1_CreerProjet() {
		
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
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(l2, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridwidth = 3;
	    this.add(nomProjet, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 1;
	    this.add(l3, gbc);
	    

		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1, p);
		JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p);
		// Don't know about the formatter, but there it is...
		dateDebut = new JDatePickerImpl(datePanel1, new DateLabelFormatter());
		dateFin = new JDatePickerImpl(datePanel2, new DateLabelFormatter());

	    gbc.gridx = 1;
	    gbc.gridy = 3;
	    gbc.gridwidth = 2;
	    this.add(dateDebut, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    gbc.gridwidth = 1;
	    this.add(l4, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 4;
	    gbc.gridwidth = 2;
	    this.add(dateFin, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    gbc.gridwidth = 1;
	    this.add(l5, gbc);
	    
	    desc.setLineWrap(true);
	    desc.setWrapStyleWord(true); 
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 3;
	    gbc.weighty = 100;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(desc, gbc);
	    
	    gbc.weighty = 1;
	    gbc.weightx = 1;
	    
	    precedent.setText("Precedent");
	    precedent.setActionCommand("GUI_4");
	    precedent.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    precedent.setPreferredSize(new Dimension(100,30));
	    
	    poursuivre.setText("Poursuivre");
	    poursuivre.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    poursuivre.setPreferredSize(new Dimension(100,30));
	    
	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbc.gridx = 0;
	    gbc.gridy = 7;
	    gbc.gridwidth = 1;
	    this.add(precedent, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 7;
	    gbc.gridwidth = 1;
	    this.add(poursuivre, gbc);
	    
	}
	
}