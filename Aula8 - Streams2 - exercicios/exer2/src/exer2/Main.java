package exer2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList();
		
		nomes.add("Paulo");
		nomes.add("Camila");
		nomes.add("Ana Maria");
		nomes.add("Patrick");
		nomes.add("Ana Clara");
		nomes.add("Pedro");
		nomes.add("Alfredo");
		
		System.out.println("Mostre somente os nomes que começam com P ");
		nomes.stream().filter(e -> e.startsWith("P"))
					.forEach(e -> System.out.println(e));
		
		System.out.println();
		System.out.println("Mostre todos os nomes dos clientes separados por tamanho (número de caracteres) ");	
		nomes.stream()
					.sorted( (a, b) -> Integer.compare(a.length(), b.length()) )
					.forEach( a -> System.out.println(a));
	
		System.out.println();
		System.out.println("Pesquise a letrainicial “A” e agrupe os nomes mostrando true e false, ou seja, liste os valores que atendem ou não a regra de parcionamento. ");
		System.out.println(nomes.stream().collect(Collectors.groupingBy(a -> a.contains("A"))).toString());
		
		System.out.println();
		System.out.println("Mostre os nomes agrupados por tamanho, converdos para maiúsculo e separados por vírgula");
		System.out.println(nomes.stream().map(a -> a.toUpperCase())
				.collect(Collectors.groupingBy( a ->    a.length())));
	}

}
