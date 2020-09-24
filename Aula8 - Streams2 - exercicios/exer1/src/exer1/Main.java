package exer1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		gerarLista100();
		gerarLista10();
				
	}
	
	public static void gerarLista100() {
		System.out.println("Gere uma lista com 100 n�meros aleat�rios e mostre estes n�meros");
		
		List<Integer> lista = new ArrayList();
		
		for(int i=0; i<100;i++) {
			lista.add( new Random().nextInt());
		}
		
		lista.stream()
			.forEach(e -> System.out.println(e));
	}
	
	public static void gerarLista10() {
		System.out.println("Gere uma lista com 10 n�meros quaisquer");
		
		List<Integer> lista = new ArrayList();
		
		// carregando a lista
		for(int i=0; i<10;i++) {
			lista.add( new Random().nextInt(100));
		}
		lista.stream()
		.forEach(e -> System.out.print(e + " "));
		System.out.println();
		
		System.out.println("N�mero m�ximo: " + lista.stream().max(Comparator.naturalOrder()).get() );
		System.out.println("N�mero m�nimo: " + lista.stream().min(Comparator.naturalOrder()).get() );
		System.out.println("Quantidade de n�meros: " + lista.stream().count() );

	}

}
