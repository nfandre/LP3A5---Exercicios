package Comandos;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Desenho implements Runnable{
	private Socket socket;
	@Override
	public void run() {
		String quadrado = "RETANGULO";
        quadrado += System.lineSeparator(); 
		 quadrado += "-----------------------";
		quadrado += System.lineSeparator(); 
       for(int i = 1; i <= 5; i++) { 
    	   quadrado += "|*";
            for(int j = 0; j < 19; j++){
            	quadrado += "*";
                //System.out.print("*");
            }
            quadrado += "*|";
            quadrado += System.lineSeparator(); 
            //System.out.println(); 
        }
       quadrado += "-----------------------";
       try {
		PrintStream saidaCliente = new PrintStream(socket.getOutputStream());
		saidaCliente.println(quadrado);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	public Desenho(Socket socket) {
		super();
		this.socket = socket;
	}
	

}
