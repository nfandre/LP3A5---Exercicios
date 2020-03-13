package Servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Servidor {

	public static void main(String[] args) throws IOException {
		System.out.println("------ Inciando Servidor ------");
		
		ServerSocket servidor = new ServerSocket(8080);
		
		//aceitando requisição
		while(true) {
			Socket socket = servidor.accept();
			System.out.println("Aceitando novo cliente na porta: " + socket.getPort());
			
		//	DistribuirTarefas distribuiTarefa = new DistribuirTarefas(socket);
		//	pooldeThread.execute(distribuiTarefa);
			//new Thread(distribuiTarefa).start();
			
		
			
			
		}
	}

}
