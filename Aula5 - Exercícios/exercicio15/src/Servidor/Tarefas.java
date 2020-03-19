package Servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

import Comandos.Desenho;
import Comandos.Lista;
import Comandos.TarefaBuscaNome;
import Comandos.Media;

public class Tarefas implements Runnable {

	private Socket socket;
	
	@Override
	public void run() {
		try {
			System.out.println("Distribuindo as tarefas para o cliente : " + socket);
			Scanner entradaClient = new Scanner(socket.getInputStream());
			PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
			
			while(entradaClient.hasNext()) {
				String comando = entradaClient.nextLine();
				System.out.println("Comando: "+ comando);
				
				switch (comando) {
				case "Desenhar":
						Thread Desenhar = new Thread(new Desenho(socket));
						Desenhar.start();
					break;
				case "buscar":
						saidaCliente.println("falta parametro");
				case "listar":
					 Thread listar = new Thread(new Lista("./src/ArquivosBusca/nomes.txt",socket));
					 listar.start();
				case "media":
					Thread media = new Thread(new Media("./src/ArquivosBusca/nomes.txt", socket));
					media.start();

				default:
					if(comando.contains("buscar(") && comando.substring(comando.length()-1).equals(")")) {
						String parametro = comando.substring(7, comando.length()-1);
						if(!parametro.equals("")) {
							//tarefa.buscar(parametro);
							Thread nomes = new Thread( new TarefaBuscaNome("./src/ArquivosBusca/nomes.txt", parametro, socket));
							nomes.start();
							break;
						}
						saidaCliente.println("Nao existe parametro na funcao");
						break;
					}
					saidaCliente.println("Comando não encontrado");
				}
			}
			saidaCliente.close();
			entradaClient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public Tarefas(Socket socket) {
		super();
		this.socket = socket;
	}
	
	

}
