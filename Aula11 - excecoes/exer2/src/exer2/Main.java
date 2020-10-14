package exer2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		try (FileWriter arquivo1 = new FileWriter(new File("arquivo1.txt"));
				FileWriter arquivo2 = new FileWriter(new File("arquivo2.txt"))
				){
			arquivo1.write("Andre");
			arquivo2.write("Nascimento de Freitas");


		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} 
		
		readFile();

	}
	
	public static void readFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("arquivo1.txt"));
				BufferedReader br2 = new BufferedReader(new FileReader("arquivo2.txt"))){
            System.out.println("Nome completo: " + br.readLine() + " " + br2.readLine());

        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
