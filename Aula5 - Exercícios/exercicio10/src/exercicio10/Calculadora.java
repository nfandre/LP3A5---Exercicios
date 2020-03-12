package exercicio10;

public class Calculadora {

	
	private String Operacao;
	private Double n1;
	private Double n2;
	
	public Calculadora(String operacao, Double n1, Double n2) {
		super();
		Operacao = operacao;
		this.n1 = n1;
		this.n2 = n2;
	}


	public Double calcular() {
		Double result = null;
		switch (this.Operacao) {
		case "+":
				result = this.n1 + this.n2;
			
			break;
		case "-":
				result =  this.n1 -  this.n2;
				break;
		case "/":
			result =  this.n1 /  this.n2;
			break;
		case "*":
			result =  this.n1 *  this.n2;
			break;	
		default:
			break;
		}
		System.out.println("Resultado: "+ result);
		return result;
	}
	
}
