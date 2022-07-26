package N1Exercici2;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		File directori = new File(".");

		listarFitxer(directori, 0);

	}

	public static void listarFitxer(File directori, int numerorecursivitat) {

		File[] archius;

		archius = directori.listFiles();

		for (File file : archius) {
			for (int i = 0; i < numerorecursivitat; i++)
	            System.out.print("\t");

			if (file.isDirectory()) {
				System.out.print(file.getName());
				System.out.println(" Es un directori (D)" + numerorecursivitat);
				listarFitxer(file, numerorecursivitat + 1);

			}

			else {
				System.out.print(file.getName());
				System.out.println(" NO es un directori (F)" + numerorecursivitat);

			}
		}

	}

}
