package Comandos;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class TarefaBuscaNome implements Runnable {
	
	private String nomeArquivo;
	private String nomePessoa;
	private Socket socket;
	public TarefaBuscaNome(String nomeArquivo, String nomePessoa, Socket socket) {
		super();
		this.nomeArquivo = nomeArquivo;
		this.nomePessoa = nomePessoa;
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			Scanner ler = new Scanner(new File(nomeArquivo));
			
			int numeroLinha =1;
			
			while(ler.hasNextLine()) {
				String linha = ler.nextLine();
				
				if(linha.toUpperCase().contains(nomePessoa.toUpperCase())) {
					PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
					saidaCliente.println(nomeArquivo + " - " + nomePessoa + " - " + numeroLinha + " - " + linha);
					//System.out.println(nomeArquivo + " - " + nomePessoa + " - " + numeroLinha + " - " + linha);
				}
				numeroLinha++;
				
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
	
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}




	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}




	public String getNomePessoa() {
		return nomePessoa;
	}




	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
}
