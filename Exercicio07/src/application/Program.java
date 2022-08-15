package application;

import java.util.Locale;

import entities.Gerente;
import entities.Supervisor;
import entities.Vendedor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Gerente gerente = new Gerente("Ana", 38, 7000.00);
		Supervisor supervisor = new Supervisor("Felipe", 45, 4500.00);
		Vendedor vendedor = new Vendedor("Roberto", 32, 3000.00);
		
		System.out.println(gerente);
		System.out.printf("Salário com Bônus: %.2f%n", gerente.bonificacao());
		System.out.println(supervisor);
		System.out.printf("Salário com Bônus: %.2f%n", supervisor.bonificacao());
		System.out.println(vendedor);
		System.out.printf("Salário com Bônus: %.2f%n", vendedor.bonificacao());

	}

}
