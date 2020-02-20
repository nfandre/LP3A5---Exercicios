import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;


public class AcaoBotao implements ActionListener{
	
	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	private Operacao operacao;
	
	public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado , Operacao operacao) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
		this.operacao = operacao;
		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		

		Thread thread = new Thread(new Tarefas(primeiro,segundo,resultado, operacao));
		thread.start();
		
	}

}
