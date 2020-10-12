package exer2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		FileWriter arquivo1 = null;
		FileWriter arquivo2 = null;

		try {
			arquivo1 = new FileWriter(new File("arquivo1.txt"));
			arquivo2 = new FileWriter(new File("arquivo2.txt"));

			arquivo1.write("Andre");
			arquivo2.write("Nascimento de Freitas");
			
			a

		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} finally {
		    if (arquivo1 != null) {
		    	arquivo1.close();
		    }
		}

	}

}
