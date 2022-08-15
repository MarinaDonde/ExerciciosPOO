package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Veiculo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Veiculo carro = new Veiculo(false, 15, 0);
		Veiculo carro1 = new Veiculo("Toyota", "Etios", "XXX1X00", "Vermelho", false, 0, 0);
		
		System.out.println(carro.frear());
		System.out.println(carro.pintar("Prata"));
		System.out.println(carro.ligar());
		System.out.println(carro.getVelocidade());
		carro.ligar();
		carro.acelerar();
		carro.acelerar();
		System.out.println(carro.getVelocidade());
		System.out.println(carro.acelerar());
		System.out.println(carro.abastecer(25));
		System.out.println(carro.frear());
		System.out.println(carro.frear());
		System.out.println(carro.desligar());
		System.out.println(carro.frear());
		System.out.println(carro.desligar());
		System.out.println(carro.frear());
		System.out.println(carro.desligar());
		System.out.println(carro.abastecer(25));
		System.out.println(carro.abastecer(20));
		System.out.println(carro.abastecer(15));
		
		System.out.println();
		
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getPlaca());
		System.out.println(carro1.pintar("Azul"));
		System.out.println(carro1.getCor());
		System.out.println(carro1.ligar());
		System.out.println(carro1.acelerar());
		System.out.println(carro1.desligar());
		System.out.println(carro1.abastecer(55));

	}

}
