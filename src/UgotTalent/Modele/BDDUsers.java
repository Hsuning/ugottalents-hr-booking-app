package UgotTalent.Modele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class BDDUsers {
	String[] row = null;
	public BDDUsers(String[] donnees, boolean b) throws IOException{
		String[] row = donnees;
		String csv = "Users.csv";
		
		if(b){
			CSVWriter writer = new CSVWriter(new FileWriter(csv, b));
			writer.writeNext(row);
			writer.close();
		}else{
			CSVWriter writer = new CSVWriter(new FileWriter(csv, b));
			//String[] row1 = new String[]{"Id","Code","Question","Reponse"};
			//writer.writeNext(row1); 
			writer.writeNext(row);
			writer.close();
		}
		

	}
}
