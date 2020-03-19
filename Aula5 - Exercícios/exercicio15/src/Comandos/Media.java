package Comandos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Media  implements Runnable{

	private String nomeArquivo;
	private Socket socket;
	@Override
	public void run() {
		
		Scanner ler;
		int count = 0;
		double soma = 0;
		double result = 0;
		try {
			ler = new Scanner(new File(nomeArquivo));
		
			
			while(ler.hasNextLine()) {
				String linha = ler.nextLine();
				
				soma +=linha.length();
				if(linha.contains(" ")) {
					soma--;
				}
				count++;
				
			}
			
			result = soma/count;
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
			saidaCliente.println( " Quantidade de nomes no arquivo " + count );
			saidaCliente.println( " Quantidade de letras " + soma );
			saidaCliente.println( " Media da quantidade de letras por nome: " + result);
			ler.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public Media(String nomeArquivo, Socket socket) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.socket = socket;
	}

}
