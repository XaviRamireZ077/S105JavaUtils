package n1Exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {

		File directori = new File(".");// Instanciem objecte de la classe File

		
		String resultat = FitxeroDirectori(directori, 0, new StringBuilder());
		guardarFitxer(resultat);
	}

	// Mètodes

	public static String FitxeroDirectori(File directori, int numerorecursivitat, StringBuilder acumulador) {

		File[] archius;

		archius = directori.listFiles();

		for (File file : archius) {
			for (int i = 0; i < numerorecursivitat; i++) {
				String tabulacio = "\t";

				acumulador.append(tabulacio);
			}

			if (file.isDirectory()) {

				String novavariable = " Es un directori (D)";
				acumulador.append((file.getName() + novavariable + "\n"));

				FitxeroDirectori(file, numerorecursivitat + 1, acumulador);

			}

			else {

				String novavariable2 = " NO es un directori (F)";
				acumulador.append(file.getName() + novavariable2 + "\n");

			}

		}
		return acumulador.toString();

	}

	public static void guardarFitxer(String resultat) {

		try {
			String directorio = "Resultatdirectori.txt";

			File file = new File(directorio);
			// Si el archivo no existe es creado
			if (!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(resultat);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
