
public class TarefaAdicionarElemento implements Runnable {
	private Lista lista;
	int numeroDaThread;
	public TarefaAdicionarElemento(Lista lista, int numeroDaThread) {
		super();
		this.lista = lista;
		this.numeroDaThread = numeroDaThread;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
		
				lista.adicionaElementos(" Thread " + numeroDaThread + " - " + i);
					
		}
		
	}
 
}
