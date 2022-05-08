package UgotTalent.Vue;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import UgotTalent.Controleur.changePanel;

public class MyJButton extends JButton{
	public MyJButton(changePanel changePanel) {
		//Font police = new Font ();
		//this.setFont(police);
		//this.setPreferredSize(new Dimension(300,50));
		this.addActionListener((ActionListener) changePanel);
	}

}
