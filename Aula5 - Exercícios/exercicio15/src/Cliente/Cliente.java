package Cliente;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		Socket socket = new Socket("localhost", 8080);
		
		System.out.println("------ Conexão Estabeleciada ------");

		Thread EnviarComando = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Envie um comando válido! ");
				PrintStream saida;
				
				
				try {
					saida = new PrintStream(socket.getOutputStream());
					
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
		
		EnviarComando.start();
		threadRespostaServidor.start();
				//thread main espera
		EnviarComando.join();


		socket.close();
		
	}

}
