package UgotTalent.Vue;


import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUI_0_Start extends JFrame{
	//Attribut pour ajouter dans la frame
	private GUI_1_Bienvenue accueil = new GUI_1_Bienvenue(new ImageIcon("Images/image.png").getImage());
	
	public GUI_0_Start(){
		this.setTitle("UgotTalents");
		this.setSize(400, 660); 
	    //Termine le processus lorsqu'on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    this.setContentPane(accueil);
	    this.setLocationRelativeTo(null);
		this.setVisible(true);


	}
}
