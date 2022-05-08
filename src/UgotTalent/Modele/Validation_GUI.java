package UgotTalent.Modele;

import java.io.IOException;

public class Validation_GUI {
	private String id;
	private String code;
	private String code2;
	private String question;
	private String reponse;
	
	public Validation_GUI(String id, String code, String code2, String question, String reponse){
		this.id = id;
		this.code = code;
		this.code2 = code2;
		this.question = question;
		this.reponse = reponse;
	}
	
	public Validation_GUI(String id, String code){
		this.id = id;
		this.code = code;
	}
	
	public Validation_GUI(String id, String question, String reponse){
		this.id = id;
		this.question = question;
		this.reponse = reponse;
	}
	
	public String mdpOublie() throws IOException{
		BDDUsersRead myBDD = new BDDUsersRead();
		String mdp = null;
		if(this.id != ""){
			for(String[] s: myBDD.getUsers()){
				if(s[0].equals(this.id)){
					if(s[2].equals(question) && s[3].equals(reponse)){
							mdp = "Votre mot de passe est : " + s[1];
					}else{
						mdp = "Question ou reponse invalide!";
					}
				}else{
					mdp = "Cet identifiant n'existe pas.";
				}
			}
		}else{
			mdp = "Veuillez saisir l'identifiant";
		}
		return mdp;
	}
	
	
	public boolean autentif() throws IOException{
		BDDUsersRead myBDD = new BDDUsersRead();
		boolean valide = false;
		if(this.id != "" && this.code != ""){
			for(String[] s: myBDD.getUsers()){
				if(s[0].equals(this.id)){
					if(s[1].equals(this.code)){
						valide = true;
					}
				}
			}
		}
		return valide;
	}
	
	public boolean verifCode(){
		boolean verif = false;
		if(this.code != "" && this.code.equals(this.code2)){
			verif = true;
		}
		return verif;
	}
	
	public boolean verifID() throws IOException{
		BDDUsersRead myBDD = new BDDUsersRead();
		boolean valide = true;
		if(this.id != ""){
			for(String[] s: myBDD.getUsers()){
				if(s[0].equals(this.id)){
					valide = false;
					break;
				}
			}
		}else{
			valide = false;
		}
		return valide;
	}
	
	public boolean verifQuestion(){
		boolean valide = true;
		if(this.question=="Chosir votre question"){
			valide = false;
		}
		return valide;
	}
	
	public boolean verifReponse(){
		boolean valide = true;
		if(this.reponse==""){
			valide = false;
		}
		return valide;
	}
	
	public void changerQR() throws IOException{
		BDDUsersRead myBDD = new BDDUsersRead();
		String mdp = null;
		String[] row1 = new String[]{"Id","Code","Question","Reponse"};
		BDDUsers myUsers = new BDDUsers(row1, false);
		if(this.id != ""){
			for(String[] s: myBDD.getUsers()){
				if(s[0].equals(this.id)){
					s[2] = question;
					s[3] = reponse;
				}
				BDDUsers myUsers2 = new BDDUsers(s, true);
			}
		}
	}
}
