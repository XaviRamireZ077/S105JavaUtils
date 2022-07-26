package n1Exercici1;

import java.io.File;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		File directori = new File(".");

		listarFitxer(directori);

		}

	public static void listarFitxer(File directori) {

		File[] archius;

		archius = directori.listFiles();
		if (archius != null) {
			
		archius = Arrays.stream(archius).sorted().toArray(File[]::new);

		for (File file : archius) {

			System.out.println(file.getName());
	
		}
	
	
	}
	
	}
}