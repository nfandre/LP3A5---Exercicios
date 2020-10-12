package exer1;

public class Generica {
	public void simular(Integer argumento) {
		
		if(argumento ==0) 
			argumento = argumento/0;
		
		if(argumento < 0) {
			throw new NumberFormatException("Erro-Argumento negavo ");
		}
		
		if(argumento <= 1000) {
			throw new NumberFormatException("Erro-Argumento deve ser maio que 1000: " + argumento);
		}
		
		if(argumento > 1000) {
			throw new NumberFormatException("Erro-Argumento muito grande" );
		}
		

		
		
		
		System.out.println("Argumento valido: " + argumento);
		
	}

}