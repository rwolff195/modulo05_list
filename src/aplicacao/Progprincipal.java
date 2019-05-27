package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Progprincipal {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		//Adicionar elementos na lista
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		//Adicionar elementos na lista por posição
		list.add(2, "Marco");
		
		//Mostrar o tamanho da lista
		System.out.println(list.size());
		
		//Mostrar elementos da lista
		for (String x : list) {
			System.out.println(x);
		}

		//remover elemento da lista
		System.out.println("###################################");
		//list.remove("Anna"); // remove associando por valor
		//list.remove(1); //remove pelo indice
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove por predicado
		
		//Mostrar elementos da lista
		for (String x : list) {
			System.out.println(x);
		}
		
		// Encontrar a posição de um elemento na lista
		System.out.println("###################################");
		System.out.println("Indice of Bob: " + list.indexOf("Bob"));
		System.out.println("Indice of Bob: " + list.indexOf("Marco"));// quando não encontra o valor, retorna -1
		
		// Filtar a lista por elemento que começam por uma determinada letra
		System.out.println("###################################");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("###################################");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		
				/*
		//Laço "for"
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("***********************");
		
		//Laço "for each"
		
		for (String obj : vect) {
			System.out.println(obj);
		}
		*/
	}

}
