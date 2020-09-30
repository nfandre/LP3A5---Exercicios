package exercicio2;

import java.util.Optional;

public class main {

	public static void main(String[] args) {
		//a) Crie uma variável sem valor usando Optional   
		Optional<String> valorEmpty = Optional.empty();
		Optional<String> valor = Optional.ofNullable("String com valor");
		
		// - Usar orElseThrow para lançar a exceção no caso da variável vazia
		String result = valor.orElseThrow(() -> new NullPointerException("valor vazio"));
		System.out.println(result);
		
		//- Usar  orElseThrow  para lançar a exceção no caso da variável vazia 
		String resultEmpty = valorEmpty.orElseThrow(() -> new NullPointerException("valor vazio"));
		System.out.println(resultEmpty);


	}

}
