package ExemploBanheiro;

public class Banheiro {
	public void usarBanheiro() {
		String nomeThread = Thread.currentThread().getName();
		
		synchronized (this) {
			System.out.println(nomeThread + " Entrando no banheiro");
			System.out.println(nomeThread + " Usando banheiro...");
			
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
			System.out.println(nomeThread + " Lavando as mãos");
			System.out.println(nomeThread + " saindo da banheiro");
		}
		System.out.println("");
	}
}
