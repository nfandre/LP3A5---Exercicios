package exer2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		//2.   Crie   uma   lista   (streams)   contendo   as   informa��es   da   tabela   abaixo
		
		List<String> names = Arrays.asList(
				"Paulo", 
				"Camila", 
				"Ana Maria", 
				"Patrick", 
				"Ana Clara", 
				"Pedro", 
				"Alfredo"
				);
		
		//Mostre   a   concatena��o   dos   nomes   que   come�am   com   P 
		Optional<String> result = names.stream()
		.filter((name) -> name.substring(0, 1).equalsIgnoreCase("P"))
		.reduce((name1, name2) -> name1.concat(name2));
		System.out.println("Mostre   a   concatena��o   dos   nomes   que   come�am   com   P: " + result.get());
		
		//Mostre   a   concatena��o   dos   nomes   que   come�am   com   A:
		Optional<String> result2 = names.stream()
		.filter((name) -> name.substring(0, 1).equalsIgnoreCase("A"))
		.reduce((name1, name2) -> name1.concat(name2));
		System.out.println("Mostre   a   concatena��o   dos   nomes   que   come�am   com   A: " + result2.get());
	
		//Mostre   a   concatena��o   de   todos   os   nomes:
		Optional<String> result3 = names.stream()
		.reduce((name1, name2) -> name1.concat(name2));
		System.out.println("Mostre   a   concatena��o   de   todos   os   nomes: " + result3.get());
	

	}

}
