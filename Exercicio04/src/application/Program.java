package application;

import java.util.ArrayList;
import java.util.List;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa pessoa1 = new Pessoa("João", 15);		
		Pessoa pessoa2 = new Pessoa("Leandro", 21);
		Pessoa pessoa3 = new Pessoa("Paulo", 17);
		Pessoa pessoa4 = new Pessoa("Jessica", 18);
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		for (Pessoa p : pessoas) {
			System.out.println(p);
		}
		
		System.out.println("------");
		
		for (int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas);
		}
		

		System.out.println(pessoas.contains(pessoa4));
		
	}
	
	
	
	public static Integer menorIdade(List<Pessoa> pessoas, int idade) {
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() < 18) {
				return i;
			}
		}
		return null;
	}

}
