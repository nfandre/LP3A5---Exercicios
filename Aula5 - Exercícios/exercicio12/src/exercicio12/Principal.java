package exercicio12;

import java.util.Scanner;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Principal {

	public static void main(String[] args) {
		double X, Z;
		Scanner ler = new Scanner(System.in);

		System.out.println("----------------------------");
		System.out.println("Informe o valor de X:");
		X = Double.parseDouble(ler.next());
		
		System.out.println("Informe o valor de Z:");
		Z = Double.parseDouble(ler.next());
		
		while(Z< X) {
			System.out.println("Informe o valor de Z que seja maio que o valor de X: X = "+ X);
			Z = Double.parseDouble(ler.next());
		}
		
		Thread t = new Thread(new Calcular(X,Z));
		t.start();
		

	}

}
