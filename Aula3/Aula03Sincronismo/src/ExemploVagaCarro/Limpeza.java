package ExemploVagaCarro;

public class Limpeza implements Runnable {
	private Vaga vaga;
	
	public Limpeza(Vaga vaga) {
		this.vaga = vaga;
	}
	@Override
	public void run() {
		while(true) {
			this.vaga.limpar();
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
