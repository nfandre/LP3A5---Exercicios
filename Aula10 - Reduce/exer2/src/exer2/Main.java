package exer2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		//2.   Crie   uma   lista   (streams)   contendo   as   informações   da   tabela   abaixo
		
		List<String> names = Arrays.asList(
				"Paulo", 
				"Camila", 
				"Ana Maria", 
				"Patrick", 
				"Ana Clara", 
				"Pedro", 
				"Alfredo"
				);
		
		//Mostre   a   concatenação   dos   nomes   que   começam   com   P 
		Optional<String> result = names.stream()
		.filter((name) -> name.substring(0, 1).equalsIgnoreCase("P"))
		.reduce((name1, name2) -> name1.concat(name2));
		System.out.println("Mostre   a   concatenação   dos   nomes   que   começam   com   P: " + result.get());
		
		//Mostre   a   concatenação   dos   nomes   que   começam   com   A:
		Optional<String> result2 = names.stream()
		.filter((name) -> name.substring(0, 1).equalsIgnoreCase("A"))
		.reduce((name1, name2) -> name1.concat(name2));
		System.out.println("Mostre   a   concatenação   dos   nomes   que   começam   com   A: " + result2.get());
	
		//Mostre   a   concatenação   de   todos   os   nomes:
		Optional<String> result3 = names.stream()
		.reduce((name1, name2) -> name1.concat(name2));
		System.out.println("Mostre   a   concatenação   de   todos   os   nomes: " + result3.get());
	

	}

}
