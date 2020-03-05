
public class Lista {
	private String[] elementos = new String[100];
	private int indice = 0;
	
	
	public void adicionaElementos(String elemento) {
		synchronized (this) {
			this.elementos[indice] = elemento;
		
		this.indice++;
		}
	}
	
	public int tamanho() {
		return this.elementos.length;
	}
	
	public String pegaElementos(int posicao) {
		return this.elementos[posicao];
	}
}
