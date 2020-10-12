package exer1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		// Gere   uma   lista   com   100   n�meros   aleat�rios 
		for(int i=0; i<100 ; i++ ) {
			list.add(new Random().nextInt(100));
		}
		
		// Mostre   a   soma   de   todos,   usando   reduce 
		Optional<Integer> soma = list.stream()
		.reduce((n1, n2) -> n1 + n2);
		System.out.println("Mostre   a   soma   de   todos,   usando   reduce: " + soma.get());
		
		//Mostre   a   mulplica��o   de   todos,   usando   reduce 
		Optional<Integer> mult = list.stream()
		.reduce((n1, n2) -> n1 * n2);
		System.out.println("Mostre   a   mulplica��o   de   todos,   usando   reduce: " + mult.get());
		
		// Mostre   o   menor   n�mero,   usando   reduce 
		Optional<Integer> menor = list.stream()
		.reduce((n1, n2) -> Math.min(n1, n2));
		System.out.println("Mostre   o   menor   n�mero,   usando   reduce: " + menor.get());
		
		//  Mostre   o   maior   n�mero,   usando   reduce
		Optional<Integer> maior = list.stream()
		.reduce((n1, n2) -> Math.max(n1, n2));
		System.out.println("Mostre   o   maior   n�mero,   usando   reduce: " + maior.get());
		

	}

}
