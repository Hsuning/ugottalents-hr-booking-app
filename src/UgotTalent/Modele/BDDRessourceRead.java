package UgotTalent.Modele;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

public class BDDRessourceRead {
	private String[] nextLine;
	private static ArrayList<String[]> allusers = new ArrayList<String[]>();
	
	public ArrayList<String[]> getUsers() throws IOException{
		CSVReader reader = new CSVReader(new FileReader("Ressources.csv"));
		while((nextLine = reader.readNext()) != null){
			String[] s = nextLine[0].split(";");
			allusers.add(s);
		}
		return allusers;
	}
	
	public static void main(String[] args) throws IOException{
		BDDRessourceRead ressource = new BDDRessourceRead();
		for(String[] s: ressource.getUsers()){
			System.out.println(s[0]);
		}
	}
}
