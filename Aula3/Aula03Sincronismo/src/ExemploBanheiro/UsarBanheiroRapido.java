package ExemploBanheiro;

public class UsarBanheiroRapido implements Runnable{
	private Banheiro banheiro;
	public UsarBanheiroRapido(Banheiro banherio ) {
		this.banheiro = banherio;
	}
	@Override
	public void run() {
		this.banheiro.usarBanheiro();
	}


}
