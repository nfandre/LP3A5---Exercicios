package exercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double n1, n2;
		String operacao;
		
		System.out.println("----------------------------");
		System.out.println("Informe dois números:");
		Scanner ler = new Scanner(System.in);
		n1 = Double.parseDouble(ler.next());
		n2 = Double.parseDouble(ler.next());
		
		System.out.println("Informe a operação a ser realizada: (+,-,/,*) ");
		operacao = ler.next();
		Calculadora c = new Calculadora(operacao,n1,n2);
		Thread calcular = new Thread(new Calcular(c));
		
		calcular.start();
		

	}

}
