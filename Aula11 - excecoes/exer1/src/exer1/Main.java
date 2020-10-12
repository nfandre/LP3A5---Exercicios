package exer1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Generica g = new Generica();
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero: ");
//		Integer number = scan.nextInt();

		
//		try {
//			g.simular(number);
//		}catch (Exception e) {
//			System.out.println("excecao: " + e);
//		}finally {
//			System.out.println("Finalizada a execucao  do metodo simular()");
//		}
		
		
		try {
			Integer text = scan.nextInt();
		}catch (Exception e) {
			System.out.println("excecao: " + e);
		}


	}

}
