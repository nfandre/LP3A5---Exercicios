package ExemploVagaCarro;
public class CompraDemorada implements Runnable{
	private Vaga vaga;
	
	public CompraDemorada(Vaga vaga) {
		this.vaga = vaga;
	}
	@Override
	public void run() {
		this.vaga.compraRapida();		
	}
	
}
