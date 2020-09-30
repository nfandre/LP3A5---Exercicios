package exercicio4;

import java.util.Optional;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		System.out.println(Stream.of("Paulo", "Camila", "Ana Maria", "Patrick", "Pedro", "Alfredo")
		.filter((name) -> name.substring(0, 1).equalsIgnoreCase("W")).findAny()
		.orElseThrow(() -> new NullPointerException("Nomes com esta letra não consta na lista")));

	}

}
