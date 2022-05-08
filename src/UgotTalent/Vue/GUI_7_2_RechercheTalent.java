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


public class GUI_7_2_RechercheTalent extends MyJPanel{

	private MyTitre l1 = new MyTitre("Recherche Talents");
	
	private JLabel l2 = new JLabel(" Date de début : ");
	private JLabel l3 = new JLabel(" Date de fin : ");
	UtilDateModel model1 = new UtilDateModel();
	UtilDateModel model2 = new UtilDateModel();
	Properties p = new Properties();
	public static JDatePickerImpl dateDebut;
	public static JDatePickerImpl dateFin;
	
	private JLabel l4 = new JLabel(" Type de profession : ");
	private static Object[] elements = new Object[]{"PYTHON", "JAVA", "C", "C++", "HTML", "VBA", "XML", "C#", "PHP"};
	public static JComboBox typeProf = new JComboBox(elements);
	
	
	private JLabel l5 = new JLabel(" Difficulté : ");
	private static Object[] elements2 = new Object[]{"1","2","3","4","5","6","7","8","9","10+"};
	public static JComboBox difficulte = new JComboBox(elements2);
	
	private MyJButton finalisation = new MyJButton(new changePanel());
	private MyJButton retour = new MyJButton(new changePanel());
	private MyJButton rechercher = new MyJButton(new changePanel());
	private MyJButton ajoute = new MyJButton(new changePanel());
	
	DefaultListModel model = new DefaultListModel();
	JList list = new JList(model);
    JScrollPane pane = new JScrollPane(list);
	
	public GUI_7_2_RechercheTalent() {
		
		//On définit le layout manager
	    this.setLayout(new GridBagLayout());
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
	    
	    finalisation.setText("Panier");
	    finalisation.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    finalisation.setPreferredSize(new Dimension(100,30));
	    
	    retour.setText("Retour");
	    retour.setActionCommand("GUI_7_1");
	    retour.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    retour.setPreferredSize(new Dimension(100,30));
	    
	    rechercher.setText("Rechercher");
	    rechercher.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    rechercher.setPreferredSize(new Dimension(100,30));
	    
	    ajoute.setText("Mettre au panier");
	    ajoute.setFont(new java.awt.Font("Cambria", Font.PLAIN, 18));
	    ajoute.setPreferredSize(new Dimension(100,30));
	    
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.VERTICAL;
	    this.add(l1, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 1;
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(finalisation, gbc);
	    
	    
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    gbc.gridwidth = 1;
	    this.add(l2, gbc);
	    
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
	    this.add(l3, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 4;
	    gbc.gridwidth = 2;
	    this.add(dateFin, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    gbc.gridwidth = 1;
	    this.add(l4, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 6;
	    gbc.gridwidth = 3;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(typeProf, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 7;
	    gbc.gridwidth = 1;
	    this.add(l5, gbc);
	    
	    gbc.gridx = 1;
	    gbc.gridy = 7;
	    gbc.gridwidth = 2;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(difficulte, gbc);
	    
	    
	    gbc.fill = GridBagConstraints.BOTH;
	    
	    gbc.gridx = 2;
	    gbc.gridy = 8;
	    gbc.gridwidth = 1;
	    this.add(rechercher, gbc);
	    
	    gbc.gridx = 0;
	    gbc.gridy = 9;
	    gbc.gridwidth = 3;
	    gbc.weighty = 200;
	    gbc.weightx = 150;
	    gbc.fill = GridBagConstraints.BOTH;
	    this.add(pane, gbc);
	    
	    gbc.weighty = 1;
	    gbc.weightx = 1;
	    
	    gbc.gridx = 0;
	    gbc.gridy = 10;
	    gbc.gridwidth = 1;
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    this.add(retour, gbc);
	    
	    gbc.gridx = 2;
	    gbc.gridy = 10;
	    gbc.gridwidth = 1;
	    this.add(ajoute, gbc);
	    
	}
	
}