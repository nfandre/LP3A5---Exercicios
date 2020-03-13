package exercicio13;

public class Caixa {
	public void Sacar() {
		String nomeThread = Thread.currentThread().getName();
		
		synchronized (this) {
			System.out.println(nomeThread + " Foi sacar o dinheiro");
			System.out.println(nomeThread + " Está sacando...");
			
			for (int i = 0; i < 8; i++) {
				System.out.print("*" );
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			System.out.println(nomeThread + " Sacou");
			System.out.println(nomeThread + " Saindo do caixa");
		}
		System.out.println("");
	}
	
	public void Trasnferir() {
		String nomeThread = Thread.currentThread().getName();
		
		synchronized (this) {
			System.out.println(nomeThread + " Foi transferir");
			System.out.println(nomeThread + " Está transferindo...");
			
			for (int i = 0; i < 5; i++) {
				System.out.print("*" );
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
			System.out.println(nomeThread + " Transferiu");
			System.out.println(nomeThread + " Saindo do caixa");
		}
		System.out.println("");
	}
}
