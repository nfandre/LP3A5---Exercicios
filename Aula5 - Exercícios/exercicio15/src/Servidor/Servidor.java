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
		
		ExecutorService pooldeThread = Executors.newCachedThreadPool();
		
		//aceitando requisição
		while(true) {
			Socket socket = servidor.accept();
			System.out.println("Aceitando novo cliente na porta: " + socket.getPort());
			
			Tarefas distribuiTarefa = new Tarefas(socket);
			pooldeThread.execute(distribuiTarefa);


			
		
			
			
		}
	}

}
