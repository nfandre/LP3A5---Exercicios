package exercicio011;

public class Contar implements Runnable {
	private Contador contar;
	
	public Contar(Contador contar) {
		super();
		this.contar = contar;
	}

	@Override
	public void run() {
		this.contar.Contar();
		
	}

}
