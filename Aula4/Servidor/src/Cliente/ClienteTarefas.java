package Cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClienteTarefas {
	public static void main(String[] args) throws IOException, InterruptedException {
		Socket socket = new Socket("localhost", 8080);
		
		System.out.println("------ Conexão Estabeleciada ------");
		
		

		
		//Thread para enviar o comando para o servidor e executar em paralelo
		Thread ThreadEnviaComando = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Pode enviar comandos! ");
				PrintStream saida;
				try {
					saida = new PrintStream(socket.getOutputStream());

				
				//enviar dados para o servidor

				Scanner scanner = new Scanner(System.in);
				while(scanner.hasNextLine()) {
					String linha = scanner.nextLine();
					if(linha.trim().equals("")) {
						break;
					}
					saida.println(linha);
				}
				saida.close();
				scanner.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread threadRespostaServidor = new Thread(new Runnable() {
			public void run() {
				System.out.println("Recebendo dados do servidor");

				//receber dados do servidor
				Scanner respostaServidor;
				try {
					respostaServidor = new Scanner(socket.getInputStream());

				while(respostaServidor.hasNextLine()) {
					String linha = respostaServidor.nextLine();
					System.out.println(linha);
				}
				respostaServidor.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});		
		ThreadEnviaComando.start();
		threadRespostaServidor.start();
		
		//thread main espera
		ThreadEnviaComando.join();


		socket.close();
		
	

	}


}
