package UgotTalent.Vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class MyJPanel2 extends JPanel{
	public static Image img;

	public MyJPanel2(){
		//this.setBackground();
		System.setProperty( "file.encoding", "UTF-8" );
	}
	
	
	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
}
}
