package exercicio13;

public class Caixa {
	private boolean temCedula = true;
	public void Sacar() {

		String nomeThread = Thread.currentThread().getName();

		synchronized (this) {
			System.out.println(nomeThread + " Foi sacar o dinheiro");
			System.out.println(nomeThread + " Está sacando...");
			
			while(!this.temCedula) {
				System.out.println(nomeThread + " Caixa está sem cedula, vou esperar alguém colocar...");
				this.espera();
			}
			for (int i = 0; i < 8; i++) {
				System.out.print("*" );
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.temCedula = false;
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
			
			while(!this.temCedula) {
				System.out.println(nomeThread + " Caixa está sem cedula, vou esperar alguém colocar...");
				this.espera();
			}
			for (int i = 0; i < 5; i++) {
				System.out.print("*" );
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			this.temCedula = false;
			System.out.println();
			System.out.println(nomeThread + " Transferiu");
			System.out.println(nomeThread + " Saindo do caixa");
		}
		System.out.println("");
	}
	private void espera() {
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void alimentarCedulas() {
		String nomeThread = Thread.currentThread().getName();
		System.out.println(nomeThread + " Procurando caixas para colocar cedulas");
		synchronized (this) {
			System.out.println(nomeThread + " Achou o caixa" );
			System.out.println(nomeThread + " Está colocando as cedulas...");
			
			if(temCedula) {
				System.out.println(nomeThread + "Já tem cedula, vou sair");
				return;
			}
			
			this.temCedula = true;
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
			System.out.println(nomeThread + " Coloquei cedulas, saindo");
		}
	}
}
