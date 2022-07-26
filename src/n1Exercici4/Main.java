package n1Exercici4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		String resultat = LlegirFitxer(new File("Resultatdirectori.txt"));
		
		System.out.println(resultat);
	}

	// Mètodes

	
	

	public static String LlegirFitxer(File lecturaArchiu) {
		Scanner sc;
		StringBuilder acumulador = new StringBuilder();

		try {
			sc = new Scanner(lecturaArchiu);

			while (sc.hasNextLine()) {
				acumulador.append(sc.nextLine()).append("\n");
			
			}
			sc.close();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return acumulador.toString();
	}

}
