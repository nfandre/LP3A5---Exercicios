import ExemploVagaCarro.CompraDemorada;
import ExemploVagaCarro.CompraRapida;
import ExemploVagaCarro.Limpeza;
import ExemploVagaCarro.Vaga;
import ExemploBanheiro.*;

public class Principal {

	public static void main(String[] args) {
			Vaga vaga = new Vaga();
			
			Thread carro1 = new Thread(new CompraRapida(vaga), "Corsa");
			Thread carro2 = new Thread(new CompraDemorada(vaga), "Sandero");
			Thread limpeza = new Thread(new Limpeza(vaga), "Limpeza");
			
			limpeza.setDaemon(true);
			carro1.start();
			carro2.start();	
			limpeza.start();
			
		
			
//			Banheiro banheiro = new Banheiro();
//			
//			Thread pessoa1 = new Thread(new UsarBanheiroRapido(banheiro), "jose" );
//			pessoa1.start();
//			
//			Thread pessoa2 = new Thread(new UsarBanheiroRapido(banheiro), "maria" );
//			pessoa2.start();
//			
//			
//			Thread pessoa3 = new Thread(new UsarBanheiroRapido(banheiro), "maria" );
//			pessoa3.start();
	}

}
