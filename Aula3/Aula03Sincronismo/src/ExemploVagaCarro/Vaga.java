package ExemploVagaCarro;

import javax.sound.midi.Soundbank;

public class Vaga {
	private boolean estaSuja = true;
	
	
	public void compraRapida() {
		String nomeThread = Thread.currentThread().getName();
		
		System.out.println(nomeThread + " procurando vaga no estacionamento");
		synchronized (this) {
			System.out.println(nomeThread + " Entrou uma vaga" );
			while(this.estaSuja) {
				System.out.println(nomeThread + "vaga esta suja, saindooo");
				espera();
			}
			System.out.println(nomeThread + " Fazendo compra rápida" );
			try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			estaSuja = true;
			System.out.println(nomeThread + " colocando as compras no carro");
			System.out.println(nomeThread + " entrando no carro");
			System.out.println(nomeThread + " saindo da vaga");
		}
		
	
	}
	
	
	private void espera() {
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	public void compraDemorada() {
		String nomeThread = Thread.currentThread().getName();
		
		
		System.out.println(nomeThread + " procurando vaga no estacionamento");
		
		synchronized (this) {
			System.out.println(nomeThread + " Entrou uma vaga" );
			while(this.estaSuja) {
				System.out.println(nomeThread + "vaga esta suja, saindooo");
				espera();
			}
			System.out.println(nomeThread + " Fazendo compra demorada" );
			
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			estaSuja = true;
			System.out.println(nomeThread + " colocando as compras no carro");
			System.out.println(nomeThread + " entrando no carro");
			System.out.println(nomeThread + " saindo da vaga");
		}
	}
	
	public void limpar() {
		String nomeThread = Thread.currentThread().getName();
		System.out.println(nomeThread + " procurando vaga para limpar");
		synchronized (this) {
			System.out.println(nomeThread + " Entrou uma vaga" );
			
			if(!estaSuja) {
				System.out.println(nomeThread + "Não está suja, vou sair");
				return;
			}
			System.out.println(nomeThread + " limpando a vaga" );
			this.estaSuja = false;
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			System.out.println();
			System.out.println(nomeThread + " Limpei, saindo da vaga");
			this.notifyAll();
	
		}		
	}
}
