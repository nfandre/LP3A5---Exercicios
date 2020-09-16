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
		
		// solicite ao usu�rio a entrada no �ltimo n�mero da lista (stream) (n)
		System.out.println("Digite um n�mero para n");
		n = ler.nextInt();
		
		//Gere uma lista com n�meros de 1 a n duplicados (1,1,2,2,3,3...)
		for(int i= 0; i <= n; i++) {
			lista.add(i);
			lista.add(i);
		}
		
		//Mostre todos os n�meros
		System.out.println("Mostre todos os n�meros");
		lista.forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os n�meros sem repeti��o
		System.out.println();
		System.out.println("Mostre todos os n�meros sem repeti��o");
		lista.stream().distinct().forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os n�meros impares sem repeti��o
		System.out.println();
		System.out.println("Mostre todos os n�meros impares sem repeti��o");
		lista.stream().distinct().filter(e -> 0 != e % 2).forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os n�meros pares sem repeti��o
		System.out.println();
		System.out.println("Mostre todos os n�meros pares sem repeti��o");
		lista.stream().distinct().filter(e -> 0 == e % 2).forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os n�meros a partir do 5 algarismo sem repeti��o
		System.out.println();
		System.out.println("Mostre todos os n�meros pares sem repeti��o");
		lista.stream().distinct().skip(5).forEach(e -> System.out.print(e + " "));
		
		//Mostre todos os n�meros multiplicados por 4
		System.out.println();
		System.out.println("Mostre todos os n�meros multiplicados por 4");
		lista.stream().map(e -> e * 4).forEach(e -> System.out.print(e + " "));
		
	}

}
