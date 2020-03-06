package Servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class DistribuirTarefas implements Runnable {

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
				case "ola":
						saidaCliente.println("mundo");
					break;

				default:
					saidaCliente.println("Comando não encontrado");
				}
			}
			saidaCliente.close();
			entradaClient.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public DistribuirTarefas(Socket socket) {
		super();
		this.socket = socket;
	}

	
}
