package exercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lista = new ArrayList<Integer>();
		Scanner ler = new Scanner(System.in);
		int n =0;
		
		// solicite ao usuário a entrada no último número da lista (stream) (n)
		System.out.println("Digite um número para n");
		n = ler.nextInt();
		
		//Gere uma lista com números de 1 a n duplicados (1,1,2,2,3,3...)
		for(int i= 0; i <= n; i++) {
			lista.add(i);
			lista.add(i);
		}
		
		//Mostre todos os números
		System.out.println("Mostre todos os números");
		lista.forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os números sem repetição
		System.out.println();
		System.out.println("Mostre todos os números sem repetição");
		lista.stream().distinct().forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os números impares sem repetição
		System.out.println();
		System.out.println("Mostre todos os números impares sem repetição");
		lista.stream().distinct().filter(e -> 0 != e % 2).forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os números pares sem repetição
		System.out.println();
		System.out.println("Mostre todos os números pares sem repetição");
		lista.stream().distinct().filter(e -> 0 == e % 2).forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os números a partir do 5 algarismo sem repetição
		System.out.println();
		System.out.println("Mostre todos os números pares sem repetição");
		lista.stream().distinct().skip(5).forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os números multiplicados por 4
		System.out.println();
		System.out.println("Mostre todos os números multiplicados por 4");
		lista.stream().map(e -> e * 4).forEach(e -> System.out.print(e + " "));
		
	}

}
