package exercicio13;

public class AlimentacaoCaixa implements Runnable {
	private Caixa caixa;

	public AlimentacaoCaixa(Caixa caixa) {
		super();
		this.caixa = caixa;
	}

	@Override
	public void run() {
		while(true) {
			this.caixa.alimentarCedulas();
			try {
				Thread.sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
	
	
}
