
public class Principal {

	public static void main(String[] args) {
		String procurado = "j";
		Thread assinaturas1 = new Thread( new TarefaBuscaNome("./src/ArquivosBusca/assinaturas1.txt", procurado));
		
		Thread assinaturas2 = new Thread( new TarefaBuscaNome("./src/ArquivosBusca/assinaturas2.txt", procurado));
		
		Thread autores = new Thread( new TarefaBuscaNome("./src/ArquivosBusca/autores.txt", procurado));

		Thread nomes = new Thread( new TarefaBuscaNome("./src/ArquivosBusca/nomes.txt", procurado));
		
		nomes.start();
		nomes.setPriority(Thread.MAX_PRIORITY);
		assinaturas1.start();
		assinaturas1.setPriority(Thread.MIN_PRIORITY);
	//	assinaturas2.start();
		//autores.start();
		


	}

}
