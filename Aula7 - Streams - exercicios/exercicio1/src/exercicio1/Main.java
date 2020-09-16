package exercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;




public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		// Crie um Stream contendo todos os n�meros de 0 a 9
		List<Integer> lista = Arrays.asList(0, 1,2,3,4,5,6,7,8,9);

		//Aplique um filtro mantendo apenas os n�meros pares
		lista.stream().filter(e -> 0 == e % 2)
		.skip(2)//Ignores os dois primeiros n�meros
		.limit(2) //Limite o processamento aos dois primeiros n�meros
		.map(e -> e * 4) //		//Aplique uma multiplica��o por 2 em cada elemento
		.forEach(e -> System.out.print(e + " "));	// Mostre o resultado final	
				
	}

}
