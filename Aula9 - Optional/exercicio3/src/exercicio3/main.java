package exercicio3;

import java.util.Optional;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		Optional<String> result = Stream.of("Paulo", "Camila", "Ana Maria", "Patrick", "Pedro", "Alfredo")
		.filter((name) -> name.substring(0, 1).equalsIgnoreCase("W")).findAny();
		
		if(result.isPresent()) {
			System.out.println(result.get());
		}else{
			System.out.println("Nomes com esta letra não consta na lista");			
		}

	}

}
