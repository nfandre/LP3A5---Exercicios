package exercicio12;

public class Calcular implements Runnable{
	private Double x;
	private Double z;
	public Calcular(Double x, Double z){
		this.x = x;
		this.z = z;
	}
	@Override
	public void run() {
		this.calcular();
		
	}
	
	public void calcular() {
		Double count = this.x;
		System.out.println("X       Z         RESPOSTA ");
		System.out.print(this.x + "     " + this.z);
		System.out.print("      " +count + " + ");
		while(this.x<this.z) {
			count++;
			this.x += count;
			

			System.out.print(" " + count + " + ");
			
		}
		//this.x +=count;
		System.out.print(" = " + this.x);
	}

}
