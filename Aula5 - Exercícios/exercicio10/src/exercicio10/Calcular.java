package exercicio10;

public class Calcular implements Runnable{
	private Calculadora calculadora;
	@Override
	public void run() {
		this.calculadora.calcular();
		
	}
	public Calcular(Calculadora calculadora) {
		this.calculadora = calculadora;
	}
	

}
