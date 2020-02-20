import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class AcaoBotao implements ActionListener{
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	
	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		
		Thread thread = new Thread(new TarefaMutiplicacao(primeiro,segundo,resultado), "TAREFA MULTI");
		thread.start();
		Thread thread2 = new Thread(new TarefaMutiplicacao(primeiro,segundo,resultado), "TAREFA MULTI1");
		thread2.start();
		
		Thread thread3 = new Thread(new TarefaMutiplicacao(primeiro,segundo,resultado), "TAREFA MULTI2");
		thread3.start();
	}

}
