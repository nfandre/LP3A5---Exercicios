package exercicio011;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String frase;
		System.out.println("----------------------------");
		System.out.println("Informe uma frase:");
		Scanner ler = new Scanner(System.in);
		
		frase = ler.next();
		
		Contador c = new Contador(frase);
		Thread cont1 = new Thread(new Contar(c));
		
		cont1.start();
		
		

	}

}
