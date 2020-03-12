package exercicio011;

public class Contador {
	String frase;
	int vogal;
	int consoante;
	public Contador(String frase) {
		super();
		this.vogal = 0;
		this.frase = frase;
	}
	
	void Contar(){
		this.frase = this.frase.toLowerCase();
		
		for(int i=0; i< this.frase.length(); i++) {
			char caractere = this.frase.charAt(i);
			
			if(caractere ==32)
					continue;
			
			if(caractere == 97 |
				  caractere == 101 | 
						  caractere == 105 | 
								  caractere == 111 | 
										  caractere == 117){
                this.vogal++;
                continue;
	        }
			if(caractere >= 98 && caractere <= 122) 
				consoante++;
		}
		System.out.println("A frase: " + frase);
		System.out.println("Tem " + vogal + " vogais");
		System.out.println("E "+ consoante + " consoantes");
	}
}
