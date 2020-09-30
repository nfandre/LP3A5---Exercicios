package exercicio1;

import java.util.Optional;

public class main {

	public static void main(String[] args) {
		//a) Crie uma variável sem valor usando Optional   
		Optional<String> valor = Optional.empty();
		// Teste:  se o oponal vazio obter a string usando  orElse  
		String result =valor.orElse("retorno");
		// Mostrar resultado 
		System.out.println(result);
		//Teste:  se o oponal a vazio obter a string usando  orElseGet  
		 result = valor.orElseGet(() -> "string vazia");
		// Mostrar resultado 
		System.out.println(result);
		
		
		//  b) Crie uma variável com valor usando Optional: uma com valor e outra vazia   
		Optional<String> valor2 = Optional.of("retorno");
		//- Teste:  se o oponal vazio obter a string usando  orElse
		result = valor2.orElse("retorno");
		//- Mostrar resultado
		System.out.println(result);
		//- Teste:  se o oponal a vazio obter a string usando  orElseGet 
		 result = valor2.orElseGet(() -> "string vazia");
		//- Mostrar resultado 
		System.out.println(result);

	}

}
