package exercicio12;

import java.util.Scanner;

import org.omg.PortableServer.THREAD_POLICY_ID;

public class Principal {
	static double X;
	static double Z;
	public static void main(String[] args) {
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
		
		Thread t = new Thread(() -> {
			Double count = X;
			System.out.println("X       Z         RESPOSTA ");
			System.out.print(X + "     " + Z);
			System.out.print("      " +count + " + ");
			while(X<Z) {
				count++;
				X += count;
				

				System.out.print(" " + count + " + ");
				
			}
			//this.x +=count;
			System.out.print(" = " + Z);
		}) ;
		t.start();
		

	}

}
