package n1Exercici5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		Object resultat = deserialitza(new File("Serialitza.ser"));
		
		System.out.println(resultat);
	}

	public static void serialitza(Object objects, File file) {

		try {
			FileOutputStream fp = new FileOutputStream(file);
			ObjectOutputStream os = new ObjectOutputStream(fp);

			os.writeObject(objects);
			os.close();
			fp.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Object deserialitza(File file) {

		try {
			FileInputStream fs = new FileInputStream(file);
			ObjectInputStream oi = new ObjectInputStream(fs);
			Object object = oi.readObject();

			
			oi.close();
			fs.close();
            return object;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
