package exercicio13;

public class Saque implements Runnable {
	
	private Caixa caixa;
	
	
	public Saque(Caixa caixa) {
		super();
		this.caixa = caixa;
	}


	@Override
	public void run() {
		this.caixa.Sacar();
	}

}
