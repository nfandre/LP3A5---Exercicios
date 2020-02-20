import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tarefas implements Runnable {

	private JTextField primeiro;
	private JTextField segundo;
	private JLabel resultado;
	private Operacao operacao;
	
	public Tarefas(JTextField primeiro, JTextField segundo, JLabel resultado, Operacao operacao) {
		this.primeiro = primeiro;
		this.segundo = segundo;
		this.resultado = resultado;
		this.operacao = operacao;
	}
	
	@Override
	public void run() {
		if(this.operacao == Operacao.mult) {
			mult();
		}
		if(this.operacao == Operacao.soma) {
			somar();
		}
		if(this.operacao == Operacao.div) {
			div();
		}
		if(this.operacao == Operacao.sub) {
			sub();
		}
		
	}
	public void mult() {
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		BigInteger calculo = new BigInteger("0");
		
		
		for (int i = 0; i < valor1; i++) {
			for (int j = 0; j < valor2; j++) 
				calculo = calculo.add(new BigInteger("1"));
		}
		resultado.setText(calculo.toString());
	}
	
	public void somar() {
		long valor1 = Long.parseLong(primeiro.getText());
		long valor2 = Long.parseLong(segundo.getText());
		
		BigInteger calculo = new BigInteger("0");
		for (int i = 0; i < valor1; i++) {
			calculo = calculo.add(new BigInteger("1"));
			if(valor1 == i-1) {
				for (int j = 0; j < valor2; i++) {
					calculo = calculo.add(new BigInteger("1"));
					
				}
			}
			
			
		}
		
		//int result = valor1 + valor2;
		resultado.setText(calculo.toString());
	}
	public void sub() {
		int valor1 = Integer.parseInt(primeiro.getText());
		int valor2 = Integer.parseInt(segundo.getText());
		
		
		for (int i = 0; i < valor1+valor2; i++) {
				
		}
		int result = valor1 - valor2;
		resultado.setText(""+result);
		
	}
	public void div() {
		float valor1 = Float.parseFloat(primeiro.getText());
		float valor2 = Float.parseFloat(segundo.getText());
		
		
		for (int i = 0; i < valor1+valor2; i++) {
				
		}
		float result = valor1 / valor2;
		resultado.setText(""+result);
		
	}

}
