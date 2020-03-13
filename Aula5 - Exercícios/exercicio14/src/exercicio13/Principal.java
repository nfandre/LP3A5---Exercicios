package exercicio13;

public class Principal {

	public static void main(String[] args) {
		System.out.println("--------------------");
		
		Caixa c = new Caixa();
		
		Thread joao = new Thread(new Saque(c), " Joao");
		Thread paulo = new Thread(new Transferencia(c), " Paulo");
		Thread cedulas = new Thread(new AlimentacaoCaixa(c), "Cedulas");
		
		cedulas.setDaemon(true);
		cedulas.start();
		joao.start();
		paulo.start();

	}

}
