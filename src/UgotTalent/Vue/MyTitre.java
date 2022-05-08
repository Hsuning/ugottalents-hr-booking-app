package UgotTalent.Vue;

import java.awt.Font;
import javax.swing.JLabel;

public class MyTitre extends JLabel{

	public MyTitre(String titre) {
		this.setText(titre);
		Font police = new Font ("Cambria", Font.PLAIN, 26);
		this.setFont(police);
	}

}
