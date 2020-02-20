import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {
	
	public static void main(String[] args) throws InterruptedException {
		
		JFrame janela = new JFrame("Calculadora");
		
		JTextField txtMult1 = new JTextField(10);
		JTextField txtMult2 = new JTextField(10);
		JButton btnMult = new JButton(" = ");
		JLabel resultMult = new JLabel(" Resultado");
		
		JTextField txtSoma1 = new JTextField(10);
		JTextField txtSoma2 = new JTextField(10);
		JButton btnSoma = new JButton(" = ");
		JLabel resultSoma = new JLabel(" Resultado");

		JTextField txtSub1 = new JTextField(10);
		JTextField txtSub2 = new JTextField(10);
		JButton btnSub = new JButton(" = ");
		JLabel resultSub = new JLabel(" Resultado");
		
		JTextField txtDiv1 = new JTextField(10);
		JTextField txtDiv2 = new JTextField(10);
		JButton btnDiv = new JButton(" = ");
		JLabel resultDiv = new JLabel(" Resultado");

		
		btnMult.addActionListener(new AcaoBotao(txtMult1, txtMult2, resultMult, Operacao.mult));
		btnSoma.addActionListener(new AcaoBotao(txtSoma1, txtSoma2, resultSoma, Operacao.soma));
		btnDiv.addActionListener(new AcaoBotao(txtDiv1, txtDiv2, resultDiv, Operacao.div));
		btnSub.addActionListener(new AcaoBotao(txtSub1, txtSub2, resultSub, Operacao.sub));
		
		
		
		
		JPanel painel = new JPanel();
		
		painel.add(txtMult1);
		painel.add(new JLabel("x"));
		painel.add(txtMult2);
		painel.add(btnMult);
		painel.add(resultMult);
		painel.setLayout(new FlowLayout());
		
		painel.add(txtSoma1);
		painel.add(new JLabel("+"));
		painel.add(txtSoma2);
		painel.add(btnSoma);
		painel.add(resultSoma);
		painel.setLayout(new FlowLayout());
		
		painel.add(txtSub1);
		painel.add(new JLabel("-"));
		painel.add(txtSub2);
		painel.add(btnSub);
		painel.add(resultSub);
		painel.setLayout(new FlowLayout());
		
		painel.add(txtDiv1);
		painel.add(new JLabel("/"));
		painel.add(txtDiv2);
		painel.add(btnDiv);
		painel.add(resultDiv);
		painel.setLayout(new FlowLayout());
		


		
		janela.add(painel);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setPreferredSize(new Dimension(400, 500));
		janela.setResizable(false);
		janela.pack();
		janela.setVisible(true);
		
		
		
	}
}
