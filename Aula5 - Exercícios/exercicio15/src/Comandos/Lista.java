package Comandos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

public class Lista implements Runnable{

	private String nomeArquivo;
	private Socket socket;
	@Override
	public void run() {
		
		Scanner ler;
		List<String> lista = new ArrayList<String>();
		try {
			ler = new Scanner(new File(nomeArquivo));
		
			
			while(ler.hasNextLine()) {
				String linha = ler.nextLine();
			
				lista.add(linha);
				
			}
			Collections.sort(lista);;
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
			saidaCliente.println("ORDENACAO" );

			for(String item : lista) {
				saidaCliente.println(nomeArquivo + " - " + item );
			}
			
			ler.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public Lista(String nomeArquivo, Socket socket) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.socket = socket;
	}
	

}
